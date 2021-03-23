public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "123456789", "Rua João da silva", null, null, null, 1);
        System.out.println(empregado.printEmpregadoInfo(empregado));
    }
}