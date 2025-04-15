public class Main {


    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};

        reverseString(chars);

    }


    public static void reverseString(char[] str){
        int left = 0;
        int right = str.length -1;


        while (left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

        for (char c : str) {
            System.out.print(c+" ");
        }
    }
}
