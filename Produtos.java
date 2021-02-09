package projeto;
 
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
 
public class Produtos {
    
class Itens {
private String codigo;
private String descricao;
private double preco;

}
 
String dados = "";
 
ArrayList<Itens> Produtos = new ArrayList<Itens>();
 
// Metodo para cadastrar os produtos
public void cadastrarProdutos(String codigo, String descricao,
double preco) {
 
Itens novoProduto = new Itens();
novoProduto.codigo = codigo;
novoProduto.descricao = descricao;
novoProduto.preco = preco;
Produtos.add(novoProduto);
 
JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.",
" ", JOptionPane.INFORMATION_MESSAGE);
}
public String mostrarProdutos() {

for (Itens produtos : Produtos) {
dados += " Código do produto: " + produtos.codigo
+ " Descrição do produto: " + produtos.descricao
+ " Preço do produto: R$: " + produtos.preco+ "\n";
}
return dados;
}
public void imprimirDados() {
 
try {

BufferedWriter texto = new BufferedWriter(new FileWriter(
"produtos.txt", true));

texto.newLine();
// escreve o texto
texto.write("- Cadastro de produtos: ");

texto.newLine();

texto.write("===============================================");

texto.newLine();

for (Itens produtos : Produtos) {
texto.write(("Código do produto: " + produtos.codigo
+ " Descrição do produto: " + produtos.descricao
+ " Preço do produto: R$: " + produtos.preco+ "\n")
.replaceAll("\n", "\r\n"));
}
texto.newLine();

texto.flush();

texto.close();
JOptionPane.showMessageDialog(null, "Produto salvo com sucesso.",
" ", JOptionPane.INFORMATION_MESSAGE);
} // fim try
catch (Exception ex) {
JOptionPane.showMessageDialog(null, "Erro ao salvar o documento!",
"Cadastro De Produtos: ",
JOptionPane.ERROR_MESSAGE);
 
} 
}
 
public void imprimir() {
 
if (!Produtos.isEmpty()) {
File arquivo = new File(System.getProperty("user.dir")
+ " PRODUTOS .txt");
PrintWriter imprimir = null;
 
try {
 
imprimir = new PrintWriter(arquivo);
imprimir.println(" - Cadastro de produtos: ");
imprimir.println("============================================");

for (Itens produtos : Produtos) {
imprimir.println("Código do produto: " + produtos.codigo
+ " Descrição do produto: " + produtos.descricao
+ " Preço do produto: R$: " + produtos.preco);

}
// imprimir arquivo txt
Desktop.getDesktop().print(arquivo);
 
} catch (Exception e) {
// tratamento de erros aqui
JOptionPane.showMessageDialog(null,
"Erro ao imprimir o documento!",
"Cadastro De Produtos: ",
JOptionPane.ERROR_MESSAGE);
} finally {
 
if (imprimir != null) {
// Fecha o arquivo txt
imprimir.close();
// Deleta o arquivo criado depois de fechar a aplicação
arquivo.deleteOnExit();
}
}
 
} else {
JOptionPane.showMessageDialog(null, "Não há produtos cadastrados!",
"Cadastro De Produtos: ",
JOptionPane.ERROR_MESSAGE);
}
 
}
   
    }
 