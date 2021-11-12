
package petshop;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Petshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        JOptionPane.showMessageDialog(null, "\n SEJA BEM-VINDO(A) AO PETSHOP FMU");
        
        
        
        do{
     opcao= Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscolha <1> para cadastrar seu gato \nEscolha <2> para cadastrar seu cachorro \nEscolha <3> para ver nossa tabela de preços \nEscolha <4> para SAIR" )); 
       //  PetGato gato = new PetGato();
         
         
            if(opcao == 1){
                
                int a;
                 PetCachorro gato = new PetCachorro();
                 
                 gato.nomedono = (JOptionPane.showInputDialog("Digite o nome do dono do(a) gato(a): "));
                 gato.setB(JOptionPane.showInputDialog("Digite o nome do(a) gato(a): "));
                 gato.setA(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) gato(a) (em meses): ")));
                 gato.rua = (JOptionPane.showInputDialog( null, "Digite o nome da rua: "));
                 gato.numerocasa = (Integer.parseInt(JOptionPane.showInputDialog( null, "Digite o numero da casa: ")));
                 gato.cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP: "));
                 a=Integer.parseInt(JOptionPane.showInputDialog("Digite o plano selecionado de acordo com a tabela de preços do PETSHOP! \nPLANO 1 <1> \nPLANO 2 <2> \nPLANO 3 <3>   "));
                 
                 
               JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! \n Caro(a) Sr.(a): " + gato.nomedono + "\n Os dados cadastrados foram: "
               +"\n Nome do gato(a): " + gato.getB() + "\n A idade do(a) gato(a) em meses é: " + gato.getA() + "\n Rua: " + gato.rua + "\n Número da residencia: " + gato.numerocasa + "\nCep: " + gato.cep + "\nPlano selecionado: " + a );

                
                
                
            }
            if(opcao == 2 ){
                
                int a;
                PetGato cachorro = new PetGato();
                PetCachorro gato2 = new PetCachorro();
                 cachorro.nomedono = (JOptionPane.showInputDialog("Digite o nome do dono do(a) cachorro(a): "));
                 cachorro.setB(JOptionPane.showInputDialog("Digite o nome do(a) cachorro(a): "));
                 cachorro.setA(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) cachorro(a) (em meses): ")));
                 cachorro.rua = (JOptionPane.showInputDialog( null, "Digite o nome da rua: (apenas caracteres) "));
                 cachorro.numerocasa = (Integer.parseInt(JOptionPane.showInputDialog( null, "Digite o numero da casa: (apenas números) ")));
                 cachorro.cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP: (apenas números) "));
                 gato2.tipo=(JOptionPane.showInputDialog("Digite o porte do seu cachorro (tamanho) em 3 medidas básicas <M> para medio porte + <P> pequeno porte, <G> grande porte:"));
                    
                  a=Integer.parseInt(JOptionPane.showInputDialog("Digite o plano selecionado de acordo com a tabela de preços do PETSHOP! \nPLANO 1 <1> \nPLANO 2 <2> \nPLANO 3 <3>   "));         
                 
                 JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! \n Caro(a) Sr.(a): " + cachorro.nomedono + "\n Os dados cadastrados foram: "
               +"\n Nome do cachorro(a): " + cachorro.getB() + "\n A idade do(a) cachorro(a) em meses é: " + cachorro.getA() + "\n Rua: " + cachorro.rua + "\n Número da residencia: " + cachorro.numerocasa + "\nCep: " + cachorro.cep + "\nO porte do seu cachorro é: "+ gato2.tipo + "\nPlano selecionado: "+a);
                
            }
            if(opcao == 3 ){
                PetPreco preco1 = new PetPreco();
                
                JOptionPane.showMessageDialog(null, "PLANO 01: \nO ANIMAL TEM DIREITO A 2 BANHOS POR MÊS COM DIREITO A TOSA A CADA 3 MESES!" +"\n"+ " O VALOR DO PLANO É: " +"R$" +  preco1.getA());
                JOptionPane.showMessageDialog(null, "PLANO 02: \nO ANIMAL TEM DIREITO A 4 BANHOS POR MÊS COM DIREITO A TOSA E DESCONTO DE 25%!  NOS ITENS PET VIP! " +"\n"+ "O VALOR DO PLANO É: " + "R$"+ preco1.getD());
                JOptionPane.showMessageDialog(null, "PLANO 03: \nO ANIMAL TEM DIREITO A 6 BANHOS POR MÊS COM DIREITO A TOSA E DESCONTO DE 35%!  NOS ITENS PET VIP! " +"\n"+ "O VALOR DO PLANO É: " + "R$" + preco1.getC());
            }
        }while(opcao !=4);
        }
    
        
    }


    

