package com.klef.jfsd.student_activities_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.jfsd.student_activities_management.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}