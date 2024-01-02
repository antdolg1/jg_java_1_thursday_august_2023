package teacher.lesson_14.lessoncode.stream;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Developer {

    private String name;
    private int age;
    private Level level;

}
