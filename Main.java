import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Roupa camisa1 = new Camisa;
    Roupa calca1 = new Calca;
    Roupa vestido1 = new Vestido;
    ArrayList<Roupa> roupas = new ArrayList<>();
    roupas.add(new Calca("Grande", "Azul", 120));
    roupas.add(new Camisa("Pequena", "Roxa", 60));
    roupas.add(new Vestido("Gigante", "Colorido", 1200));
    for Roupa roupas: roupas
        {
            if (roupas instanceof Calca)
            {
                System.out.println("CALÇA");
            }
            else if (roupas instanceof Camisa)
            {
                System.out.println("CAMISA");
            }
            else
            {
                System.out.printf("VESTIDO");
            }
            System.out.println(roupas.getTamanho);
            System.out.println(roupas.getCor);
            System.out.println(roupas.getPreco);
        }

    }
}
