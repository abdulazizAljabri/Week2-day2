import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // First Example form Class Account ....
        try {
            Account accountOne = new Account();
            Account accountTwo = new Account("12", "ail", 200);
            System.out.println("Enter Your ID :");
            String id = input.nextLine();
            accountOne.setId(id);
            System.out.println("Enter Your Name :");
            String name = input.nextLine();
            accountOne.setName(name);
            System.out.println("Enter Your Balance :");
            int balance = input.nextInt();
            accountOne.setBalance(balance);
            System.out.println("-------------------");
            System.out.println("Enter the money to withdraw :");
            int amount = input.nextInt();
            accountOne.credit(amount);
            System.out.println("The balance after withdraw is : " + accountOne.getBalance());
            System.out.println("Enter the amount to debit");
            amount = input.nextInt();
            accountOne.debit(amount);
            System.out.println("The balance after debit is : " + accountOne.getBalance());
            System.out.println("-------------------");
            System.out.println("Enter the money to transfer :");
            amount = input.nextInt();
            accountOne.transferTo(amount, accountTwo);
            System.out.println("The balance your account is : " + accountOne.getBalance());
            System.out.println("-------------------");
            System.out.println("The balance of accountOne after transfer is : " + accountOne.getBalance());
            System.out.println("The balance of accountTwo after transfer is : " + accountTwo.getBalance());
            System.out.println("-------------------");
            System.out.println(accountOne.toString());
            System.out.println(accountTwo.toString());
        } catch (InputMismatchException e1) {
            System.out.println(" Invalid Input ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Second Example form Class Employee...


        try {
            Employee employeeOne = new Employee("10", "ail", 20000);
            Employee employeeTwo = new Employee();
            System.out.println(" Employee Name : ");
            String name = input.nextLine();
            employeeTwo.setName(name);
            System.out.println(" Employee ID : ");
            String id = input.nextLine();
            employeeTwo.setId(id);
            System.out.println(" Employee Salary : ");
            int salary = input.nextInt();
            employeeTwo.setSalary(salary);
            System.out.println("-------------------");
            System.out.println(" Enter the percentage of the employeeTwo salary increase: ");
            int percentage = input.nextInt();
            employeeTwo.raisedSalary(percentage);
            System.out.println("The employeeTwo salary after increase is : " + employeeTwo.getSalary());
            System.out.println("-------------------");
            System.out.println(" Enter the percentage of the employeeOne salary increase: ");
            percentage = input.nextInt();
            employeeOne.raisedSalary(percentage);
            System.out.println("The employeeOne salary after increase is : " + employeeOne.getSalary());
            System.out.println("-------------------");
            System.out.println(" The employeeOne AnnualSalary is : " + employeeOne.getAnnualSalary());
            System.out.println(" The employeeTwo AnnualSalary is : " + employeeTwo.getAnnualSalary());

            System.out.println(employeeOne.toString());
            System.out.println(employeeTwo.toString());
        } catch (InputMismatchException e2) {
            System.out.println(" Invalid Input ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}