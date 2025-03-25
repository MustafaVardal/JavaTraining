public class Main {
    public static void main(String[] args) {

        int[] flowers = {1,0,1,1,0,0,0};
        int number = 2;

        System.out.println(canPlaceFlower(flowers, number));
    }

    public static boolean canPlaceFlower(int[] flowerBed, int n){

        int empty = flowerBed[0] == 0 ? 1: 0;

        for (int flower : flowerBed) {
            if (flower == 1){
                n = n - (empty -1 ) / 2; //round up this division to zero.
                empty = 0;
            }else {
                empty++;
            }
        }
        n = n - empty /2; // lastone
        return n <= 0; // false
    }
}
