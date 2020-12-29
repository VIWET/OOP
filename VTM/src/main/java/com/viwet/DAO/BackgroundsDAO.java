package com.viwet.DAO;

import com.viwet.config.HibernateUtil;
import com.viwet.entities.Background;
import org.hibernate.Session;

import java.util.List;

public class BackgroundsDAO {
    private Session session;

    public void createBackground(Background background) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(background);
        session.getTransaction().commit();
        session.close();
    }

    public Background readBackground(int id) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        Background background = session.get(Background.class, id);
        session.getTransaction().commit();
        session.close();
        return background;
    }

    public void updateBackground(Background background) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.saveOrUpdate(background);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteBackground(Background background) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(background);
        session.getTransaction().commit();
        session.close();
    }

    public List<Background> readAllBackgrounds() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + Background.class.getSimpleName();
        List<Background> backgrounds = session.createQuery(query).list();
        session.close();
        return backgrounds;
    }
}
