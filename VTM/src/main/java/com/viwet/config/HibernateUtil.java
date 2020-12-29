package com.viwet.config;


import com.viwet.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addResource("com/viwet/entities/Abilities.hbm.xml");
        cfg.addResource("com/viwet/entities/Attributes.hbm.xml");
        cfg.addResource("com/viwet/entities/Background.hbm.xml");
        cfg.addResource("com/viwet/entities/CharacterSheet.hbm.xml");
        cfg.addResource("com/viwet/entities/Clan.hbm.xml");
        cfg.addResource("com/viwet/entities/Discipline.hbm.xml");
        cfg.addResource("com/viwet/entities/Health.hbm.xml");
        cfg.addResource("com/viwet/entities/MaskNature.hbm.xml");
        cfg.addResource("com/viwet/entities/Player.hbm.xml");
        cfg.addResource("com/viwet/entities/VariableAttributes.hbm.xml");
        cfg.addResource("com/viwet/entities/Virtues.hbm.xml");
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        sessionFactory = cfg.buildSessionFactory(builder.build());
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
