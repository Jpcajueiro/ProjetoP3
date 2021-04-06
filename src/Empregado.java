public class Empregado {
    
    private String name;
    private String id;
    private String endereco;
    private TipoDeEmpregado tipoDeEmpregado;
    private CartaoDePonto cartaoDePonto;
    private Sindicato sindicato;
    private int metodoDePagamento;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setTipoDeEmpregado(TipoDeEmpregado tipoDeEmpregado) {
        this.tipoDeEmpregado = tipoDeEmpregado;
    }

    public TipoDeEmpregado getTipoDeEmpregado() {
        return this.tipoDeEmpregado;
    }
    
    public void setCartaoDePonto(CartaoDePonto cartaoDePonto) {
        this.cartaoDePonto = cartaoDePonto;
    }
    
    public CartaoDePonto getCartaoDePonto() {
        return this.cartaoDePonto;
    }

    public void setMetodoDePagamento(int metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public int getMetodoDePagamento() {
        return this.metodoDePagamento;
    }
    
    public void setSindicato(Sindicato sindicato) {
        this.sindicato = sindicato;
    }

    public Sindicato getSindicato() {
        return this.sindicato;
    }

    public String printEmpregadoInfo(){
        return "Nome: " + this.name +
        "\n---------------------\n"+
        "Endereço:" + this.endereco +
        "\n---------------------\n"+
        "ID:" + this.id +
        "\n---------------------\n";
    }
}