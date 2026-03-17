public class LivrosFisicos extends Produtos{
    private String nomeAutor;
    public LivrosFisicos(String nome, String nomeAutor,double precoBase) {
        super(nome, precoBase);
        this.nomeAutor = nomeAutor;
    }

    @Override
    public double getTaxaImposto() {
        return 0; // taxa de imposto para livros fisicos por lei é 0.
    }

    @Override
    public double getValorAPagar() {
        return getPrecoBase() + getTaxaImposto();
    }
}
