public class Cuenta{

    String numero;
    String tipo;
    double saldo;

    public Cuenta (String numero, String tipo, double saldo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public boolean retirarSaldo(double cantidadARetirar){
        if (cantidadARetirar <= this.saldo){
            this.saldo -= cantidadARetirar;
            return true;
        }else{
            return false;
        }
    }

    public void consignarSaldo(double cantidadAConsignar){
        this.saldo += cantidadAConsignar;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

}