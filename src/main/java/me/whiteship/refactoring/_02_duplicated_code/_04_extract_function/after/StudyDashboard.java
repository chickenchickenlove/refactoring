package me.whiteship.refactoring._02_duplicated_code._04_extract_function.after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {

    private void printParticipants(int eventId) throws IOException {
        GHIssue issue = getGithubIssue(eventId);
        Set<String> participants = getUserNames(issue);
        print(participants);
    }

    private void printReviewers() throws IOException {
        GHIssue issue = getGithubIssue(30);
        Set<String> reviewers = getUserNames(issue);
        print(reviewers);
    }

    private static void print(Set<String> participants) {
        participants.forEach(System.out::println);
    }

    private Set<String> getUserNames(GHIssue issue) throws IOException {
        Set<String> participants = new HashSet<>();
        issue.getComments().forEach(c -> participants.add(c.getUserName()));
        return participants;
    }

    private GHIssue getGithubIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        return repository.getIssue(eventId);
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }

}
