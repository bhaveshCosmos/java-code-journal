public class StringBasic {
    static void main(String[] args) {
        // String Literals
        String firstName = "Bhavesh";
        // String Constructor
        String lastName = new String("Upadhyay");

        // Memory
        String greet1 = "Hello";
        String greet2 = "Hello";
        String greet3 = new String("Hello");

        System.out.println(greet1 == greet2); // (Same Reference in String Pool)
        System.out.println(greet1 == greet3); // (Different Objects)
        System.out.println(greet1.equals(greet3)); // (Content)

        // Methods
        String s = "Java Programming";

        // 1. length()
        System.out.println(s.length());          // 16

        // 2. charAt()
        System.out.println(s.charAt(2));          // v

        // 3. toUpperCase()
        System.out.println(s.toUpperCase());      // JAVA PROGRAMMING

        // 4. toLowerCase()
        System.out.println(s.toLowerCase());      // java programming

        // 5. substring()
        System.out.println(s.substring(5));       // Programming
        System.out.println(s.substring(0, 4));    // Java

        // 6. contains()
        System.out.println(s.contains("Java"));   // true

        // 7. equals()
        System.out.println(s.equals("Java"));     // false

        // 8. equalsIgnoreCase()
        System.out.println(s.equalsIgnoreCase("java programming")); // true

        // 9. indexOf()
        System.out.println(s.indexOf("P"));       // 5

        // 10. replace()
        System.out.println(s.replace("Java", "Core Java"));

        // 11. trim()
        String t = "  Hello  ";
        System.out.println(t.trim());             // Hello

        // 12. split()
        String[] arr = s.split(" ");
        System.out.println(arr[0]);                // Java
        System.out.println(arr[1]);                // Programming

        // 13. isEmpty()
        String empty = "";
        System.out.println(empty.isEmpty());      // true

    }

}
