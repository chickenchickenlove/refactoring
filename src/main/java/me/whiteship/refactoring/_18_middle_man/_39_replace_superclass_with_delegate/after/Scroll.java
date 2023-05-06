package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate.after;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

// 상속 구조를 위임으로 제거했다. (슈퍼 클래스를 위임으로 제거하기)
public class Scroll{

    private LocalDate dateLastCleaned;
    private CategoryItem categoryItem;


    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
        this.categoryItem = new CategoryItem(id, title, tags);
        this.dateLastCleaned = dateLastCleaned;
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
