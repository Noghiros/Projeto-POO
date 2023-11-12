//Nome: Stefano Calheiros Stringhini - RA: 2312123

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerPro{

	private Outros pro = new Outros();
	private List<Outros> bdPro = new ArrayList<Outros>();

        public List<Outros> getBdPro(){
            return bdPro;
        }
        
	public Outros cadPro(Outros pro){

		if(consProCod(pro)== null){
			bdPro.add(pro);
			return pro;
		}
		else{
			return null;
		}

	}//fim cadPro

	public Outros consProCod(Outros pro){
		for(int i = 0; i < bdPro.size(); i++){
			if(pro.getCodigoBarra()== bdPro.get(i).getCodigoBarra()){
				return bdPro.get(i);
			}
		}
		return null;
	}//fim consProCod

	public Outros removeProCod(Outros pro){
                pro = consProCod(pro);
            	if(pro != null){
                    bdPro.remove(pro);
                    return null;
		}
		else{
                    return pro;
		}
		
	}//fim removeProCod

	public Outros atualizaProCod(Outros pro){
		for(int i = 0; i < bdPro.size(); i++){
			if(pro.getCodigoBarra()== bdPro.get(i).getCodigoBarra()){
                                int o=0;
                                
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setNome(nome);
                                String validade = JOptionPane.showInputDialog(null, "Informe o NOVA validade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setValidade(validade);
                                String disponibilidade = JOptionPane.showInputDialog(null, "Informe o NOVA disponibilidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setDisponibilidade(disponibilidade);
                                String tipo = JOptionPane.showInputDialog(null, "Informe o NOVO tipo", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setTipo(tipo);
                                
                                do{
                                try{
                                String peso = JOptionPane.showInputDialog(null, "Informe o NOVA miligrama", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setPeso(Integer.parseInt(peso));
                                String preco = JOptionPane.showInputDialog(null, "Informe o NOVO preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setPreco(Integer.parseInt(preco));
                                o=1;
                                }catch(NumberFormatException nfe){
                                JOptionPane.showMessageDialog(null,"coloque apenas numeros inteiros\nonde estiver em vermelho!","ERRO NA ENTRADA!", 0);
                                }
                                }while(o==0);
                                
                                bdPro.set(i, pro); 
                                return bdPro.get(i);
			}
		}
                return null;
	}
}