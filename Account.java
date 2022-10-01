


	public class Account {
		
		private long accountNumber;
		private String username;
		private String password;
		private int balance;
		private int cashback;
		private KYCVerification kycdetails;
		private ContactDetails contactDetails;
		
		public Account(long accountNumber , String username , String password , int balance , int cashback) {
			super();
			this.accountNumber = accountNumber;
			this.username = username;
			this.password = password;
			this.balance = balance;
		}
		
		public Account() {
			super();
		}

		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public int getCashback() {
			return cashback;
		}

		public void setCashback(int cashback) {
			this.cashback = cashback;
		}

		public KYCVerification getKycdetails() {
			return kycdetails;
		}

		public void setKycdetails(KYCVerification kycdetails) {
			this.kycdetails = kycdetails;
		}

		public ContactDetails getContactDetails() {
			return contactDetails;
		}

		public void setContactDetails(ContactDetails contactDetails) {
			this.contactDetails = contactDetails;
		}

	}


