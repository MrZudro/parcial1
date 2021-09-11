public class Cronometro extends Reloj{
    //atriutos
    private int horas;
    private int minutos; 
    private int segundos;

    //constrictructor

    public Cronometro(){

    }

    public Cronometro(int horas, int minutos, int segundos){
        super(horas, minutos, segundos);
    }

    //metodos

    @Override
    public void run(){
        mostraReloj();
        for (int i=0;i<Main.vueltas.size();i++) {
            System.out.println(Main.vueltas.get(i));
        }
    }

    @Override
    public void mostraReloj(){

        for(this.segundos = segundos;segundos<30;segundos++){
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

    public String darVuelta(){
        String vuelta = String.valueOf(getHoras())+":"+String.valueOf(getMinutos())+":"+String.valueOf(getSegundos());
        return vuelta;
    }

}
