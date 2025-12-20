public class PolyOverloadingFive {
    public void hodDetails(){
        System.out.println("first method...");
    }
    public void hodDetails(int id){
        System.out.println("second method...");
        System.out.println(id);
    }
    public void hodDetails(int id, String name){
        System.out.println("third method...");
        System.out.println(id);
        System.out.println(name);
    }
    public void hodDetails(int id, String name, long number){
        System.out.println("fourth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
    }
    public void hodDetails(int id, String name, long number, float rank){
        System.out.println("fifth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(rank);
    }

    public static void main(String[] args) {
        PolyOverloadingFive obj=new PolyOverloadingFive();
        obj.hodDetails();
        System.out.println("-----------");
        obj.hodDetails(5);
        System.out.println("---------------");
        obj.hodDetails(5,"sharan");
        System.out.println("-------------------------");
        obj.hodDetails(5,"sharan",8988767654l);
        System.out.println("----------------------------------------------");
        obj.hodDetails(5,"sharan",8988767654l,7.2f);
    }
}
