
package uef;


public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Chegou a Hora!!!! apresento a Vocês o Lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com "+ this.getIdade() + " anos e " + this.getAltura() + " de altura !");
        System.out.println("Pesando!! " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas e ");
        System.out.println(this.getEmpates() + " Empates !!!");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Vezes");
        System.out.println("Perdeu " + this.getEmpates() + " Vezes");
        System.out.println("Empatou " + this.getEmpates() + " Vezes");
    }
    public void ganharLuta(){
    this.setVitorias(this.getVitorias()+1);
    
    }
    public void perderLuta(){
    this.setDerrotas(this.getDerrotas()+1);
    
    }
    public void empatarLuta(){
    this.setEmpates(this.getEmpates()+1);
    
    }
    //metodos especiais 

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
        this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
        this.categoria = "Leve";
        }else if(this.peso <=83.9){
        this.categoria = "Médio";
        }else if(this.peso <=120.3){
        this.categoria = "Pesado";
        }else{ this.categoria = "Inválido";}
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
