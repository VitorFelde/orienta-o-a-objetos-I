public class Turma {
    // Atributos declarados
    private int nroTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdeAlunos;
    private Aluno[] vetAlunos;


    public Turma (){
        this.vetAlunos = new Aluno[40]; 
    }

    public int getNroTurma() {
        return this.nroTurma;
    }

    public void setNroTurma(int nroTurma) {
        this.nroTurma = nroTurma;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoIngresso() {
        return this.anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeAlunos() {
        return this.qtdeAlunos;
    }

    public Aluno getAluno(int pos){
        return this.vetAlunos[pos]; //criamos pos para melhor controle
    }

    public void setAlunos(Aluno a) {
        if (this.qtdeAlunos < 40) {
        this.vetAlunos[qtdeAlunos] = a;
        qtdeAlunos++;
        }
    }
}
