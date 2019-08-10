package rnd.clone.shallowclone;

public class DeepCloneDemo {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
		Course course=new Course("hindi","English");
		Student student= new Student(123,course);
		System.out.println(student.getCourse().getSubject1());

			Student student2= (Student) student.clone();
			student2.getCourse().setSubject1("Math");
			
		System.out.println(student.getCourse().getSubject1());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}

}

class Student implements Cloneable{
	private int rollNo;
	private Course course;
	
	
	public Student(int rollNo, Course course) {
		super();
		this.rollNo = rollNo;
		this.course = course;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}	
}

class Course{
	
	String subject1;
	String subject2;
	public Course(String subject1, String subject2) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
	}
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	
	
	
}