import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    static ArrayList <String> vueltas = new ArrayList<>();
    static Cronometro r2;
    static Reloj r1;
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Que desea inciar: \n1. Reloj \n2.Cronometro"));
        switch(inicio){
            case 1:
            int horas =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora:"));
            int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos:"));
            int segundos =Integer.parseInt(JOptionPane.showInputDialog("Ingrese los segundos:"));
            r1 = new Reloj(horas, minutos, segundos);
            r1.run();
            break;
            case 2:
            r2 = new Cronometro(0,0,0);
            Preguntar preguntilla = new Preguntar();
            r2.start();
            preguntilla.start();
            //System.exit(0);
            break;
        }
        
    }
}

/*public static void preguntar(){
    int opcion; 
    do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea dar vuelta? \n1.Si\n2.No"));
        vueltas.add(r2.darVuelta());
    }while(opcion == 1);
}*/