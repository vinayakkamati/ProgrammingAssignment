import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check perfect number or not: ");
        Long input = new Scanner(System.in).nextLong();

        System.out.println(input.equals(findSumOfFactors(input)));
    }

    private static Long findSumOfFactors(long num) {
        int i = 1;
        long result = 0L;
        while (i <= num / 2) {
            if (num % i == 0) {
                result += i;
            }
            i++;
        }
        return result;
    }
}
