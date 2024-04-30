package peaksoft;

import peaksoft.entity.Course;
import peaksoft.entity.Student;
import peaksoft.enums.Genger;
import peaksoft.service.CourseService;
import peaksoft.service.StudentService;
import peaksoft.service.serviceImpl.CourseServiceImpl;
import peaksoft.service.serviceImpl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        StudentService studentService = new StudentServiceImpl();
//        studentService.saveStudent(new Student("Ulan","Karaev","ulan@gmail.com",20, Genger.MALE));
//        System.out.println(studentService.getStudentById(2L));
//        System.out.println(studentService.getAllStudents());
//        System.out.println(studentService.updateStudent(3L, new Student("Sezim", "Nurdinbekova", "sezim@gmail.com", 18, Genger.FEMALE)));
//        System.out.println(studentService.deleteStudentById(1L));

        CourseService courseService = new CourseServiceImpl();
//        System.out.println(courseService.saveCourse(new Course("JS", 14000)));

//        System.out.println(courseService.getCourseById(1L));
//        System.out.println(courseService.updateCourse(2L, new Course("Python", 10000)));
        System.out.println(courseService.deleteCourseById(2L));


    }
}
