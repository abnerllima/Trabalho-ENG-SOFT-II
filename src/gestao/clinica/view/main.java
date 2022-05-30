package gestao.clinica.view;

import java.util.ArrayList;

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
		
		while (opcao != 0) {
			
		System.out.print("############# CLINICA MEDICA #############"
				+ "\n1. Cadastrar paciente"
				+ "\n2. Cadastrar medico"
				+ "\n3. Agendar consulta"
				+ "\n0. SAIR"
				+ "\n\nDigite a opcao desejada: ");
		
		opcao = leitor.nextInt();
		
		if (opcao == 1) {
			
			System.out.print("\n############# CADASTRAR PACIENTE #############\n");
			System.out.print("\nDigite o nome: ");
			String nome = leitor.next();
			
			System.out.print("Digite o CPF: ");
			String cpf = leitor.next();
			
			System.out.print("Digite o telefone: ");
			String tel = leitor.next();
			
			System.out.print("Digite o historico: ");
			String hist = leitor.next();

		
		controller_paciente.addPaciente(nome, cpf, tel, hist);
			
		System.out.print("\nPaciente cadastrado com sucesso!\n\n\n\n\n ");
		
		} else if(opcao == 2) {
			
			System.out.print("\n############# CADASTRAR MEDICO #############\n");

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

			controller_medico.addMedico(nome, cpf, tel, crm, especializacao);
		
			System.out.print("\nMedico cadastrado com sucesso!\n\n ");
		
		}
		else if(opcao == 3) {
			
			System.out.print("\n############# AGENDAR CONSULTA #############\n");
			
			System.out.print("\nDigite o ID do paciente: ");
			int idPaciente = leitor.nextInt();
			
			System.out.print("Digite o ID do medico: ");
			int idMedico = leitor.nextInt();
			
			System.out.print("Digite a data desejada: ");
			String data = leitor.next();

			controller_main.agendarConsulta(data, idMedico, idPaciente);
			
			System.out.print("Consulta cadastrada com sucesso!\n\n ");
		}
		
		else if(opcao == 0) {
			
			System.out.print("\n############# VOLTE SEMPRE #############\n");
		}
		
		else {
			
			System.out.print("\n############# OPCAO INVALIDA #############\n");
		}
		
		}
		
		
		/*
		//Criando um paciente
		Paciente pacienteTeste = new Paciente("Gabriel", "14067737602", "31993410214", "Diabetico, cardiopata, idiota", 0);
		Paciente pacienteTeste2 = new Paciente("Luis", "14667737602", "31993410214", "Diabetico, cardiopata, idiota", 1);
		Pessoa pessoa1 = new Pessoa();
		
		
		
		//criando um médico
		Medico medicoTeste = new Medico("Marcell", "12345678", "31999557385", "crmteste", "Cardiologista", 0);
		
		//Adicionando usuario na lista de usuarios
		listaMedicos.add(medicoTeste);
		listaPacientes.add(pacienteTeste);
		listaPacientes.add(pacienteTeste2);
		
		//Agendamento da consulta.
		listaPacientes.get(0).agendarConsulta(0, "27/03", listaConsultas, listaMedicos);
		listaPacientes.get(1).agendarConsulta(0, "31/12", listaConsultas, listaMedicos);
		
		//Criando e Adicionando exame.
		listaMedicos.get(0).arquivarExame("Hemograma", 0, listaExames);
		listaMedicos.get(0).arquivarExame("Exame de Urina", 1, listaExames);
		
		//Liberação do resultado do exame.
		//listaExames.get(0).LiberarExame("98mg");
		
		
		System.out.print("\n\n\n");
		System.out.print("----------Teste de visualizar Exames-----------\n");
		//Visualização dos dados do exame.
		listaExames.get(0).visualizarExame(); //98mg
		listaExames.get(1).visualizarExame(); 
	
		System.out.print("\n\n\n");
		System.out.print("---------Teste de visualizar consultas agendadas------------\n");
		//Visualizar todas as consultas de um médico.
		listaMedicos.get(0).visualizarConsultas();
		*/
	}
	
}
