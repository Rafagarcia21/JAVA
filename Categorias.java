
package projeto;
 
//Classe com os gets e sets
public class Categorias {
 
private String _nome;
private int _codigo;
private double _valor;
 
void setNome(String nome) {
this._nome = nome;
}
 
String getNome() {
return _nome;
}
 
void setCodigo(int codigo) {
this._codigo = codigo;
}
 
int getCodigo() {
return _codigo;
}
 
public void setValor(double valor) {
this._valor = valor;
}
 
public double getValor() {
return _valor;
}
 
}