import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sb = "";
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        String stringVal = booleanAnd(number1, number2);
        int diff = 8 - stringVal.length();
        for (int i = 0; i < diff; i++) {
            sb += "0";
        }
        sb = sb + stringVal;
        System.out.println(sb);
        s.close();
    }

    public static String booleanAnd(int number1, int number2) {
        Scanner s = new Scanner(System.in);
        number1 = s.nextInt();
        number2 = s.nextInt();
        int result = number1 & number2;
        return Integer.toBinaryString(result);
    }

}