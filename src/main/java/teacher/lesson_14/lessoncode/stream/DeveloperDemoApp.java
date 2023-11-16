package teacher.lesson_14.lessoncode.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeveloperDemoApp {
    public static void main(String[] args) {

        List<Developer> developers = getDeveloperList();

        Developer developer1 = new Developer("Gunter", 22, Level.SENIOR);
        Developer developer2 = new Developer();

        Developer developer3 = Developer.builder()
                .name("Johans")
                .age(44)
                .level(Level.SENIOR)
                .build();

        Developer developer4 = Developer.builder()
                .name("Guntars")
                .build();


        Developer developer5 = Developer.builder()
                .level(Level.SENIOR)
                .name("Juntra")
                .build();

        System.out.println("JUNIOR developers:");
        List<Developer> juniorDevs = developers.stream()
                .filter(developer -> Level.JUNIOR == developer.getLevel())
                .toList();
        juniorDevs.forEach(System.out::println);
        System.out.println();

        //sort by age ascending
        System.out.println("Developers list sorted by age ascending:");
        List<Developer> developersSortedAsc = developers.stream()
                .sorted(Comparator.comparing(Developer::getAge))
                .toList();
        developersSortedAsc.forEach(System.out::println);
        System.out.println();

        //all match (also there is anyMatch and noneMatch)
        boolean allMatch = developers.stream()
                .allMatch(developer -> developer.getAge() > 17);
        System.out.println("All devs are older than 17? " + allMatch);
        System.out.println();

        //oldest dev
        System.out.println("Oldest developer:");
        developers.stream()
                .max(Comparator.comparing(Developer::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //youngest dev
        System.out.println("Youngest developer:");
        developers.stream()
                .min(Comparator.comparing(Developer::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //youngest MIDDLE dev
        Optional<String> youngestMidDev = developers.stream()
                .filter(developer -> Level.MIDDLE == developer.getLevel())
                .min(Comparator.comparing(Developer::getAge))
                .map(Developer::getName);
        youngestMidDev.ifPresent(System.out::println);
        System.out.println();

        //group by level
        Map<Level, List<Developer>> devsMap = developers.stream()
                .collect(Collectors.groupingBy(Developer::getLevel));

        devsMap.forEach((level, dev1) -> {
            System.out.println(level);
            dev1.forEach(System.out::println);
            System.out.println();
        });

    }

    private static List<Developer> getDeveloperList() {
        return List.of(
                new Developer("Janis", 30, Level.MIDDLE),
                new Developer("Raivis", 23, Level.MIDDLE),
                new Developer("Juta", 21, Level.SENIOR),
                new Developer("Liene", 45, Level.JUNIOR),
                new Developer("Johan", 18, Level.INTERN),
                new Developer("Kiril", 26, Level.INTERN),
                new Developer("Denis", 33, Level.SENIOR),
                new Developer("Anna", 32, Level.ARCHITECT),
                new Developer("Dzek", 28, Level.MIDDLE),
                new Developer("Julija", 30, Level.MIDDLE)
        );
    }
}
