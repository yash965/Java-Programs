import java.util.Scanner;

interface BankProcess {
    boolean withdraw(double Amt);
}

class SavingsAccount implements BankProcess {
    long accountId;
    double balance;
    String name;

    public SavingsAccount (long accId, String n, double bal) {
        accountId = accId;
        name = n;
        balance = bal;
    }

    public void deposit (double Amt) {
        balance = balance + Amt;
    }

    public boolean withdraw (double Amt) {
        if((balance - Amt) < 5000d) {
            System.out.println("This traction cannot succeed, minimum balance of 5,000 required");
            return false;
        } else {
            System.out.println("Transaction Successful");
            return true;
        }    
    }

    public void display() {
        System.out.println("Account No. = " + accountId);
        System.out.println("Name of the account holder = " + name);
        System.out.println("Balanc: " + balance);
    }
}

class CurrentAccount {
    long accountId;
    double balance;
    String name;

    public CurrentAccount (long accId, String n, double bal) {
        accountId = accId;
        name = n;
        balance = bal;
    }

    public void deposit (double Amt) {
        balance = balance + Amt;
    }

    public boolean withdraw (double Amt) {
        if((balance - Amt) < -10000d) {
            System.out.println("This traction cannot succeed, maximum of 10,000 overdue is allowed");
            return false;
        } 
        else {
            System.out.println("Transaction Successful");
            return true;
        }    
    }

    public void display() {
        System.out.println("Account No. = " + accountId);
        System.out.println("Name of the account holder = " + name);
        System.out.println("Balance: " + balance);
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();

        System.out.print("Enter Savings bank details :\nAccount ID - ");
        long SaccId = sc.nextLong();
        System.out.print("Balance - ");
        double Sbalance = sc.nextDouble();
        while(Sbalance<0) {
            System.out.println("Balance should not be less than 0");
            Sbalance = sc.nextDouble();
        }

        System.out.print("Enter Current bank details :\nAccount ID - ");
        long CaccId = sc.nextLong();
        System.out.print("Balance - ");
        double Cbalance = sc.nextDouble();
        while(Cbalance<-10000) {
            System.out.println("Maximum 10000 overdue is allowed");
            Cbalance = sc.nextDouble();
        }
        char option; // For while loop

        do{

            System.out.println("Enter yor choice");
            System.out.println("1. Savings Account \n2. Current Account");
            
            int choice = sc.nextInt();
            int ch, amt;
            SavingsAccount save = new SavingsAccount(SaccId, name, Sbalance);
            CurrentAccount curr = new CurrentAccount(CaccId, name, Cbalance);

            switch(choice) {
                case 1:
                    System.out.println("Enter the operation \n1.deposit \n2.withdraw \n3.display");
                    ch = sc.nextInt();
                    switch(ch) {
                        case 1: 
                            System.out.println("Enter Amount");
                            amt = sc.nextInt();
                            save.deposit(amt);
                            break;

                        case 2:
                            System.out.println("Enter Amount");
                            amt = sc.nextInt();
                            save.withdraw(amt);
                            break;

                        case 3: 
                            save.display();
                    }
                    break;

                case 2:
                    System.out.println("Enter the operation \n1.deposit \n2.withdraw \n3.display");
                    ch = sc.nextInt();
                    switch(ch) {
                        case 1: 
                            System.out.println("Enter Amount");
                            amt = sc.nextInt();
                            curr.deposit(amt);
                            break;

                        case 2:
                            System.out.println("Enter Amount");
                            amt = sc.nextInt();
                            curr.withdraw(amt);
                            break;

                        case 3: 
                            curr.display();
                    }
                    break;

            }

            System.out.println("Do you want to continue? Y/N");
            option = sc.next().charAt(0);

        } while (option == 'Y' || option == 'y');
    }
}
