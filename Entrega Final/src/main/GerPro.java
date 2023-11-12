import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerPro{

	private Produto pro = new Produto();
	private List<Produto> bdPro = new ArrayList<Produto>();

        public List<Produto> getBdRem(){
            return bdPro;
        }
        
	public Produto cadPro(Produto rem){

		if(consProCod(rem)== null){
			bdPro.add(rem);
			return rem;
		}
		else{
			return null;
		}

	}//fim cadPro

	public Produto consProCod(Produto pro){
		for(int i = 0; i < bdPro.size(); i++){
			if(pro.getCodigoBarra()== bdPro.get(i).getCodigoBarra()){
				return bdPro.get(i);
			}
		}
		return null;
	}//fim consProCod

	public Produto removeProCod(Produto pro){
                pro = consProCod(pro);
            	if(pro != null){
                    bdPro.remove(pro);
                    return null;
		}
		else{
                    return pro;
		}
		
	}//fim removeProCod

	public Produto atualizaProCod(Produto pro){
		for(int i = 0; i < bdPro.size(); i++){
			if(pro.getCodigoBarra()== bdPro.get(i).getCodigoBarra()){
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                pro.setNome(nome);
				bdPro.set(i, pro);  
                                return bdPro.get(i);
			}
		}
                return null;
	}
}