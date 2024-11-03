package start;

public class Main17 {

    public static void main(String[] args) {
        String txt1 = "OHD";
        System.out.println(txt1.length());     // 3

        String txt2 = "oHd";
        String txt3 = "ohd";
        System.out.println(txt2.toUpperCase());    // OHD
        System.out.println(txt3.toLowerCase());    // ohd

        String txt4 = "Omer \t Halis  De\bmir";
        System.out.println(txt4);     //  Omer   Halis  Dmir
        String txt5 = "Omer\rHalis";
        System.out.println(txt5);              // Halis

        String txt6 = "It\'s alright.";
        System.out.println(txt6);     // It's alright.
        String txt7 = "Omer \"Halis\" Demir";
        System.out.println(txt7);     // Omer "Halis" Demir
        String txt8 = "The character \\ is called backslash.";
        System.out.println(txt8);     // The character \ is called backslash.

        String txt9 = "Please locate where 'locate' occurs!";
        System.out.println(txt9.indexOf("locate"));      // 7
        System.out.println(txt9.lastIndexOf("locate"));  // 21

        String txt10 = "Omer";
        String txt11 = "Halis";
        System.out.println(txt10.concat(txt11));   // Omer Halis

        String txt12 = "OHD";
        System.out.println(txt12.contains("o"));       // false
        System.out.println(txt12.contains("O"));      // true
        System.out.println(txt12.contains("OHD")); // true
        System.out.println(txt12.contentEquals("OHD"));  // true
        System.out.println(txt12.contentEquals("O"));      // false
        System.out.println(txt12.contentEquals("OH"));   // false
        System.out.println(txt12.endsWith("OH"));         // false
        System.out.println(txt12.endsWith("HD"));         // true
        System.out.println(txt12.endsWith("D"));           //true
        System.out.println(txt12.startsWith("O"));        // true
        System.out.println(txt12.startsWith("OH"));     // true
        System.out.println(txt12.startsWith("D"));        // false

        String txt13 = "OHD";
        String txt14 = "OHD";
        String txt15 = "ohd";
        System.out.println(txt13.equals(txt14));   // true
        System.out.println(txt13.equals(txt15));   // false

        String txt16 = "OHD";
        String txt17 = "ohd";
        System.out.println(txt16.equalsIgnoreCase(txt17));   // true

        String txt18 = "OHD";
        char result = txt18.charAt(0);
        System.out.println(result);        // O

        String txt19 = "Hello";
        String txt20 = " ";
        String txt21 = "";
        System.out.println(txt19.isEmpty());   // false
        System.out.println(txt20.isEmpty());   // false
        System.out.println(txt21.isEmpty());   // true

        String txt22 = "cat|dog|fish";
        System.out.println("c".matches(txt22));      // false
        System.out.println("dog".matches(txt22));    // true
        System.out.println("catfish".matches(txt22));   // false

        String txt23 = "Omer";
        System.out.println(txt23.replace('m', 'n'));  //Oner

        String txt24 = "       OHD        ";
        System.out.println(txt24.trim());    //  OHD

        String txt25 = "Hello, World!";
        System.out.println(txt25.subSequence(7, 12));     // World

        String txt26 = "This is school.";
        String txt27 = "is";
        System.out.println(txt26.replaceFirst(txt27, "at"));    // That is school.

        char[] txt28 = {'O', 'H', 'D'};
        String txt29 = String.copyValueOf(txt28, 0, 3);  // Boş string atamasını kaldırdık
        System.out.println(txt29);  // OHD

        String txt30 = "Hello, World!";
        System.out.println(txt30.substring(7, 12));   // World

        char[] myArray = {'a', 'b', 'c'};
        System.out.println(String.valueOf(myArray));   // abc
        System.out.println(String.valueOf('A'));       // A
        System.out.println(String.valueOf(true));      // true
        System.out.println(String.valueOf(4.5f));      // 4.5
        System.out.println(String.valueOf(5.2));       // 5.2
        System.out.println(String.valueOf(12));        // 12
        System.out.println(String.valueOf(1400L));     // 1400
    }
}
