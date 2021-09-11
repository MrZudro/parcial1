import logica.Complejo;
public class Main {

    public static void main(String[] args) {

        Complejo c=new Complejo();
        Complejo c1= new Complejo();
        System.out.println(" ");
        System.out.println("\tHEY! ESTO ES UNA CALCULADORA DE NUMEROS COMPLEJOS");
        System.out.println("-------------------------------------------------------------------");
        c1.leer();
        c.leer();
        System.out.print("Suma: ");
        c.suma(c1).imprimir();
        System.out.print("Resta: ");
        c.resta(c1).imprimir();
        System.out.print("Multiplicacion: ");
        c.multiplicacion (c1).imprimir();
        System.out.print("Division: ");
        c.division (c1).imprimir();
        System.out.print("Conjugado: ");
        c.conjugado().imprimir();
        System.out.print("Norma: ");
        c.norma(c1).imprimir();


    }
}
/*
    Se crean dos objetos de la clase Complejo, ¿por que? Esto se debe a que las 
    funciones que tenemos en la clase complejo nos retornan un dato de tipo Complejo, 
    y es necesario que ese retorno sea guardado cuando se invoque en el Main.
*/