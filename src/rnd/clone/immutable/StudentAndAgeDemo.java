package rnd.clone.immutable;

public class StudentAndAgeDemo {
	 public static void main(String[] args) {
		 
		    Age age = new Age();
		    age.setDay(1);
		    age.setMonth(1);
		    age.setYear(1992);
		    ImmutableStudent1 student = new ImmutableStudent1(1, "Alex", age);

		    System.out.println("Alex age year before modification = " + student.getAge().getYear());
		    age.setYear(1993);
		    System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}

}

final class ImmutableStudent1 {

	private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent1(int id, String name, Age age) {
    	Age ageClone= new Age();
    	ageClone.setDay(age.getDay());
    	ageClone.setMonth(age.getMonth());
    	ageClone.setYear(age.getYear());
    	
    this.name = name;
    this.id = id;
    this.age = ageClone;
    }

    public int getId() {
    return id;
    }

    public String getName() {
    return name;
    }

    public Age getAge() {
    return age;
    }
    
}

class Age {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
    this.day = day;
    }

    public int getMonth() {
    return month;
    }

    public void setMonth(int month) {
    this.month = month;
    }

    public int getYear() {
    return year;
    }

    public void setYear(int year) {
    this.year = year;
    }

}