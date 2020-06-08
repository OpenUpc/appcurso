package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.InfectiousAgents;
import pe.edu.upc.serviceinterface.IinfectiousAgentService;

@Named
@RequestScoped
public class InfectiousAgentController {
	@Inject
	private IinfectiousAgentService iService;
	private InfectiousAgents i;
	List<InfectiousAgents> listaInfectiousAgent;

//constructor
	@PostConstruct
	public void init() {
		this.listaInfectiousAgent = new ArrayList<InfectiousAgents>();
		this.i = new InfectiousAgents();
		this.list();
	}

//métodos
	public String newInfectious() {
		this.setI(new InfectiousAgents());
		return "infectiousAgent.xhtml";
	}

	public void insert() {
		try {

			iService.insertar(i);
			cleanInfectiousAgent();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaInfectiousAgent = iService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanInfectiousAgent() {
		this.init();
	}
//get y set

	public InfectiousAgents getI() {
		return i;
	}

	public void setI(InfectiousAgents i) {
		this.i = i;
	}

	public List<InfectiousAgents> getListaInfectiousAgent() {
		return listaInfectiousAgent;
	}

	public void setListaInfectiousAgent(List<InfectiousAgents> listaInfectiousAgent) {
		this.listaInfectiousAgent = listaInfectiousAgent;
	}

}
