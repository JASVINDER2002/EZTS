package Day4Hospitalmanagement;

public class Patient {

	private String name;
	private int age;
	private String gender;
	private boolean insurance;
	
	void patientInput(String nameofpatient,int ageofpatient,String genderofpatient,boolean insuranceofpatient)
	{
		this.name = nameofpatient;
		this.age = ageofpatient;
		this.gender = genderofpatient;
		this.insurance = insuranceofpatient;
	}
	void patientoutput()
	{
		System.out.println("Name of patient :"+this.name);
		System.out.println("Age of patient :"+this.age);
		System.out.println("Gender :"+this.gender);
		System.out.println("Insurance :"+this.insurance);
	}
}
