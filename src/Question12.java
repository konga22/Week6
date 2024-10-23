import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        int [] numbers ={5,10,15,20,25,30};
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력하세여");
        int n = in.nextInt();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == n){
                System.out.println();
            }
        }
    }
}
