//Nome: Stefano Calheiros Stringhini - RA: 2312123


public class Produto {
    private String nome;
    private long codigoBarra;
    private int preco;
    private String validade;
    private String disponibilidade;

    public Produto() {
        nome="";
        codigoBarra=0;
        preco=0;
        validade="";
        disponibilidade="";
    }
        public Produto(String Nome, long CodigoBarra,int Preco,String Validade, String Disponibilidade){
        this.nome = Nome;
        this.codigoBarra = CodigoBarra;
        this.preco = Preco;
        this.validade = Validade;
        this.disponibilidade = Disponibilidade;
        }
            public Produto(Produto p){
            this.nome = p.getNome();
            this.codigoBarra = p.getCodigoBarra();
            this.preco = p.getPreco();
            this.validade= p.getValidade();
            this.disponibilidade = p.getDisponibilidade();
            }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
