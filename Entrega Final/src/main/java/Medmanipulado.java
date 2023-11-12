//Nome: Stefano Calheiros Stringhini - RA: 2312123


public class Medmanipulado extends Medicamento {
    private String Nomecliente;
    private int cpf;
    private String ativo;
    private String formula;
    private String CRM;

// Polimorfismo por Sobrecarga------------------------------------------------------------------------------------

    public Medmanipulado(){
        Nomecliente = "";
        cpf = 0;
        ativo = "";
        formula = "";
        CRM = "";
    }

    public Medmanipulado(String NomeCliente, int CPF, String Ativo, String Formula, String CRM){
        this.Nomecliente=NomeCliente;
        this.cpf=CPF;
        this.ativo=Ativo;
        this.formula=Formula;
        this.CRM=CRM;
    }

        public Medmanipulado(Medmanipulado a){
            this.Nomecliente=a.getNomeCliente();
            this.cpf=a.getCPF();
            this.ativo=a.getAtivo();
            this.formula=a.getFormula();
            this.CRM=a.getCRM();
        }

    public String getNomeCliente(){ return Nomecliente;}

    public int getCPF(){ return cpf;}

    public String getAtivo(){ return ativo;}

    public String getFormula(){ return formula;}

    public String getCRM(){ return CRM;}

    public void setNomecliente(String nomecliente) {
        Nomecliente = nomecliente;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
}
