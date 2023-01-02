package model.vo;

public class pizzaVO {
    private String tipo;
    private double preco;
    private long id;


//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS GET(acessar, “pegar” alguns atributos da classe)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
    public String getTipo() {
        return tipo;
    }
    public double getPreco() {
        return preco;
    }
    public long getId() {
        return id;
    }
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS SET(modificar valores de um atributo da classe de maneira protegida)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
    public void setTipo(String tipo) {
        if(tipo == null){
        }else{
            if(tipo.equals("")){
            }else{
                this.tipo = tipo;
            }
        }
    }
    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }
        else{  
        }
    }
    public void setId(long id) {
        this.id = id;
    }
    
    
}
