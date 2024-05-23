package Day4Hospitalmanagement;
import java.util.Scanner;
public class Hospital {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option  = sc.nextInt();
		switch(option) {
		case 1:
			Doctor d = new Doctor();
			String dn = sc.next();                 // "G Mohan reddy";
			String ds = sc.next();                 //"General Surgeon";
			int da = sc.nextInt();
			String dg =sc.next();                   //"Male";
			
			d.inputofdoctor(dn, ds, da, dg);
			d.outputofdoctorinformation();
			break;
			
		case 2:
			Patient p = new Patient();
			String n = sc.next();         //"srikar";
			int a = sc.nextInt();         //30;
			String g = sc.next();         //"male";
			boolean i = sc.nextBoolean();
			p.patientInput(n,a, g, i);
			
			p.patientoutput();
			break;
			
		case 3:
			Nurse nurseobject = new Nurse();
			String name =sc.next();           //"Priya";
			int floor = sc.nextInt();         //5;
			
			nurseobject.nurseinput(name, floor);
			nurseobject.nurseoutput();
			break;
			
			
		}
	}
}
