

import java.util.Scanner;
import java.util.Random; 


public class Application {
	Account allAccounts[] = new Account[50000];
	int noOfAccountEntry = 0;
	
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Application bankApp = new Application();
	
	
	while(true)
	{
		System.out.println("\n\n\n\n ===== WebSite links (actions what user can do) ==== ");
		System.out.println("1. Submit User Details. ");
		System.out.println("2. Do Deposite Operation. ");
		System.out.println("3. Do Withdrawl Operation. ");
		System.out.println("4. Print user all details. ");
		System.out.println("5. Print user contact details. ");
		System.out.println("6. Print KYC document details. ");
		System.out.println("7. Print Balance. ");
		System.out.println("8. Change mobile number. ");
		System.out.println("9. Change email id. ");
		
		System.out.println("0. EXIT");
		
		System.out.println(" Enter option [0-9] :- ");
		
		switch (new Scanner(System.in).nextInt()) {
		
		case 0:
			System.exit(0);
			break;

		case 1:
			bankApp.submitUserDetails();
			break;
			
		case 2:
			bankApp.deposite();
			break;
		
		case 3:
			bankApp.withdrawl();
			break;
		
		case 4:
			bankApp.userDetails();
			break;
		
		case 5:
			bankApp.contactDetails();
			break;
		case 6:
			bankApp.kycDetails();
			break;
		case 7:
			bankApp.balance();
			break;
		case 8:
			bankApp.changeMobileNumber();
			break;
		case 9:
			bankApp.changeEmailId();
			break;	
			
			
			
		default:
			System.out.println("Invalid Option ...");
		} //end switch
	}
}


	public void submitUserDetails() {
		Random myRandom = new Random();
		long accountNumber = myRandom.nextInt();
		System.out.println("Enter User Name: ");
		String userName = scStr.nextLine();
		System.out.println("Enter Password: ");
		String password = scStr.nextLine();
		System.out.println("Enter Balance: ");
		int balance = sc.nextInt();
		System.out.println("Enter Pan Number: ");
		String panNumber = scStr.nextLine();
		System.out.println("Enter Aadhar Number: ");
		long aadharNumber = sc.nextInt();
		System.out.println("Enter Document Type: ");
		String documentType = scStr.nextLine();
		System.out.println("Enter Document Number: ");
		String documentNumber = scStr.nextLine();
		System.out.println("Enter House Number: ");
		String houseNumber = scStr.nextLine();
		System.out.println("Enter Locality: ");
		String localityName = scStr.nextLine();
		System.out.println("Enter City: ");
		String cityName = scStr.nextLine();
		System.out.println("Enter State: ");
		String stateName = scStr.nextLine();
		System.out.println("Enter Country: ");
		String countryName = scStr.nextLine();
		System.out.println("Enter Pin Code: ");
		long pinCode = sc.nextInt();
		System.out.println("Enter Mobile Number: ");
		long mobileNumber = sc.nextInt();
		System.out.println("Enter Email id: ");
		long emailId = sc.nextInt();
		
		
		ContactDetails contactDetails = new ContactDetails (houseNumber,localityName,cityName,stateName,countryName,pinCode,mobileNumber,emailId);
		KYCVerification kycVerification = new KYCVerification(panNumber,aadharNumber,documentType,documentNumber);
		Account a = new Account(accountNumber, userName, password,balance, balance);
		
		a.setKycdetails(kycVerification);
		a.setContactDetails(contactDetails);
		int noOfAccounts = 0;
		allAccounts[noOfAccounts++]=a;
		System.out.println(""+a);
		System.out.println("Added in the list.");
	}


	public void deposite() {
		System.out.println("Enter account number : ");
		int enteredNumber = sc.nextInt();
		
		System.out.println(" Enter Amount to be deposite :-  ");
		int amount  = sc.nextInt();
		
		Account enteredAccount = null;
		boolean foundEnteredAccount = false;
		
		for(int i = 0; i< noOfAccountEntry; i++)
		{
			Account a = allAccounts[i];
			if(a.getAccountNumber()== enteredNumber)
			{
				enteredAccount = a;
				foundEnteredAccount = true;
			}
			if(foundEnteredAccount)
			{
				enteredAccount.setBalance(enteredAccount.getBalance()+amount);
			}
		}
		
		
		
		System.out.println(" Deposite Done ");
		System.out.println(" Cheack Balance ");
		System.out.println(enteredAccount.getAccountNumber()+" - "+enteredAccount.getBalance());
		
	}


	public void withdrawl() {
		System.out.println("Enter account number : ");
		int enteredNumber = sc.nextInt();
		
		System.out.println(" Enter Amount to be withdrawl :-  ");
		int amount  = sc.nextInt();
		
		Account enteredAccount = null;
		boolean foundEnteredAccount = false;
		
		for(int i = 0; i< noOfAccountEntry; i++)
		{
			Account a = allAccounts[i];
			if(a.getAccountNumber()== enteredNumber)
			{
				enteredAccount = a;
				foundEnteredAccount = true;
			}
			if(foundEnteredAccount)
			{
				enteredAccount.setBalance(enteredAccount.getBalance()-amount);
			}
		}	
		System.out.println(" Withdrawl Done ");
		System.out.println(" Cheack Balance ");
		System.out.println(enteredAccount.getAccountNumber()+" - "+enteredAccount.getBalance());
			
		
	}


	public void userDetails() {
		System.out.println("Enter the account Number : ");
		long searchAccNum = sc.nextInt();
		
		Account a = getAccount(searchAccNum);
		System.out.println(a);
		
		
	}


	private Account getAccount(long searchAccNum) {
		for (int i =0; i<noOfAccountEntry;i++)
		{
			Account[] enteredAccount = null;
			@SuppressWarnings("null")
			Account a = enteredAccount[i];
			@SuppressWarnings("unused")
			boolean isFound = (a.getAccountNumber()== searchAccNum?true:false);
		}	
		boolean isFound = false;
		if(isFound)
		{
			Account a = null;
			return a;
		}
		return null;
	}


	public void contactDetails() {
		System.out.println("Enter the account Number : ");
		long searchAccNum = sc.nextInt();
		
		Account a = getAccount(searchAccNum);
		System.out.println(a.getContactDetails());
		
	}


	public void kycDetails() {
		System.out.println("Enter the account Number : ");
		long searchAccNum = sc.nextInt();
		
		Account a = getAccount(searchAccNum);
		System.out.println(a.getKycdetails());
		
	}


	public void balance() {
		System.out.println("Enter the account Number : ");
		long searchAccNum = sc.nextInt();
		
		Account a = getAccount(searchAccNum);
		System.out.println(a.getBalance());
		
	}


	public void changeMobileNumber() {
		System.out.println("Enter the account Number : ");
		long searchAccNum = sc.nextInt();
		
		Account a = getAccount(searchAccNum);
		long preMobNum = a.getContactDetails().getMobileNumber();
		System.out.println(preMobNum);
		
		System.out.println("Enter Mobile Number :");
		long mobNum = sc.nextInt();
		a.getContactDetails().setMobileNumber(mobNum);
		System.out.println("Mobile Number"+a.getContactDetails().getMobileNumber());
		
	}


	public void changeEmailId() {
		System.out.println("Enter the account Number : ");
		long searchAccNum = sc.nextInt();
		
		Account a = getAccount(searchAccNum);
		long preEmailId = a.getContactDetails().getEmailId();
		System.out.println(preEmailId);
		
		System.out.println("Enter Email Id: ");
		long email = sc.nextInt();
		a.getContactDetails().setEmailId(email);
		System.out.println("Email ID"+a.getContactDetails().getEmailId());
		
		
	}
}	

