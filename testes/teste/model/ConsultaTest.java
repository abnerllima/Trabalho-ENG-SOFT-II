package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Consulta;

class ConsultaTest {
	
	String data;
	int id_medico;
	int id_paciente;
	
	Consulta consulta = new Consulta(data, id_medico, id_paciente);


    @Test
    public void testConsultaData() {
    	
		assertEquals(this.consulta.getData(), this.data, "Data da consulta");

    }

    @Test
    public void testConsultaMedico() {

		assertEquals(this.consulta.getIdMedico(), this.id_medico, "Medico da consulta");

    }

    @Test
    public void testConsultaPaciente() {

		assertEquals(this.consulta.getIdPaciente(), this.id_paciente, "Paciente da consulta");

    }
}
