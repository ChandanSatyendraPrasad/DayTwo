import java.util.Scanner;

public class Nonprimitive_String {
    public static void main(String[] args) {
        // Lets see how to declare a String variable and use of it.
        String  myName ="Chandan";
        System.out.println("myName= " + myName);

        String  mySurname="Prasad";
        System.out.println("mySurname= " + mySurname);

        // Now Lets concatenate my name and surname and assign to another variable myFullName. To concatenate we can use + operator.
        String  myFullName =myName+mySurname;
        System.out.println("myFullName= " + myFullName);

        //As wee see there is a space necessary in between my name and my surname so We will put directly a space char  surrounded double quotes without using a variable in between them.
        myFullName =myName+ " " + mySurname;
        System.out.println("myFullName= " + myFullName);

        // We can also concatenate a String value with other types using + operator with no effort. Lets assume that we need to concatenate myname and my birth year to create a speacial code or a password. We do either concatenate my birth year directly without using double quota or we can assign it to an int variable than concatenate. Either way works.
        String  myCode = myName + 1987;
        System.out.println("myCode= " + myCode);

        int  myBirthDate=1988;
        myCode = myName + myBirthDate;
        System.out.println("myCode= " + myCode);

        // To concatenate more numeric values  we need at least one double
        // quote that surrounds empty
        String  myExactBirthDate =""+1986+"/"+8+"/"+10;
        System.out.println("myExactBirthDate= " + myExactBirthDate);

        //If a String literal includes double quotation marks itself we need
        // to use escape character which is backslash. Lets assume that we want to print  William says  "Java is a very nice language" that includes quotation marks

        String s_test ;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Your Password");
        s_test=scanner.nextLine();
        System.out.println(" Your Password "+s_test);


    }
}
