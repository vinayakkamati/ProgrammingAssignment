import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CombinationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list");
        int n = sc.nextInt();

        List<String> input = new ArrayList<>();
        System.out.println("Enter values of list");

        int i = 0;
        while (i<n) {
            input.add(sc.next());
            i++;
        }
        System.out.println(input);

        List<String> l1 = sortByFirstChar(input);
        System.out.println("L1: " + l1);
        List<String> l2 = sortByNum(input);
        System.out.println("L2: " + l2);
    }

    public static List<String> sortByFirstChar(List<String> list) {
        list.sort(Comparator.comparingInt(str -> str.charAt(0)));
        return list;
    }

    public static List<String> sortByNum(List<String> list) {
        list.sort((s1, s2) -> {
            int num1 = Integer.parseInt(s1.substring(1));
            int num2 = Integer.parseInt(s2.substring(1));
            int result = num2 - num1;
            if (!s1.substring(0,1).equals(s2.substring(0,1))) {
                result = list.indexOf(s1) - list.indexOf(s2);
            }
            return result;
        });
        return list;
    }
}

// input d34 g54 d12 b87 g1 c65 g40 g5 d77

// L1 : b87, c65, d34, d12, d77, g54, g1, g40, g5
// L2 : b87, c65, d77, d34, d12, g54, g40, g5, g1