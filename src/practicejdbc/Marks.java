package practicejdbc;

public class Marks {
    public int totalMarks;
    private String name;
    private int java;
    private int spring;
    private int jdbc;

    public Marks() {
        super();
    }

    public Marks(String name, int java, int spring, int jdbc) {
        super();
        this.name = name;
        this.java = java;
        this.spring = spring;
        this.jdbc = jdbc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSpring() {
        return spring;
    }

    public void setSpring(int spring) {
        this.spring = spring;
    }

    public int getJdbc() {
        return jdbc;
    }

    public void setJdbc(int jdbc) {
        this.jdbc = jdbc;
    }

    public void display(){
        totalMarks += java + spring + jdbc ;
        System.out.println("Total Marks :" + totalMarks );

    }

}


