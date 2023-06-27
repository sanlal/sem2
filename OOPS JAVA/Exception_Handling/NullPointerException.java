public class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        try {
            int len = str.length();
            System.out.println(len);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        }
    }
}
