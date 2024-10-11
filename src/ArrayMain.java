public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; //0,1,2,3,4 배열 초기화
        System.out.println(numbers[0]);  // 10 출력
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);  // 50 출력

        System.out.println("넘버의 길이 : "+ numbers.length);

        int[] oldArray = {1, 2, 3};      // 기존 배열
        System.out.println("oldattay의 길이 : "+ oldArray.length);

        int[] newArray = new int[5];     // 새로운 배열 생성
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length); // 배열 복사
        System.out.println(newArray[4]);


        for(int i =0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
