package com.academy.backend.dto.request.course;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class CourseCreateRequest {

    @NotBlank(message = "강의 제목은 필수 입력 사항입니다.")
    @Size(max = 100, message = "제목은 100자 이내로 입력해주세요.")
    private String title;

    @NotNull(message = "강의 수강료는 필수 입력 정보입니다.")
    @Min(value = 1, message = "강의 수강료는 최소 1원 이상이어야 합니다.")
    private Integer cost;

    private List<String> descriptions = Collections.emptyList();
    private List<String> tags = Collections.emptyList();

    @Valid
    @NotEmpty(message = "수업 일정은 최소 하나 이상 입력해야 합니다.")
    private List<CourseTimeTableRequest> timetables = Collections.emptyList();
}
