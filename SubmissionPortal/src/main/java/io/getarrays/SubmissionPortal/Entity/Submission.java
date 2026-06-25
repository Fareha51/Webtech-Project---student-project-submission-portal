package io.getarrays.SubmissionPortal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String projectTitle;
    private String description;
    private String fileLink;
    private String sandboxUrl;   // for preview
    private int marks;           // grading
    private String feedback;     // comments
    private String status;       // SUBMITTED / REVIEWED
    // getters/setters
    public Long getId() {
        return id;
    }
    public String getSandboxUrl() { return sandboxUrl; }
    public void setSandboxUrl(String sandboxUrl) { this.sandboxUrl = sandboxUrl; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getFileLink() {
        return fileLink;
    }
    public void setFileLink(String fileLink) {}
}