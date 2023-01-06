package Trabalho;

public class menu2 {
	    public void imprimirPrincipal(){
	    			System.out.println("------------------------------");
	    			System.out.println("Criado por Jan e Daniel");
	    			System.out.println("------------------------------");
	    			System.out.println("            MENU              ");
	                System.out.println("------------------------------");
	                System.out.println("[1] LANCHAS                   ");
	                System.out.println("------------------------------");
	                System.out.println("[2] IATES                     ");
	                System.out.println("------------------------------");
	                System.out.println("[3] JETSKI                    ");
	                System.out.println("------------------------------");
	                System.out.println("[0] SAIR                      ");
	                System.out.println("------------------------------\n"); 
	                System.out.println("DIGITE SUA OPÇAO: ");
	    }
	    
public void imprimirLanchas(String j1, String j2, String j3, String j4,
	            String j5){
	                        System.out.println("------------------------------");
	                        System.out.println("            Lanchas           ");
	                        System.out.println("------------------------------");
	                        if(j1 == null){
	                            System.out.println("[1] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[1] " + j1);
	                            System.out.println("------------------------------");
	                        }
	                        if(j2 == null){
	                            System.out.println("[2] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[2] " + j2);
	                            System.out.println("------------------------------");
	                        }
	                         if(j3 == null){
	                            System.out.println("[3] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[3] " + j3);
	                            System.out.println("------------------------------");
	                        }                       
	                        if(j4 == null){
	                            System.out.println("[5] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[4] " + j4);
	                            System.out.println("------------------------------");
	                        }
	                        if(j5 == null){
	                            System.out.println("[5] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[5] " + j5);
	                            System.out.println("------------------------------");
	                        }
	                        System.out.println("[6] VOLTAR                    ");
	                        System.out.println("------------------------------");
	    }
	    
	    public void imprimirItens(String modelo){
	            if(modelo == null){
	                System.out.println("        NÃO CADASTRADO        ");
	                System.out.println("------------------------------");
	            } else {
	                System.out.println(modelo);
	                System.out.println("------------------------------");
	            }
	            System.out.println("[1] CADASTRAR/ATUALIZAR       ");
	            System.out.println("------------------------------");
	            System.out.println("[2] IMPRIMIR                  ");
	            System.out.println("------------------------------");            
	            System.out.println("[3] APLICAR DESCONTO          ");
	            System.out.println("------------------------------");
	            System.out.println("[0] VOLTAR                    ");
	            System.out.println("------------------------------");
	            
	            
	    }
	    
	    public void imprimirIates(String j1, String j2, String j3, String j4,
	            String j5){
	                        System.out.println("------------------------------");
	                        System.out.println("            IATES             ");
	                        System.out.println("------------------------------");
	                        if(j1 == null){
	                            System.out.println("[1] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[1] " + j1);
	                            System.out.println("------------------------------");
	                        }
	                        if(j2 == null){
	                            System.out.println("[2] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[2] " + j2);
	                            System.out.println("------------------------------");
	                        }
	                         if(j3 == null){
	                            System.out.println("[3] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[3] " + j3);
	                            System.out.println("------------------------------");
	                        }                       
	                        if(j4 == null){
	                            System.out.println("[5] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[4] " + j4);
	                            System.out.println("------------------------------");
	                        }
	                        if(j5 == null){
	                            System.out.println("[5] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[5] " + j5);
	                            System.out.println("------------------------------");
	                        }
	                        System.out.println("[6] VOLTAR                    ");
	                        System.out.println("------------------------------");   
	    }
	    
	    public void imprimirJetskis(String j1, String j2, String j3, String j4,
	            String j5){
	                        System.out.println("------------------------------");
	                        System.out.println("        J E T S K I S         ");
	                        System.out.println("------------------------------");
	                         if(j1 == null){
	                            System.out.println("[1] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[1] " + j1);
	                            System.out.println("------------------------------");
	                        }
	                        if(j2 == null){
	                            System.out.println("[2] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[2] " + j2);
	                            System.out.println("------------------------------");
	                        }
	                         if(j3 == null){
	                            System.out.println("[3] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[3] " + j3);
	                            System.out.println("------------------------------");
	                        }                       
	                        if(j4 == null){
	                            System.out.println("[5] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[4] " + j4);
	                            System.out.println("------------------------------");
	                        }
	                        if(j5 == null){
	                            System.out.println("[5] CADASTRAR                 ");
	                            System.out.println("------------------------------");
	                        } else {
	                            System.out.println("[5] " + j5);
	                            System.out.println("------------------------------");
	                        }
	                        System.out.println("[6] VOLTAR                    ");
	                        System.out.println("------------------------------");
	    }
	    
	}
