package training;

public class Acc1 {

	public static void main(String[] args) {
		
		 Account myAccount = new Account(50000); 
	        myAccount.withdraw(4500); 
	        double newBalance = myAccount.getBalance();

	        if(newBalance >= 1000)
	        {

	            System.out.println(newBalance);
	        }
	}

}
