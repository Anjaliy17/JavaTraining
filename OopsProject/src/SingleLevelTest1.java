import java.time.LocalDate;
public class SingleLevelTest1 {

	public static void main(String[] args) {
		
		AdhaarCard adhaarCard1 = new AdhaarCard();
		adhaarCard1.setAdhaarNumber("1231 2312 3123");
		adhaarCard1.setAddress("C 709, West Avenue, Mumbai 16");
		adhaarCard1.setNameOnAdhaar("Peter Dsouza");
		adhaarCard1.setFatherName("Patrick Dsouza");
		adhaarCard1.setDateOfBirth(LocalDate.of(2002, 3, 25));
		adhaarCard1.setMobileNumber("9870445533");
		
		AdhaarCard adhaarCard2 = new AdhaarCard();
		adhaarCard2.setAdhaarNumber("9820 2312 3123");
		adhaarCard2.setAddress("D 909, East Avenue, Nagpur 16");
		adhaarCard2.setNameOnAdhaar("Dinesh Sawant");
		adhaarCard2.setFatherName("Guru Sawant");
		adhaarCard2.setDateOfBirth(LocalDate.of(2003, 12, 15));
		adhaarCard2.setMobileNumber("8899445533");


		AdhaarCard adhaarCard3 = new AdhaarCard();
		adhaarCard3.setAdhaarNumber("1231 5312 6123");
		adhaarCard3.setAddress("D22, Ram Mahal, Pune 333");
		adhaarCard3.setNameOnAdhaar("Satish Kulkarni");
		adhaarCard3.setFatherName("Shyam Kulkarni");
		adhaarCard3.setDateOfBirth(LocalDate.of(2000, 7, 29));
		adhaarCard3.setMobileNumber("8870445511");
		
		PanCard panCard1 = new PanCard();
		panCard1.setPanNumber("YGJN4823");
		panCard1.setNameOnPan("Yash Mishra");
		panCard1.setFatherName("Sumit Mishra");
		panCard1.setDateOfBirth(LocalDate.of(1999, 8, 25));

		PanCard panCard2 = new PanCard();
		panCard1.setPanNumber("TFJV85691");
		panCard1.setNameOnPan("Shweta Kulkarni");
		panCard1.setFatherName("Mohit Kulkarni");
		panCard1.setDateOfBirth(LocalDate.of(2000, 2, 12));
		
		Person person1 = new Person('F', "Seema", 24);
		person1.showPerson();
		person1.setPanCard(panCard2);
		System.out.println("-------------------------");
		
		Student std1 = new Student('M', "Jack", 24, 123, "Bharati Vidyapeeth", "Mech Engg", 899);
		std1.setAdhaarCard(adhaarCard2);
		std1.setPanCard(panCard2);
		std1.showStudent();
		System.out.println("-------------------------");
		
		Employee emp1 = new Employee('M', "Jack", 24, 123, "Bharati Vidyapeeth", "Mech Engg", 899, 1205, "DS", "Software Developer", 9999);
		emp1.setAdhaarCard(adhaarCard3);
		emp1.setPanCard(panCard2);
		emp1.showEmployee();
		System.out.println("-------------------------");
		
//		Person person2 = new Person(24);
//		person2.showPerson();
//		
//		Person person3 = new Person("Puja", 24);
//		person3.showPerson();
	}
}

class AdhaarCard{
	private String adhaarNumber;
	private String nameOnAdhaar;
	private LocalDate dateOfBirth;
	private String address;
	private String mobileNumber;
	private String fatherName;
	
	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getNameOnAdhaar() {
		return nameOnAdhaar;
	}

	public void setNameOnAdhaar(String nameOnAdhaar) {
		this.nameOnAdhaar = nameOnAdhaar;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	void printAdhaarCard() {
		System.out.println("-----ADHAAR CARD INFO -----");
		System.out.println("Adhaar Number  : "+ adhaarNumber);
		System.out.println("Adhaar Name    : "+nameOnAdhaar);
		System.out.println("Adhaar Address : "+address);
		System.out.println("Birthdate      : "+dateOfBirth);
		System.out.println("Father Name    : "+fatherName);
		System.out.println("Mobile Number  : "+mobileNumber);
		
	}
}

class PanCard{
	private String panNumber;
	String nameOnPan;
	String fatherName;
	LocalDate dateOfBirth;
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getNameOnPan() {
		return nameOnPan;
	}
	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	void printPanCard() {
		System.out.println("----------------PAN CARD INFO-------------");
		System.out.println("PAN no : " + panNumber);
		System.out.println("PAN Name :" + nameOnPan);
		System.out.println("father Name :" + fatherName);
		System.out.println("Birthdate : "+ dateOfBirth);
	}
	
}

class Person{
	private char gender;
	private String name;
	private int age;
	private AdhaarCard adhaarCard; // is it a reference ???YES
	private PanCard panCard;
	
	public AdhaarCard getAdhaarCard() {
		return adhaarCard;
	}

	public void setAdhaarCard(AdhaarCard adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	
	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

	Person() {
		System.out.println("Person() constructor...");
	}
	
	Person(int age) {
		this('F', "NONAME", age);  // invoking constructor of the same class - reuse
	}
	
//	Person(String name, int age) {
//		this('F', name, age);
//	}
	
	Person(char gender, String name, int age, AdhaarCard adhaarCard) {
		this(gender, name, age);
		System.out.println("START => Person(char, String, int, Object) constructor...");
		this.adhaarCard = adhaarCard;
	}

	
	Person(char gender, String name, int age) {
		System.out.println("START => Person(char, String, int) constructor...");
		
		if(gender=='M' || gender == 'F') {
			this.gender = gender;			
		} else {
			// System.out.println("Invalid Gender");
			// throw new RuntimeException("Invalid gender");
			RuntimeException runtimegenderEx = new RuntimeException("Invalid gender : " + gender);
			throw runtimegenderEx;
		}
		
		if(Validator.checkString(name)) {
			this.name = name;						
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid name : " + name);
			throw runtimeNameEx;
		}
		
		if(age >= 1 && age <= 120) {
			this.age = age;			
		}
		else {
			RuntimeException runtimeAgeEx = new RuntimeException("Invalid age : " + age);
			throw runtimeAgeEx;
		}
		
		System.out.println("FINISH => Person(char, String, int) constructor...");
	}
	
	public void showPerson() {
		System.out.println("------------------PERSONAL------------------");
		System.out.println("GENDER : " + gender);
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age);
		if(adhaarCard!=null) {
			adhaarCard.printAdhaarCard();
		}
		else {
			System.out.println("Adhaar Card NOT set");
		}
		if(panCard!=null) {
			panCard.printPanCard();
		} else {
			System.out.println("Pan Card NOT set");
		}
	}
}

class Student extends Person{
	private int rollno;
	private String colgName;
	private String stream;
	private float marks;
	Student() {
		System.out.println("Student() constructor...");
	}
	
	Student(char gender, String name, int age, int rollno, String colgName, String stream, float marks) {
		super(gender, name, age);
		System.out.println("Student() constructor...");
		
		if(Validator.checkNumber(rollno, 1, 500)) {
			this.rollno = rollno;			
		} else {
			RuntimeException runtimeRollnoEx = new RuntimeException("Invalid rollno : " + rollno);
			throw runtimeRollnoEx;
		}
		
		if(Validator.checkStringWithSpace(colgName)) {					
			this.colgName = colgName;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid colgName : " + colgName);
			throw runtimeNameEx;
		}
		
		if(Validator.checkStringWithSpace(stream)) {					
			this.stream = stream;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid stream : " + stream);
			throw runtimeNameEx;
		}
		
		if(Validator.checkNumber(marks, 1, 1000)) {
			this.marks = marks;			
		} else {
			RuntimeException runtimeMarksEx = new RuntimeException("Invalid marks : " + marks);
			throw runtimeMarksEx;
		}		
	}
	
	void showStudent() {
		super.showPerson();
		System.out.println("------------------STUDENT------------------");
		System.out.println("ROLLNO : " + rollno);
		System.out.println("COLGNAME : " + colgName);
		System.out.println("STREAM : " + stream);
		System.out.println("MARKS : " + marks);
		
	}
}

class Employee extends Student {
	private int empNo;
	private String companyName;
	private String designation;
	float salary;
	
	
	Employee() {
		super();
		System.out.println("Employee() constructor...");
	}
	
	Employee(char gender, String name, int age, int rollno, String colgName, String stream, float marks, 
			int empNo, String companyName, String designation, float salary) {
		super(gender, name, age, rollno, colgName, stream, marks);
		System.out.println("Employee() constructor...");
		
		if(Validator.checkNumber(empNo, 100, 3000)) {
			this.empNo = empNo;			
		} else {
			RuntimeException runtimeEmpNoEx = new RuntimeException("Invalid empNo : " + empNo);
			throw runtimeEmpNoEx;
		}
		
		if(Validator.checkString(companyName)) {
			this.companyName = companyName;						
		}
		else {
			RuntimeException runtimeCompanyNameEx = new RuntimeException("Invalid companyName : " + companyName);
			throw runtimeCompanyNameEx;
		}
		
		if(Validator.checkStringWithSpace(designation)) {
			this.companyName = companyName;						
		}
		else {
			RuntimeException runtimeDesignationEx = new RuntimeException("Invalid designation : " + designation);
			throw runtimeDesignationEx;
		}
		
		if(Validator.checkNumber(salary, 5000, 20000)) {
			this.salary = salary;			
		}
		else {
			RuntimeException runtimeSalaryEx = new RuntimeException("Invalid salary : "+salary);
			throw runtimeSalaryEx;
		}
		
		
	}
	
	void showEmployee() {
		super.showStudent();
		System.out.println("------------------EMPLOYEE INFO------------------");
		System.out.println("EMPNO : " + empNo);
		System.out.println("COMPANY NAME : " + companyName);
		System.out.println("DESIGNATION : " + designation);
		System.out.println("SALARY : " + salary);
		
	}
}