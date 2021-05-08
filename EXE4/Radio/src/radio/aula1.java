

package radio;


public class aula1 {
    public String modelo;
    public String corled;  
    private boolean ligado;
    private int volume;
   
    public void setModelo(String modelo){
    this.modelo = modelo; 
   }
   
   public String getModelo(){
    return this.modelo;
   }
    
    public void setCorled(String corLed){
    this.corled = corLed; 
   }
   
   public String getCorLed(){
    return this.corled;
   }
    
   public void setVolume(int volume){
     if(volume >=1 && volume <=99){
       this.volume = volume;
     }else{System.out.println("ESTE VOLUME NÃO EXISTE"); }
   }
   
   public int getVolume(){
    return this.volume;
   }
   
    public void setLigado(boolean ligado){
  
        this.ligado = ligado;
     
    }   
   
   
   public boolean getLigado(){
   return this.ligado;
   }
    
   public void Status(){
       System.out.println("MODELO: " + this.modelo);
       System.out.println("COR DO LED: " + this.corled);
       System.out.println("O RADIO ESTÁ LIGADO:" + this.ligado);
       System.out.println("VOLUME: " + this.volume);
   }
   
}
