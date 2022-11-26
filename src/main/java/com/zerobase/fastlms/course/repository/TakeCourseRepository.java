package com.zerobase.fastlms.course.repository;

import com.zerobase.fastlms.course.entity.TakeCourse;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TakeCourseRepository extends JpaRepository<TakeCourse, Long> {

    long countByCourseIdAndUserIdAndStatusIn(long courseId, String userId, Collection<String> status);


}
