
public class StudyClass {

	public static void main(String[] args) {
//		Student student1 = new Student();
//		Student student2 = new Student("aa");
//		int a = Student.Student(3);
//		
//		System.out.println(student1);
//		System.out.println(student2);
//		System.out.println(a);
		Student student1 = new Student("jk",28);
		Student student2 = new Student("kk",10);
		Student student3 = new Student("kk",10);
		
//		String name1 = student.getName();
//		int age1 = student.getAge();
//		
//		String name2 = student2.getName();
//		int age2 = student2.getAge();
//		
//		String name3 = student3.getName();
//		int age3 = student3.getAge();
		String[] name = new String[3];
		
		for (int i = 0; i<name.length; i++ ) {
			String student = "student"+i;
			name[i] = student1.getName();
		}
		

//		System.out.println(name1 +" " + age1);
//		System.out.println(name2 +" " + age2);
//		System.out.println(name3 +" " + age3);

	}

}

class Student{
//	public Student() {
//		System.out.println("aaaa");
//	}
//
//
//	public Student(String name) {
//		System.out.println(name);
//	}
//	public static int Student(int a) {
//		return a;
//	}
	private String name;
	private int age;
	
	public Student(String name, int age){
		this.name= name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}

