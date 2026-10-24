public class TestarAnimais {
    public static void main(String[] args) {

        Animal camelo = new Animal("Camelo", 150f, 4, "Amarelo", "Terra", 2.0f);


        Peixe tubarao = new Peixe("Tubarão", 300f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");


        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180f, 4, "Vermelho", "Terra", 0.5f, "Mel");


        System.out.println("--- Relatório: Camelo ---");
        camelo.dados();

        System.out.println("\n--- Relatório: Tubarão ---");
        tubarao.dados();

        System.out.println("\n--- Relatório: Urso-do-canadá ---");
        ursocanada.dados();
    }
}