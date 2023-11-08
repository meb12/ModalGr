public class Emprestimo {

    String nomeColaborador;
    int anoAdmissao;
    double salarioAtual;
    double valorEmprestimo;

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public Emprestimo(String nomeColaborador,int anoAdmissao,double salarioAtual, double valorEmprestimo)
    {
        this.nomeColaborador = nomeColaborador;
        this.anoAdmissao = anoAdmissao;
        this.salarioAtual = salarioAtual;
        this.valorEmprestimo = valorEmprestimo;
    }
}


