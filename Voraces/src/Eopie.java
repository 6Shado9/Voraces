public class Eopie {
    private double volumen_soportado;

    public Eopie(double volumen_soportado) {
        this.volumen_soportado = volumen_soportado;
    }

    public double getVolumen_soportado() {
        return volumen_soportado;
    }

    public void setVolumen_soportado(double volumen_soportado) {
        this.volumen_soportado = volumen_soportado;
    }

    public String toString() {
        return super.toString() + "Capacidad del Eopie: " + volumen_soportado;
    }
}
