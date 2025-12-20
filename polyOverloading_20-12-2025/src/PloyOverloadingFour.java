public class PloyOverloadingFour {
    public void userDetails(){
        System.out.println("first method...");
    }
    public void userDetails(int id){
        System.out.println("second method...");
        System.out.println(id);
    }
    public void userDetails(int id, String name){
        System.out.println("third method...");
        System.out.println(id);
        System.out.println(name);
    }
    public void userDetails(int id, String name, long number){
        System.out.println("fourth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
    }
    public void userDetails(int id, String name, long number, float rank){
        System.out.println("fifth method...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(rank);
    }

    public static void main(String[] args) {
        PloyOverloadingFour obj=new PloyOverloadingFour();
        obj.userDetails();
        System.out.println("-----------");
        obj.userDetails(4);
        System.out.println("---------------");
        obj.userDetails(4,"kumar");
        System.out.println("-------------------------");
        obj.userDetails(4,"kumar",9878765465l);
        System.out.println("----------------------------------------------");
        obj.userDetails(4,"kumar",9878765465l,6.2f);
    }
}
