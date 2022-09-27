abstract class Person {
    private int myAge;
    private String myName;
    private float myHeight;

    abstract int getMyAge();
    abstract String getMyName();
    abstract float getMyHeight();

    abstract void setMyAge(int myAge);
    abstract void setMyName(String myName);
    abstract void setMyHeight(float myHeight);
}