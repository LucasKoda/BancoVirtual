package banco.virtual;

import java.util.Scanner;

public class BancoVirtual {

    private static float valor;
    
    public static void main(String[] args) {
        
        Conta minhaConta = new Conta();
        Scanner leitura = new Scanner(System.in);
    String nome;
    int numero, operar;
    float saldo, valor, limite;
        do{
            System.out.println("1- Inserir dados:");
            System.out.println("2- Mostrar dados");
            System.out.println("3- Depositar valor");
            System.out.println("4- Sacar valor");
            System.out.println("5- Mostrar saldo");
            System.out.println("6- Alterar senha");
            System.out.println("0 - Sair");
            leitura.nextLine();
            operar = leitura.nextInt();
            switch(operar){
                
                case 1 :  
                    System.out.println("Digite o nome:"); 
                    nome = leitura.nextLine();
                    
                    System.out.println("Digite o Numero: "); 
                    numero = leitura.nextInt();

                    System.out.println("Saldo: "); 
                    saldo = leitura.nextFloat();
                    
                    System.out.println("Digite o limite");
                    limite = leitura.nextFloat();
                    
                    minhaConta.inseredados(nome, numero, saldo, limite);
                    
                break;
                case 2 :
                    minhaConta.mostrardado();
                break;
                case 3 :   
                    System.out.println("Valor que vai ser depositado: ");
                    valor = leitura.nextFloat();
                    minhaConta.deposita(valor);
                break;
                case 4:
                    minhaConta.mostrarsal();
                    System.out.println("Valor que vai ser sacado: ");
                    valor = leitura.nextFloat();
                    minhaConta.saca(valor);
                break;
                case 5:
                    minhaConta.mostrarsal();
                break;
                            
            }
            }while(operar != 0);
        }
        
    }
 
