package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.InfectiousAgents;

public interface IinfectiousAgentService {
	public void insertar(InfectiousAgents i);

	public List<InfectiousAgents> listar();

}
