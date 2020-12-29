package com.viwet.DAO;

import com.viwet.config.HibernateUtil;
import com.viwet.entities.CharacterSheet;
import org.hibernate.Session;

import java.util.List;

public class CharacterSheetDAO {
    private Session session;

    public void createCharacterSheet(CharacterSheet characterSheet) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(characterSheet);
        session.getTransaction().commit();
        session.close();
    }

    public CharacterSheet readCharacterSheet(int id) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        CharacterSheet characterSheet = session.get(CharacterSheet.class, id);
        session.getTransaction().commit();
        session.close();
        return characterSheet;
    }

    public void updateCharacterSheet(CharacterSheet characterSheet) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.saveOrUpdate(characterSheet);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteCharacterSheet(CharacterSheet characterSheet) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(characterSheet);
        session.getTransaction().commit();
        session.close();
    }

    public List<CharacterSheet> readAllCharacterSheets() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "FROM " + CharacterSheet.class.getSimpleName();
        List<CharacterSheet> characterSheets = session.createQuery(query).list();
        session.close();
        return characterSheets;
    }
}
