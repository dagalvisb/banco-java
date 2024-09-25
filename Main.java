import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        /**int valor = 100000;
        Cuenta cuenta = new Cuenta("059-908-548-17", "ahorros", 100000 );
        System.out.println(cuenta.saldo);
        cuenta.consignarSaldo(valor);
        System.out.println(cuenta.saldo);
        boolean pudoRetirar = cuenta.retirarSaldo(50000.5);
        System.out.println("Pudo Reitat: " + pudoRetirar);
        System.out.println(cuenta.consultarSaldo());

        boolean pudoSegundoRetiro = cuenta.retirarSaldo(50000.5);
        System.out.println("Pudo Reitat: " + pudoSegundoRetiro);
        System.out.println(cuenta.consultarSaldo());

        Cuenta cuentaNueva = new Cuenta("12345-1", "corriente");
        System.out.println(cuentaNueva.getNumero());
        cuentaNueva.setNumero("1467-2");
        System.out.println(cuentaNueva.getNumero());
        */

        Cuenta cuenta1 = new Cuenta("1234-6", "Corriente", 100000);
        Cuenta cuenta2 = new Cuenta("1234-8", "Ahorros");
        Cuenta cuenta3 = cuenta1;

        ArrayList<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);

        //System.out.println(cuentas.get(0).consultarSaldo());

        /**for (int i = 0; i < cuentas.size(); i++){
            
            System.out.printf("Numero de cuenta: %s, Tipo de cuenta: %s, El saldo es: %.2f \n", cuentas.get(i).getNumero(), cuentas.get(i).getTipo(), cuentas.get(i).getSaldo());
        }
        */

        System.out.println("____________________________________________________________");
        
        for (Cuenta cuenta : cuentas) {
            System.out.printf("Numero de cuenta: %s, Tipo de cuenta: %s, El saldo es: %.2f \n", cuenta.getNumero(), cuenta.getTipo(), cuenta.getSaldo());
        }

        /**System.out.println("____________________________________________________________");

        cuentas.forEach(cuenta -> {
            System.out.printf("Numero de cuenta: %s, Tipo de cuenta: %s, El saldo es: %.2f \n", cuenta.getNumero(), cuenta.getTipo(), cuenta.getSaldo());
        });
        */
        double resultado = 0;
        for (Cuenta cuenta : cuentas) {
            resultado += cuenta.getSaldo();
        }
        System.out.println("resultado es: " + resultado);
    }

}
