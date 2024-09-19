import java.util.Scanner;

public class ATM {
   
   
    private double balance;

  
    public ATM() {
        this.balance = 0.0;
    }

   
    public void deposit(double amount) {
        if (amount > 0) 
        {
            balance += amount;
          System.out.println("Successfully deposited: $" + amount);
        } 
        else 
        {
            System.out.println("Deposit amount must be positive!");
        }
    }

  
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } 
        else
        {
            System.out.println("Insufficient funds! Current balance: $" + balance);
        }
    }

   
   
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        
        
        
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

           
           
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } 
        
        while (choice != 4);

        scanner.close();
    }
}
