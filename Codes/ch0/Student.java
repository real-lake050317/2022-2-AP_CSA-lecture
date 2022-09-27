public class Student {
    private String name;
    private int age;
    private double height;
    private double quizScore;
    private double midScore;
    private double finalScore;

    Student(String name, int age, double height, double quizScore, double midScore, double finalScore) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.quizScore = quizScore;
        this.midScore = midScore;
        this.finalScore = finalScore;
    }
    Student() {

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public double getQuizScore() {
        return quizScore;
    }
    public double getMidScore() {
        return midScore;
    }
    public double getFinalScore() {
        return finalScore;
    }
    public double getScore() {
        return quizScore*40/100 + midScore*30/100 + finalScore*30/100;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setQuizScore(double quizScore) {
        this.quizScore = quizScore;
    }
    public void setMidScore(double midScore) {
        this.midScore = midScore;
    }
    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
}
