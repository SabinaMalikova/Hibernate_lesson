package peaksoft.service;

import peaksoft.entity.Course;

import java.util.List;

public interface CourseService {
    String saveCourse(Course course);
    Course getCourseById(Long courseId);
    String updateCourse(Long oldCourseId, Course newCourse);
    List<Course> getAllCourse();
    String deleteCourseById(Long courseId);
}
