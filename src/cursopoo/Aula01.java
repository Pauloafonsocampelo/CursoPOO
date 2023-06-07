
package cursopoo;

class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void rabiscar(){
        if(this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar");
        } else 
            System.out.println("Estou rabiscando");
    }
    
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Caneta: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Tampada: "+ this.tampada);
        System.out.println("");
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public float getponta(){
        return ponta;
    }
    }

public class Aula01 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.getponta();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
