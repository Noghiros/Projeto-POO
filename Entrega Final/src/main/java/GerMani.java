//Nome: Stefano Calheiros Stringhini - RA: 2312123


import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerMani{

	private Medmanipulado rem = new Medmanipulado();
	private List<Medmanipulado> bdRem = new ArrayList<Medmanipulado>();

        public List<Medmanipulado> getBdRem(){
            return bdRem;
        }
        
	public Medmanipulado cadPro(Medmanipulado rem){

		if(consProCod(rem)== null){
			bdRem.add(rem);
			return rem;
		}
		else{
			return null;
		}

	}//fim cadPro

	public Medmanipulado consProCod(Medmanipulado rem){
		for(int i = 0; i < bdRem.size(); i++){
			if(rem.getCodigoBarra()== bdRem.get(i).getCodigoBarra()){
				return bdRem.get(i);
			}
		}
		return null;
	}//fim consProCod

	public Medmanipulado removeProCod(Medmanipulado rem){
                rem = consProCod(rem);
            	if(rem != null){
                    bdRem.remove(rem);
                    return null;
		}
		else{
                    return rem;
		}
		
	}//fim removeProCod

	public Medmanipulado atualizaProCod(Medmanipulado rem){
		for(int i = 0; i < bdRem.size(); i++){
			if(rem.getCodigoBarra()== bdRem.get(i).getCodigoBarra()){
                                int o=0;
                                
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setNome(nome);
                                String nomeclinico = JOptionPane.showInputDialog(null, "Informe o NOVO nome Clinico", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setNomeClinico(nomeclinico);
                                String periodo = JOptionPane.showInputDialog(null, "Informe o NOVO periodo de uso", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setPeriodoUso(periodo);
                                String publico = JOptionPane.showInputDialog(null, "Informe o NOVO publico alvo", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setPublicoAlvo(publico);
                                String sintomas = JOptionPane.showInputDialog(null, "Informe o NOVOS sintomas recomendados", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setSitRecomenda(sintomas);
                                String validade = JOptionPane.showInputDialog(null, "Informe o NOVA validade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setValidade(validade);
                                String disponibilidade = JOptionPane.showInputDialog(null, "Informe o NOVA disponibilidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setDisponibilidade(disponibilidade);
                                do{
                                try{
                                String miligramas = JOptionPane.showInputDialog(null, "Informe o NOVA miligrama", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setMiligramas(Integer.parseInt(miligramas));
                                String preco = JOptionPane.showInputDialog(null, "Informe o NOVO preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setPreco(Integer.parseInt(preco));
                                o=1;
                                }catch(NumberFormatException nfe){
                                JOptionPane.showMessageDialog(null,"coloque apenas numeros inteiros\nonde estiver em vermelho!","ERRO NA ENTRADA!", 0);
                                }}while(o==0);
                                
                                String nomecliente = JOptionPane.showInputDialog(null, "Informe o NOVO nome do Paciente", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setNomecliente(nomecliente);
                                do{
                                try{    
                                String cpf = JOptionPane.showInputDialog(null, "Informe o NOVO CPF", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setCpf(Integer.parseInt(cpf));
                                }catch(NumberFormatException nfe){
                                JOptionPane.showMessageDialog(null,"coloque apenas numeros inteiros\nonde estiver em vermelho!","ERRO NA ENTRADA!", 0);
                                }}while(o==0);
                                String ativo = JOptionPane.showInputDialog(null, "Informe o NOVO ativo", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setAtivo(ativo);
                                String formula = JOptionPane.showInputDialog(null, "Informe o NOVA formula", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setFormula(formula);
                                String crm = JOptionPane.showInputDialog(null, "Informe o NOVO CRM do medico", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                rem.setCRM(crm);
                                
                                bdRem.set(i, rem);
                                
                                return bdRem.get(i);
			}
		}
                return null;
	}
}