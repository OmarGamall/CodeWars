import java.util.HashMap;

public class HexToRGB
{
    public static HashMap<String, Integer> hexStringToRGB(String hex) {

        // 1. Parse the string to three components (r, g, b)
        // We skip index 0 to ignore the '#' character
        String rHex = hex.substring(1, 3);
        String gHex = hex.substring(3, 5);
        String bHex = hex.substring(5, 7);

        // 2. Convert each component from hex notation to decimal notation
        // Integer.parseInt(string, 16) handles the base-16 conversion
        int r = Integer.parseInt(rHex, 16);
        int g = Integer.parseInt(gHex, 16);
        int b = Integer.parseInt(bHex, 16);

        // 3. Finally return the map
        // Using HashMap for compatibility; Map.of is available in Java 9+
        HashMap<String, Integer> rgbMap = new HashMap<>();
        rgbMap.put("r", r);
        rgbMap.put("g", g);
        rgbMap.put("b", b);

        return rgbMap;
    }
}
