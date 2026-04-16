public class Kata {
    public static boolean solution(String str, String ending)
    {
        if (str.length() >= ending.length()) {
            String strEnd = str.substring(str.length() - ending.length());
            return strEnd.equals(ending);
        }
        return false;
    }
}