import java.util.ArrayList;

public class Banco {

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    String nombre;
    
    ArrayList<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public Cuenta buscarCuenta(String numero){
    
        for (Cuenta cuenta : this.cuentas){
            if(numero.equals(cuenta.getNumero())){
                return cuenta;
            }
        }
        return null;
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, Cliente titular){
        
        if (this.buscarCuenta(numero) != null){
            return false;
        }else {
            Cuenta cuenta = new Cuenta(numero, tipo, saldoInicial, titular);
            cuentas.add(cuenta);
            return true;
        }
    }

    public double consultarTotalDinero (){
        double resultado = 0;
        for (Cuenta cuenta : this.cuentas) {
            resultado += cuenta.consultarSaldo();
        }
        return resultado;
    }

    public String consultarClienteMayorSaldo(){
        double mayorSaldo = 0;
        Cuenta cuentaMayor = null;

        for (Cuenta cuenta : this.cuentas){
            if (cuenta.getSaldo() > mayorSaldo){
                mayorSaldo = cuenta.getSaldo();
                cuentaMayor = cuenta;
            }
        }
        if(cuentaMayor == null){
            return "no hay cuentas en el banco";
        }else{
            return cuentaMayor.getTitular().getNombreCliente();
        }
        
    }
    
}
