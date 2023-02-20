public class Gamers extends Person {
    private String name;
    private int age;
    private int phone;
    private String platform;

    public Gamers(String name, int age, int phone, String platform) {
        super(name, age, phone);
        this.platform = platform;

    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
