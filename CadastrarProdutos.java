package projeto;
 
import static java.awt.SystemColor.menu;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
 
public class CadastrarProdutos {
 
public static void main(String[] args) {

int menu = 0;
 
Produtos novoItem = new Produtos();
 
do {
menu = Integer.parseInt(JOptionPane.showInputDialog(null,
" Sistema de Produtos :   \n\n"
        
+ "\n\nQual item deseja escolher? "
        
+ "\n\n1 - Cadastrar Produtos "
        
+ "\n 2 - Exibir Produtos "
        
+ "\n 3 - Imprimir Produtos " 
        
+ "\n 4 - Editar Produtos "
        
+ "\n 5 - Sair"));
 
if (menu == 1) {
 
try {
String codigo = JOptionPane.showInputDialog(null,
" Digite o código do produto: ");
String descricao = JOptionPane.showInputDialog(null,
" Digite o nome do produto: ").toUpperCase();
Double preco = Double.parseDouble(JOptionPane
.showInputDialog(null,
" Digite o preço do produto: "));
// chamando o metodo
novoItem.cadastrarProdutos(codigo,descricao, preco);
 
} catch (Exception e) {
JOptionPane.showMessageDialog(null,
"Um dos dados está incorreto!",
"Cadastro De Produtos: ",
JOptionPane.ERROR_MESSAGE);
}
 
} else if (menu == 2) {
// chamando o metodo mostrar Produtos
JOptionPane.showMessageDialog(
null,
"Lista do(s) produto(s) cadastrado(s): "
+ novoItem.mostrarProdutos(),
" Cadastro De Produtos: ",
JOptionPane.INFORMATION_MESSAGE);
 
} else if (menu == 3) {
int imprimir = JOptionPane.showConfirmDialog(null,
"Deseja imprimir produtos cadastrado?",
"PRODUTOS", JOptionPane.OK_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE);
 
if (imprimir == 0) {
 
novoItem.imprimir();
}
 
} else if (menu == 5) {
int sair = JOptionPane.showConfirmDialog(null,
"Deseja realmente sair ?", "",
JOptionPane.OK_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE);
 
if (sair == JOptionPane.YES_OPTION) {
 
System.exit(0);
}
 
} else if ((menu > 5) || (menu < 1)) {
JOptionPane.showMessageDialog(null,
"Por favor escolha uma opção correta \nentre 1 e 5!",
"Cadastro De Produtos: ",
JOptionPane.ERROR_MESSAGE);
}
 
} while (menu != 0);
System.exit(0);
}

if(menu == 4)
    private Object[] Produtos;
{
				
 System.out.println("-----------------------------"); 
System.out.println(" Editar Produtos    "); 
System.out.println("-----------------------------");
System.out.println("");
System.out.println("Digite o nome do produto ou a id"); 
String nomeid = sc.next();
boolean verdadeiro;
verdadeiro = Produtos[0].editaProdutos(nomeid);
				  
if(verdadeiro == true) {
FileInputStream arquivo = null;
InputStreamReader lerArquivo = null;
BufferedReader convertArquivo = null;
							
try {
								
arquivo = new FileInputStream("cadastro_Produtos.txt");
lerArquivo = new InputStreamReader(arquivo);
convertArquivo = new BufferedReader(lerArquivo);
								
int n1 = 0;
								
while(convertArquivo.ready()) {
									
String linha = convertArquivo.readLine();
String[] infoproduto = linha.split(";");
																		
int idconvertido = Integer.parseInt(infoproduto[0]);
String nomeconvertido = infoproduto[1];
double precoconvertido = Double.parseDouble(infoproduto[2]);
int quantidadeconvertido = Integer.parseInt(infoproduto[3]);
									
Produtos[n1].setAll(idconvertido, nomeconvertido,
precoconvertido,quantidadeconvertido );									
n1 = n1 + 1;									
}

}catch(IOException e) {
System.out.println("Não foi possível listar todos produto! ");
}			  
if(verdadeiro == true) {					  
				  
for( int Vetor = 0; Vetor < produto.length; Vetor++) {
if( Produtos[Vetor].getNome().equals(nomeid)||
        Integer.toString(Produtos[Vetor].getId()).equals(nomeid)) {
    System.out.println(Produtos[Vetor].getNome()+"nome do edit: ");
    System.out.println("Digite um novo nome: ");
    String nome2 = sc.next();
    
    System.out.println("Digite um preço: ");
    double preco2 = sc.nextDouble();
    
    System.out.println("Digite a quantidade: ");
    int quantidade2 = sc.nextInt();
    
    Produtos[Vetor].setNome(nome2);
    Produtos[Vetor].setPreco(preco2);
    Produtos[Vetor].setQuantidade(quantidade2);
} else {
}
					  
}

boolean gravaVdd= false;
boolean falso = false;
				
for(int Vetor = 0; Vetor <produto.length;Vetor++){
					
if(Vetor == 1) {
gravaVdd = true;						
}
					
falso = Produtos[Vetor].gravaArquivo(gravaVdd, falso);
}
				
if(falso == true) {
System.out.println("Editado com sucesso");	
}else {
System.out.println("Falha ao editar;");
}
}else {
System.out.println("Produto cancelado ou nao encontrado!");
}
}
}

  

		
		



