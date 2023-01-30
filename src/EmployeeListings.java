import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmployeeListings {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/resources/employees.csv"));
            PrintWriter managersFile = new PrintWriter(new File("src/resources/manager.csv"));
            PrintWriter singleNameFile = new PrintWriter(new File("src/resources/single_name_employees.csv"));

            input.nextLine(); // To ignore the header line

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] fields = line.split(",");
                String name = fields[0];
                String role = fields[1];
                String division = fields[2];

                if (role.equals("Manager") && division.equals("R&D")) {
                    managersFile.println(line);
                }

                if (!name.contains(" ")) {
                    singleNameFile.println(line);
                }
            }

            managersFile.close();
            singleNameFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

