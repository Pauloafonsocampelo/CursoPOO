
package cursopoo;

class Livro{
    private String cor;
    private String titulo;
    private int paginas;
    private boolean fechado;
    
    Livro(String cor, String titulo, int pagina){
        this.cor = cor;
        this.titulo = titulo;
        this.paginas = pagina;
        this.aberto();
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String c){
        this.cor = c;
    }
    
    public String gettitulo(){
        return titulo;
    }
    
    public void settitulo(String t){
        this.titulo = t;
    }
    
    public int getpaginas(){
        return paginas;
    }
    
    public void setpaginas(int p){
        this.paginas = p;
    }
    
    public void fechar(){
        this.fechado = true;
    }
    
    public void aberto(){
        this.fechado = false;
    }
    
    public void status(){
        System.out.println("Cor: "+ this.cor);
        System.out.println("Título: "+ this.titulo);
        System.out.println("Páginas: "+ this.getpaginas());
        System.out.println("Fechado: "+ this.fechado);
    }
}

public class Aula05 {

    public static void main(String[] args) {
        Livro l1 = new Livro("Azul", "PYTHON", 328);
        l1.status();
    }
    }
    

