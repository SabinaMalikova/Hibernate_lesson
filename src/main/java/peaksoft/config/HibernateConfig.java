package peaksoft.config;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.entity.Course;
import peaksoft.entity.Student;

import java.util.Properties;

public class HibernateConfig {
//    public static SessionFactory getSession(){
//
//        Properties properties = new Properties();
//        properties.put(Environment.DRIVER,"org.postgresql.Driver");
//        properties.put(Environment.URL,"jdbc:postgresql://localhost:5432/postgres");
//        properties.put(Environment.USER,"postgres");
//        properties.put(Environment.PASS,"1234");
//        properties.put(Environment.HBM2DDL_AUTO,"create");
//        properties.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
//        properties.put(Environment.SHOW_SQL,"true");
//
//        Configuration configuration = new Configuration();
//        configuration.addProperties(properties);
//        configuration.addAnnotatedClass(Student.class);
//
//        return configuration.buildSessionFactory();
//    }

    public static EntityManagerFactory getEntityManagerFactory() {
        try {
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "org.postgresql.Driver");
            properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
            properties.put(Environment.USER, "postgres");
            properties.put(Environment.PASS, "1234");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            properties.put(Environment.SHOW_SQL, "true");

            Configuration configuration = new Configuration();
            configuration.addProperties(properties);
            configuration.addAnnotatedClass(Course.class);

            return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
        } catch (HibernateException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
