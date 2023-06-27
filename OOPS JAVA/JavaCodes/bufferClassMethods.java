public class bufferClassMethods {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello ");

    // append method
    sb.append("World!");
    System.out.println(sb); // Output: Hello World!

    // insert method
    sb.insert(6, "insert ");
    System.out.println(sb); // Output: Hello Java World!

    // delete method
    sb.delete(6, 11);
    System.out.println(sb); // Output: Hello World!

    // replace method
    sb.replace(5, 6, ", ");
    System.out.println(sb); // Output: Hello, World!

    // reverse method
    sb.reverse();
    System.out.println(sb); // Output: !dlroW ,olleH

    //lenght method
    int len = sb.length();
    System.out.println(sb);

    //capacity method
    int cap = sb.capacity();
    System.out.println(sb);

    //setlenght method
    sb.setLength(10);
    System.out.println(sb);

    //char
    char c = sb.charAt(5);
    System.out.println(sb);

    String str = sb.toString();
    System.out.println(sb);

    sb.trimToSize();
    System.out.println(sb);

    sb.ensureCapacity(20);
    System.out.println(sb);

    int index = sb.indexOf("world");
    System.out.println(sb);

    int lastIndex = sb.lastIndexOf("l");
    System.out.println(sb);

    String sub = sb.substring(5);
    System.out.println(sb);

    String subb = sb.substring(5, 10);
    System.out.println(sb);

  }
}
