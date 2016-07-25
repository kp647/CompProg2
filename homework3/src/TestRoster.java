public class TestRoster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("John","Doe");
		Student s2 = new Student("kevin","patel");
		Student s5 = new Student("mike","jackson");
		Student s3 = new Student("Kevin","Pagan");
		Student s4 = new Student("kevin","patel");
		Course c1 = new Course(198, 111);
		Roster r1 = new Roster(4, c1);
		System.out.println(r1);
		testAdd(r1, s1);
		testAdd(r1,s2);
		testAdd(r1, s3);
		testAdd(r1, s4);
		testAdd(r1, s5);
		System.out.println(r1.findStudent(s3));
		System.out.println(r1.dropStudent(s3));
		System.out.println(r1);
		System.out.println(r1.findStudent(s3));
		System.out.println(r1.isFull());
		testAdd(r1, s3);
		System.out.println(r1.isFull());
	}

    private static void testAdd(Roster r, Student s){
	System.out.println(s.familyName+" "+r.addStudent(s));
	System.out.println(r);
	//System.out.println(r.findStudent(s));
    }	
}
