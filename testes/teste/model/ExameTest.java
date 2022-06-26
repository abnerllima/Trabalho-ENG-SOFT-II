package teste.model;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Exame;

class ExameTest {
	
	String nome = "Rotina";
	int id_paciente = 1;
	String resultado = "Negativo";
	
	Exame exame = new Exame(nome, id_paciente);

    @Test
    public void testVisualizarExameIndisponivel() {

        String mensagem = this.exame.visualizarExame();
        
        assertEquals(mensagem, 
        		"O resultado do seu exame ainda não está disponivel", 
        		"Exame indisponível");
    }
    
    @Test
    public void testVisualizarExameDisponivel() {
        
        this.exame.LiberarExame(this.resultado);
        
        String mensagem = this.exame.visualizarExame();
        
        assertEquals(mensagem, "Nome do Exame:" + this.nome + "\n"
				+ "Resultado do Exame:" + this.resultado, "Exame disponível");
    }
    
    @Test
    public void testNomeExame() {
        
        assertEquals(this.nome, this.exame.nomeExame, "Nome do exame");
    }
    
    @Test
    public void testResultadoExame() {
    	
    	this.exame.LiberarExame(this.resultado);
        
        assertEquals(this.resultado, this.exame.resultado, "Resultado do exame");
    }
    
    @Test
    public void testIdPaciente() {
        
        assertEquals(this.id_paciente, this.exame.id_paciente, "Id do paciente");
    }
}
