package BankApplicationProcess;

public class BankTest {
	public static void main(String[] args) {
		
		BankApplicationForm bankAppForm1 = new BankApplicationForm();
		BankApplicationForm bankAppForm2 = new BankApplicationForm();
		BankApplicationForm bankAppForm3 = new BankApplicationForm();
		
		bankAppForm1.setApplicationName("Jack Dsouza");
		bankAppForm1.setAdhaarCard("123412344321");
		bankAppForm1.setPanCard("JDZA4532K");
		bankAppForm1.setEmailAddress("jack@gmail.com");
		bankAppForm1.setMobileNumber("9564821375");
		bankAppForm1.setAddresss("A59, West Avenev Mumbai 15");
		bankAppForm1.setAccountType("Savings");
		
		bankAppForm2.setApplicationName("Sushil Kulkarni");
		bankAppForm2.setAdhaarCard("432143211234");
		bankAppForm2.setPanCard("SUSD4454D");
		bankAppForm2.setEmailAddress("sushil@gmail.com");
		bankAppForm2.setMobileNumber("8890443464");
		bankAppForm2.setAddresss("D509, East Avenue, Pune 16");
		bankAppForm2.setAccountType("Current");
		
		bankAppForm3.setApplicationName("Ratan Rajkudali");
		bankAppForm3.setAdhaarCard("999988887777");
		bankAppForm3.setPanCard("ROPTR434E");
		bankAppForm3.setEmailAddress("ratan@gmail.com");
		bankAppForm3.setMobileNumber("7799443464");
		bankAppForm3.setAddresss("E59, South Avenue, Bengaluru 26");
		bankAppForm3.setAccountType("fixed");
		
	
		bankAppForm1.printApplicationForm();
		bankAppForm2.printApplicationForm();

		bankAppForm3.printApplicationForm();

		
		System.out.println("=============================");
		
		Bank bank = new Bank();
		BankAccount bankAcc1 = bank.applyforBankAccount(bankAppForm1); //passing object here 
		BankAccount bankAcc2 = bank.applyforBankAccount(bankAppForm2); //passing object here 
		BankAccount bankAcc3 = bank.applyforBankAccount(bankAppForm3); //passing object here 

		bankAcc1.bankAccountDetails();	
		bankAcc2.bankAccountDetails();	
		bankAcc3.bankAccountDetails();
		
		System.out.println("=============================");

		BankApplicationForm bankForm1 = new BankApplicationForm();
		BankApplicationForm bankForm2 = new BankApplicationForm();
	
		bankForm1.setApplicationName("Dinesh Sawant");
		bankForm1.setAdhaarCard("125612451289");
		bankForm1.setPanCard("DINJD2233D");
		bankForm1.setEmailAddress("dinesh@gmail.com");
		bankForm1.setMobileNumber("6688443464");
		bankForm1.setAddresss("D21, Sai Niwas, Pune 30");
		bankForm1.setAccountType("Savings");
		
		bankForm2.setApplicationName("Disha Sawant");
		bankForm2.setAdhaarCard("555589901289");
		bankForm2.setPanCard("DIAS1133E");
		bankForm2.setEmailAddress("disha@gmail.com");
		bankForm2.setMobileNumber("5588663464");
		bankForm2.setAddresss(bankForm1.getAddresss());
		bankForm2.setAccountType(bankForm1.getAccountType());
		
		BankAccount jointAcc = bank.applyforJointAccount(bankForm1, bankForm2);
		jointAcc.bankAccountDetails();
		
		
	}

}

class Form{
	
}

class BankApplicationForm extends Form {
	
	private String applicantName;
	private String address;
	private String adhaarCard;
	private String panCard;
	private String mobileNumber;
	private String emailAddress;
	private String accountType;
		
		
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicationName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getAddresss() {
		return address;
	}
	public void setAddresss(String addresss) {
		this.address = addresss;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	void printApplicationForm() {
		System.out.println("-------------Bank Application Form-------------------");
		System.out.println("Bank Applicant Name : " + applicantName);
		System.out.println("Bank Account Type : " + accountType);
		System.out.println("Applicant's Address : " + address);
		System.out.println("Applicant's Adhaar  : "+adhaarCard);
		System.out.println("Applicant's PAN : " + panCard);
		System.out.println("Applicant's Email : " + emailAddress);
		System.out.println("Applicant's Mobile : " + mobileNumber);
	}
	

	
}

class BankAccount{
	
	private long accountNumber;
	private String accountHolder;
	private long accountBalance;
	private String accountType;
	private String ifscCode;
	private String operationType; // single, partnership, joint, firm, 
	
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	void bankAccountDetails() {
		System.out.println("-------Bank Account Details -------");
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Account Holder      : "+accountHolder);
		System.out.println("Bank Account IFSC   : "+ifscCode);
		System.out.println("Account Balance     : "+accountBalance);
		System.out.println("Account Operation   : "+operationType);
	}
	
}

class Bank {
	
	//returning Object                //passing object [usesA]
	BankAccount applyforBankAccount(BankApplicationForm bankAppFormRef) {
		System.out.println("Recieved the application from  : "+bankAppFormRef.getApplicantName());
		System.out.println("Creating bank Account ");
		BankAccount bankAccObj = new BankAccount(); // a blank object
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj.setAccountNumber(accNum);//real time, connect to the DB, and find out the last account number generated, and one 
		bankAccObj.setAccountHolder(bankAppFormRef.getApplicantName());
		bankAccObj.setAccountType(bankAppFormRef.getAccountType());
		bankAccObj.setIfscCode("BOB000000015");
		bankAccObj.setAccountBalance(3000);
		
		return bankAccObj;
	}
	
	BankAccount applyforJointAccount(BankApplicationForm form1, BankApplicationForm form2) {
		//gather both the form details and make the bankAccount details
		
		BankAccount bankAcc = new BankAccount();
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAcc.setAccountNumber(accNum);
		bankAcc.setAccountHolder(form1.getApplicantName()+ " " + form2.getApplicantName());;
		bankAcc.setAccountType(form1.getAccountType());
		bankAcc.setAccountBalance(accNum);
		
		return bankAcc;
	}
}


