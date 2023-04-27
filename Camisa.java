public abstract class Camisa extends Roupa{

    @Override
    public float calcularPrecoFinal(float acrescimo)
    {
        getPreco();
        preco -= preco/10;
        return preco;
    }

    public Camisa(String tamanho, String cor, float preco)
    {
        super(tamanho, cor, preco);
        getPreco();
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
