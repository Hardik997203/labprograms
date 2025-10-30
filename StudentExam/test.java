package StudentExam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class ScoreLoggerTest {

    @Test
    public void testSingleFileWrite() throws Exception {
        String fileName = "test_scores.csv";
        Files.deleteIfExists(Paths.get(fileName));

        ScoreLogger logger = new ScoreLogger(fileName);
        Student s = new Student("TestStudent", 111, 99);
        logger.logScore(s);

        List<String> lines = Files.readAllLines(Paths.get(fileName));
        assertEquals("111,TestStudent,99", lines.get(0));
    }

    @Test
    public void testThreadCompletion() throws Exception {
        String fileName = "thread_scores.csv";
        Files.deleteIfExists(Paths.get(fileName));

        ScoreLogger logger = new ScoreLogger(fileName);

        Thread t1 = new Thread(new StudentTask(new Student("A", 1, 70), logger));
        Thread t2 = new Thread(new StudentTask(new Student("B", 2, 80), logger));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        List<String> lines = Files.readAllLines(Paths.get(fileName));
        assertTrue(lines.size() >= 2);
    }
}