package integracao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.*;
import gestao.clinica.controller.*;

public class ConsultaMedicosTest {
	
	final String NOME = "Pedro";
	final String CPF = "12345678910";
	final String CONTATO = "987654321";
	final String CRM = "10000";
	final String ESPECIALIZACAO = "doutor";
	
	int tamanhoLista = 0;
	
	ArrayList<Medico> LISTA_MEDICOS = new ArrayList<>();
	
	MedicoControl medicoControl = new MedicoControl(); 
	
	@Test
	public void testAgendarConsulta() {
		
		medicoControl.registrarMedico(NOME, CPF, CONTATO, CRM, ESPECIALIZACAO);
		medicoControl.registrarMedico(NOME, CPF, CONTATO, CRM, ESPECIALIZACAO);
		
		this.tamanhoLista = medicoControl.listarMedico();
		
		assertTrue(this.tamanhoLista > 0, "consulta marcada");
		assertEquals(this.tamanhoLista, 2, "tamanho agenda");
	}

}
