package techLock.techLock.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long id;

    @Column(name = "log_date", unique = true, nullable = false)
    private String date;

    @Column(name = "log_path",nullable = false)
    private String path;
}
