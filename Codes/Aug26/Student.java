package Codes.Aug26;

public class Student { // class identifier를 생략하면 자동으로 Public이 되긴 하나, 적는것이 좋음
    // Public 클래스라는 것은 외부에서도 이 클래스에 접근할 수 있다는 것.
    // class 대신에 쓸 수 있는 말: interface, abstract class Q: enum은? A: 
    // 추천: 앞부분에 Attribute, 뒷부분에 Method 들을 작성하는 것을 추천
    private String myName;
    private int myAge;
    private float myHeight;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public float getMyHeight() {
        return myHeight;
    }

    public void setMyHeight(float myHeight) {
        this.myHeight = myHeight;
    }

    public Student(String myName, int myAge, float myHeight) {
        this.myName = myName;
        this.myAge = myAge;
        this.myHeight = myHeight;
    }
}
