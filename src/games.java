public class games {
    private String nume;
    private String gen;
    private int pret;

    public games(String nume, String gen, int pret){
        this.nume=nume;
        this.gen=gen;
        this.pret=pret;
    }
    public String toString() {
        return this.nume + " " + this.gen + ", are pretul de  " + this.pret;
    }

    public String getNume() {
        return nume;
    }

    public String getGen() {
        return gen;
    }

    public int getPret() {
        return pret;
    }
}
