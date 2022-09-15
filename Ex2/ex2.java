package Ex2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<PessoaFisica> pessoaFisicaList = new ArrayList<>();
		ArrayList<PessoaJuridica> pessoaJuridicaList = new ArrayList<>();
		
		int option;
		
		int id;
		String name;
		int cnpj;
		int cpf;
		int confirmar;
	
		
		do {
			
	        System.out.printf("SISTEMA PARA CADASTRO DE PESSOAS \n" +
	                "Escolha qual tipo de conta você quer:\n\n" +
	                "1) Conta Pessoa Física\n" +
	                "2) Conta Pessoa Jurídica\n" +
	                "3) Sair\n\n");
	        System.out.printf("Digite a opção desejada => ");
	        
	        option = ler.nextInt();
	        
	        
	        if (option == 1) {
	        	
	        	
	        	
	        	do {
	        		
		        	PessoaFisica pf = new PessoaFisica();
			        
		        	
		            id = pessoaFisicaList.size() + 1;
	                pf.setId(id);
		        	
		            System.out.printf("Digite seu nome => ");
	                name = ler.next();
	                pf.setName(name);

	                System.out.printf("Digite seu número do CPF => ");
	                cpf = ler.nextInt();
	                pf.setCpf(cpf);

	                
	                System.out.printf("As informações estão certas?\n\n" +
	    					"0 - REFAZER\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                pessoaFisicaList.add(pf);
	                
	                System.out.printf("Pessoa física cadastrada foi com sucesso");
	                System.in.read();
	                
	                
	        		
	        	} while (confirmar != 1);

	        	
	        } else if (option == 2) {
	        	
	        	do {
	        		
		        	PessoaJuridica pj = new PessoaJuridica();
			        
		        	
		            id = pessoaJuridicaList.size() + 1;
	                pj.setId(id);
		        	
		            System.out.printf("Digite seu nome => ");
	                name = ler.next();
	                pj.setName(name);

	                System.out.printf("Digite o número do CNPJ => ");
	                cnpj = ler.nextInt();
	                pj.setCnpj(cnpj);

	                
	                System.out.printf("As informações estão corretas?\n\n" +
	    					"0 - REFAZER\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                pessoaJuridicaList.add(pj);
	                
	                System.out.printf("Pessoa jurídica foi cadastrada com sucesso");
	                System.in.read();
	                
	        		
	        	} while (confirmar != 1);
	        	
	        	
	        }
	        
			
		} while (option != 0);
		
		ler.close();
	}

	
}
