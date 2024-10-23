import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean flag = false;

        for(int i= 0; i< numbers.length; i++){
            if(numbers[i] == n){
                flag = true;
                break;
            }

        }
        if(flag){
            System.out.println("존재합니다");
        }else {
            System.out.println("존재하지 않습니다");
        }
    }
}
