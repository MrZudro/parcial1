package logica;
import java.util.Scanner;

public class Complejo {

    private double real;
    private double imag;

    //Constructores

    public Complejo(){
        this.real=0;
        this.imag=0;
    }
    public Complejo(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    //Setters
    public void setReal(double real){
        this.real=real;
    }

    //Getters
    public double getReal(){
    return this.real;
    }

    //metodos

    public Complejo suma(Complejo c1){

        return new Complejo(this.real+c1.real,this.imag+c1.imag);
    }


    public Complejo resta(Complejo c1){
    
        return new Complejo(this.real-c1.real, this.imag-c1.imag);
    }

    public Complejo multiplicacion(Complejo c1){
    
        return new Complejo(this.real*c1.real-this.imag*c1.imag, this.imag*c1.real+this.real*c1.imag);
    
    }
    
    public Complejo conjugado(){

        return new Complejo(this.real, this.imag*(-1));
    }

    public Complejo division(Complejo c1){

        Complejo num=this.multiplicacion(c1.conjugado());
        Complejo den=c1.multiplicacion(c1.conjugado());
        return new Complejo(num.real/den.real,num.imag/den.real);
    }

    public Complejo norma(Complejo c1){
        
        return new Complejo((Math.sqrt(Math.pow(c1.real, 2) + Math.pow(c1.imag, 2))),(Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2))));
    }

    public void leer(){

        System.out.println("Ingrese la parte real y luego de un enter la parte imaginaria: ");
        Scanner s = new Scanner(System.in);
        this.real=s.nextDouble();
        this.imag=s.nextDouble();
    }

    public void imprimir(){
        System.out.println("("+this.real+")"+"+"+"("+this.imag+"i"+")");
    }

}
/*
    Muchas de estas funciones devuelven un objeto, que en este caso sería "Complejo"
*/
