package main;

import java.util.List;

import modelo.Employees;
import modelo.servicio.EmployessServicio;
import modelo.servicio.IEmployessServicio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.SessionFactoryUtil;

public class main {

    public static void main(String[] args) {
		boolean exito;

//        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        System.out.println("----------- Q1: Uso de cross join: Cada fila de una tabla combinada con todas las filas de la otra tabla -----------");
//        List<Object[]> vendedorproducto = session.createQuery("select e.firstName, s.salesId from Employees e join e.saleses s").list();
//        for (Object[] fila : vendedorproducto) {
//            System.out.println("Vendedor: " + fila[0] + "Id producto " + fila[1]);
//        }


		  IEmployessServicio employessServicio = new EmployessServicio();
//		  Employees employees1 = new Employees();
//		  employees1.setFirstName("Pepe");
//		  employees1.setLastName("Cabrera");
//		  employessServicio.Employessadd(employees1);
		exito=employessServicio.borrarEmpleado(264);
		if(!exito){
			System.out.println("No existe el id de empleado para borrar");
		}

    }
}



