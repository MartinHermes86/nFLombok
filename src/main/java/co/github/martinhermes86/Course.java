package co.github.martinhermes86;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Course {

    private final int id;

    private String name;

    private Teacher teacher;

    private List<Student> students;

}
