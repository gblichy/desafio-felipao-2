public class Rankeadas {

    public static int calcularSaldo(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    public static String calcularRank(int saldo) {
        if (saldo < 10) return "Ferro";
        if (saldo <= 20) return "Bronze";
        if (saldo <= 50) return "Prata";
        if (saldo <= 80) return "Ouro";
        if (saldo <= 90) return "Diamante";
        if (saldo <= 100) return "Lendário";
        return "Imortal";
    }
}
