package StudentExam;

public class Student {

	  private String name;
	    private int rollNo;
	    private int marks;

	    
	    public Student(String name, int rollNo, int marks) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.marks = marks;
	    }

	
	    public String getName() {
	        return name;
	    }

	    public int getRollNumber() {
	        return rollNo;
	    }

	    public int getMarks() {
	        return marks;
	    }

	    
	    @Override
	    public String toString() {
	        return rollNo + "," + name + "," + marks;
	    }
	}