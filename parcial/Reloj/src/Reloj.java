public class Reloj extends Thread {
    //atributos
    private boolean isActive = true;
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;

    //Constructores
    public Reloj(){

    }

    public Reloj(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //setters
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //getters
    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    //metodos

    @Override
    public void run(){
        mostraReloj();
    }

    public void mostraReloj(){
        do{
            for(this.horas=horas; horas<=24;horas++){
                for(this.minutos = minutos;minutos<=60;minutos++){
                    for(this.segundos = segundos;segundos<=60;segundos++){
                        if(segundos==60){
                            segundos = 0;
                            minutos++;
                        }
                        if(minutos==60){
                            minutos=0;
                            horas++;
                        }
                        if(horas==24){
                            horas=0;
                            minutos=0;
                            segundos=0;
                        }
                        if(horas < 10){
                            System.out.print("0"+horas+":");
                        }else{
                            System.out.print(horas+":");
                        }
                        if(minutos < 10){
                            System.out.print("0"+minutos+":");
                        }else{
                            System.out.print(minutos+":");
                        }
                        if(segundos < 10){
                            System.out.println("0"+segundos);
                        }else{
                            System.out.println(segundos);
                        }
                        try {
                            Thread.sleep(990);//Ralentizamos para que parezca un segundo
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("\033[H\033[2J");//Que forma de borrar la consola mas rara.
                        System.out.flush();
                    }
                }
            }
        }while(isActive == true);
        
    }

    public void parar(){
        isActive = false;
    }

}
