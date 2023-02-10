package 입출력스트림연습문제;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class InOutStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {

        TreeSet<StudentInfo> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("src/입출력스트림연습문제/score.txt");
        Scanner sc = new Scanner(is);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }

        for (StudentInfo e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}

class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentInfo(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    int getTotal() {
        return kor + eng + math;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal();
    }
}
