package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4356.89);
        Produto.desconto = 0.25;

        Produto p2 = new Produto("Caneta Preta", 12.56);
        Produto.desconto = 0.50;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double media = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carinho = R$ %.2f.", media);
    }
}
