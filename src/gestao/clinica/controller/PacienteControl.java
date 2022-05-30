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
	
	public void registrarPaciente(String nome, String cpf, String contato, String historico) {
		
		Paciente novoPaciente = new Paciente(nome, cpf, contato, historico, this.id);
		
		listaPacientes.add(novoPaciente);
		
		this.id++;
	
	}
	
	public void listarPaciente() {
		
		for(int index = 0; index < this.listaPacientes.size(); index++) {
			
			System.out.println("NOME: " + this.listaPacientes.get(index).getNome() + " | ID: " +
					this.listaPacientes.get(index).getId() + "\n");
		}
	}

}
