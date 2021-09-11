import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    
    static ArrayList <Punto> listPuntos = new ArrayList<>();
    public static void main(String[] args){
        menu();
        mover();
        if(listPuntos.size() != 1){
            char respuesta =JOptionPane.showInputDialog("¿Desea conocer la distancia entre puntos?\n S/N").charAt(0);
            if(respuesta == 's' || respuesta == 'S'){
                distanPuntos();
            }
            char respuesta2 =JOptionPane.showInputDialog("¿Desea conocer la distancia de un punto al origen?\n S/N").charAt(0);
            if(respuesta2 == 's' || respuesta2 == 'S'){
                origenPunto();
            }
        }else{
            char respuesta2 =JOptionPane.showInputDialog("¿Desea conocer la distancia de un punto al origen?\n S/N").charAt(0);
            if(respuesta2 == 's' || respuesta2 == 'S'){
                origenPunto();
            }   
        }
    }

    public static void distanPuntos(){
        int bpunto1 = (Integer.parseInt(JOptionPane.showInputDialog("Entre el punto: "))-1);
        int bpunto2 = (Integer.parseInt(JOptionPane.showInputDialog("y el punto: "))-1);
        int distancia = listPuntos.get(bpunto1).getPosActual() - listPuntos.get(bpunto2).getPosActual();
        JOptionPane.showMessageDialog(null, "La ditancia entre el punto "+(bpunto1+1)+" y el punto "+(bpunto2+1)+" es: "+distancia);
    }

    public static void menu(){
        int puntos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos puntos desea crear?"));
        for(int i =0; i<puntos;i++){
            Punto p = new Punto();
            listPuntos.add(p);
        }
    }

    public static void mover(){
        int opcion;
        for(int i=0;i<listPuntos.size();i++){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer con el punto "+(i+1)+"\n1.Mover horizontalmente\n2.Mover Verticalmente\n3.Mover Diagonalmente")); 
            switch(opcion){
                case 1:
                int moverH;
                moverH = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto desea moverlo? "));
                listPuntos.get(i).moverHor(moverH);
                break;
                case 2:
                int moverV;
                moverV = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto desea moverlo? "));
                listPuntos.get(i).moverVer(moverV);
                break;
                case 3:
                int moverD;
                moverD = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto desea moverlo? "));
                listPuntos.get(i).moverDiag(moverD);
                break;
            }
        }
    }

    public static void origenPunto(){
        int opunto = (Integer.parseInt(JOptionPane.showInputDialog("¿De que punto?")))-1;
        int origen = listPuntos.get(opunto).getTotalDesplazado();
        JOptionPane.showMessageDialog(null, "La ditancia del origen al punto es: "+origen);

    }
}
