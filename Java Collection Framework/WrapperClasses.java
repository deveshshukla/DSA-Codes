public class WrapperClasses {
    public static void main(String[] args) {

        /*
            Wrapper Classes: It is a class in Java, whose object wraps/cover primitive data types. 
            
            Why? --> Because Data Structures in the collection framework (i.e: ArrayList, LinkedList, etc.) store in the form of object/refrence types only & not in primetive data type.

            The classes in java.util package handles only objects and hence wrapper classes help in this case also.

            Eg: char - Character, int - Integer, etc.
        */

        Integer intObj1 = Integer.valueOf(7); // <-- Integer wrapper class
        System.out.println("Integer wrapper: "+intObj1);

        // Imp: String to Integer wrapper conversion
        Integer intObj2 = Integer.valueOf("7");
        System.out.println("Str to Int wrapper conversion: "+intObj2);

        Boolean boolObj = Boolean.valueOf(true); // <-- Boolean wrapper class
        System.out.println("Boolean wrapper: "+boolObj);

        /*
            Autoboxing:
            The automatic conversion of primitive types to the object of their corresponding
            wrapper classes is knoyyn as autoboxing. For example — conversion of int to
            Integer, long to Long, double to Double, etc.

            Unboxing:
            It is just the reverse process of autoboxing. Automatically converting an object
            of a wrapper class to its corresponding primitive type is known as unboxing. For
            example — conversion of Integer to int, Long to long, Double to double, etc.

            Note: Java autometically handel's this conversions in runtime.
        */

        Integer intObj3 = 7; // <-- This is called: Autoboxing.
        System.out.println("Autoboxing: "+intObj3);

        int num = intObj3; // <-- This is called: Unboxing.
        System.out.println("Unboxing: "+num);
    }
}
