package gestao.clinica.model;

import java.util.ArrayList;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String contato;
	private int id;
	public ArrayList<Consulta> consultasAgendadas = new ArrayList<>();
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	public void setContato(String contato) {
		this.contato = contato;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getContato() {
		return contato;
	}
	
	
	protected void alteraDados(String nome, String cpf, String contato) {
		
		setNome(nome);
		setCpf(cpf);
		setContato(contato);
		
	}

	
}
