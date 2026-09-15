public class Voos {
    private String origem;
    private String destino;
    private String data;
    private String hora;
    private int qtdePassageiros;
    private Passageiros[] vetPassageiros;



    public Voos() {
        this.vetPassageiros = new Passageiros[10];
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getQtdePassageiros() {
        return this.qtdePassageiros;
    }
}
