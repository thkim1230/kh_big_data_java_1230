package 클래스정렬연습문제;

import java.util.Comparator;

public class Student {
    String name;
    int score;
    String id;

    public Student(String name, int score, String id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }
}

class Comp implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o2.score == o1.score){
            return o1.id.compareTo(o2.id);
        }
        return o2.score - o1.score;
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}