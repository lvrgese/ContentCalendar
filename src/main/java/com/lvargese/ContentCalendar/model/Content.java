package com.lvargese.ContentCalendar.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;


public record Content(
        Integer id,
        @NotBlank
        String title, //Refer to jakarta.validation.constraints for more validation annotations
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
)
{ }
