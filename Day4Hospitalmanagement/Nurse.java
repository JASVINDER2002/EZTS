package Day4Hospitalmanagement;

public class Nurse {
     private String name;
	 private int floor;
	 void nurseinput(String nameofnurse,int floorofnurse)
	 {
		 this.name= nameofnurse;
		 this.floor = floorofnurse;
	 }
	 void nurseoutput()
	 {
		 System.out.println("Name of the nurse :"+name);
		 System.out.println("Floor of the nurse :"+floor);
	 }
}
