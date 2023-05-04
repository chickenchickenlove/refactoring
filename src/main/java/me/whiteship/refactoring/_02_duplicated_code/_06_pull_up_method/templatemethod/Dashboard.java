package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method.templatemethod;

import org.kohsuke.github.GHIssue;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public abstract class Dashboard {

    public static void main(String[] args) throws IOException {
        ReviewerDashboard reviewerDashboard = new ReviewerDashboard();
        reviewerDashboard.printReviewers();

        ParticipantDashboard participantDashboard = new ParticipantDashboard();
        participantDashboard.printParticipants(15);
    }

    protected void printUsers(int eventId) throws IOException {
        // Get github issue to check homework
        GHIssue issue = getGithubIssue(eventId);

        // Get users
        Set<String> users = new HashSet<>();
        issue.getComments().forEach(c -> users.add(c.getUserName()));

        // Print users
        users.forEach(System.out::println);


    }
    public abstract GHIssue getGithubIssue(int eventId) throws IOException;

}
