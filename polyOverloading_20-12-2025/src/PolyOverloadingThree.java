public class PolyOverloadingThree {
    public void workerDetails(){
        System.out.println("first method...");
    }
    public void workerDetails(int id){
        System.out.println("second method...");
        System.out.println(id);
    }
    public void workerDetails(int id, String name){
        System.out.println("third method...");
        System.out.println(id);
        System.out.println(name);
    }
    public void workerDetails(int id, String name, long number){
        System.out.println("fourth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
    }
    public void workerDetails(int id, String name, long number, float rank){
        System.out.println("fifth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(rank);
    }

    public static void main(String[] args) {
        PolyOverloadingThree obj=new PolyOverloadingThree();
        obj.workerDetails();
        System.out.println("-----------");
        obj.workerDetails(3);
        System.out.println("---------------");
        obj.workerDetails(3,"sai");
        System.out.println("-------------------------");
        obj.workerDetails(3,"sai",674211265l);
        System.out.println("----------------------------------------------");
        obj.workerDetails(3,"sai",674211265l,8.2f);
    }
}
