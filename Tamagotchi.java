public class Tamagotchi{
    //Atributos do Tamagotchi
  private String nome;
  private int idade;
  private int peso;
  private int fome;
  private int sono;
  private int exercicio;
  
  public Tamagotchi (String nome, int idade, int peso, int fome,int sono, int exercicio){
       this.nome = nome;
       this.idade = idade;
       this.peso = peso;
       this.fome = fome;
       this.sono = sono;
       this.exercicio = exercicio;
  }
    
    //Getters dos atributos
    
    public String getNome(){
        return this.nome;
    }
    
  
    public int getIdade () {
       return this.idade = idade;
    }
    
    
    public int getPeso () {
        return this.peso;
    }
    
    public int getFome () {
       return this.fome;
    } 
    
    public int getSono () {
        return this.sono;
    }
    
    
     public int getExercicio () {
        return this.exercicio;
     }
      
}
    
  
    