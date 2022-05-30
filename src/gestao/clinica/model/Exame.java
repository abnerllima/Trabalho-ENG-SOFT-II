package gestao.clinica.model;

public class Exame {
	
	public String nomeExame;
	public String resultado;
	
	public int id_paciente;
	public boolean exameDisponivel;
	
	public void LiberarExame(String resultado) {
		
		this.resultado = resultado;
		this.exameDisponivel = true;
		
		System.out.print("Os resultado do exame foi gravado e está disponivel");
		
	}
	
	public Exame(String nomeExame, int id_paciente) {
		
		this.exameDisponivel = false;
		this.nomeExame = nomeExame;
		this.id_paciente = id_paciente;
		
	}
	
	public String visualizarExame(){
		
		if(this.exameDisponivel) {
			
			return("Nome do Exame:" + this.nomeExame + "\n"
					+ "Resultado do Exame:" + this.resultado);
		}
			return ("O resultado do seu exame ainda não está disponivel");
	}
	
	

}
