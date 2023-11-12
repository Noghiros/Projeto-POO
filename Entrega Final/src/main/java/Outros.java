//Nome: Stefano Calheiros Stringhini - RA: 2312123


public class Outros extends Produto{
    private String tipo;
    private int peso;

// Polimorfismo por Sobrecarga------------------------------------------------------------------------------------

    public Outros(){
        tipo ="";
        peso=0;
    }

    public Outros(String Tipo,int Peso){
     this.tipo=Tipo;
     this.peso=Peso;
    }

        public Outros(Outros o){
            this.tipo=o.getTipo();
            this.peso=o.getPeso();
        }

    // Classe Interface
        public double desconto()
        {
            double precoFinal;
            precoFinal = getPreco()*0.9;

            return precoFinal;
        }
        
        
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
