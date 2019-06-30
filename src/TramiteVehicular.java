public class TramiteVehicular {

    float nrotramite;
    int codigoEmpleado;
    float dni;
    String tipoVehiculo;
    int notaTeorico;
    int notaPractico;

    //constructor
    public TramiteVehicular(){}

    public TramiteVehicular(float nrotramite, int codigoEmpleado, float dni, String tipoVehiculo, int notaTeorico, int notaPractico) {
        this.nrotramite = nrotramite;
        this.codigoEmpleado = codigoEmpleado;
        this.dni = dni;
        this.tipoVehiculo = tipoVehiculo;
        this.notaTeorico = notaTeorico;
        this.notaPractico = notaPractico;
    }

    //getter y setter
    public float getNrotramite() {
        return nrotramite;
    }

    public void setNrotramite(float nrotramite) {
        this.nrotramite = nrotramite;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public float getDni() {
        return dni;
    }

    public void setDni(float dni) {
        this.dni = dni;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getNotaTeorico() {
        return notaTeorico;
    }

    public void setNotaTeorico(int notaTeorico) {
        this.notaTeorico = notaTeorico;
    }

    public int getNotaPractico() {
        return notaPractico;
    }

    public void setNotaPractico(int notaPractico) {
        this.notaPractico = notaPractico;
    }
}
