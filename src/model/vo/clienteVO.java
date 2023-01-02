package model.vo;

public class clienteVO {
    private long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

public clienteVO(String nome, String cpf, String endereco, String telefone) {
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
        setTelefone(telefone);
    }
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS GET(acessar, “pegar” alguns atributos da classe)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
public long getId() {
    return id;
}
public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public String getEndereco() {
    return endereco;
}

public String getTelefone() {
    return telefone;
}
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
//      METODOS SET(modificar valores de um atributo da classe de maneira protegida)
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
public void setNome(String nome) {
    if(nome == null){
    }else{
        if(nome.equals( "")){
        }else{
            this.nome = nome;
        }
    }
}
public void setCpf(String cpf) {
    if(cpf == null){
    }else{
        if(cpf.equals("")){
        }else{
            this.cpf = cpf;
        }
    }
}
public void setEndereco(String endereco) {
    if(endereco == null){
    }else{
        if(endereco.equals("")){
        }else{
            this.endereco = endereco;
        }
    }       
}
public void setTelefone(String telefone) {
    if(telefone == null){
    }else{
        if(telefone.equals("")){
        }else{
            this.telefone = telefone;
        }
    }
}
public void setId(long id) {
    this.id = id;
}



    
    

    
    
    

}
