package StudentExam;

public class StudentTask implements Runnable {
    private Student stud;
    private ScoreLogger logger;

    public StudentTask(Student stud, ScoreLogger logger) {
        this.stud = stud;
        this.logger = logger;
    }

    @Override
    public void run() {
        logger.logScore(stud);
        System.out.println(Thread.currentThread().getName() + " submitted -> " + stud);
    }
}