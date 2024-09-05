public class Main {
    
    public static void main(String[] args) {
        int valor = 100000;
        Cuenta cuenta = new Cuenta();
        System.out.println(cuenta.saldo);
        cuenta.consignarSaldo(valor);
        System.out.println(cuenta.saldo);
        boolean pudoRetirar = cuenta.retirarSaldo(50000.5);
        System.out.println("Pudo Reitat: " + pudoRetirar);
        System.out.println(cuenta.consultarSaldo());

        boolean pudoSegundoRetiro = cuenta.retirarSaldo(50000.5);
        System.out.println("Pudo Reitat: " + pudoSegundoRetiro);
        System.out.println(cuenta.consultarSaldo());
    }

}
