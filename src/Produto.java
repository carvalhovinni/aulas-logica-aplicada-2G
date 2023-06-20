public class Produto {
    // Atributos
    int codigo;
    private String nome;
    double valor;

    // setter
    //public void setNome(String Valor) {
       // if (nivelacesso == 5) {
         //   this.nome = valor;



    // Construtor padrão
    Produto(){}
    // Sobrecarga do método construtor
    Produto(int _codigo){
        this.codigo = _codigo;
    }
    // mais uam sobrecarga
    Produto(int _codigo, String _nome){
        this.codigo = _codigo;
        this.nome = _nome;
    }

    public Produto(String nomeProduto) {
        this.nome = nomeProduto;
    }
}
