package br.com.poo;

import javax.swing.JOptionPane;
import br.com.poo.modelo.Contador;
import br.com.poo.modelo.Ponto2D;

public class Execucao {
    public static void main(String[] args) {
        String nome = null;
        while (nome == null || nome.equals("")) {
            nome = JOptionPane.showInputDialog("Qual o seu nome?");
            if (nome == null || nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Voce nao respondeu a pergunta.");
            }
        }
        JOptionPane.showMessageDialog(null, "Seu nome e " + nome);

        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        JOptionPane.showMessageDialog(null, "Valor do contador: " + contador.retornarValor());

        Ponto2D p1 = new Ponto2D(3.0, 4.0);
        Ponto2D p2 = new Ponto2D();
        JOptionPane.showMessageDialog(null, "Ponto 1: " + p1.toString() + "\nDistancia para a origem: " + p1.calcularDistancia(p2));
    }
}