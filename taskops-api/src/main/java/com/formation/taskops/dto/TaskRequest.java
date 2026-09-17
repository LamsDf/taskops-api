package com.formation.taskops.dto;

import com.formation.taskops.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;

public class TaskRequest {

    @NotBlank
    private String title;

    private String description;

    private TaskStatus status;

    public TaskRequest() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
