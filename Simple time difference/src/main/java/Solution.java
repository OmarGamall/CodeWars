import java.util.*;
class Solution{
    public static String solve(String [] arr)
    {
        if (arr == null || arr.length == 0) return "00:00";
        else if(arr.length == 1) return "23:59";

        // 1. Convert to minutes and remove duplicates using a Set
        Set<Integer> minuteSet = new HashSet<>();
        for (String time : arr)
        {
            String[] parts = time.split(":");
            int mins = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
            minuteSet.add(mins);
        }

        List<Integer> times = new ArrayList<>(minuteSet);

        // Step 1: Order the time Array from largest to lowest
        Collections.sort(times, Collections.reverseOrder());

        int maxDiff = 0;

        // Step 2: Loop and calculate the biggest diff
        // Compare adjacent elements in the sorted list
        for (int i = 0; i < times.size() - 1; i++)
        {
            int diff = times.get(i) - times.get(i + 1) - 1;
            maxDiff = Math.max(maxDiff, diff);
        }

        // Handle the wrap-around case (Midnight boundary)
        // Interval between the smallest time and the largest time (next day)
        int first = times.get(times.size() - 1); // Smallest
        int last = times.get(0);                // Largest
        int wrapAroundDiff = (1440 - last) + first - 1;
        maxDiff = Math.max(maxDiff, wrapAroundDiff);

        // Step 3: Return the maxDiff formatted as HH:MM
        return String.format("%02d:%02d", maxDiff / 60, maxDiff % 60);
    }
}