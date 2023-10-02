import java.util.Scanner;

public class Homework3 {
    public static void main(String[] arqs){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 수를 입력할 예정인가요? ");
        String count = sc.nextLine();
        System.out.print("\n수를 입력하세요: ");
        String input = sc.nextLine();
        String[] num = input.split(" ");
        int max = Integer.parseInt(num[0]), min = Integer.parseInt(num[0]);
        for(String s : num){
            int n = Integer.parseInt(s);
            if(n > max) max = n;
            if(n < min) min = n;
        }
        System.out.println("\n최대값: "+max+"\n최소값: "+min);
    }
}
