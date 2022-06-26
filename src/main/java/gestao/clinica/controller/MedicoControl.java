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
	

	public void registrarMedico(String nome, String cpf, String contato, String crm, String especializacao) {

		Medico novoMedico = new Medico(nome, cpf, contato, crm, especializacao, this.id);
		
		listaMedicos.add(novoMedico);
		
		this.id++;
		
	}
	
	public int listarMedico() {
		
		int size = 0;
		
		for(int index = 0; index < this.listaMedicos.size(); index++) {
			
			System.out.println("NOME: " + this.listaMedicos.get(index).getNome() + " | ID: " +
					this.listaMedicos.get(index).getId() + "\n");
			
			size++;
		}
		return size;
	}		
}
