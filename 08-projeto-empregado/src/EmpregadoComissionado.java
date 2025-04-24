public class EmpregadoComissionado extends Empregado {
    //ATRIBUTOS
    double totalDeVendas;
    double comissao;

    //METODOS
    public double calcularSalario(){
        return ((totalDeVendas * comissao)/100);
    }
}
