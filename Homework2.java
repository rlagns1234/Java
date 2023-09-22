import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Student stList[] = new Student[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("학생의 학번, 이름 전공, 전화번호를 입력하세요: ");
            stList[i] = new Student(sc.nextLine());
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for(int i = 0; i < 3; i++){
            System.out.println("첫두세".charAt(i)+"번째 학생: "
                    +stList[i].getStNum()+" "+stList[i].getName()+" "+stList[i].getMajor()
                    +" 0"+new StringBuffer(Integer.toString(stList[i].getPhoneNum())).insert(2, "-").insert(7, "-"));

        }
    }
}

class Student{
    private int stNum;
    private String name;
    private String major;
    private int phoneNum;

    public Student(){
    }
    public Student(int stNum, String name, String major, int phoneNum){
        this.stNum = stNum;
        this.name = name;
        this.major = major;
        this.phoneNum = phoneNum;
    }

    public Student(String info){
        String infoList[] = extractInfo(info);
        this.stNum = Integer.parseInt(infoList[0]);
        this.name = infoList[1];
        this.major = infoList[2];
        this.phoneNum = Integer.parseInt(infoList[3]);
    }

    private String[] extractInfo(String info){
        String result[] = info.split(" ");
        result[3] = result[3].replaceFirst("0", "").replace("-", "");
        return result;
    }

    public int getStNum(){
        return this.stNum;
    }

    public String getName(){
        return  this.name;
    }

    public String getMajor(){
        return  this.major;
    }

    public int getPhoneNum(){
        return this.phoneNum;
    }

    public void setStNum(int stNum) {
        this.stNum = stNum;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setMajor(java.lang.String major) {
        this.major = major;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
