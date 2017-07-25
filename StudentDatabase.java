class Student {
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase {
	public static void main(String[] args) {
		Student[] db;
		/* Study Drill #1. Give the database a capacity for 4 students, but don't fill
		them all. This will compile but it will fail during the for loop at lines 30-34.
		This is because it reaches a point when db[3] is null. I'm not sure why it doesn't
		just print out null null null. I guess because db[3] is null, but db[3].name does
		not have a value of null in it, it just doesn't exist. This is error:
		"Exception in thread "main" java.lang.NullPointerException
			at StudentDatabase.main(StudentDatabase.java:31)"
		*/
		db = new Student[4];
		
		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;
		
		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 3.9;
		
		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;
		
		db[3] = new Student();
		db[3].name = "Anna";
		db[3].credits = 59;
		db[3].gpa = 4.0;
		
		for (int i=0; i<db.length; i++) {
			System.out.println("Name: " + db[i].name);
			System.out.println("\tCredit hours: " + db[i].credits);
			System.out.println("\tGPA: " + db[i].gpa + "\n");
		}
		
		int maxLoc = 0;
		int fewCredits = 0;
		
		for (int i=1; i<db.length; i++) {
			if (db[i].gpa > db[maxLoc].gpa) {
				maxLoc = i;
			}
			if (db[i].credits < db[fewCredits].credits) {
				fewCredits = i;
			}
		}
		
		System.out.println(db[maxLoc].name + " has the hightest GPA.");
		System.out.println(db[fewCredits].name + " has the fewest number of credits.");

	}
}