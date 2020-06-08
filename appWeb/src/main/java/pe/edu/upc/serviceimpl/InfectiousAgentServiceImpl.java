package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IinfectiousAgentDao;
import pe.edu.upc.entity.InfectiousAgents;
import pe.edu.upc.serviceinterface.IinfectiousAgentService;

@Named
@RequestScoped
public class InfectiousAgentServiceImpl implements IinfectiousAgentService {
	@Inject
	private IinfectiousAgentDao iD;

	public void insertar(InfectiousAgents i) {
		iD.insertar(i);
	}

	public List<InfectiousAgents> listar() {
		// TODO Auto-generated method stub
		return iD.listar();
	}

}
