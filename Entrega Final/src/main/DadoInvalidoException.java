//Nome: Stefano Calheiros Stringhini - RA: 2312123

public class DadoInvalidoException extends Exception{
    Entrada e = new Entrada();
    public void dadoInvalExcecao(){
        System.out.println("\nERRO: Entrada - Entre apenas com numeros");
    }
    public Medicamento correcaoMed(Medicamento me){
        try{
            me.setCodigoBarra(Integer.parseInt(e.Leitura("\nCodigo de Barra: ")));
        }
         catch (NumberFormatException ne){
            System.out.println("\nERRO: Entrada - Entre apenas com numeros inteiros");
        }
        return me;
    }
}
