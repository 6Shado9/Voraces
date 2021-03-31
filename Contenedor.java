public class Contenedor {
    private double volumen;

    public Contenedor(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String toString() {
        return super.toString() + "Capacidad del Contenedor: " + volumen;
    }
}