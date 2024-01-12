import java.util.Scanner;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (string, and int)
        String name1;
        String name2;
        int age1;
        int age2;

        // TODO: Read name and age input for customer 1
        System.out.println("Enter your name: ");
        name1 = scnr.nextLine();
        System.out.println("Enter your age: ");
        age1 = Integer.parseInt(scnr.nextLine());

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())
        customer1.setName(name1);
        customer1.setAge(age1);

        // TODO: Read name and age input for customer 2
        System.out.println("Enter your name: ");
        name2 = scnr.nextLine();
        System.out.println("Enter your age: ");
        age2 = Integer.parseInt(scnr.nextLine());

        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
        customer2.setName(name2);
        customer2.setAge(age2);

        System.out.println("Customer that is older:");

        /// TODO: Determine older customer (use getAge())
        //       and output older customer's info (use printInfo())
        if (customer1.getAge() > customer2.getAge()) {
            System.out.println("Name: " + customer1.getName());
            System.out.println("Age: " + customer1.getAge());
        } else {
            System.out.println("Name: " + customer2.getName());
            System.out.println("Age: " + customer2.getAge());
        }
    }
}
