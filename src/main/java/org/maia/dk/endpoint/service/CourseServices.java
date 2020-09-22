package org.maia.dk.endpoint.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.maia.dk.model.Course;
import org.maia.dk.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseServices {

    private final CourseRepository courseRepository;

    public Iterable<Course>list (Pageable pageable){
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }

}
