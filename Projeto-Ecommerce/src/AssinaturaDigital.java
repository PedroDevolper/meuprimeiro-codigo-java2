public class AssinaturaDigital extends Produtos{
    private int mesesDuracao;
    public AssinaturaDigital(String nome, double precoBase,int mesesDuracao) {
        super(nome, precoBase);
        this.mesesDuracao = mesesDuracao;
    }

    @Override
    public double getTaxaImposto() {
        double imposto = 0.05;
        return getPrecoBase() * imposto;

    }

    @Override
    public double getValorAPagar() {
        return getPrecoBase() + getTaxaImposto();
    }
}
