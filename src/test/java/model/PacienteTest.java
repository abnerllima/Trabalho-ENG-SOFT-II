package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Consulta;
import gestao.clinica.model.Medico;
import gestao.clinica.model.Paciente;

public class PacienteTest {
	
	String nome = "Pedro";
	String cpf = "12345678910";
	String contato = "987654321";
	String historico = "Internado";
	int id = 5;
	
	int id_medico = 10;
	String crm = "10000";
	String especializacao = "doutor";
	String data = "10/10/2022";
	ArrayList<Consulta> listaConsultas = new ArrayList<>();
	ArrayList<Medico> listaMedicos = new ArrayList<>();
	
	Paciente paciente = new Paciente(nome, cpf, contato, historico, id);
	
	@Test
	public void testNomePaciente() {
		
		assertEquals(this.paciente.getNome(), this.nome, "Nome do paciente");
	}
	
	@Test
	public void testCpfPaciente() {
	
		assertEquals(this.paciente.getCpf(), this.cpf, "CPF do paciente");
	}
	
	@Test
	public void testContatoPaciente() {
	
		assertEquals(this.paciente.getContato(), this.contato, "Contato do paciente");
	}
	
	@Test
	public void testIdPaciente() {
	
		assertEquals(this.paciente.getId(), this.id, "Id do paciente");
	}
	
	@Test
	public void testAlteraHistorico() {
		
		this.historico = "Recuperado";
		
		this.paciente.alteraDados(this.historico);
		
		assertEquals(this.paciente.getHistorico(), this.historico, "Historico alterado");

	}
	
	@Test
	public void testSemConsulta() {
		
		assertTrue(paciente.consultasAgendadas.size() == 0, "Sem consulta");

	}

}
