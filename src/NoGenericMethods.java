public class NoGenericMethods {

    private String banana;
    private String manzana;
    private String pera;

    public NoGenericMethods(String banana, String manzana, String pera) {
        this.banana = banana;
        this.manzana = manzana;
        this.pera = pera;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getPera() {
        return pera;
    }

    public void setPera(String pera) {
        this.pera = pera;
    }
}
