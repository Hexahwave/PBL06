public abstract class Roupa implements Produto {
    private String tamanho;
    private String cor;
    private float preco;
    private String marca;

    public Roupa(String tamanho, String cor, float preco)
    {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }

    public float setPreco(float preco)
    {
        this.preco = preco;
        return preco;
    }
    public abstract float calcularPrecoFinal(float acrescimo);

    public float getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }
}
