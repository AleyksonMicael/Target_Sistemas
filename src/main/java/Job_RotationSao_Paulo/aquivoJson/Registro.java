package Job_RotationSao_Paulo.aquivoJson;

public class Registro {
    private int dia;
    private double valor;

    public Registro() {
    }

    public Registro(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
