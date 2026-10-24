public class EmpregadoTest {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Carlos", "Silva", 3000.0);
        Empregado emp2 = new Empregado("Ana", "Souza", 4500.0);

        System.out.println("Salario anual de " + emp1.getPrimeiroNome() + ": " + (emp1.getSalarioMensal() * 12));
        System.out.println("Salario anual de " + emp2.getPrimeiroNome() + ": " + (emp2.getSalarioMensal() * 12));

        emp1.setSalarioMensal(emp1.getSalarioMensal() * 1.10);
        emp2.setSalarioMensal(emp2.getSalarioMensal() * 1.10);

        System.out.println("Novo salario anual de " + emp1.getPrimeiroNome() + ": " + (emp1.getSalarioMensal() * 12));
        System.out.println("Novo salario anual de " + emp2.getPrimeiroNome() + ": " + (emp2.getSalarioMensal() * 12));
    }
}