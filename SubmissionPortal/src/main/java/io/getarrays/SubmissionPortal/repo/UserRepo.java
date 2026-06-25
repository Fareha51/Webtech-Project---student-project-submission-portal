package io.getarrays.SubmissionPortal.repo;

import io.getarrays.SubmissionPortal.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
