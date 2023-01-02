package model.vo;

public class estoqueVO {
    private String item;
    private int quantidade;

//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS GET(acessar, “pegar” alguns atributos da classe)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
    public String getItem() {
        return item;
    }
    public int getQuantidade() {
        return quantidade;
    }
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS SET(modificar valores de um atributo da classe de maneira protegida)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
    public void setItem(String item) {
        if(item == null){
        }else{
            if(item.equals("")){
            }else{
                this.item = item;
            }
        }
    }
    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
        }
    }
    
}
