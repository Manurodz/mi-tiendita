package arg.ds.app;

public class Hdd {

    private String fabricante;

    private String capacidad;

    private String rpm;

    private String tamanio;

    private String bus;

    public Hdd() {
    }

    public Hdd(String fabricante, String capacidad, String rpm, String tamanio, String bus) {
        this.fabricante = fabricante;
        this.capacidad = capacidad;
        this.rpm = rpm;
        this.tamanio = tamanio;
        this.bus = bus;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "fabricante='" + fabricante + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", rpm='" + rpm + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
