public class EmpregadoHorista extends Empregado {
    //ATRIBUTOS
    int totalDeHorasTrabalhadas;
    double valorDaHora;

    //METODOS
    public double calcularSalario(){
        return valorDaHora*totalDeHorasTrabalhadas;
    }

    //GET
    public int getTotalDeHorasTrabalhadas() {
        return totalDeHorasTrabalhadas;
    }

    //GET
    public double getValorDaHora() {
        return valorDaHora;
    }
}
