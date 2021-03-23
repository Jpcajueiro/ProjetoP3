
public class Empregado {
    
    String name;
    String id;
    String endereco;
    TipoDeEmpregado tipoDeEmpregado;
    CartaoDePonto cartaoDePonto;
    Sindicato sindicato;
    int metodoDePagamento;

    public Empregado(String name, String id,String endereco, TipoDeEmpregado tipoDeEmpregado, CartaoDePonto cartaoDePonto, Sindicato sindicato, int metodoDePagamento){
        this.name = name;
        this.id = id;
        this.endereco = endereco;
        this.tipoDeEmpregado = tipoDeEmpregado;
        this.cartaoDePonto = cartaoDePonto;
        this.sindicato = sindicato;
        this.metodoDePagamento = metodoDePagamento;
    }

    public String printEmpregadoInfo(Empregado empregado){
        return "Nome: " + empregado.name +
        "\n---------------------\n"+
        "Endereço:" + empregado.endereco +
        "\n---------------------\n"+
        "ID:" + empregado.id +
        "\n---------------------\n"+
        "Tipo de empregado:" + tipoDeEmpregado+
        "\n---------------------\n";
    }
}