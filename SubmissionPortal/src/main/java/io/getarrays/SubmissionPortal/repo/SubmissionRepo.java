package io.getarrays.SubmissionPortal.repo;

import io.getarrays.SubmissionPortal.Entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepo extends JpaRepository<Submission, Long> {
}
