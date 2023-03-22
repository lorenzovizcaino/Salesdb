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

    }

