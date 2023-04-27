class hello {
    public native void displayhello();

    static {
        System.loadLibrary("hello");
    }
    
    public static void main(String[] args) {
        new hello().displayhello();
    }
}