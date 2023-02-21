package CourseWork2.Ticket_14;

public class Main {
    public static void main(String[] args) {
        String s = "А роза упала на лапу азора";
        isPalindrome(s);
        removeSpaceString(s);
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}|\\p{Space}", "").toLowerCase();
        StringBuffer sPalindrome = new StringBuffer(s);
        sPalindrome.reverse();
        String s1 = new String(sPalindrome);
        System.out.println(sPalindrome);
        System.out.println(s);
        if (s.equals(s1)) {
            System.out.println("УРА! Это палиндром!");
        } else{
            System.out.println("Похоже это не палиндром!");
        }
        return true;
    }
    public static void removeSpaceString(String s) {
        String s1[] = s.split(" ");
        StringBuilder removeSpace = new StringBuilder();
        for (String s2: s1 ) {
            removeSpace.append(s2);
        }
        s = removeSpace.toString();
        System.out.println(s);
    }
}
