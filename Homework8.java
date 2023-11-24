import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
;        HashMap<String,String> map = new HashMap<String,String>();
        for(int i = 1; i <= 3; i++){
            map.put("myId"+(i != 1 ? i : ""), "myPass"+(i != 1 ? i : ""));
        }
        while(true) {
            System.out.println("\nid와 password를 입력해주세요. ");
            System.out.print("id : ");
            String id = sc.next();
            String pw = "";
            if (map.containsKey(id)) {
                System.out.print("password : ");
                pw = sc.next();
                if (map.get(id).contains(pw)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
