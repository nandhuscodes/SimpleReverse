import java.util.Scanner;

public class SimpleReverse {
    static String reverseString(String string){
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(reverseString(string));
    }
}
