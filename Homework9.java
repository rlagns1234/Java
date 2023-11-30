import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<String,String>();
        BufferedReader f = new BufferedReader(new FileReader("db.txt"));
        String s = f.readLine();
        while(s != null){
            map.put(s.split(" ")[0].trim(), s.split(" ")[1].trim());
            s = f.readLine();
        }
        while(true) {
            System.out.println("\nid와 password를 입력해주세요. ");
            System.out.print("id : ");
            String id = sc.next().trim();
            String pw = "";
            if (map.containsKey(id)) {
                System.out.print("password : ");
                pw = sc.next().trim();
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
