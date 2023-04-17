public class Data_Types_And_Variables {
    public static void main(String[] args) {
        // Let's start with declaring a variable whose type is byte
        byte byteVal = 5;
        //Now we first  assigned 5  which is in the range.
        System.out.println("byteVal= " + byteVal);
        // Let's change its value to -5  which is in the range and print it again
        byteVal = -5;
        System.out.println("byteVal= " + byteVal);
        // To print  size of byte data type we use associated Wrapper class
        // which starts with capital B
        System.out.println("Byte Size Is = " + Byte.SIZE);
        // Now lets try to find out maximum and minimum values of the byte
        // data type. Again we use associated wrapper class to find  range values
        System.out.println("Byte Datatype values...");
        System.out.println("Min = " + Byte.MIN_VALUE);
        System.out.println("Max = " + Byte.MAX_VALUE);

// Lets start with declaring a variable whose type is short
        short shortVal = 256;
        // Now we first  assigned 256 which is in the range and bigger than
        // maximum byte
        System.out.println("shortVal= " + shortVal);
        /// Lets change its value to -256 which is in the range and print it
        // again
        shortVal=--shortVal;
        System.out.println("shortVal= " + shortVal);
        // To print  size of short  data type we use associated Wrapper class
        // which starts with capital S
        System.out.println("Short Size Is = " + Short.SIZE);
        // Now lets try to find out maximum and minimum values of the short
        // data type. Again we use associated wrapper class to find  range values
        System.out.println("Short Datatype values...");
        System.out.println("Min = " + Short.MIN_VALUE);
        System.out.println("Max = " + Short.MAX_VALUE);


        // Lets start with declaring a variable whose type is int
        int intVal = 33000;
        // Now we first  assigned 33000 which is in the range and bigger than
        // maximum short
        System.out.println("intVal= " + intVal);
        // Lets change its value to - 33000 which is in the range and print
        // it again
        intVal = -33000;
        System.out.println("intVal= " + intVal);
        // To print  size of int data type we use associated Wrapper class
        // which starts with capital I
        System.out.println("Integer Size Is = " + Integer.SIZE);
        // Now lets try to find out maximum and minimum values of the int data
        // type. Again we use associated wrapper class to find  range values
        System.out.println("Int Datatype values...");
        System.out.println("Min = " + Integer.MIN_VALUE);
        System.out.println("Max = " + Integer.MAX_VALUE);

        // Lets start with declaring a variable whose type is long
        long longVal = 33000;
        //Now we first  assigned 3000000000 (3 billion) which is in the range
        // and bigger than maximum int
        System.out.println("longVal= " + longVal);
        //Lets change its value to - 3000000000 which is in the range and
        // print it again
        longVal = -3000000000l;
        System.out.println("longVal= " + longVal);
        // To print  size of long data type we use associated Wrapper class
        // which starts with capital L
        System.out.println("Long Size Is = " + Long.SIZE);
        // Now lets try to find out maximum and minimum values of the Long
        // data type. Again we use associated wrapper class to find  range values
        System.out.println("Long Datatype values...");
        System.out.println("Min = " + Long.MIN_VALUE);
        System.out.println("Max = " + Long.MAX_VALUE);

    }
}
