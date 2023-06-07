package cursopoo;

import static java.lang.Math.random;
import java.util.Random;

class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 ){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("===================");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // Gerar três resultados diferentes (0, 1, 2)
            switch (vencedor){
                case 0: //Empate
                    System.out.println("!!!! Empatou !!!!");
                    System.out.println("===================");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou Desafiado
                    System.out.println("$$$$ Vitória do " + desafiado.getNome() + " $$$$");
                    System.out.println("===================");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Ganhou Desafiante
                    System.out.println("$$$$ Vitória do " + desafiante.getNome() + " $$$$");
                    System.out.println("===================");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("A Luta não pode acontecer!");
        }
        
    }
    public Lutador getDesafiado(){
        return desafiado;
    }
    
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiante(){
        return desafiante;
    }
    
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    
    public boolean getAprovada(){
        return aprovada;
    }
    
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
}
public class Luta_Aula09 {
    
    
}

