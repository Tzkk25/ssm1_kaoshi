package entity;

public class Pet {
    private int pid;
    private String pname;
    private int age;
    private String brand;
    private String color;

    public Pet() {
    }

    public Pet(int pid, String pname, int age, String brand, String color) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.brand = brand;
        this.color = color;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
