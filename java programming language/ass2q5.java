import java.util.Scanner;

public class ass2q5 {

    public static void count(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("The number of elements are:"+count);
    }
    // Function to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        System.out.println("Palindrome words in the sentence:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
        count(sentence);
    }
}
