public class Main {
    public static void main(String[] args) {
        System.out.println(scoreOfString("DAScd"));
    }

    public static int scoreOfString(String s){
        int total =0;
        for (int i = 0; i < s.length()-1; i++) {
            total += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return total;
    }
}
