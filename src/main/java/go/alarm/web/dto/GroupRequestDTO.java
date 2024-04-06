package go.alarm.web.dto;

import go.alarm.domain.entity.WakeupDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.List;
import lombok.Getter;

public class GroupRequestDTO {

    @Getter
    public static class CreateDTO{
        @NotBlank
        String name;
        @NotNull
        LocalTime wakeupTime;
        String memo;
        @NotNull
        List<String> wakeupDateList;
    }

    @Getter
    public static class CreateMemoDTO{
        String memo;
    }
}