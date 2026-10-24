public class Animal {
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getComprimento() { return comprimento; }
    public void setComprimento(float comprimento) { this.comprimento = comprimento; }

    public int getNumPatas() { return numPatas; }
    public void setNumPatas(int numPatas) { this.numPatas = numPatas; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getAmbiente() { return ambiente; }
    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }

    public float getVelocidadeMedia() { return velocidadeMedia; }
    public void setVelocidadeMedia(float velocidadeMedia) { this.velocidadeMedia = velocidadeMedia; }

    public void dados() {
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidadeMedia + " m/s");
    }
}