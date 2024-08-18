package id.my.avzy.sb1.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {
}
