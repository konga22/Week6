public class Question5 {
    public static void main(String[] args) {
        int [] numbers = {12,3,19,7,5};
        int ss = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
           if(ss > numbers[i]) {
               ss = numbers[i];
           }

        }
        System.out.println("최초값: "+ss);
    }

}
