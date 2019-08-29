package javagda25;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDao {
/*
    public void saveOrUpdate(Student studentEntity) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Transaction transaction = null;
        try (Session session = factory.openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(studentEntity);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        try (Session session = factory.openSession()) {

            // Narzędzie do kreowania zapytania, do tworzenia query i budowania klauzuli 'where'
            CriteriaBuilder cb = session.getCriteriaBuilder();
            // Obiekt reprezentujący zapytanie o <typ generyczny>
            CriteriaQuery<Student> criteriaQuery = cb.createQuery(Student.class);
            // reprezentuje tabelę 'Student' i tworzymy tą instancję żeby powiedzieć
            // "do jakiej tabeli chcemy wykonać zapytanie"
            Root<Student> rootTable = criteriaQuery.from(Student.class);
            // wykonanie select'a z tabeli
            criteriaQuery.select(rootTable);
            // wywołujemy zapytanie, wyniki zbieramy do listy
            list.addAll(session.createQuery(criteriaQuery).list());

            //Query<Student> query = session.createQuery("from Student",Student.class); //HQL
            //return query.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Optional<Student> getById(Long id) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        try (Session session = factory.openSession()) {
            Student student = session.get(Student.class, id);
            return Optional.ofNullable(student);
        }
    }

    public void delite(Long id) {

        Optional<Student> studentOptional = getById(id);

        if(studentOptional.isPresent()){
            delite(studentOptional.get());
        }else {
            System.err.println("Nie udało się odnaleźć instancji");
        }
    }

    public void delite(Student student) {
        SessionFactory factory = HibernateUtil.getSessionFactory();

        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(student);
            transaction.commit();
        }
    }

*/

}
