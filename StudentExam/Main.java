package StudentExam;

public class Main {

	
	    public static void main(String[] args) {
	        System.out.println("Lets Start Student Exam Scorrer...");

	        String fileName = "scores.csv"; 
	        ScoreLogger logger = new ScoreLogger(fileName);

	       
	        Thread t1 = new Thread(new StudentTask(new Student("Hardik", 101, 85), logger));
	        Thread t2 = new Thread(new StudentTask(new Student("dishan", 102, 90), logger));
	        Thread t3 = new Thread(new StudentTask(new Student("vineeth", 103, 78), logger));

	       
	        t1.start();
	        t2.start();
	        t3.start();

	        
	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Everyone Has Submitted successfully!");
	    }
	    }