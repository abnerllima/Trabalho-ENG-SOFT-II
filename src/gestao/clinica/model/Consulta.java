package gestao.clinica.model;

public class Consulta {
	
	public String data; 
	public int id_medico;
	public int id_paciente;
	
	public void setData(String data) {
		this.data = data;
	}
	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getIdMedico() {
		return id_medico;
	}	
	public int getIdPaciente() {
		return id_paciente;
	}
	public String getData() {
		return data;
	}
	
	public Consulta(String data, int id_medico, int id_paciente) {
		
		this.data = data;
		this.id_medico = id_medico;
		this.id_paciente = id_paciente;
		
	}

	
}
