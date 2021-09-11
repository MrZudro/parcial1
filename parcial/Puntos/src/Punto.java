public class Punto {
    //atributos
    private int posicionInicial = 0;
    private int puntoID;
    private int totalDesplazado= 0;
    private int posActual= 0; 
    
    //getters
    public int getposicionInicial() {
        return posicionInicial;
    }
    public int getPuntoID() {
        return puntoID;
    }
    public int getTotalDesplazado() {
        return totalDesplazado;
    }
    public int getPosActual() {
        return posActual;
    }

    //Setters
    public void setposicionInicial(int posicionInicial) {
        this.posicionInicial = posicionInicial;
    }
    public void setPuntoID(int puntoID) {
        this.puntoID = puntoID;
    }
    public void setTotalDesplazado(int totalDesplazado) {
        this.totalDesplazado = totalDesplazado;
    }

    //Constructor
    public Punto(int posicionInicial){
        this.posicionInicial = posicionInicial;
    }
    public Punto(){

    }

    //Metodos
    public void moverHor(int moverH){
        totalDesplazado += moverH;
        posActual = moverH;
        for(int i= 1;i<moverH;i++){
            System.out.print("   ");
        }
        System.out.print("*");
    }

    public void moverVer(int moverV){
        totalDesplazado += moverV;
        posActual = moverV;
        for(int i= 1;i<moverV;i++){
            System.out.println(" ");
        }
        System.out.println("*");
    }

    public void moverDiag(int moverD){
        totalDesplazado += moverD;
        posActual=moverD;
        for(int i= 1;i<moverD;i++){
            System.out.println(" ");
        }
        for(int b=1;b<moverD;b++){
            System.out.print("   ");
        }
        System.out.println("*");
    }

    public int calcularOrg(){
        return totalDesplazado;
    }


}
