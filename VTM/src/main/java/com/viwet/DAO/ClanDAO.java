package com.viwet.DAO;

import com.viwet.config.HibernateUtil;
import com.viwet.entities.Clan;
import org.hibernate.Session;

import java.util.List;

public class ClanDAO {
    private Session session;

    public void createClan(Clan clan) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(clan);
        session.getTransaction().commit();
        session.close();
    }

    public Clan readClan(int id) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        Clan clan = session.get(Clan.class, id);
        session.getTransaction().commit();
        session.close();
        return clan;
    }

    public void updateClan(Clan clan) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.saveOrUpdate(clan);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteClan(Clan clan) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(clan);
        session.getTransaction().commit();
        session.close();
    }

    public List<Clan> readAllClans() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + Clan.class.getSimpleName();
        List<Clan> clans = session.createQuery(query).list();
        session.close();
        return clans;
    }

    public List<Clan> readClanByTitle(String title) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + Clan.class.getSimpleName() + " WHERE TITLE = '" + title+ "'";
        List<Clan> clans = session.createQuery(query).list();
        session.close();
        return clans;
    }
}
