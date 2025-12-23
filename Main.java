import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean isRunning = true;
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		
		
		while(isRunning) {
			System.out.println("----------------------");
			System.out.println("CONSOLE BANKING SYSTEM");
			System.out.println("----------------------");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money ");
			System.out.println("3. Withdraw Money ");
			System.out.println("4. Check Balance ");
			System.out.println("5. Exit");
			System.out.print("Enter your option: ");
			String choice = scanner.nextLine();
			int option;
			
			try {
				option = Integer.parseInt(choice);
			}catch(NumberFormatException e) {
				System.out.println("***Something went wrong***");
				continue;		
			}
			
			switch(option) {
			case 1: 
				System.out.print("Enter the account number: ");
				int accnumber = scanner.nextInt();
				scanner.nextLine();
				
				System.out.print("Enter name: ");
				String accname = scanner.nextLine();
				
				bank.createAccount(accnumber,accname);
				
				break;
				
			case 2:
				
				System.out.println("Account number for deposit: ");
				int accnumb = scanner.nextInt();
				scanner.nextLine();
				
				System.out.print("How much you wanna deposit? ");
				int depositamount = scanner.nextInt();
				scanner.nextLine();
				
				Account account = bank.getAccount(accnumb);
					
				
				if(account == null) {
					System.out.println("Account not found");
				}else {
					account.deposit(depositamount);
					
				}
				break;
				
			case 3:
				System.out.println("Account number for withdrawal: ");
				int accnumber1 = scanner.nextInt();
				scanner.nextLine();
				
				System.out.print("How much you wanna withdraw? ");
				int withdrawamount = scanner.nextInt();
				scanner.nextLine();
				
				Account account1 = bank.getAccount(accnumber1);
					
				
				if(account1 == null) {
					System.out.println("Account not found");
				}else {
					account1.withdraw(withdrawamount);
					
				}
				break;
				
			case 4:
				System.out.print("Enter the account number: ");
				int accnumberBalance = scanner.nextInt();
				scanner.nextLine();
				
				Account account2 = bank.getAccount(accnumberBalance);
				System.out.println(account2.getBalance());
				
				break;
			case 5:
				
				isRunning = false;
				System.out.println("See ya !!");
				break;
				
			
			
			}
			
		}
scanner.close();
	}

}
