package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Medico;


public class MedicoTest {
	
	String nome = "Ana";
	String cpf = "12345678910";
	String contato = "9999999999";
	String crm = "10500";
	String especializacao = "Psiquiatra";
	int id = 2;

	@Test
	public void testAlteraCRM() {

	    Medico medico = new Medico(nome, cpf, contato, crm, especializacao, id);
	    
	    medico.alteraDados("40100", "Anestesista");

	    assertEquals(medico.getCrm(), "40100", "CRM alterada com sucesso");

	}
	
	@Test
	public void testAlteraEspecializacao() {

	    Medico medico = new Medico(nome, cpf, contato, crm, especializacao, id);
	    
	    medico.alteraDados("40100", "Anestesista");

	    assertEquals(medico.getEspecializacao(), "Anestesista", "Especializacao alterada com sucesso");

	}

}
