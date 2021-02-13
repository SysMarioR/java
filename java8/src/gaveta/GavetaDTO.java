package gaveta;

public class GavetaDTO {

	private Integer dois;
	private Integer cinco;
	private Integer dez;
	private Integer vinte;
	private Integer cinquenta;
	private Integer cem;
	private double moeda;
	private double vlTotal;


	public Integer getDois() {
		return dois;
	}

	public void setDois(Integer dois) {
		this.dois = dois;
	}

	public Integer getCinco() {
		return cinco;
	}

	public void setCinco(Integer cinco) {
		this.cinco = cinco;
	}

	public Integer getDez() {
		return dez;
	}

	public void setDez(Integer dez) {
		this.dez = dez;
	}

	public Integer getVinte() {
		return vinte;
	}

	public void setVinte(Integer vinte) {
		this.vinte = vinte;
	}

	public Integer getCinquenta() {
		return cinquenta;
	}

	public void setCinquenta(Integer cinquenta) {
		this.cinquenta = cinquenta;
	}

	public Integer getCem() {
		return cem;
	}

	public void setCem(Integer cem) {
		this.cem = cem;
	}

	public double getMoeda() {
		return moeda;
	}

	public void setMoeda(double moeda) {
		this.moeda = moeda;
	}
	
	public double getVlTotal() {
		return this.vlTotal = (this.dois * 2) + (this.cinco * 5) + (this.dez * 10) 
					+ (this.vinte * 20) + (this.cinquenta * 50) + (this.cem * 100) + this.moeda;
	}
	
	@Override
	public String toString() {
		return "GavetaDTO [dois=" + dois + ", cinco=" + cinco + ", dez=" + dez + ", vinte=" + vinte + ", cinquenta="
				+ cinquenta + ", cem=" + cem + ", moeda=" + moeda + ", vlTotal=" + vlTotal + "]";
	}
	
	

}
