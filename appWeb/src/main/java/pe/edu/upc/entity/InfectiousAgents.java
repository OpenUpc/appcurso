package pe.edu.upc.entity;

import java.util.Date;

public class InfectiousAgents {
	private int idInfectiousAgents;
	private String descriptionInfectiousAgents;
	private String typeInfectiousAgents;
	private int timeOfLifeInfectiousAgents;
	private Date appearanceDateInfectiousAgents;

	public InfectiousAgents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InfectiousAgents(int idInfectiousAgents, String descriptionInfectiousAgents, String typeInfectiousAgents,
			int timeOfLifeInfectiousAgents, Date appearanceDateInfectiousAgents) {
		super();
		this.idInfectiousAgents = idInfectiousAgents;
		this.descriptionInfectiousAgents = descriptionInfectiousAgents;
		this.typeInfectiousAgents = typeInfectiousAgents;
		this.timeOfLifeInfectiousAgents = timeOfLifeInfectiousAgents;
		this.appearanceDateInfectiousAgents = appearanceDateInfectiousAgents;
	}

	public int getIdInfectiousAgents() {
		return idInfectiousAgents;
	}

	public void setIdInfectiousAgents(int idInfectiousAgents) {
		this.idInfectiousAgents = idInfectiousAgents;
	}

	public String getDescriptionInfectiousAgents() {
		return descriptionInfectiousAgents;
	}

	public void setDescriptionInfectiousAgents(String descriptionInfectiousAgents) {
		this.descriptionInfectiousAgents = descriptionInfectiousAgents;
	}

	public String getTypeInfectiousAgents() {
		return typeInfectiousAgents;
	}

	public void setTypeInfectiousAgents(String typeInfectiousAgents) {
		this.typeInfectiousAgents = typeInfectiousAgents;
	}

	public int getTimeOfLifeInfectiousAgents() {
		return timeOfLifeInfectiousAgents;
	}

	public void setTimeOfLifeInfectiousAgents(int timeOfLifeInfectiousAgents) {
		this.timeOfLifeInfectiousAgents = timeOfLifeInfectiousAgents;
	}

	public Date getAppearanceDateInfectiousAgents() {
		return appearanceDateInfectiousAgents;
	}

	public void setAppearanceDateInfectiousAgents(Date appearanceDateInfectiousAgents) {
		this.appearanceDateInfectiousAgents = appearanceDateInfectiousAgents;
	}

}
