package teacher.lesson_8.lessoncode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventScheduler {
    public static void main(String[] args) {

        List<Event> events = new ArrayList<>();

        events.add(new Event("Sprint planning", LocalDate.of(2023, 11, 2)));
        events.add(new Event("Retrospective", LocalDate.of(2023, 11, 16)));
        events.add(new Event("Refinement", LocalDate.of(2023, 12, 31)));

        System.out.println("Upcoming events:");
        for (Event event : events) {
            if (event.isUpcomingEvent()) {
                System.out.println("Event: " + event.getEventName() + ", Date: " + event.getEventDate());
            }
        }

    }
}
