import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public static void main(String[] args) {

        List<Produtos> listProdutos = new ArrayList<>();

        LivrosFisicos livrosFisicos = new LivrosFisicos("Dom Casmurro", "Machado de Assis", 100);
        Eletronicos eletronicos = new Eletronicos("Macbook Pro", "Apple", 1000);
        AssinaturaDigital assinaturaDigital = new AssinaturaDigital("Curso Java", 1200, 1);

        listProdutos.add(livrosFisicos);
        listProdutos.add(eletronicos);
        listProdutos.add(assinaturaDigital);

        double custoTotal = 0;
        double valorTotalImpostos = 0;

        for(Produtos produtos : listProdutos){
            System.out.printf("Produto: %s , valor de imposto R$ %.2f .\n",produtos.getNome(),produtos.getTaxaImposto());
            valorTotalImpostos += produtos.getTaxaImposto();
            custoTotal += produtos.getValorAPagar();
        }

        System.out.printf("Valor total dos impostos: R$ %.2f\n",valorTotalImpostos);
        System.out.printf("Valor total a pagar (Produtos + Impostos): R$ %.2f",custoTotal);

    }
}
