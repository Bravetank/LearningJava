package class_practice;

public class Payroll {

    public static void main(String[] args) {

        Address address1 = new Address("5", "Pretend Street", "Pretend Village", "Swansea", "Wales", "33333");

        Address address2 = new Address("10", "Joking Street", "Joking Village", "Cardiff", "Wales", "90210");

        Employee employee1 = new Employee("Michelle", "Treeface", "545454", address1, 901, 001, "Dr", 50000);

        Employee employee2 = new Employee("Peter", "Greenhouse", "676767", address2, 801, 002, "Mr", 30000);

        Employee employee3 = new Employee("Demi", "Shed", "929292", null, 701, 003, "Ms.", 12000);

        employee1.printEmployee();
        System.out.println();
        employee2.printEmployee();
        System.out.println();

        //Added employee3 above & in print below just to show can use null above if not instantiating address object and then use if in Employee class to print a message "No address on file"
        employee3.printEmployee();
        System.out.println();


        int result = employee1.compareTo(employee2);
        if (result == 1) {
            System.out.println(employee1.getName() + " earns more than " +
                    employee2.getName());
        } else if (result == 0) {
            System.out.println(employee1.getName() + " earns the same as " +
                    employee2.getName());
        } else {
            System.out.println(employee2.getName() + " earns more than " +
                    employee1.getName());
        }

        System.out.println();

        if (address1.compareTo(address2) == 1 || address1.compareTo(address2) == 0) {
            System.out.println("Address: " + address1.toString());
            System.out.println("Address: " + address2.toString());
        } else {
            System.out.println("Address: " + address2.toString());
            System.out.println("Address: " + address1.toString());

        }

        System.out.println();

        employee1.setSalary(2000);

    }

}




