package interview;

import java.util.*;
import java.io.*;

public class Main {

    static class Booking {
        String customer;
        String roomType;
        int price;
        Booking(String customer, String roomType, int price) {
            this.customer = customer;
            this.roomType = roomType;
            this.price = price;
        }
    }

    public static List<String> processData(List<String> lines) {
        // Maps to track max and min prices per room type
        Map<String, Integer> maxPrice = new HashMap<>();
        Map<String, Integer> minPrice = new HashMap<>();
        // List of all bookings in input order
        List<Booking> bookings = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length < 6) continue;
            String customer = parts[0].trim();
            String roomType = parts[3].trim();
            String priceField = parts[4].trim();            // e.g. "Rs 8500"
            int price = Integer.parseInt(priceField.replaceAll("[^0-9]", ""));

            // record booking
            bookings.add(new Booking(customer, roomType, price));

            // update max/min maps
            maxPrice.put(roomType,
                Math.max(maxPrice.getOrDefault(roomType, price), price));
            minPrice.put(roomType,
                Math.min(minPrice.getOrDefault(roomType, price), price));
        }

        // Determine which room types were ever booked at a discount
        // and compute discount amount = maxPrice - minPrice
        Map<String, Integer> discountAmt = new HashMap<>();
        for (String rt : maxPrice.keySet()) {
            int mx = maxPrice.get(rt);
            int mn = minPrice.get(rt);
            if (mn < mx) {
                discountAmt.put(rt, mx - mn);
            }
        }

        // Sort room types in descending order of discount amount
        List<String> discountedTypes = new ArrayList<>(discountAmt.keySet());
        discountedTypes.sort((a, b) -> discountAmt.get(b) - discountAmt.get(a));

        // For each discounted type, find customer(s) who paid the minimum price
        List<String> result = new ArrayList<>();
        for (String rt : discountedTypes) {
            int mn = minPrice.get(rt);
            Set<String> seen = new HashSet<>();
            for (Booking bk : bookings) {
                if (bk.roomType.equals(rt) && bk.price == mn && !seen.contains(bk.customer)) {
                    result.add(bk.customer);
                    seen.add(bk.customer);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                lines.add(line);
            }
        }
        List<String> output = processData(lines);
        for (String name : output) {
            System.out.println(name);
        }
    }
}