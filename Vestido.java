public abstract class Vestido extends Roupa{

    public Vestido(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public float calcularPrecoFinal(float acrescimo)
    {
        getPreco();
        preco -= preco/4;
        return preco;
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
