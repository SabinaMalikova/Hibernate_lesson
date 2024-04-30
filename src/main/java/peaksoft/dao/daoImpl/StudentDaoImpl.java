package peaksoft.dao.daoImpl;

import org.hibernate.Session;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.StudentDao;
import peaksoft.entity.Student;

import java.util.List;


public class StudentDaoImpl implements StudentDao {
//    @Override
//    public String saveStudent(Student student) {
//        //open session
//        Session session = HibernateConfig.getSession().openSession();
//        //start Transaction
//        session.beginTransaction();
//        //save method from hibernate
//        session.persist(student);
//        // сщхраняем транзакцию
//        session.getTransaction().commit();
//        //close session
//        session.close();
//        return "success";
//    }
//
//    @Override
//    public Student getStudentById(Long studentId) {
//        Session session = HibernateConfig.getSession().openSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class, studentId);
//        session.getTransaction().commit();
//        session.close();
//        return student;
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        Session session = HibernateConfig.getSession().openSession();
//        session.beginTransaction();
//        List<Student> allStudents =
//                session.createQuery("select s from Student s", Student.class).getResultList();
//        session.getTransaction().commit();
//        session.close();
//        return allStudents;
//    }
//
//    @Override
//    public Student updateStudent(Long studentId, Student newStudent) {
//        Session session = HibernateConfig.getSession().openSession();
//        session.beginTransaction();
//        Student oldStudent = session.get(Student.class, studentId);
//        oldStudent.setFirstName(newStudent.getFirstName());
//        oldStudent.setLastName(newStudent.getLastName());
//        oldStudent.setEmail(newStudent.getEmail());
//        oldStudent.setAge(newStudent.getAge());
//        oldStudent.setGender(newStudent.getGender());
//        session.getTransaction().commit();
//        session.close();
//        return oldStudent;
//    }
//
//    @Override
//    public String deleteStudentById(Long studentId) {
//        try {
//            Session session = HibernateConfig.getSession().openSession();
//            session.beginTransaction();
//            Student student = session.get(Student.class, studentId);
//            if (student != null) {
//                session.remove(student);
//                session.getTransaction().commit();
//                session.close();
//                return "successfully deleted";
//            } else return "not found";
//        } catch (Exception e) {
//            return e.getLocalizedMessage();
//        }
//    }
}
