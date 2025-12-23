import java.util.HashMap;


public class Bank {
	
	HashMap<Integer,Account> map = new HashMap<>();
	
	public void createAccount(int accNumber, String name) {
		if(map.containsKey(accNumber)) {
			System.out.println("Duplicate account number Error ....");
		}else {
			map.put(accNumber, new Account(accNumber, name));
		}	
		
	}
	
	public Account getAccount(int accNo) {
		if(map.containsKey(accNo)) {
			return map.get(accNo);
		}else {	
			return null;	
		 }
		}
}
