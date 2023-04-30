package pol.estival.dam.mp09.uf02.a01;
public class EntornJoc {

    private int midaHoritzontal, midaVertical, screendDepth;

    public EntornJoc(int midaHoritzontal, int midaVertical, int profunditatPantalla) {
        this.midaHoritzontal = midaHoritzontal;
        this.midaVertical = midaVertical;
        this.screendDepth = profunditatPantalla;
    }

    public int getmidaHoritzontal() {
        return midaHoritzontal;
    }  

    public void setmidaHoritzontal(int midaHoritzontal) {
        this.midaHoritzontal = midaHoritzontal;
    }
   
    public int getmidaVertical() {
        return midaVertical;
    }

    public void setmidaVertical(int midaVertical) {
        this.midaVertical = midaVertical;
    }

    public int getprofunditatPantalla() {
        return screendDepth;
    }

    public void setprofunditatPantalla(int screendDepth) {
        this.screendDepth = screendDepth;
    }

}
