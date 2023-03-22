package modelo.servicio;

import modelo.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

public class EmployessServicio implements IEmployessServicio{
    @Override
    public Employees Employessadd(Employees empleado) {

        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Transaction tx = null;
        try (Session session = sf.openSession()) {
            tx = session.beginTransaction();
            session.save(empleado);
            tx.commit();

        } catch (Exception ex) {
            System.out.println("Ha ocurrido una exception: " + ex.getMessage());

            if (tx != null) {
                tx.rollback();
            }
            empleado = null;
        }
        return empleado;
    }

    @Override
    public boolean borrarEmpleado(int idEmpleado) {
        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
        Transaction tx=null;
        boolean exito=true;
        try(Session session= sessionFactory.openSession()){
            tx= session.beginTransaction();
            Employees empleado=session.get(Employees.class,idEmpleado);
            if(empleado!=null){
                session.delete(empleado);
                tx.commit();
            }else{
                exito=false;
            }

        }catch (Exception ex) {
            System.out.println("Ha ocurrido una exception: " + ex.getMessage());

            if (tx != null) {
                tx.rollback();
            }

        }




        return exito;
    }

}

