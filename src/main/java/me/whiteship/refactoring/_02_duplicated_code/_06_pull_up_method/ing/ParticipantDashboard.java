package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method.ing;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ParticipantDashboard extends Dashboard {

    public void printUsers(int eventId) throws IOException {
        // Get github issue to check homework
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);

        // Get users
        Set<String> users = new HashSet<>();
        issue.getComments().forEach(c -> users.add(c.getUserName()));

        // Print users
        users.forEach(System.out::println);
    }

}
