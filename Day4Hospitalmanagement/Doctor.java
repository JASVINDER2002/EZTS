package Day4Hospitalmanagement;

public class Doctor {
	
	private String name;
	private String specialisation; 
	private int age;
	private String gender;
	void inputofdoctor(String nameofdoctor,String specialisationofdoctor,int Ageofdoctor,String genderofdoctor)
	{
		this.name = nameofdoctor;
		this.specialisation = specialisationofdoctor;
		this.age = Ageofdoctor;
		this.gender = genderofdoctor;
	}
	void outputofdoctorinformation()
	{
		System.out.println("*************Doctor****************");
		System.out.println("Name of Doctor :"+this.name);
		System.out.println("Age of Doctor :"+this.age);
		System.out.println("Specialisation of doctor:"+this.specialisation);
		System.out.println("Gender :"+this.gender);

	}

}
