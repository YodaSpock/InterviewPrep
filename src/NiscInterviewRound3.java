public class NiscInterviewRound3 {


    public static int CountTheTwos(int num){
        int count = 0;

        while(num > 10){
            int ones = num % 10;
            if(ones == 2){
                count = count + 10;
            }
            num = num / 10;

        }
        if(num < 10){
            count ++;
        }


        for (int i = 0; i < num; i++) {
            if(num > 2){

            }
        }
//        if(num < 100){
//            num = num / 10;
//            int ones = num % 10;
//
//        }
//        if(num < 10){
//            for (int i = 0; i < num + 1; i++) {
//                if(i == 2) {
//                    count++;
//                }
//            }
//
//
//        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountTheTwos(23));
    }
}
