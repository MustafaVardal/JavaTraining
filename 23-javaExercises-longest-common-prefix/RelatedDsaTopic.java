public class RelatedDsaTopic {

    public static void main(String[] args) {
        String[] str = {"A","B","C","D"};

        boolean found = false;
        int index = 0;
        String s = "B";

        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i])){
                index=i; found = true; break;
            }
        }
        if (found){
            System.out.println(s + " found at index " + index);
        }
        else {
            System.out.println(s + " not found in the array");
        }


        String[] arr = {"cars", "dark", "park"};


        String prefix = arr[0];

        if (prefix.equals(arr[0])){
            System.out.println(arr[0]);
        }

        boolean equality= arr[0].length() == prefix.length();

        System.out.println(equality);

        boolean equal= prefix.charAt(0) == arr[0].charAt(0);
        System.out.println(equal);


      //  prefix.charAt(0) == arr[0].charAt(0); induction.

    }
}
