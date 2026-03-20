package Leetcode;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(5,1);
    }

    public static void printName(int i, int n){
        if(i < n)
            return;
        System.out.println("Ranu");
        printName(i, n+1);
    }
}
