package de.neuefische.studentweb.githubcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/github")
public class GitHubController {

    private final GitHubService gitHubService;

    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/{gitHubUser}")
    public String[] getRepositoryNames(@PathVariable("gitHubUser") String gitHubUser) {

        Repository[] repositories = (Repository[]) gitHubService.getRepositories(gitHubUser); //TODO warum muss hier gecastet werden??

        // Ich iteriere über die Repository Objecte aus der Response von GitHub und speichere den Namen im Array
        // repositoryNames. Das Array wird dann auch returned.
        return Arrays.stream(repositories)
                .map(Repository::getName)
                .toArray(String[]::new);
    }

}
