//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//import entity.Border;
//import entity.City;
//import entity.Country;
//import entity.Language;
//import entity.Religion;
import entity.City;
import entity.Country;
import entity.Countrylanguage;
import entity.Person;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MysqlConnection {
    private EntityManager entityManager;

    public MysqlConnection() {
        SessionFactory factory = (new Configuration()).addAnnotatedClass(Country.class).addAnnotatedClass(City.class).addAnnotatedClass(Countrylanguage.class).buildSessionFactory();
       // SessionFactory factory = (new Configuration()).addAnnotatedClass(Person.class).buildSessionFactory();
        Session session = factory.openSession();
        this.entityManager = factory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}

