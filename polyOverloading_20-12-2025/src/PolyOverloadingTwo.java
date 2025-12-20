public class PolyOverloadingTwo {
    public void employeeDetails(){
        System.out.println("first method...");
    }
    public void employeeDetails(int id){
        System.out.println("second method...");
        System.out.println(id);
    }
    public void employeeDetails(int id, String name){
        System.out.println("third method...");
        System.out.println(id);
        System.out.println(name);
    }
    public void employeeDetails(int id, String name, long number){
        System.out.println("fourth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
    }
    public void employeeDetails(int id, String name, long number, float rank){
        System.out.println("fifth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(rank);
    }

    public static void main(String[] args) {
        PolyOverloadingTwo obj=new PolyOverloadingTwo();
        obj.employeeDetails();
        System.out.println("-----------");
        obj.employeeDetails(2);
        System.out.println("---------------");
        obj.employeeDetails(2,"daya");
        System.out.println("-------------------------");
        obj.employeeDetails(2,"daya",9990211265l);
        System.out.println("----------------------------------------------");
        obj.employeeDetails(2,"daya",9990211265l,9.6f);
    }
}
