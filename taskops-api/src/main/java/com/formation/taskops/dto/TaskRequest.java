package com.formation.taskops.dto;

import com.formation.taskops.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TaskRequest(
        @NotBlank(message = "Le titre est obligatoire")
        @Size(max = 120, message = "Le titre ne peut depasser 120 caracteres")
        String title,

        @Size(max = 1000, message = "La description ne peut depasser 1000 caracteres")
        String description,

        TaskStatus status
) {
}
