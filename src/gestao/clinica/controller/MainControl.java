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
	
	public void agendarConsulta(String data, int idMedico, int idPaciente) {
		
		Consulta novaConsulta = new Consulta(data, idMedico, idPaciente);
		listaConsultas.add(novaConsulta);

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
	

}
