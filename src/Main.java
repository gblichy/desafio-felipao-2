//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vitorias = 75;
        int derrotas = 10;

        int saldo = Rankeadas.calcularSaldo(vitorias, derrotas);
        String nivel = Rankeadas.calcularRank(saldo);

        System.out.printf("O Herói tem de saldo **%d** está no nível **%s**%n", saldo, nivel);
    }
}