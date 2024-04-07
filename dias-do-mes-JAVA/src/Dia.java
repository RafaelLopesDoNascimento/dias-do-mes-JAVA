import EnumsPackage.diasDaSemana;

public class Dia {
	private Integer wholeHour;
	private String feriadoName;
	private Boolean feriado;
	private diasDaSemana day;
	
	public Dia() {
		
	}

	public Dia(Integer wholeHour, String feriadoName, Boolean feriado, diasDaSemana day) {
		this.wholeHour = wholeHour;
		this.feriadoName = feriadoName;
		this.feriado = feriado;
		this.day = day;
	}
	public Dia(Integer wholeHour, Boolean feriado, diasDaSemana day) {
		this.wholeHour = wholeHour;
		this.feriado = feriado;
		this.day = day;
	}

	public Dia(Integer wholeHour, diasDaSemana day) {
		this.wholeHour = wholeHour;
		this.day = day;
	}
	public Integer getWholeHour() {
		return wholeHour;
	}

	public void setWholeHour(Integer wholeHour) {
		this.wholeHour = wholeHour;
	}

	public String getFeriadoName() {
		return feriadoName;
	}

	public void setFeriadoName(String feriadoName) {
		this.feriadoName = feriadoName;
	}

	public Boolean getFeriado() {
		return feriado;
	}

	public void setFeriado(Boolean feriado) {
		this.feriado = feriado;
	}

	public diasDaSemana getDay() {
		return day;
	}

	public void setDay(diasDaSemana day) {
		this.day = day;
	}


	

}