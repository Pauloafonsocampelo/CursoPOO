
package cursopoo;

class Lapiseira{
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    Lapiseira(String m, String c, float p){ // <- Construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
    
    public String getModelo(){
    return this.modelo;
}
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A LAPISEIRA:");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tampada: "+ this.tampada);
    }
}

public class Aula04{
    public static void main(String args[]){
        Lapiseira c1 = new Lapiseira("BIC", "Azul", 0.5f);
        c1.status();
        System.out.println("");
        Lapiseira c2 = new Lapiseira("Faber", "Preta", 0.7f);
        c2.status();
    }
    
}
