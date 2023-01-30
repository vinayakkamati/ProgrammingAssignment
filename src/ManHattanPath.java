import java.util.Scanner;

public class ManHattanPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] start = new int[2];
        String input;

        System.out.print("Enter start point (x, y): ");
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();

        System.out.print("Enter input string: ");
        input = sc.next();

        int x1 = start[0];
        int y1 = start[1];

        System.out.println("Shortest distance is: " + findShortestDistance(x1, y1, input));
    }

    private static double findShortestDistance(int x1, int y1, String input) {
        int x2 = x1;
        int y2 = y1;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'N':
                    y2++;
                    break;
                case 'E':
                    x2++;
                    break;
                case 'S':
                    y2--;
                    break;
                case 'W':
                    x2--;
                    break;
            }
        }
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
