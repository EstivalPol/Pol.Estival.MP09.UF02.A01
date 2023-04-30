package pol.estival.dam.mp09.uf02.a01;
public class ElementJoc {

	private String nom, imatge;
	private int xPosicio, yPosicio, zPosicio;
	private boolean visible;

	public ElementJoc(String nom, String imatge) {
		this.nom = nom;
		this.imatge = imatge;
		this.xPosicio = 0;
		this.yPosicio = 0;
		this.zPosicio = 0;
		this.visible = false;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getImatge() {
		return imatge;
	}
	
	public void setImatge(String imatge) {
		this.imatge = imatge;
	}
	
	public int getxPosicio() {
		return xPosicio;
	}

	public void setxPosicio(int xPosicio) {
		this.xPosicio = xPosicio;
	}

	public int getyPosicio() {
		return yPosicio;
	}

	public void setyPosicio(int yPosicio) {
		this.yPosicio = yPosicio;
	}

	public int getzPosicio() {
		return zPosicio;
	}

	public void setzPosicio(int zPosicio) {
		this.zPosicio = zPosicio;
	}

	public boolean visible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@Override
	public String toString() {
		return String.format("Element Joc [nom = %s, imatge = %s, x-Posicio = %d, y-Posicio = %d, z-Posicio = %d, visible = %b]\n",
			nom, imatge, xPosicio, yPosicio, zPosicio, visible);
	}

}
