public abstract class Produtos implements Pagamento{
    private String nome;
    private double precoBase;

    public Produtos (String nome, double precoBase){
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }


    @Override
    public  abstract double getTaxaImposto();

    @Override
    public  abstract double getValorAPagar();
}
