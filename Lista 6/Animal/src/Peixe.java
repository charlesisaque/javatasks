public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() { return caracteristica; }
    public void setCaracteristica(String caracteristica) { this.caracteristica = caracteristica; }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}