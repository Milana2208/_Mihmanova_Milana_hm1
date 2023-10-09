public class First extends Student{
    public First(Info info, Yer yer) {
        super(info, yer);
    }
    public final void print (){
        System.out.println("Name: " + getInfo().getName());
        System.out.println("Age: " + getInfo().getName());
    }
    public void print (Yer yer){
        System.out.println("Name: " + getInfo().getName());
        System.out.println("Age: " + getInfo().getName());
        System.out.println("Yer: " + getYer());
    }
}
