import chn.util.*;
import java.lang.Math;


public class StudentTest {
    public static void main(String[] args) {
        FileInput f = new FileInput("input.txt"); // Reads data from input.txt
        FileOutput o = new FileOutput("result.txt", "write"); // Writes data to result.txt
        Student[] s = new Student[22]; // Array that can contain 22 students
        int totalNum = f.readInt(); // Variable to count index of the array
        double midExam = 0, finalExam = 0, total = 0, quiz = 0;

        for (int i = 0; i<totalNum; i++) {
            Student sTemp = new Student(); // Temporary student object
            for (int j = 0; j<6; j++) { // Read 6 tokens per line
                switch(j) {
                    case(0):
                        sTemp.setName(f.readToken()); // Sets name when first token is read
                        break;
                    case(1):
                        sTemp.setHeight(f.readDouble()); // Sets height when second token is read
                        break;
                    case(2):
                        sTemp.setAge(f.readInt()); // Sets age when third token is read
                        break;
                    case(3):
                        sTemp.setMidScore(f.readDouble());
                        // Sets midterm score when fourth token is read
                        break;
                    case(4):
                        sTemp.setFinalScore(f.readDouble());
                        // Sets final exam score when fifth token is read
                        break;
                    case(5):
                        sTemp.setQuizScore(f.readDouble());
                        // Sets quiz score when sixth token is read
                        break;
                }  
            }
            s[i] = sTemp; // add the temporary student object to the array
        }

        for (int i = 0; i<totalNum; i++) {
            for (int j = i+1; j<totalNum; j++) {
                if (s[i].getScore() < s[j].getScore()) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        } // sort the array in descending order of the score (using selection sort)
        // Time complexity: O(n^2), Space complexity: O(n)

        for (int i = 0; i < totalNum; i++) {
            midExam += s[i].getMidScore();
            finalExam += s[i].getFinalScore();
            quiz += s[i].getQuizScore();
            total += s[i].getScore();
            o.println(i+1 + "등 " + s[i].getName() + " 최종 점수 " + s[i].getScore() + "점");
        } // Print the result

        o.println("평균 중간고사 점수: " + String.format("%.3f", midExam/totalNum));
        o.println("평균 기말고사 점수: " + String.format("%.3f", finalExam/totalNum));
        o.println("평균 퀴즈 점수: " + String.format("%.3f", quiz/totalNum));
        o.println("평균 최종 점수: " + String.format("%.4f", total/totalNum));

        // compute the standard deviation
        double midStd = 0, finalStd = 0, quizStd = 0, totalStd = 0;

        for (int i = 0; i < totalNum; i++) {
            midStd += Math.pow(s[i].getMidScore() - midExam/totalNum, 2);
            finalStd += Math.pow(s[i].getFinalScore() - finalExam/totalNum, 2);
            quizStd += Math.pow(s[i].getQuizScore() - quiz/totalNum, 2);
            totalStd += Math.pow(s[i].getScore() - total/totalNum, 2);
        }

        midStd = Math.sqrt(midStd/totalNum);
        finalStd = Math.sqrt(finalStd/totalNum);
        quizStd = Math.sqrt(quizStd/totalNum);
        totalStd = Math.sqrt(totalStd/totalNum);
        
        o.println("중간고사 표준편차: " + String.format("%.3f", midStd));
        o.println("기말고사 표준편차: " + String.format("%.3f", finalStd));
        o.println("퀴즈 표준편차: " + String.format("%.3f", quizStd));
        o.println("최종 점수 표준편차: " + String.format("%.3f", totalStd));

        o.close(); // Close the output file
    }
}