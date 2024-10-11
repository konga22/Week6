public class ArrayPractice {
    public static void main(String[] args) {



        int[] numbers = {10,20,30,40,50};
        int max = numbers[0];

        for(int i=0; i< numbers.length; i++){ // 0부터 사용하고 =는 사용하지말기
            if(numbers[i] > max) {
                max = numbers[i];
                System.out.println("max= "+max+",number["+i+"]="+numbers[i]);

                max=numbers[i];
            }
        }
        System.out.println("max= "+max);
    }
}
