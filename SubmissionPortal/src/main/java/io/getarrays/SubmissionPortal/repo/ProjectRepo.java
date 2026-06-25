package io.getarrays.SubmissionPortal.repo;

import io.getarrays.SubmissionPortal.Entity.ProjectTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<ProjectTopic, Long> {
}
