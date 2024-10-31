import javax.swing.JOptionPane;


public class operacionesBanco {

    Banco banco = new Banco();

    public operacionesBanco(){
        menuOpciones();
    }

    public void menuOpciones(){

        String opcionTxt = JOptionPane.showInputDialog("Ingrese una opción: \n #1 para crear cuenta \n #2 para consultar total");
        int opcion = Integer.parseInt(opcionTxt);

        if (opcion == 1){
            crearCuenta(banco);
        }else if(opcion == 2){
            consultarTotal(banco);
        }
    }

    public void crearCuenta(Banco banco){
        int deseaAñadirNuevaCuenta = JOptionPane.YES_OPTION;
        
        do{
        String informacion = "";
        String numero = JOptionPane.showInputDialog("Digite el numero de cuenta:");
        String saldoInicialTxt = JOptionPane.showInputDialog("Digite el saldo inicial");
        double saldoInicial = Double.parseDouble(saldoInicialTxt);
        String tipo = JOptionPane.showInputDialog("Digite el tipo de cuenta:");
        String cedulaTitular = JOptionPane.showInputDialog("Digite el numero de Cedula:");
        String nombreTitular = JOptionPane.showInputDialog("Digite el nombre del Titular:");
        deseaAñadirNuevaCuenta = JOptionPane.showConfirmDialog(null, "Desea añadir nueva cuenta?", "continuar", JOptionPane.YES_NO_CANCEL_OPTION);
        banco.adicionarCuenta(numero, saldoInicial, tipo, cedulaTitular, nombreTitular);
        informacion += String.format("Numero de cuenta: %s \n Saldo: %s \n Tipo de cuenta: %s \n Cedula titular: %s \n Nombre del titular: %s", numero, saldoInicial, tipo, cedulaTitular,nombreTitular);
        JOptionPane.showMessageDialog(null, informacion);
        } while (deseaAñadirNuevaCuenta == JOptionPane.YES_OPTION);

        
    }
    

    public void consultarTotal(Banco banco){

        JOptionPane.showMessageDialog(null, banco.consultarTotalDinero());

    }
}
