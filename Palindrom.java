public class Palindrom {

    public static void main(String args[]){

        System.out.println("är aaa palindrom " + isPalindromString("aaa"));
        System.out.println("är abc palindrom " + isPalindromString("abc"));
        System.out.println("är bbbb palindrom " + isPalindromString("aaa"));
        System.out.println("är defg palindrom " + isPalindromString("defg"));

    }

    //metod för kolla om palindrom

    public static boolean isPalindromString(String text){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }
        return false;
    }

    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }

}
