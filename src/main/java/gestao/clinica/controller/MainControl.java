package gestao.clinica.controller;

import java.util.ArrayList;

import gestao.clinica.model.Consulta;
import gestao.clinica.model.Exame;

public class MainControl {
	
	private ArrayList<Consulta> listaConsultas = new ArrayList<>();
	private ArrayList<Exame> listaExames = new ArrayList<>();
	
	
	public Consulta getConsulta(int n) {
		
		return this.listaConsultas.get(n);
	}
	
				
		for (int i = 0; i < listaConsultas.size(); i++) {
			
			if (listaConsultas.get(i).getIdMedico() == idMedico 
					&& listaConsultas.get(i).getData() == data) {
				
						return false;
				}
		    }

		Consulta novaConsulta = new Consulta(data, idMedico, idPaciente);
		listaConsultas.add(novaConsulta);
		
		return true;
	}
	
	public void listarConsultas() {
	
		for(int index = 0; index < this.listaConsultas.size(); index++) {
			
			System.out.println("PACIENTE: " + this.listaConsultas.get(index).getIdPaciente() + " | MEDICO: " +
					listaConsultas.get(index).getIdMedico() + " | DATA: " + listaConsultas.get(index).getData() + "\n");
		}
	}
	
	public void arquivarExame(String nomeExame, int id_paciente) {
		
		Exame exame = new Exame(nomeExame, id_paciente);
		this.listaExames.add(exame);
		
	}
	
	public void printarMenu(){
		System.out.print("############# CLINICA MEDICA #############"
				+ "\n1. Cadastrar paciente"
				+ "\n2. Cadastrar medico"
				+ "\n3. Agendar consulta"
				+ "\n4. Ver lista de pacientes"
				+ "\n5. Ver lista de medicos"
				+ "\n6. Ver agenda"
				+ "\n0. SAIR"
				+ "\n\nDigite a opcao desejada: ");
	}

	public void printarTitulo(String titulo){
		System.out.print("\n############# " + titulo + " #############\n");
	}
}
