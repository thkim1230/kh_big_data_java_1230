package 접근제한자;
// 접근제한자는 객체지향언어 4가지 중요 특성 중에 하나 임
// 사용 목적은 내부의 필드값을 외부에서 접근하는 것을 제한 하는 목적
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
        System.out.println(childRest.jobs);

    }
}

class ChildRest extends ParentRest{
    String jobs;

    public String getJobs(){
        return jobs;
    }

    public void setJobs(String jobs){
        this.jobs = jobs;
    }

    public String getMoney(){
        return money;
    }

    public String getName(){
        return name;
    }

    public String getAddr() {
        return addr;
    }


}
