package StudentExam;

import java.io.FileWriter;
import java.io.IOException;


public class ScoreLogger {
    private String fileName;

    public ScoreLogger(String fileName) {
        this.fileName = fileName;
    }

    
    public synchronized void logScore(Student student) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, true); 
            writer.write(student.toString() + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}