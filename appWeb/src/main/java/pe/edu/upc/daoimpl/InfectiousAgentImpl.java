package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.conexion.Conexion;
import pe.edu.upc.daointerface.IinfectiousAgentDao;
import pe.edu.upc.entity.InfectiousAgents;

public class InfectiousAgentImpl implements IinfectiousAgentDao {
	private Connection oCn;

	public InfectiousAgentImpl() {
		oCn = Conexion.AbrirConexion();
	}

	public void insertar(InfectiousAgents infectious) {
		try {
			String sql = "insert into infectiousagents(descriptionInfectiousAgents,typeInfectiousAgents,timeOfLifeInfectiousAgents,appearanceDateInfectiousAgents) "
					+ "values(?,?,?,?)";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ps.setString(1, infectious.getDescriptionInfectiousAgents());
			ps.setString(2, infectious.getTypeInfectiousAgents());
			ps.setInt(3, infectious.getTimeOfLifeInfectiousAgents());
			ps.setDate(4, new java.sql.Date(infectious.getAppearanceDateInfectiousAgents().getTime()));
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<InfectiousAgents> listar() {
		List<InfectiousAgents> lista = new ArrayList<InfectiousAgents>();
		try {
			String sql = "select * from infectiousagents";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				InfectiousAgents i = new InfectiousAgents();
				i.setIdInfectiousAgents(rs.getInt("idInfectiousAgents"));
				i.setDescriptionInfectiousAgents(rs.getString("descriptionInfectiousAgents"));
				i.setTypeInfectiousAgents(rs.getString("typeInfectiousAgents"));
				i.setTimeOfLifeInfectiousAgents(rs.getInt("timeOfLifeInfectiousAgents"));
				i.setAppearanceDateInfectiousAgents(rs.getDate("appearanceDateInfectiousAgents"));
				lista.add(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
