public class Student { 
    // class identifier를 생략하면 자동으로 Public이 되긴 하나, 적는것이 좋음
    // Public 클래스라는 것은 외부에서도 이 클래스에 접근할 수 있다는 것.
    // class 대신에 쓸 수 있는 말: interface, abstract class Q: enum은? A: 
    // 추천: 앞부분에 Attribute, 뒷부분에 Method 들을 작성하는 것을 추천
    private String myName;
    private int myAge;
    private float myHeight;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String name) {
        this.myName = name;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int age) {
        this.myAge = age;
    }

    public float getMyHeight() {
        return myHeight;
    }

    public void setMyHeight(float height) {
        this.myHeight = height;
    }

    Student(String name, int age, float height) {
        this.myName = name;
        this.myAge = age;
        this.myHeight = height;
    }
}
