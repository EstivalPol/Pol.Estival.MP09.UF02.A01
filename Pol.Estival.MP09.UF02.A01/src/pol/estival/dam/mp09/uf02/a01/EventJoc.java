package pol.estival.dam.mp09.uf02.a01;
public class EventJoc extends Thread {

    private EntornJoc entornJoc;
    private ElementJoc elementJoc;
    private int frequenciaVisibilitat;
    private Integer maximesVisibilitats;

    public EventJoc(
            EntornJoc entornJoc,
            ElementJoc elementJoc,
            int frequenciaVisibilitat,
            Integer maximesVisibilitats
    ) {
        this.entornJoc = entornJoc;
        this.elementJoc = elementJoc;
        this.frequenciaVisibilitat = frequenciaVisibilitat;
        this.maximesVisibilitats = maximesVisibilitats;
    }

    public EntornJoc getentornJoc() {
        return entornJoc;
    } 

    public void setentornJoc(EntornJoc entornJoc) {
        this.entornJoc = entornJoc;
    } 

    public ElementJoc getElementJoc() {
        return elementJoc;
    } 

    public void setElementJoc(ElementJoc elementJoc) {
        this.elementJoc = elementJoc;
    } 
    
    public int getFrequenciaVisibilitat() {
        return frequenciaVisibilitat;
    } 

    public void setFrequenciaVisibilitat(int frequenciaVisibilitat) {
        this.frequenciaVisibilitat = frequenciaVisibilitat;
    } 

    public Integer getMaximesVisibilitats() {
        return maximesVisibilitats;
    } 

    public void setMaximesVisibilitats(Integer maximesVisibilitats) {
        this.maximesVisibilitats = maximesVisibilitats;
    }

    @Override
	public String toString() {
		return String.format("Event Joc [element joc = %s, freqüència d'aparició = %s, màximes aparicions = %d]\n",
			elementJoc, frequenciaVisibilitat, maximesVisibilitats);
	}

    @Override
    public void run() {
        int appareances = 0;

        while (maximesVisibilitats == null || appareances <= maximesVisibilitats) {
            appareances++;

            int x = (int) (Math.random() * (entornJoc.getmidaHoritzontal() - 0));
			int y = (int) (Math.random() * (entornJoc.getmidaVertical() - 0));
            int z = (int) (Math.random() * (entornJoc.getprofunditatPantalla() - 0));

            elementJoc.setxPosicio(x);
            elementJoc.setyPosicio(y);
            elementJoc.setzPosicio(z);
            elementJoc.setVisible(true);

            System.out.println(toString());

            try {
                Thread.sleep(frequenciaVisibilitat * 1000);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        System.err.printf("ALERTA - EVENT ACABAT -> %s\n", elementJoc.toString());
    }

}
