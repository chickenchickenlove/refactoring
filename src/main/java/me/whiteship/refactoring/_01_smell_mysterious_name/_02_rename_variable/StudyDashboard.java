package me.whiteship.refactoring._01_smell_mysterious_name._02_rename_variable;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudyDashboard {

    private Set<String> usernames = new HashSet<>();

    private Set<String> reviews = new HashSet<>();

    /**
     * 스터디 리뷰 이슈에 작성되어 있는 리뷰어 목록과 리뷰를 읽어옵니다.
     * @throws IOException
     */
    private void loadReviews() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        // Issue의 comment가 review가 맞긴 하다.
        // 그런데 review를 읽어오는 함수 안에 review 변수가 없다는 것은 어색하다.
        List<GHIssueComment> comments = issue.getComments();
        for (GHIssueComment comment : comments) {
            usernames.add(comment.getUserName());
            this.reviews.add(comment.getBody());
        }
    }

    public Set<String> getUsernames() {
        return usernames;
    }

    public Set<String> getReviews() {
        return reviews;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        // 람다 안에서 사용되는 변수는 다음과 같다.
        // 1. 가장 좁은 범위에서 사용되는 변수라 이름이 상대적으로 중요하지 않음.
        // 2. 람다 안에서 사용될 변수는 무엇이 들어있는지 이미 알고 있는 경우가 많음. 따라서 이름이 중요하지 않음.
        // 따라서 람다 안에서 사용되는 변수는 n,r로 바꿔줘도 크게 문제가 없다. 혹은 메서드 레퍼런스를 이용해서 변수의 이름을 고려하지 않아도 된다.
        studyDashboard.getUsernames().forEach(name -> System.out.println(name));
        studyDashboard.getReviews().forEach(review -> System.out.println(review));
    }
}
