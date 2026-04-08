public class SumParts
{
    public static int[] sumParts(int[] ls) {
        // The result array is always size N + 1
        int[] result = new int[ls.length + 1];

        // Start from the end
        for (int i = ls.length - 1; i >= 0; i--) {
            result[i] = result[i + 1] + ls[i];
        }

        return result;
    }
}
