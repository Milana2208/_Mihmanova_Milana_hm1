public class Main {
    public static void main(String[] args) {

        First objectA = new First(new Info("Milana",16), Yer.FIRST);
        Second objectB = new Second(new Info("samina", 17),Yer.FIRST);
        Second objectC = new Second(new Info("amina", 17),Yer.FIRST);

        objectA.print();
        objectA.print(objectA.getYer());
        objectB.print();
        objectB.print(objectB.getYer());
        objectC.print();
        objectC.print(objectA.getYer());


    }
}