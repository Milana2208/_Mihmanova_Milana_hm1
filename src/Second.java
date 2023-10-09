public class Second extends First{
    public Second(Info info, Yer yer) {
        super(info, yer);
    }

    @Override
    public void print(Yer yer) {
        System.out.println("Name: " + getInfo().getName());
        System.out.println("Yer: " + getYer());
    }
}
