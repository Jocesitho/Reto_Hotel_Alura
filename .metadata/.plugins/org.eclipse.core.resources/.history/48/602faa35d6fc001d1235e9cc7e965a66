package Controladores;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import DAO.HuespedesDAO;
import Factory.ConnectionFactory;
import modelo.Huespedes;

public class HuespedesControlador {
	
	private HuespedesDAO huespedesDao;
	
	public  HuespedesControlador() {
		Connection con= new ConnectionFactory().recuperaConexion();
		this.huespedesDao= new HuespedesDAO(con);
	}
	
	public void guardar(Huespedes huespedes) {
		this.huespedesDao.guardar(huespedes);
	}
	
	public List<Huespedes> mostrarHuesped(){
		return this.huespedesDao.mostrar();
	}
	
	public List<Huespedes> buscarHuesped(String id){
		return this.huespedesDao.buscarId(id);
	}
	
	public void ActualizarHuespedes(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono,
			Integer idReserva,Integer id) {
		this.huespedesDao.ActualizarH(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva, id);
	}
	
	public void EliminarHuespedes(Integer idReserva) {
		this.huespedesDao.EliminarHuespedes(idReserva);
	}
}
