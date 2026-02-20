import java.util.Scanner;

public class Reverse {

    public static String reverse(String str) {
    char[] chars = str.toCharArray();

    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        left++;
        right--;
    }

    return new String(chars);
}


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
