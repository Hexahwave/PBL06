public abstract class Calca extends Roupa{
    @Override
    public float calcularPrecoFinal(float acrescimo)
    {
        getPreco();
        preco -= (preco*3)/20;
        return preco;
    }

    public Calca(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public float setPreco(float preco) {
        return 0;
    }
}
