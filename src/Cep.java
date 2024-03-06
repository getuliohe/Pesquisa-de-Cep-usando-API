public class Cep {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public Cep(String cep, String logradouro, String bairro, String localidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }
    public Cep(ViaCep viaCep){
        this.cep = viaCep.cep();
        this.logradouro = viaCep.logradouro();
        this.bairro = viaCep.bairro();
        this.localidade = viaCep.localidade();
        this.uf = viaCep.uf();
    }

    @Override
    public String toString() {
        return
                "cep='" + cep + '\'' +
                        ", logradouro='" + logradouro + '\'' +
                        ", bairro='" + bairro + '\'' +
                        ", localidade='" + localidade + '\'' +
                        ", uf='" + uf ;
    }
}
