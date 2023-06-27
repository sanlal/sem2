public class BufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        
        // append method
        sb.append("World!");
        System.out.println(sb);  // Output: Hello World!

        // insert method
        sb.insert(6, "insert ");
        System.out.println(sb);  // Output: Hello Java World!

        // delete method
        sb.delete(6, 11);
        System.out.println(sb);  // Output: Hello World!

        // replace method
        sb.replace(5, 6, ", ");
        System.out.println(sb);  // Output: Hello, World!

        // reverse method
        sb.reverse();
        System.out.println(sb);  // Output: !dlroW ,olleH
    }
}
