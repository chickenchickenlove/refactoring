package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy.after;

import java.time.LocalDateTime;
import java.util.List;

// 이 클래스는 CourtReservation 용도로만 사용되고 있을 수도 있다.
public class Reservation {

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private List<String> members;
    private String owner;
    private boolean paid;

    // courtNumber는 상위 클래스에서 필요할 수도 있고, 아닐 수도 있다.
    // CourtReservation 클래스에서 pull up members로 옮겨옴.
    private String courtNumber;
}
