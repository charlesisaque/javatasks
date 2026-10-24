public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, Data dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double calcularRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return "Titular: " + titular +
                "\nNumero: " + numero +
                "\nAgencia: " + agencia +
                "\nSaldo: " + saldo +
                "\nData de Abertura: " + dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno();
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }
}