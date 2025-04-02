public class Main {


    public static void main(String[] args) {
        String[] ticketInfo = {"1234567891M2021","9876543212F6012"};
        System.out.println("Total senior : " + countSenior(ticketInfo));


    }

    public static int countSenior(String[] details) {
        int seniorCount =0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11,13));
            if (age>=60){
                seniorCount++;
            }
        }



        /*for (String detail : details) {
            int age = (detail.charAt(11) - '0') * 10 + (detail.charAt(12) -'0');
            // chatAt(11) will give char but if we do some subs with 0. it will return int value.
            if (age>=60) seniorCount++;
        }*/
        return seniorCount;
    }
}
