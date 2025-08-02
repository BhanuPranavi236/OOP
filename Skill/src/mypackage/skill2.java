package mypackage;

public class skill2 {
    public static void main(String[] args) {
        String text = "  Java Programming  ";

        System.out.println("String Methods:");
        System.out.println("Original: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Upper case: " + text.toUpperCase());
        System.out.println("Lower case: " + text.toLowerCase());
        System.out.println("Substring from index 5: " + text.substring(5));
        System.out.println("Substring from index 5 to 16: " + text.substring(5, 16));
        System.out.println("Contains 'Program'? " + text.contains("Program"));
        System.out.println("Replace 'a' with '@': " + text.replace('a', '@'));
        System.out.println("Starts with '  Java'? " + text.startsWith("  Java"));
        System.out.println("Ends with '  '? " + text.endsWith("  "));
        System.out.println("Character at index 3: " + text.charAt(3));
        System.out.println("Index of 'g': " + text.indexOf("g"));
        System.out.println("Equals '  Java Programming  '? " + text.equals("  Java Programming  "));
        System.out.println("EqualsIgnoreCase '  java programming  '? " + text.equalsIgnoreCase("  java programming  "));

        System.out.println("\nString Comparison:");

        String s1 = "Code";
        String s2 = "Code";
        String s3 = new String("Code");
        String s4 = "code";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4));
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
    }

}
