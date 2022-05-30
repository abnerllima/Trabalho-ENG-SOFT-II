package gestao.clinica.controller;

import java.util.ArrayList;

import gestao.clinica.model.Medico;

public class MedicoControl {
	
	private ArrayList<Medico> listaMedicos = new ArrayList<>();
	private int id;
	
	public MedicoControl() {
		this.id = 1;
	}
	
	public Medico getMedico(int n) {
		
		return this.listaMedicos.get(n);
		
	}
	

	public void addMedico(String nome, String cpf, String contato, String crm, String especializacao) {

		Medico aux = new Medico(nome, cpf, contato, crm, especializacao, this.id);
		listaMedicos.add(aux);
		this.id++;
		
		for(int i = 0; i < this.listaMedicos.size(); i++) {
			System.out.println("NOME: " + this.listaMedicos.get(i).getNome() + " | ID: " +
					this.listaMedicos.get(i).getId() + "\n");
		}
		
	}
	
}
