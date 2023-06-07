
package cursopoo;

class ControleRemoto implements Controlador_Aula08{
    
    //Atributos
    private int volume;
    private int volumemax;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.volumemax = 100;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return volume;
    }
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private int getVolumemax(){
        return volumemax;
    }
    
    private void setVolumemax(int volumemax){
        this.volumemax = volumemax;
    }
    
    private boolean getLigado(){
        return ligado;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private boolean getTocando(){
        return tocando;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void deligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
        System.out.println("------MENU------");
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.print("Volume: "+ this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
        }else{
            System.out.println("Não foi possível mostrar o menu, pois a TV está deligada");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }else if(this.getLigado() == false){
            System.out.println("Não pode aumentar o volume, pois a TV está desligada");
        }
        if(this.getVolume() == 100){
            for(int i = 0; this.getVolume() == 100; ){
                
            }
               
            System.out.println("O volume já está no máximo");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Não pode diminuir o volume, pois a TV está desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(50);
        }else{
            System.out.println("O Mudo não pode ser executado, pois a TV está desligada");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(0);
        }else if(this.getLigado() == false){
            System.out.println("O Mudo não pode ser deligado, pois a TV está desligada");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não pode dar play, pois a TV está deligada");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("A TV não pode ser pausada, pois está desligada");
        }
    }
}

public class Aula08 {
    public static void main(String args[]){
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
    
      
        c.abrirMenu();
        c.fecharMenu();
        
    }
    
}
