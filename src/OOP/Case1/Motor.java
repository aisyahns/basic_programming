package OOP.Case1;

public class Motor {

    private double roda;
    private String mesin;
    private String lampu;
    private String jok;
    private String name;

    public String getName() {
        return name;
    }

    public double getRoda() {
        return roda;
    }

    public String getJok() {
        return jok;
    }

    public String getLampu() {
        return lampu;
    }

    public String getMesin() {
        return mesin;
    }

    public void setRoda(double roda){
        this.roda = roda;
    }

    public void setLampu(String lampu) {
        this.lampu = lampu;
    }

    public void setJok(String jok) {
        this.jok = jok;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public void setName(String name) {
        this.name = name;
    }
}
