import java.util.Scanner;

class Student {
    private long studentId;       
    private String name;         
    private String major;        
    private long phoneNumber;    

    public Student(long studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");

            String studentIdStr = sc.next();
            String name = sc.next();
            String major = sc.next();
            String phoneStr = sc.next();

            long studentId = Long.parseLong(studentIdStr);
            long phoneNumber = Long.parseLong(phoneStr);

            students[i] = new Student(studentId, name, major, phoneNumber);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            Student student = students[i];

            String phone = Long.toString(student.getPhoneNumber());

            // 전화번호를 010-xxxx-xxxx 형식으로 변환
            String phoneFormatted = "010-" 
                    + phone.substring(2, 6) + "-"
                    + phone.substring(6);
            System.out.print((i + 1) + "번째 학생: ");
            System.out.print(student.getStudentId());
            System.out.print(student.getName());
            System.out.print(student.getMajor());
            System.out.print(phoneFormatted);
            System.out.println();
        }

        sc.close();
    }
}