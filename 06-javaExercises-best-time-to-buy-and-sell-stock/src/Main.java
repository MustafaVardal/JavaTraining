public class Main {
    public static void main(String[] args) {


        int[] list = new int[]{7,1,5,3,6,4};

        int net = maxProfit(list);
        System.out.println("Your earning total earning will be \n"
                + net);

    }

    private static int maxProfit(int[] list) {

        int buy = list[0];
        int profit = 0;
        for (int i = 1; i < list.length; i++){
            if (list[i] < buy){
                buy = list[i];
            } else if (list[i] - buy > profit){
                profit = list[i] - buy;
            }
        }
        return profit;
    }
}

