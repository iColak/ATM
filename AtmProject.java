import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) throws Exception {
        String userName, password;
        int right = 3;
        int balance = 1500;
        boolean session = true;
        int select;

        Scanner input = new Scanner(System.in);

        while (right > 0) {

            System.out.print("Enter your name: ");
            userName = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("patikadev") && password.equals("java101")) {
                System.out.println("Hi, Welcome to the Kodluyoruz  Bank!");

                while (session) {
                    System.out.println("1-Withdraw\n" +
                            "2-Deposit\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Choose an option: ");

                    select = input.nextInt();


                    switch (select) {
                        case 1:
                            System.out.print("Please enter amount : ");
                            int amount = input.nextInt();
                            if (amount > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= amount;
                                System.out.println("Total Balance : " + balance);
                            }
                            break;
                        case 2:
                            System.out.print("Please enter amount: ");
                            int amount2 = input.nextInt();
                            balance += amount2;
                            System.out.println("Total Balance : " + balance);
                            break;
                        case 3:
                            System.out.println("Total Balance : " + balance);
                            break;
                        case 4:
                            System.out.println("Exit.");
                            session = false;
                            right =-1;
                            break;
                        default:
                            System.out.println("Please try again");
                            session = false;
                            break;
                    }
                }
            } else {
                right--;
                System.out.println("Incorrect username or password. Please try again");
                if (right == 0) {
                    System.out.println("You entered your password incorrectly 3 times. Your password has been blocked. Please contact our bank.");
                } else {
                    System.out.println("your remaining entry right " + right);
                }

            }

        }
    }
}
