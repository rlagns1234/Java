import java.util.Scanner;

public class Subject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for(int i = 0; i<5; i++){
            System.out.print("정수를 입력하세요: ");
            n += sc.nextInt();
            System.out.println("현재까지 입력된 정수의 합은 "+n+"입니다.");
        }
    }
}