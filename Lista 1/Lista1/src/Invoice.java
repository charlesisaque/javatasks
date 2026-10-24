public class Invoice {
    private String numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;

    public Invoice(String numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNumeroItem() {
        return numeroItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getInvoiceAmount() {
        return quantidadeComprada * precoUnitario;
    }
}