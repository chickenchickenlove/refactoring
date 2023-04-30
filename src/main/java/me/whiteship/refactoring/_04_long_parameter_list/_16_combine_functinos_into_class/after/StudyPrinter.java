package me.whiteship.refactoring._04_long_parameter_list._16_combine_functinos_into_class.after;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

// 사용되는 매개변수를 하나의 클래스로 모으고, 각 메서드들에 필요한 매개변수를 줄인다.
public class StudyPrinter {

    private final int totalNumberOfEvents;
    private final List<Participant> participants;

    public StudyPrinter(int totalNumberOfEvents, List<Participant> participants) {
        this.totalNumberOfEvents = totalNumberOfEvents;
        this.participants = participants;
    }


    public void print() throws IOException {
        // 이 코드에서 출력을 담당한다.
        // homework, username, totalNumberOfParticipants 등이 매개변수에 계속 전달되는 것을 볼 수 있다.
        // homework, username은 Participant라는 객체에서 전달됨.
        // 전달되는 이 매개변수들은 이 메서드에서만 쓰이므로, 메서드 + 매개변수로 따로 클래스를 뽑는 것이 코드 복잡도를 줄일 수 있음.
        try (FileWriter fileWriter = new FileWriter("participants.md");
             PrintWriter writer = new PrintWriter(fileWriter)) {
            this.participants.sort(Comparator.comparing(Participant::username));

            writer.print(header());

            this.participants.forEach(p -> {
                String markdownForHomework = getMarkdownForParticipant(p);
                writer.print(markdownForHomework);
            });
        }
    }

    // 매개변수 2개 → 1개 감소
    private String getMarkdownForParticipant(Participant participant) {
        return String.format("| %s %s | %.2f%% |\n",
                participant.username(),
                checkMark(participant.homework()),
                getRate(participant.homework()));
    }

    /**
     * |:white_check_mark:|:white_check_mark:|:white_check_mark:|:x:|
     */
    private String checkMark(Map<Integer, Boolean> homework) {
        StringBuilder line = new StringBuilder();
        for (int i = 1 ; i <= this.totalNumberOfEvents ; i++) {
            if(homework.containsKey(i) && homework.get(i)) {
                line.append("|:white_check_mark:");
            } else {
                line.append("|:x:");
            }
        }
        return line.toString();
    }

    private double getRate(Map<Integer, Boolean> homework) {
        long count = homework.values().stream()
                .filter(v -> v == true)
                .count();
        return (double) (count * 100 / this.totalNumberOfEvents);
    }

    /**
     * | 참여자 (420) | 1주차 | 2주차 | 3주차 | 참석율 |
     * | --- | --- | --- | --- | --- |
     */
    // 매개변수 1개 → 0개 감소
    private String header() {
        StringBuilder header = new StringBuilder(String.format("| 참여자 (%d) |", this.participants.size()));

        for (int index = 1; index <= this.totalNumberOfEvents; index++) {
            header.append(String.format(" %d주차 |", index));
        }
        header.append(" 참석율 |\n");

        header.append("| --- ".repeat(Math.max(0, this.totalNumberOfEvents + 2)));
        header.append("|\n");

        return header.toString();
    }
}
