package com.viwet.DAO;

import com.viwet.config.HibernateUtil;
import com.viwet.entities.Player;
import org.hibernate.Session;

import java.util.List;

public class PlayerDAO {
    private Session session;

    public void createPlayer(Player player) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(player);
        session.getTransaction().commit();
        session.close();
    }

    public Player readPlayer(int id) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        Player player = session.get(Player.class, id);
        session.getTransaction().commit();
        session.close();
        return player;
    }

    public void updatePlayer(Player player) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.saveOrUpdate(player);
        session.getTransaction().commit();
        session.close();
    }

    public void deletePlayer(Player player) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(player);
        session.getTransaction().commit();
        session.close();
    }

    public List<Player> readAllPlayers() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + Player.class.getSimpleName();
        List<Player> players = session.createQuery(query).list();
        session.close();
        return players;
    }

    public List<Player> readPlayerByLogin(String login) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + Player.class.getSimpleName() + " WHERE LOGIN = '" + login + "'";
        List<Player> players = session.createQuery(query).list();
        session.close();
        return players;
    }
}
