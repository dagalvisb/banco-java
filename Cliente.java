public class Cliente{
    String cedula;
    String nombreCliente;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Cliente (String cedula, String nombre){
        this.cedula = cedula;
        this.nombreCliente = nombre;
    }

    public Cliente (){
        this("1234567", "");
    }


}