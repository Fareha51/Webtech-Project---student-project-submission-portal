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
@RequestMapping("/student")
public class studentcontroller {

    @Autowired
    private SubmissionRepo submissionRepo;

    @GetMapping("/projects")
    public List<ProjectTopic> getProjects(@Autowired ProjectRepo repo) {
        return repo.findAll();
    }

    @PostMapping("/submit")
    public Submission submitProject(@RequestBody Submission s) {

        s.setStatus("SUBMITTED");

        return submissionRepo.save(s);
    }
    @GetMapping("/my")
    public Submission getMyProject() {
        return submissionRepo.findAll().get(0); // temporary
    }
    @DeleteMapping("/projects/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id) {
        submissionRepo.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
    @PutMapping("/update/{id}")
    public Submission updateProject(@PathVariable Long id, @RequestBody Submission updated) {
        Submission s = submissionRepo.findById(id).orElseThrow();

        s.setProjectTitle(updated.getProjectTitle());
        s.setDescription(updated.getDescription());
        s.setFileLink(updated.getFileLink());
        s.setSandboxUrl(updated.getSandboxUrl());

        return submissionRepo.save(s);
    }

}
