package co.github.martinhermes86;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private String grade;
}
