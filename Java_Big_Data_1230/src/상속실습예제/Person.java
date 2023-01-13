package 상속실습예제;
public class Person {

   private int age;
   private int sleep;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}

class Worker extends Person {
   private int work;

    public int getWork() {
        return work;
    }

    void setWork(int time){
        this.work = time;
    }

}

class Student extends Person{

    int study;

    public String getStudy() {
        String[] studyStr = {"", "\"열심히\"","\"적당히\"","\"놀면서\""};
        return studyStr[study];
    }

    void setStudy(int study){
        this.study = study;
    }
}

