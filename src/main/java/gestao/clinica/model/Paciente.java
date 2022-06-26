package gestao.clinica.model;

import java.util.ArrayList;

public class Paciente extends Pessoa{
	
	protected String historico;
	
	public String getHistorico() {
		return historico;
	}
	
	public void alteraDados(String historico) {
		
		this.historico = historico;
	}
	
	
	public Paciente(String nome, String cpf, String contato, String historico, int id) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.historico = historico;		
		this.setId(id);
		
	}
	
	
	public boolean agendarConsulta(int id_medico, String data, ArrayList<Consulta> listaConsultas, ArrayList<Medico> listaMedico) {
		
		for (int i = 0; i < listaConsultas.size(); i++) {
			
			if (listaConsultas.get(i).getIdMedico() == id_medico 
					&& listaConsultas.get(i).getData() == data) {
				
						return false;
				}
		    }

		Consulta novaConsulta = new Consulta(data, id_medico, this.getId());
		listaConsultas.add(novaConsulta);
		
		this.consultasAgendadas.add(novaConsulta);
		
		return true;
		
	}

}
