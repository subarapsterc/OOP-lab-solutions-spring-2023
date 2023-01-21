package Lab01;

public class Problem02 {
    public static void main(String[] args) {
        String orig = "aabababacdefaa";
        String want = "bacd";

        int index = locate(orig, want);
        System.out.println(index);
    }
    
    private static int locate(String string, String substring) {
        for (int i = 0; i < string.length() - (substring.length() - 1); i++) {
            
        }
        
        return -1;
    }
}
