package io.getarrays.SubmissionPortal.controller;

import io.getarrays.SubmissionPortal.Entity.ProjectTopic;
import io.getarrays.SubmissionPortal.Entity.Submission;
import io.getarrays.SubmissionPortal.repo.ProjectRepo;
import io.getarrays.SubmissionPortal.repo.SubmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@CrossOrigin
@RequestMapping("/admin")
public class admincontroller {

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private SubmissionRepo submissionRepo;

    @PostMapping("/addProject")
    public ProjectTopic addProject(@RequestBody ProjectTopic p) {
        System.out.println(p.getTitle());
        System.out.println(p.getField());
        return projectRepo.save(p);
    }

    @GetMapping("/submissions")
    public List<Submission> getAllSubmissions() {
        return submissionRepo.findAll();
    }

    @PutMapping("/projects/{id}/grade")

    public ResponseEntity<?> gradeProject(@PathVariable Long id, @RequestBody Submission data) {
        Submission sub = submissionRepo.findById(id).get();

        sub.setMarks(data.getMarks());
        sub.setFeedback(data.getFeedback());
        sub.setStatus("REVIEWED");

        submissionRepo.save(sub);

        return ResponseEntity.ok("Graded");
    }

}
