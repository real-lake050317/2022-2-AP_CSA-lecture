import chn.util.*;

public class Sep01 {
    public static void main(String[] args) {
        FileInput f = new FileInput("input.txt"); // Reads data from input.txt
        FileOutput o = new FileOutput("result.txt", "write"); // Writes data to result.txt
        Student[] s = new Student[22]; // Array that can contain 22 students
        int idx = 0; // Variable to count index of the array
        f.readLine(); // Skips the first line

        while (f.hasMoreTokens()) {
            Student sTemp = new Student(); // Temporary student object
            for (int i = 0; i<6; i++) { // Read 6 tokens per line
                switch(i) {
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
                        sTemp.setQuizScore(f.readDouble()); // Sets quiz score when fourth token is read
                        break;
                    case(4):
                        sTemp.setMidScore(f.readDouble()); // Sets midterm score when fifth token is read
                        break;
                    case(5):
                        sTemp.setFinalScore(f.readDouble()); // Sets final score when sixth token is read
                        break;
                }  
            }
            s[idx] = sTemp; // add the temporary student object to the array
            idx++; // increase the index by 1
        }

        for (int i = 0; i<idx; i++) {
            for (int j = i+1; j<idx; j++) {
                if (s[i].getScore() < s[j].getScore()) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        } // sort the array in descending order of the score (using selection sort)
        // Time complexity: O(n^2), Space complexity: O(n)

        for (int i = 0; i < idx; i++) {
            System.out.print(i + 1 + "번째 학생은");
            System.out.println(s[i].toString());
            o.println(i+1 + "등 " + s[i].getName() + " " + s[i].getScore() + "점");
        } // Print the result
        o.close(); // Close the output file
    }
}