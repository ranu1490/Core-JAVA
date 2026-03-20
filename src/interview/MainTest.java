package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MainTest {

    @Test
    void testSampleInput() {
        List<String> input = Arrays.asList(
                "Arjun Sharma, MakeMyTrip, 1, Deluxe Room, Rs 8500, Cash",
                "Priya Nair, Booking.com, 1, Executive Suite, Rs 15000, Credit Card",
                "Arjun Sharma, Agoda, 3, Standard Room, Rs 7500, Cash",
                "Kavya Reddy, Expedia, 4, Superior Room, Rs 6000, Credit Card",
                "Rajesh Kumar, MakeMyTrip, 5, Executive Suite, Rs 6500, Credit Card",
                "Vikram Joshi, Booking.com, 10, Presidential Suite, Rs 25000, Credit Card",
                "Arjun Sharma, Expedia, 21, Deluxe Room, Rs 6500, Credit Card",
                "Arjun Sharma, MakeMyTrip, 22, Standard Room, Rs 7500, UPI",
                "Anita Reddy, Agoda, 23, Superior Room, Rs 7000, Cash",
                "Kavya Reddy, Booking.com, 24, Executive Suite, Rs 8000, UPI",
                "Priya Nair, Expedia, 25, Superior Room, Rs 7500, UPI"
        );
        List<String> expected = Arrays.asList(
                "Rajesh Kumar",
                "Arjun Sharma",
                "Kavya Reddy"
        );
        List<String> actual = Main.processData(input);
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyInput() {
        List<String> input = Collections.emptyList();
        List<String> actual = Main.processData(input);
        assertTrue(actual.isEmpty(), "Expected empty result for empty input");
    }

    @Test
    void testNoDiscounts() {
        List<String> input = Arrays.asList(
                "Alice, X, 1, Room A, Rs 100, Cash",
                "Bob, Y, 2, Room B, Rs 200, UPI",
                "Charlie, Z, 3, Room A, Rs 100, Credit Card"
        );
        // Room A always 100, Room B only one booking → no discounts anywhere
        List<String> actual = Main.processData(input);
        assertTrue(actual.isEmpty(), "Expected no customers when there are no discounts");
    }

    @Test
    void testMultipleLowestBookings() {
        List<String> input = Arrays.asList(
                "Alice, X, 1, RoomA, Rs 100, Cash",
                "Bob, Y, 2, RoomA, Rs  80, UPI",
                "Charlie, Z, 3, RoomA, Rs 80, Credit Card"
        );
        // RoomA max=100, min=80 → both Bob and Charlie at the most discounted price
        List<String> expected = Arrays.asList("Bob", "Charlie");
        List<String> actual = Main.processData(input);
        assertEquals(expected, actual);
    }

    @Test
    void testDiscountOrdering() {
        List<String> input = Arrays.asList(
                "C1, X, 1, Room1, Rs 150, Cash",      // Room1: max=150, min=100 → discount=50
                "C2, Y, 2, Room1, Rs 100, UPI",
                "C3, X, 3, Room2, Rs 200, Cash",      // Room2: max=200, min=180 → discount=20
                "C4, Y, 4, Room2, Rs 180, Credit Card",
                "C5, Z, 5, Room3, Rs 300, Cash"       // Room3: no discount
        );
        // Discounts: Room1(50) then Room2(20). Customers at min: C2 then C4.
        List<String> expected = Arrays.asList("C2", "C4");
        List<String> actual = Main.processData(input);
        assertEquals(expected, actual);
    }
}