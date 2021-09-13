public class Combo {

    private String sanduiches;
    private String batataFrita;
    private String salada;
    private String refrigerante;

    //Construtor da classe Combo
    public Combo(){
        this.setSanduiches("");
        this.setBatataFrita("");
        this.setSalada("");
        this.setRefrigerante("");
    }

    public Combo (String sanduiches, String batataFrita, String salada, String refrigerante) {
        this.setSanduiches(sanduiches);
        this.setBatataFrita(batataFrita);
        this.setSalada(salada);
        this.setRefrigerante(refrigerante);
    }

    public String getSanduiches(){
        return this.sanduiches;
    }

    public void setSanduiches(String sanduiches){
        this.sanduiches = sanduiches;
    }

    public String getBatataFrita() {
        return batataFrita;
    }

    public void setBatataFrita(String batataFrita) {
        this.batataFrita = batataFrita;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
}
