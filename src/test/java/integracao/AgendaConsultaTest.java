package integracao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import gestao.clinica.controller.*;
import gestao.clinica.model.*;

public class AgendaConsultaTest {
	
	final String NOME = "Pedro";
	final String CPF = "12345678910";
	final String CONTATO = "987654321";
	final String HISTORICO = "Internado";
	final int ID = 5;
	
	final int ID_MEDICO = 10;
	final String CRM = "10000";
	final String ESPECIALIZACAO = "doutor";
	final String DATA = "10/10/2022";
	
	ArrayList<Consulta> LISTA_CONSULTAS = new ArrayList<>();
	ArrayList<Medico> LISTA_MEDICOS = new ArrayList<>();
	
	MainControl mainControl = new MainControl();
	PacienteControl pacienteControl = new PacienteControl();
	MedicoControl medicoControl = new MedicoControl();
	
	@Test
	public void testConsultarAgenda() {
		
		pacienteControl.registrarPaciente(NOME, CPF, CONTATO, HISTORICO);
		medicoControl.registrarMedico(NOME, CPF, CONTATO, CRM, ESPECIALIZACAO);
		
		Paciente paciente = new Paciente(NOME, CPF, CONTATO, HISTORICO, ID);
				
		boolean consultaMarcada = paciente.agendarConsulta(this.ID_MEDICO, this.DATA, this.LISTA_CONSULTAS, this.LISTA_MEDICOS);
		
		mainControl.agendarConsulta(DATA, ID_MEDICO, ID);
		
		assertTrue(consultaMarcada, "consulta marcada");
		assertEquals(1, paciente.consultasAgendadas.size(), "tamanho agenda");
	}
	
	@Test
	public void testAgendarConsultaInvalida() {
		
		pacienteControl.registrarPaciente(NOME, CPF, CONTATO, HISTORICO);
		medicoControl.registrarMedico(NOME, CPF, CONTATO, CRM, ESPECIALIZACAO);
		
		mainControl.agendarConsulta(DATA, ID_MEDICO, ID);
		
		mainControl.agendarConsulta(DATA, ID_MEDICO, ID);
		
		Paciente paciente = new Paciente(NOME, CPF, CONTATO, HISTORICO, ID);
				
		boolean consultaMarcada = paciente.agendarConsulta(this.ID_MEDICO, this.DATA, mainControl.listarConsultas(), this.LISTA_MEDICOS);
		
		assertFalse(consultaMarcada, "consulta invalida");
		assertEquals(paciente.consultasAgendadas.size(), 0, "quantidade de consultas do paciente");
	}

}