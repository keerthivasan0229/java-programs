public class Palindrome {
    public static void main(String[] args) {
        String str = "1222"; // you can change this word
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println("Palindrome: " + str);
        } else {
            System.out.println("Not Palindrome: " + str);
        }
    }
}
