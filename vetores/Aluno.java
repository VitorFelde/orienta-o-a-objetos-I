public class Aluno {
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    //metodo getter - serve para retornar o valor de um atributo 
    public String getNome(){ //chamamos para pegar algo de dentro
        return this.nome;
        //this faz referencia a um atributo ou metodod declarado no escopo da classe
    }

    //metodo setter - serve para atribuir valor a um atributo
    public void setNome (String n){ //chamamos para guardar algo dentro
        this.nome = n; 
    }

    public String getMatricula (){
        return this.matricula;
    }

    public void setMatricula (String m){
        this.nome = m;
    }

    public float getNota1 (){
        return this.nota1;
    }   

    public void setNota1 (float n1){
        this.nota1 = n1;
    }

   public float getNota2 (){
        return this.nota2;
    }

    public void setNota2 (float n2){
        this.nota2 = n2;
    }
       public float getNota3 (){
        return this.nota3;
    }

    public void setNota3 (float n3){
        this.nota1 = n3;
    }
       public float getNota4 (){
        return this.nota4;
    }

    public void setNota4 (float n4){
        this.nota1 = n4;
    }

    public float calcularMedia (){
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    }

}