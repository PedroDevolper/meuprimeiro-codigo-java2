public class Eletronicos extends Produtos{
    private String marca;
    public Eletronicos(String nome,String marca,double precoBase) {
        super(nome, precoBase);
        this.marca = marca;
    }

    @Override
    public double getTaxaImposto() {
        double imposto = 0.15; // 15%
        return getPrecoBase() * imposto;
    }

    @Override
    public double getValorAPagar() {
        return getPrecoBase() + getTaxaImposto();
    }
}
