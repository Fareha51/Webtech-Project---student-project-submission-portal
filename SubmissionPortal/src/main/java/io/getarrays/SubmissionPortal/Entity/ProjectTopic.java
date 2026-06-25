package io.getarrays.SubmissionPortal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String field;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getField() { return field; }
    public void setField(String field) { this.field = field; }

    // getters/setters
}
