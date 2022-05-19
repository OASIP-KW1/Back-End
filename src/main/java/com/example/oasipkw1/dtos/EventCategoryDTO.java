package com.example.oasipkw1.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventCategoryDTO {

    @NotNull(message = "ID cannot null")
    private Integer id;
    private String eventCategoryName;
    private String eventCategoryDescription;
    private Integer eventDuration;
    public String getCategoryName() {
        return eventCategoryName;
    }
}