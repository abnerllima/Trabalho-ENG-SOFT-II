package gestao.clinica.controller;

import java.util.ArrayList;

import gestao.clinica.model.Paciente;

public class PacienteControl {
	
	private ArrayList<Paciente> listaPacientes = new ArrayList<>();
	private int id;
	
	public PacienteControl() {
		id = 1;
	}
	
	
	public Paciente getPaciente(int n) {
		
		return this.listaPacientes.get(n);
		
	}
	
	public void addPaciente(String nome, String cpf, String contato, String historico) {
		
		Paciente aux = new Paciente(nome, cpf, contato, historico, this.id);
		
		listaPacientes.add(aux);
		
		this.id++;
		
		for(int i = 0; i < this.listaPacientes.size(); i++) {
			System.out.println("NOME: " + this.listaPacientes.get(i).getNome() + " | ID: " +
					this.listaPacientes.get(i).getId() + "\n");
		}
	
	}

}
