import chn.util.*;

public class Sep01 {
    public static void main(String[] args) {
        //FileOutput f = new FileOutput("Sep01.txt", "write");
        //f.print(1);
        FileInput f = new FileInput("input.txt");
        FileOutput o = new FileOutput("result.txt", "write");
        Student[] s = new Student[22];
        int idx = 0;
        f.readLine();
        while (f.hasMoreTokens()) {
            Student sTemp = new Student();
            for (int i = 0; i<6; i++) {
                switch(i) {
                    case(0):
                        sTemp.setName(f.readToken());
                        break;
                    case(1):
                        sTemp.setHeight(f.readDouble());
                        break;
                    case(2):
                        sTemp.setAge(f.readInt());
                        break;
                    case(3):
                        sTemp.setQuizScore(f.readDouble());
                        break;
                    case(4):
                        sTemp.setMidScore(f.readDouble());
                        break;
                    case(5):
                        sTemp.setFinalScore(f.readDouble());
                        break;
                }  
            }
            s[idx] = sTemp;
            idx++;
        }
        for (int i = 0; i<idx; i++) {
            for (int j = i+1; j<idx; j++) {
                if (s[i].getScore() < s[j].getScore()) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(i + 1 + "번째 학생은");
            System.out.println(s[i].toString());
            o.println(i+1 + "등 " + s[i].getName() + " " + s[i].getScore() + "점");
        }
        o.close();
    }
}