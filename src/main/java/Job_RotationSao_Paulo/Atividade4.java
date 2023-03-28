package Job_RotationSao_Paulo;

public class Atividade4 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double faturamentoTotal = sp + rj + mg + es + outros;

    // Calculando o percentual

        double porcentagemSP = (sp / faturamentoTotal) * 100;
        double porcentagemRJ = (rj / faturamentoTotal) * 100;
        double porcentagemMG = (mg / faturamentoTotal) * 100;
        double porcentagemES = (es / faturamentoTotal) * 100;
        double porcentagemOutros = (outros / faturamentoTotal) * 100;

    // resultados com 2 decimais apos a virgula

        System.out.println("Porcentagem por estado:");
        System.out.printf("SP: %.2f%%\n", porcentagemSP);
        System.out.printf("RJ: %.2f%%\n", porcentagemRJ);
        System.out.printf("MG: %.2f%%\n", porcentagemMG);
        System.out.printf("ES: %.2f%%\n", porcentagemES);
        System.out.printf("Outros: %.2f%%\n", porcentagemOutros);
    }
}
