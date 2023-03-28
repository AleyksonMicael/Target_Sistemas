package Job_RotationSao_Paulo;
import Job_RotationSao_Paulo.aquivoJson.Registro;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Atividade3 {
    public static void main(String[] args) throws IOException {

    // Acessando arquivo Json

        String json = new String(Files.readAllBytes(Paths.get("C:\\ESTAGIO\\Job_Rotation-São_Paulo\\src\\main\\java\\Job_RotationSao_Paulo\\aquivoJson\\Dados.json")));

        Type listType = new TypeToken<ArrayList<Registro>>() {}.getType();
        List<Registro> registros = new Gson().fromJson(json, listType);

        List<Registro> dados = new ArrayList<>();

        for (Registro registro : registros) {
            dados.add(new Registro(registro.getDia(), registro.getValor()));
        }

        double[] faturamentoDiario = dados.stream().mapToDouble(Registro::getValor).toArray();


        double menorFaturamento = faturamentoDiario[0];
        double menorFaturamentoSemDiasZerados = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double somaFaturamento = 0;


    // Calcula o menor e maior faturamento diário

        for(int i = 0; i < faturamentoDiario.length; i++) {

            if(faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }

            if(faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }

            if(faturamentoDiario[i] < menorFaturamentoSemDiasZerados &&
                    faturamentoDiario[i] != 0.0) {
                menorFaturamentoSemDiasZerados = faturamentoDiario[i];
            }

            somaFaturamento += faturamentoDiario[i];
        }

    // Calcula a média mensal de faturamento diário sem dias zerados

        double faturamentoSemDiasZerados = 0.0;
        for (Registro registro : registros) {
            if ( registro.getValor() != 0.0){
                faturamentoSemDiasZerados++;
            }
        }
        double mediaMensal = somaFaturamento / faturamentoSemDiasZerados;

    // Calcula o número de dias em que o faturamento diário foi superior à média mensal

        int numDiasAcimaMedia = 0;
        for(int i = 0; i < faturamentoDiario.length; i++) {
            if(faturamentoDiario[i] > mediaMensal) {
                numDiasAcimaMedia++;
            }
        }

        System.out.printf("Menor faturamento diário: %.2f%n" , menorFaturamento);
        System.out.printf("Menor faturamento diário sem dias zerados: %.2f%n" , menorFaturamentoSemDiasZerados);
        System.out.printf("Maior faturamento diário: %.2f%n" , maiorFaturamento);
        System.out.println("Dias acima da média: " + numDiasAcimaMedia);
    }
}

