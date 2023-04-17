public class ExpressionType {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        byte b = 10;
        short s = 10;
        int i = 1;
        long l = 1;

        float f = 1.0F;
        double d = 1.0;

        char c = 1;

        int intExpressionType = b + b;
        System.out.println("intExpressionType=" + intExpressionType);
        int intExpressionType2 = s + s;
        System.out.println("intExpressionType2=" + intExpressionType2);
        int intExpressionType3 = b + i + c;
        System.out.println("intExpressionType3=" + intExpressionType3);
        long longExpressionType = i + l;
        System.out.println("intExpressionType 4=" + longExpressionType);
        float floatExpressionType = l + f;
        System.out.println("intExpressionType 5=" + floatExpressionType);
        double doubleExpressionType = f + d;
        System.out.println("intExpressionType 6=" + doubleExpressionType);
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335

        System.out.println("Hello " + 1); // Hello 1
        System.out.println("Hello " + null); // Hello null

        l = ((b * b) + (s * s) + 2 * b * s);
        System.out.println("(A + B)^2 = " + l);

        l = ((b * b) + (s * s) + 2 * (b * s));
        System.out.println("New (A + B)^2 = " + l);

        String s1 = "Chandan   ";

        System.out.println("Test 1 = " + s1);
        System.out.println("Test 2 = " + s1.toLowerCase());
        System.out.println("Test 3 = " + s1.toUpperCase());
        System.out.println("Test 4 = " + s1.length());
        String s2 = s1;
        System.out.println("Test 5 = " + s2.trim().length());
        s2 = s2.trim();
        int doctorG = s2.length();
        System.out.println("doctorG = " + doctorG);
        while (doctorG != 0) {
           System.out.println(doctorG);
           System.out.println(s2.substring(doctorG-1));
            System.out.println(s2.charAt(doctorG-1));

            doctorG--;
        }

    }
}
