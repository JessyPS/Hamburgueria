public class Produto {

    private String nome; //exemplo: Whopper
    private String tipo; //exemplo: sanduiche
    private String tamanho; //300ml, 500ml, G, M
    private double valor; //R$ 16,90

    public Produto (){
        this.setNome ("");
        this.setTipo("");
        this.setTamanho("");
        this.setValor(0.0);
    }

    public Produto (String nome, String tipo, String tamanho) {
        this.setNome(nome);
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setValor(16.90);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
