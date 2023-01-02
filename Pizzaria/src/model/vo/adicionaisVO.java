package model.vo;

public class adicionaisVO {
    private String nome;
    private double preco;
    private int quantidade;

//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS GET(acessar, “pegar” alguns atributos da classe)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------    
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS SET(modificar valores de um atributo da classe de maneira protegida)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
    public void setNome(String nome) {
        if(nome == null){
        }else{
            if(nome.equals("")){
            }else{
                this.nome = nome;
            }
        }
    }
    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco; 
        }else{
        }
    }
    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
        }
    }

}
