import java.util.ArrayList;

public class Banco {

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

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo){
        
        if (this.buscarCuenta(numero) != null){
            return false;
        }else {
            Cuenta cuenta = new Cuenta(numero, tipo, saldoInicial);
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
}
