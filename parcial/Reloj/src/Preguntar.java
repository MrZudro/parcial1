import javax.swing.JOptionPane;

public class Preguntar extends Thread{
    @Override
    public void run(){
        int opcion; 
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea dar vuelta? \n1.Si\n2.No"));
            Main.vueltas.add(Main.r2.darVuelta());
        }while(opcion == 1);
    }
}

