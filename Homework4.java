import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        String input = sc.nextLine();
        String[] num = input.split(" ");
        int result = gcd(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
        System.out.println("두 수의 최대공약수는 "+result+"입니다.");
    }
    public static int gcd(int m, int n){
        int min = (m<n) ? m : n;
        int max = (m>n) ? m : n;
        int other = max % min;
        if(min == 0){
            return min;
        }else if(other == 0 ){
            return min;
        }else{
            return gcd(other, min);
        }
    }
}
