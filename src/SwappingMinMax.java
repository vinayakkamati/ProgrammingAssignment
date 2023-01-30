import java.util.*;

public class SwappingMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list");
        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        System.out.println("Enter values of first list");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println("Enter values of second list");
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        int temp;
        while (true) {
            int max_b = Collections.max(b.subList(1, n));
            int i = b.indexOf(max_b);
            if (max_b > a.get(i)) {
                temp = a.get(i);
                a.set(i, b.get(i));
                b.set(i, temp);
            } else {
                break;
            }
        }

        int max_a = Collections.max(a);
        int max_b = Collections.max(b);
        System.out.println(max_a * max_b);
    }
}

/*
 Input

 25
 8 7 9 6 5 6 6 5 6 4 6 7 8 5 4 3 2 1 4 5 6 7 8 7 8
 2 4 5 6 7 6 7 8 9 8 7 6 7 6 5 4 3 2 3 4 5 5 5 4 5

 6
 1 2 6 5 1 2
 3 4 3 2 2 5

 12
 1 2 3 2 3 4 5 3 5 6 7 8
 2 1 5 3 4 6 4 3 2 3 1 2
*/

