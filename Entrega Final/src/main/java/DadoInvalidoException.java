//Nome: Stefano Calheiros Stringhini - RA: 2312123

import javax.swing.JOptionPane;

public class DadoInvalidoException extends Exception{
    
    public Medmanipulado correcaoRemmaniCodigoBarra(Medmanipulado remmani){
        try{
            remmani.setCodigoBarra(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            remmani = correcaoRemmaniCodigoBarra(remmani);
        }
        return remmani;
    }
    
    public Medmanipulado correcaoRemmaniMg(Medmanipulado remmani){
        try{
            remmani.setMiligramas(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            remmani = correcaoRemmaniMg(remmani);
        }
        return remmani;
    }
    
    public Medmanipulado correcaoRemmaniPreco(Medmanipulado remmani){
        try{
            remmani.setPreco(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            remmani = correcaoRemmaniPreco(remmani);
        }
        return remmani;
    }
    
    public Medicamento correcaoRemCodigoBarra(Medicamento rem){
        try{
            rem.setCodigoBarra(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            rem = correcaoRemCodigoBarra(rem);
        }
        return rem;
    }
    
    public Medicamento correcaoRemMg(Medicamento rem){
        try{
            rem.setMiligramas(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            rem = correcaoRemMg(rem);
        }
        return rem;
    }
    
    public Medicamento correcaoRemPreco(Medicamento rem){
        try{
            rem.setPreco(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            rem = correcaoRemPreco(rem);
        }
        return rem;
    }
    
    public Outros correcaoOutroCodigoBarra(Outros outro){
        try{
            outro.setCodigoBarra(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            outro = correcaoOutroCodigoBarra(outro);
        }
        return outro;
    }
    
    public Outros correcaoOutrosPeso(Outros outro){
        try{
            outro.setPeso(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            outro = correcaoOutrosPeso(outro);
        }
        return outro;
    }
    
    public Outros correcaoOutrosPreco(Outros outro){
        try{
            outro.setPreco(Integer.parseInt((JOptionPane.showInputDialog(null, "Informe um Código com Apenas Números Inteiros", "Inválido", JOptionPane.QUESTION_MESSAGE))));
        } catch(NumberFormatException nfe){
            outro = correcaoOutrosPreco(outro);
        }
        return outro;
    }
}
