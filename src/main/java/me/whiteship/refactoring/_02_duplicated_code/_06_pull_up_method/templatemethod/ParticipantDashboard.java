package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method.templatemethod;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

public class ParticipantDashboard extends Dashboard {

    @Override
    public GHIssue getGithubIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        return repository.getIssue(eventId);
    }

    public void printParticipants(int eventId) throws IOException {
        super.printUsers(eventId);
    }
}
