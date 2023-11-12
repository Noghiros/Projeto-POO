//Nome: Stefano Calheiros Stringhini - RA: 2312123


public class Medicamento extends Produto implements calcDescontoInter{
    private String nomeClinico;
    private int miligramas;
    private String composicao;
    private String sitRecomenda;
    private String periodoUso;
    private String publicoAlvo;

// Polimorfismo por Sobrecarga------------------------------------------------------------------------------------

    public Medicamento(){
        nomeClinico = "";
        miligramas = 0;
        composicao = "";
        sitRecomenda = "";
        periodoUso = "";
        publicoAlvo = "";
    }

    public Medicamento(String NomeClinico,int Miligramas,String Composicao,String QtdDose,String SitRecomenda, String PeriodoUso,String PublicoAlvo){
        this.nomeClinico=NomeClinico;
        this.miligramas=Miligramas;
        this.composicao= Composicao;
        this.sitRecomenda= SitRecomenda;
        this.periodoUso=PeriodoUso;
        this.publicoAlvo=PublicoAlvo;
    }

        public Medicamento(Medicamento m){
            this.nomeClinico=m.getNomeClinico();
            this.miligramas=m.getMiligramas();
            this.composicao=m.getComposicao();
            this.sitRecomenda=m.getSitRecomenda();
            this.periodoUso=m.getPeriodoUso();
            this.publicoAlvo= m.getPublicoAlvo();
        }

        // Classe Interface
            public double desconto()
            {
                double precoFinal;
                precoFinal = getPreco()*0.9;

                return precoFinal;
            }

    public String getNomeClinico() {
        return nomeClinico;
    }

    public void setNomeClinico(String nomeClinico) {
        this.nomeClinico = nomeClinico;
    }

    public int getMiligramas() {
        return miligramas;
    }

    public void setMiligramas(int miligramas) {
        this.miligramas = miligramas;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }


    public String getSitRecomenda() {
        return sitRecomenda;
    }

    public void setSitRecomenda(String sitRecomenda) {
        this.sitRecomenda = sitRecomenda;
    }

    public String getPeriodoUso() {
        return periodoUso;
    }

    public void setPeriodoUso(String periodoUso) {
        this.periodoUso = periodoUso;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

}
