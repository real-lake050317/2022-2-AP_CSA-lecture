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

    public String toString() {
        return " 이름: " + name + " 나이: " + age + "세 키: " + height + "cm 퀴즈 점수는: " + quizScore + "점 중간고사 점수는: " + midScore + "점 기말고사 점수는: " + finalScore + "점 학기말 총 점수는: " + getScore() + "점";
    }

}
