package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.InfectiousAgents;

public interface IinfectiousAgentDao {
	public void insertar(InfectiousAgents infectious);

	public List<InfectiousAgents> listar();
}
