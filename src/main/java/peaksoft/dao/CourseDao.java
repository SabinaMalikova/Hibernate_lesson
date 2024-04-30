package peaksoft.dao;

import peaksoft.entity.Course;

import java.util.List;

public interface CourseDao {
    String saveCourse(Course course);
    Course getCourseById(Long courseId);
    String updateCourse(Long oldCourseId, Course newCourse);
    List<Course> getAllCourse();
    String deleteCourseById(Long courseId);

}
