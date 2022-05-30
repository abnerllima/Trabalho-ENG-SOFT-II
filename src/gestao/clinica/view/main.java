package gestao.clinica.view;

import gestao.clinica.controller.MainControl;
import gestao.clinica.controller.MedicoControl;
import gestao.clinica.controller.PacienteControl;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		PacienteControl controller_paciente = new PacienteControl();
		MedicoControl controller_medico = new MedicoControl();
		MainControl controller_main = new MainControl();
		
		Scanner leitor = new Scanner(System.in);
		int opcao = 10;
		
		while(opcao != 0) {
			
			controller_main.printarMenu();
			opcao = leitor.nextInt();
		
		if(opcao == 1){
			
			controller_main.printarTitulo("CADASTRAR PACIENTE");
			System.out.print("\nDigite o nome: ");
			String nome = leitor.next();
			System.out.print("Digite o CPF: ");
			String cpf = leitor.next();
			System.out.print("Digite o telefone: ");
			String tel = leitor.next();
			System.out.print("Digite o historico: ");
			String hist = leitor.next();

			controller_paciente.registrarPaciente(nome, cpf, tel, hist);
			System.out.print("\nPaciente cadastrado com sucesso!\n\n\n\n\n ");
		}
		else if(opcao == 2) {
			
			controller_main.printarTitulo("CADASTRAR MEDICO");
			
			System.out.print("\nDigite o nome: ");
			String nome = leitor.next();
			
			System.out.print("Digite o CPF: ");
			String cpf = leitor.next();
			
			System.out.print("Digite o telefone: ");
			String tel = leitor.next();
			
			System.out.print("Digite o crm: ");
			String crm = leitor.next();
			
			System.out.print("Digite a especializacao: ");
			String especializacao = leitor.next();

			controller_medico.registrarMedico(nome, cpf, tel, crm, especializacao);
			System.out.print("\nMedico cadastrado com sucesso!\n\n ");
		}
		else if(opcao == 3) {
			
			controller_main.printarTitulo("AGENDAR CONSULTA");
			
			System.out.print("\nDigite o ID do paciente: ");
			int idPaciente = leitor.nextInt();
			
			System.out.print("Digite o ID do medico: ");
			int idMedico = leitor.nextInt();
			
			System.out.print("Digite a data desejada: ");
			String data = leitor.next();

			controller_main.agendarConsulta(data, idMedico, idPaciente);
			System.out.print("Consulta cadastrada com sucesso!\n\n ");
		}
		else if(opcao == 4) {
			
			controller_main.printarTitulo("LISTA DE PACIENTES");
			controller_paciente.listarPaciente();;
		}
		else if(opcao == 5) {
			
			controller_main.printarTitulo("LISTA DE MEDICOS");
			controller_medico.listarMedico();;
		}
		else if(opcao == 6) {
			
			controller_main.printarTitulo("VER AGENDA");
			controller_main.listarConsultas();
		}
		else if(opcao == 0) {
			
			controller_main.printarTitulo("VOLTE SEMPRE");
		}
		
		else {
			controller_main.printarTitulo("OPCAO INVALIDA");
		}
		
		}
	}
	
}package gestao.clinica.view;

import gestao.clinica.controller.MainControl;
import gestao.clinica.controller.MedicoControl;
import gestao.clinica.controller.PacienteControl;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		PacienteControl controller_paciente = new PacienteControl();
		MedicoControl controller_medico = new MedicoControl();
		MainControl controller_main = new MainControl();
		
		Scanner leitor = new Scanner(System.in);
		int opcao = 10;
		
		while(opcao != 0) {
			
			controller_main.printarMenu();
			opcao = leitor.nextInt();
		
		if(opcao == 1){
			
			controller_main.printarTitulo("CADASTRAR PACIENTE");
			System.out.print("\nDigite o nome: ");
			String nome = leitor.next();
			System.out.print("Digite o CPF: ");
			String cpf = leitor.next();
			System.out.print("Digite o telefone: ");
			String tel = leitor.next();
			System.out.print("Digite o historico: ");
			String hist = leitor.next();

			controller_paciente.registrarPaciente(nome, cpf, tel, hist);
			System.out.print("\nPaciente cadastrado com sucesso!\n\n\n\n\n ");
		}
		else if(opcao == 2) {
			
			controller_main.printarTitulo("CADASTRAR MEDICO");
			
			System.out.print("\nDigite o nome: ");
			String nome = leitor.next();
			
			System.out.print("Digite o CPF: ");
			String cpf = leitor.next();
			
			System.out.print("Digite o telefone: ");
			String tel = leitor.next();
			
			System.out.print("Digite o crm: ");
			String crm = leitor.next();
			
			System.out.print("Digite a especializacao: ");
			String especializacao = leitor.next();

			controller_medico.registrarMedico(nome, cpf, tel, crm, especializacao);
			System.out.print("\nMedico cadastrado com sucesso!\n\n ");
		}
		else if(opcao == 3) {
			
			controller_main.printarTitulo("AGENDAR CONSULTA");
			
			System.out.print("\nDigite o ID do paciente: ");
			int idPaciente = leitor.nextInt();
			
			System.out.print("Digite o ID do medico: ");
			int idMedico = leitor.nextInt();
			
			System.out.print("Digite a data desejada: ");
			String data = leitor.next();

			controller_main.agendarConsulta(data, idMedico, idPaciente);
			System.out.print("Consulta cadastrada com sucesso!\n\n ");
		}
		else if(opcao == 4) {
			
			controller_main.printarTitulo("LISTA DE PACIENTES");
			controller_paciente.listarPaciente();;
		}
		else if(opcao == 5) {
			
			controller_main.printarTitulo("LISTA DE MEDICOS");
			controller_medico.listarMedico();;
		}
		else if(opcao == 6) {
			
			controller_main.printarTitulo("VER AGENDA");
			controller_main.listarConsultas();
		}
		else if(opcao == 0) {
			
			controller_main.printarTitulo("VOLTE SEMPRE");
		}
		
		else {
			controller_main.printarTitulo("OPCAO INVALIDA");
		}
		
		}
	}
	
}