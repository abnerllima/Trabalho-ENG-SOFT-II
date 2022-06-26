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
	
	
	public void agendarConsulta(int id_medico, String data, ArrayList<Consulta> listaConsultas, ArrayList<Medico> listaMedico) {
		
		Consulta consulta = new Consulta(data, id_medico, this.getId());
		
		//Atualiza as listas de usuarios.
		listaConsultas.add(consulta);
//		listaMedico.get(id_medico).consultasAgendadas.add(consulta);
		
		this.consultasAgendadas.add(consulta);
		
	}

}
