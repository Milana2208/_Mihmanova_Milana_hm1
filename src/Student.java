public class Student {
    private Info info;
    private Yer yer;

    public Info getInfo() {
        return info;
    }

    public Yer getYer() {
        return yer;
    }

    public Student(Info info, Yer yer) {
        this.info = info;
        this.yer = yer;
    }
}
