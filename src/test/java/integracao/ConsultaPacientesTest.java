package integracao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import gestao.clinica.controller.*;
import gestao.clinica.model.*;

public class ConsultaPacientesTest {
	
	final String NOME = "Pedro";
	final String CPF = "12345678910";
	final String CONTATO = "987654321";
	final String HISTORICO = "enfermo";
	
	int tamanhoLista = 0;
	
	ArrayList<Medico> LISTA_MEDICOS = new ArrayList<>();
	
	PacienteControl pacienteControl = new PacienteControl(); 
	
	@Test
	public void testAgendarConsulta() {
		
		pacienteControl.registrarPaciente(NOME, CPF, CONTATO, HISTORICO);
		pacienteControl.registrarPaciente(NOME, CPF, CONTATO, HISTORICO);
		
		this.tamanhoLista = pacienteControl.listarPaciente();
		
		assertEquals(this.tamanhoLista, 2, "tamanho lista");
	}
	
	@Test
	public void testconsultarPacienteRemovido() {
		
		pacienteControl.registrarPaciente(NOME, CPF, CONTATO, HISTORICO);
		pacienteControl.registrarPaciente(NOME, CPF, CONTATO, HISTORICO);
		
		pacienteControl.removerPaciente(1);
		
		this.tamanhoLista = pacienteControl.listarPaciente();
		
		assertEquals(this.tamanhoLista, 1, "tamanho lista");
	}
}