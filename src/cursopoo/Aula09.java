
package cursopoo;

class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso() + "Kg");
        if(this.getVitoria() > 1 || this.getVitoria() == 0){
            System.out.println("Ganhou: " + getVitoria() + " lutas");
        }else{
            System.out.println("Ganhou: " + getVitoria() + " luta");
        }
        if(this.getDerrota() > 1 || this.getDerrota() == 0){
            System.out.println("Perdeu: "+ getDerrota() + " lutas");
        }else{
            System.out.println("Perdeu: "+ getDerrota() + " luta");
        }
        if(this.getEmpate() > 1 || this.getEmpate() == 0){
            System.out.println("Empatou: "+ getEmpate() + " lutas");
        }else{
            System.out.println("Empatou: "+ getEmpate() + " luta");
        }
    }
    
    public void Status(){
        System.out.println(getNome());
        System.out.println("Peso " + getCategoria());
        if(this.getVitoria() > 1 || this.getVitoria() == 0){
            System.out.println("Ganhou " + getVitoria() + " vezes");
        }else{
            System.out.println("Ganhou " + getVitoria() + " vez");
        }
        if(this.getDerrota() > 1 || this.getDerrota() == 0){
            System.out.println("Perdeu " + getDerrota() + " vezes");
        }else{
            System.out.println("Perdeu " + getDerrota() + " vez");
        }
        if(this.getEmpate() > 1 || this.getEmpate() == 0){
            System.out.println("Empatou " + getEmpate() + " vezes");
        }else{
            System.out.println("Empatou " + getEmpate() + " vez");
        }
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    private void setCategoria(){
        if(peso < 52.2){
            this.categoria = "Inválido";
        }else if(peso <= 70.3){
            this.categoria = "Leve";
        }else if(peso <= 83.9){
            this.categoria = "Médio";
        }else if(peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
        
    }
    
    public int getVitoria(){
        return vitorias;
    }
    
    public void setVitoria(int vitorias){
        this.vitorias = vitorias;
    }
    
    public int getDerrota(){
        return derrotas;
    }
    
    public void setDerrota(int derrotas){
        this.derrotas = derrotas;
    }
    
    public int getEmpate(){
        return empates;
    }
    
    public void setEmpate(int empates){
        this.empates = empates;
    }
}

public class Aula09 {
    public static void main(String args[]){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscrip", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
       
       
    }
    
}
