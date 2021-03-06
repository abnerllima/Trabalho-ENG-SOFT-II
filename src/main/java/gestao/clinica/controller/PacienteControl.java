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
	
	public boolean removerPaciente(int id) {
		
		for(int index = 0; index < this.listaPacientes.size(); index++) {
			
			if(this.listaPacientes.get(index).getId() == id) {
				
				this.listaPacientes.remove(id - 1);
				
				return true;
			}
		}
		
		return false;
		
	}
	
	public int listarPaciente() {
		
	    int size = 0;
	    
	    for(int index = 0; index < this.listaPacientes.size(); index++) {
	        
	        System.out.println("NOME: " + this.listaPacientes.get(index).getNome() + " | ID: " +
	                this.listaPacientes.get(index).getId() + "\n");
	        
	        size++;
	    }
	    
	    return size;
	}

}
