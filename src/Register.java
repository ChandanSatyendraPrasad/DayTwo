import java.util.Scanner;

public class Register {
    static String email,username,password;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sing Up");
        System.out.println("Enter Your Email ID");
        email=scanner.nextLine();
        System.out.println("Enter Your Username");
        username=scanner.nextLine();
        System.out.println("Enter Your Password");
        password=scanner.nextLine();

        int passwordlength =0;
        passwordlength=password.length();
        if (passwordlength>=8) {
            System.out.println("Your Email ID " + email);
            System.out.println("Your Username " + username);
            System.out.println("Your Password " + password);

            System.out.println("SubString Way "+email.substring(4));
            System.out.println("SubString Way "+email.substring(6));

        }
        else
        {
            System.out.println("Registration Failed as Password is Short");
        }
    }
}
