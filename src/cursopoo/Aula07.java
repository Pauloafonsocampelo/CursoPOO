
package cursopoo;



public class Aula07 {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1111);
        p1.setDono("Paulo");
        p1.abrirConta("CC");
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setnumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("CP");
       
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(600);
        p1.sacar(100);
        
        p1.sacar(50);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        p2.semsaldo();
        
    }
    
    
}
