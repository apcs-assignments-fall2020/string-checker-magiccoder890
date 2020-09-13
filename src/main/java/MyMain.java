import java.util.Scanner;

public class MyMain {
    
    public static int countABC(String str) {
        String str2 = str.toLowerCase();
        //System.out.print(str2.length());
        int a_number = 0;
        int b_number = 0;
        int c_number = 0;
        for (int i = 0; i < str2.length();i++) {
            char Detected_Character = str2.charAt(i);
            if ("a".indexOf(Detected_Character) == 0) {
                a_number = a_number + 1;
            }
            else if ("b".indexOf(Detected_Character) == 0) {
                b_number = b_number + 1;
            }
            else if ("c".indexOf(Detected_Character) == 0) {
                c_number = c_number + 1;

            }
        }
        System.out.print("There are "+ a_number + " as, and " + b_number + " bs, and " + c_number + " cs.");
        return a_number + b_number + c_number;
        
    }

    public static boolean containsThe(String str) {
        if (str.contains("the")) {
            System.out.print("Yes, it has the");
            return true;
        }
        if (str.contains("The")){
            System.out.print("Yes, it has The");
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        char[] chr = str.toCharArray();
        int index_num = 0;
        for (int i = chr.length - 1; i >= 0; i--) {
            if (str.charAt(index_num) != chr[i]) {
                System.out.print("No, it not a palindrome");
                return false;
            }
            else {
                index_num = index_num + 1;
                return true;
            }
        }
        if (index_num == str.length()) {
            System.out.print("Yes, it is a palindrome");
        }
        return true;
    }

    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a string for us to detect");
        String str = scanner.nextLine();
        countABC(str);
        System.out.print("\n");
        containsThe(str);
        System.out.print("\n");
        isPalindrome(str);
        scanner.close();
    }
}
