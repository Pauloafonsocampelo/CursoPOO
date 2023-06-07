
package cursopoo;

class Aula{
    int duração;
    int data_inicio;
    int hora_inicio;
    int hora_termino;
    
    Aula(){
        hora_termino = 10;
    }
    
    void comecar_aula(){
    if(this.hora_inicio == 7){
            System.out.println("Aula ja comecou!!");
    } if(this.hora_inicio < 7){
         System.out.println("Nao comecou!!");
    } else if(this.hora_termino >= 10)
            System.out.println("Aula terminou!!");
}
    
    void situacao(){
        System.out.println("Duracao: "+ this.duração+"horas");
        System.out.println("Data de inicio: "+ this.data_inicio);
        System.out.println("Hora de inicio "+ this.hora_inicio+"horas");
    }
}

public class Aula02 {
    
    public static void main(String args[]){
        Aula c1 = new Aula();
        c1.duração = 3;
        c1.data_inicio = 15;
        c1.hora_inicio = 7;
        c1.hora_termino = 10;
        c1.comecar_aula();
        c1.situacao();
    }
    
}
