package com.viwet.DAO;

import com.viwet.config.HibernateUtil;
import com.viwet.entities.Discipline;
import org.hibernate.Session;

import java.util.List;

public class DisciplineDAO {
    private Session session;

    public void createDiscipline(Discipline discipline) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(discipline);
        session.getTransaction().commit();
        session.close();
    }

    public Discipline readDiscipline(int id) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        Discipline discipline = session.get(Discipline.class, id);
        session.getTransaction().commit();
        session.close();
        return discipline;
    }

    public void updateDiscipline(Discipline discipline) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.saveOrUpdate(discipline);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteDiscipline(Discipline discipline) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(discipline);
        session.getTransaction().commit();
        session.close();
    }

    public List<Discipline> readAllDisciplines() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + Discipline.class.getSimpleName();
        List<Discipline> disciplines = session.createQuery(query).list();
        session.close();
        return disciplines;
    }
}
