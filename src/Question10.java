public class Question10 {
    public static void main(String[] args) {
        int [] numbers = {20,30,50,70,90};
        int sum = 0;
        double avg =0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
             avg = (double) sum / numbers.length;//더블로 캐스트 한거임

        }

        System.out.println(avg);
    }
}
