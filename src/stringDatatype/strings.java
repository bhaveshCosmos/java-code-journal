// A string is an immutable object that represents a sequence of characters and is created using the String class in Java.

public class strings{
    public static void main(String[] args) {

        // Create
        String language = "Java"; 
        System.out.println(language);

        // Methods
        int len = language.length();
        System.out.println(len);

        char findChar = language.charAt(2);
        System.out.println(findChar);

        String lang = "JaVa";
        boolean check;
        check = lang.equals(language);
        System.out.println(check);
        System.out.println(lang.equalsIgnoreCase(language));

        System.out.println(lang.compareTo(language));

        String name = "   Bhavesh Upadhyay    ";
        System.out.println(((name.substring(11, name.length()).toUpperCase()).trim()));

        String formattedString = String.format("I am %s, age: %d", "Bhavesh Upadhyay", 19);
        System.out.println(formattedString);
    }

}