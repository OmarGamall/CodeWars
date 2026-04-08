import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest
{
    @Test
    public void basicTests()
    {
        assertEquals("23:59",Solution.solve(new String[] {"14:51"}));
        assertEquals("09:10",Solution.solve(new String[] {"21:14", "15:34", "14:51", "06:25", "15:30"}));
        assertEquals("11:40",Solution.solve(new String[] {"23:00","04:22","18:05","06:24"}));
    }
    @Test
    public void edgeCaseTests() {
        // Duplicate times: Should be ignored (Gap between 12:00 and 12:00 across midnight)
        assertEquals("23:59", Solution.solve(new String[] {"12:00", "12:00"}));

        // Midnight boundary: Alarm at 00:00 and 23:59
        // 00:00 rings until 00:01. 23:59 rings until 00:00.
        // The gap between 00:01 and 23:59 is 1438 minutes.
        assertEquals("23:58", Solution.solve(new String[] {"00:00", "23:59"}));

        // Alarms one minute apart: Quiet time should be 0 minutes
        assertEquals("23:58", Solution.solve(new String[] {"10:00", "10:01"}));
    }

    @Test
    public void spreadTests() {
        // Three alarms perfectly 8 hours apart (480 mins)
        // Each gap is 479 mins (07:59)
        assertEquals("07:59", Solution.solve(new String[] {"00:00", "08:00", "16:00"}));
    }
}