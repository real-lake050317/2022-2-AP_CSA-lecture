import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) { // Formal input parameter (String[] args), static: method identifier, public: access modifier
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();

        sc.close();

        Student s = new Student(name, age, height);

        System.out.println("내 이름은: " + s.getMyName() + "입니다.");
        System.out.println("내 나이는: " + s.getMyAge() + "세 입니다.");
        System.out.println("내 키는: " + s.getMyHeight() + "cm 입니다.");
    }
}
