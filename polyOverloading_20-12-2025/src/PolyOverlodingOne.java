public class PolyOverlodingOne {
    public void studentDetails(){
        System.out.println("first method...");
    }
    public void studentDetails(int id){
        System.out.println("second method...");
        System.out.println(id);
    }
    public void studentDetails(int id, String name){
        System.out.println("third method...");
        System.out.println(id);
        System.out.println(name);
    }
    public void studentDetails(int id, String name, long number){
        System.out.println("fourth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
    }
    public void studentDetails(int id, String name, long number, float rank){
        System.out.println("fifth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(rank);
    }

    public static void main(String[] args) {
        PolyOverlodingOne obj=new PolyOverlodingOne();
        obj.studentDetails();
        System.out.println("-----------");
        obj.studentDetails(1);
        System.out.println("---------------");
        obj.studentDetails(1,"prasad");
        System.out.println("-------------------------");
        obj.studentDetails(1,"prasad",6360211265l);
        System.out.println("----------------------------------------------");
        obj.studentDetails(1,"prasad",6360211265l,9.2f);
    }
}
