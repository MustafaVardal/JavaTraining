public class Main {

    public static void main(String[] args) {

        String[] arr = {"flower","flow","fly"};

        System.out.println("Most common prefix is -> " + commonPrefix(arr));

    }

    private static String commonPrefix(String[] arr) {

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int j = 0;

            while(j < Math.min(prefix.length(), arr[i].length())){
                if (prefix.charAt(j) != arr[i].charAt(j)){
                    break;
                }
                j++;
            }

            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
