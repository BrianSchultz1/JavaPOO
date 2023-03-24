public class Paciente {

    private String nome;
    private int idade;
    private int temperaturaCorporal;
    private int diasTosse;
    private int diasDorDeCabeca;
    private boolean italia;
    private boolean china;
    private boolean indonesia;
    private boolean portugal;
    private boolean eua;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(int temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public int getDiasTosse() {
        return diasTosse;
    }

    public void setDiasTosse(int diasTosse) {
        this.diasTosse = diasTosse;
    }

    public int getDiasDorDeCabeca() {
        return diasDorDeCabeca;
    }

    public void setDiasDorDeCabeca(int diasDorDeCabeca) {
        this.diasDorDeCabeca = diasDorDeCabeca;
    }

    public boolean isItalia() {
        return italia;
    }

    public void setItalia(boolean italia) {
        this.italia = italia;
    }

    public boolean isChina() {
        return china;
    }

    public void setChina(boolean china) {
        this.china = china;
    }

    public boolean isIndonesia() {
        return indonesia;
    }

    public void setIndonesia(boolean indonesia) {
        this.indonesia = indonesia;
    }

    public boolean isPortugal() {
        return portugal;
    }

    public void setPortugal(boolean portugal) {
        this.portugal = portugal;
    }

    public boolean isEua() {
        return eua;
    }

    public void setEua(boolean eua) {
        this.eua = eua;
    }


    public Paciente(String nome, int idade, int temperaturaCorporal, int diasTosse, int diasDorDeCabeca, boolean italia, boolean china, boolean indonesia, boolean portugal, boolean eua) {
        this.nome = nome;
        this.idade = idade;
        this.temperaturaCorporal = temperaturaCorporal;
        this.diasTosse = diasTosse;
        this.diasDorDeCabeca = diasDorDeCabeca;
        this.italia = italia;
        this.china = china;
        this.indonesia = indonesia;
        this.portugal = portugal;
        this.eua = eua;
    }
}
