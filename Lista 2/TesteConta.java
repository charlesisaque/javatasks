import javax.swing.JOptionPane;

public class TesteConta {
    public static void main(String[] args) {
        String nome = null;
        while (nome == null || nome.equals("")) {
            nome = JOptionPane.showInputDialog("Qual o seu nome?");
            if (nome == null || nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Voce nao respondeu a pergunta.");
            }
        }
        JOptionPane.showMessageDialog(null, "Seu nome e " + nome);

        Data data = new Data(10, 5, 2023);
        Conta conta = new Conta(nome, 1234, "001-X", 1000.0, data);

        conta.depositar(500.0);
        conta.sacar(200.0);

        JOptionPane.showMessageDialog(null, conta.recuperaDadosParaImpressao() + "\nRendimento: " + conta.calcularRendimento());
    }
}