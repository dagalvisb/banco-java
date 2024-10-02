public class Cuenta {

    Cliente titular = new Cliente();
    String numero;
    String tipo;
    double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public Cuenta (String numero, String tipo, double saldo, Cliente titular){
        
        this.titular = titular;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Cuenta (String numero, String tipo, Cliente titular){
        this(numero, tipo, 0, titular);
    }

    public Cuenta(Cliente titular){
        this("", "Ahorros", 0, titular);
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