package gestao.clinica.controller;

import java.util.ArrayList;

import gestao.clinica.model.Consulta;
import gestao.clinica.model.Exame;

public class MainControl {
	
	private ArrayList<Consulta> listaConsultas = new ArrayList<>();
	private ArrayList<Exame> listaExames = new ArrayList<>();
	
	
	//Ver consultas
	public Consulta getConsulta(int n) {
		
		return this.listaConsultas.get(n);
	}
	
	//Agendar consulta
	public void agendarConsulta(String data, int idMedico, int idPaciente) {
		
		Consulta aux = new Consulta(data, idMedico, idPaciente);
		listaConsultas.add(aux);
		
		for(int i = 0; i < this.listaConsultas.size(); i++) {
			
			System.out.println("PACIENTE: " + this.listaConsultas.get(i).getIdPaciente() + " | MEDICO: " +
					listaConsultas.get(i).getIdMedico() + " | DATA: " + listaConsultas.get(i).getData() + "\n");
		}

	}
	
	public void arquivarExame(String nomeExame, int id_paciente) {
		
		Exame exame = new Exame(nomeExame, id_paciente);
		this.listaExames.add(exame);
		
	}
	

}
