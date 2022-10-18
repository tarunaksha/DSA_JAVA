package string;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aba";
        StringBuilder newStr = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            newStr.append(str.charAt(i));
        }
        if(str.equals(newStr.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
