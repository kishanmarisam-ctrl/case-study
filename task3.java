class task3 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello World");
        StringBuffer s2 = new StringBuffer(20);
        StringBuffer s3 = new StringBuffer();

        System.out.println("Length: " + s.length());
        System.out.println("Capacity: " + s.capacity());

        s.ensureCapacity(50);
        s.setLength(5);

        System.out.println("Character: " + s.charAt(1));
        s.setCharAt(0, 'Y');

        char[] a = new char[5];
        s.getChars(0, 5, a, 0);
        System.out.println(a);

        s.append(" Java");
        s.insert(5, "!");
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        s.delete(0, 2);
        s.deleteCharAt(0);
        s.replace(0, 2, "Hi");
        System.out.println(s);
    }
}

