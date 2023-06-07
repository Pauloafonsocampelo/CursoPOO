
package cursopoo;

class ContaBanco{
    int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String semSaldo;
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: "  +this.getnumConta());
        System.out.println("Tipo: "  +this.getTipo());
        System.out.println("Dono: "  +this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
         System.out.println("Conta aberta com sucesso!");
        if(t == "CC"){
            this.setSaldo(50);
        }
        else if(t == "CP"){
            this.setSaldo(150);
        }
       
    }
    
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("A conta possui saldo");
        }else if(saldo < 0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if(this.status = true){
            //this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de "+ this.getDono());
        }else{
            System.out.println("Não é possível fazer o depósito!");
        }
    }
    
    public void sacar(float valor){
        if(this.status = true){
            if(this.saldo > valor){
                //this.saldo = this.saldo - valor;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println(this.getDono()+", Saque efetuado com sucesso!");
            }else
                System.out.println(this.dono+", voce não possui saldo suficiente para realizar o saque!");
        }else{
            System.out.println(this.dono+", sua conta esta inativa ou não existe!");
        }
    }
    
    public void pagarMensal(float valor){
        if(this.tipo == "Conta Corrente" ){
            valor = 12;
        }else if(this.tipo == "Conta poupança"){
            valor = 20;
        }if(this.status = true){
            if(this.saldo > valor){
                //this.saldo = this.saldo - valor;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println(this.getDono()+", sua mensalidade paga sucesso!");
            }else
                System.out.println("Saldo insufuciente");
        }else{
            System.out.println("Não foi possível efetuar o pagamento");
       }
        
    }
    
    public void semsaldo(){
    if(this.saldo == 0){
        System.out.println(this.dono+", voce não possui mais saldo em sua conta!");
    }else{
        
    }
}
    
    public int getnumConta(){
        return numConta;
    }
    
    public void setnumConta(int n){
        numConta = n;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDono(String d){
        dono = d;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float s){
        saldo = s;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean st){
        status = st;
    }
    
    public String getSemSaldo(){
        return semSaldo;
    }
    
    public void setSemsaldo(String ss){
        semSaldo = ss;
    }
    
}



public class Aula06 {
    
}
