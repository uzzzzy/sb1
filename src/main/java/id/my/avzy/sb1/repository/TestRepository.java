package id.my.avzy.sb1.repository;

import id.my.avzy.sb1.run.Location;
import id.my.avzy.sb1.run.Run;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TestRepository {
    private List<Run> runs = new ArrayList<Run>();

    public List<Run> findAll() {
        return runs;
    }

    public Optional<Run> findById(Integer id) {
        return runs.stream().filter(run -> run.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 100, Location.INDOOR));
        runs.add(new Run(2, "Run 2", LocalDateTime.now(), LocalDateTime.now().plusHours(2), 100, Location.INDOOR));
    }
}


