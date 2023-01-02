package model.vo;

public class pedidosVO {
    private String tamanho;
    private clienteVO cliente;
    private pizzaVO pizza;
    private adicionaisVO adicionais;

//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS GET(acessar, “pegar” alguns atributos da classe)
//-----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------- 
    public adicionaisVO getAdicionais() {
        return adicionais;
    }
    public pizzaVO getPizza() {
        return pizza;
    }
    public clienteVO getCliente() {
        return cliente;
    }
    public String getTamanho() {
        return tamanho;
    }
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS SET(modificar valores de um atributo da classe de maneira protegida)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
    public void setTamanho(String tamanho) {
        if(tamanho == null){
        }else{
            if(tamanho.equals("")){ 
            }else{
                this.tamanho = tamanho;
            }
        }
    }

    public void setCliente(clienteVO cliente) {
        if(cliente == null){
            System.out.println("Nulo");
        }else{
            this.cliente = cliente;
        }
    }

    public void setPizza(pizzaVO pizza) {
        if(pizza == null){
            System.out.println("Nulo");
        }else{
            this.pizza = pizza;
        }
    }

    public void setAdicionais(adicionaisVO adicionais) {
       if(adicionais == null){
            System.out.print("Nulo");
       }else{
            this.adicionais = adicionais;
    }
    }
}
