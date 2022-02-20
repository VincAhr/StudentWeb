package de.neuefische.studentweb.githubcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {
    public Repository[] getRepositories(String gitHubUser) {

        // Ermitteln der Daten von GitHub. Dafür wird die URL aufgebaut und mit Hilfe des RestTemplates ein get-request
        // an die GitHub API geschickt.
        // Als Response-Body erwarte ich ein Array von Repository Objekten. Die Klasse Repository habe ich selber
        // geschrieben. Sie beinhaltet nur ein Attribute name und getter und setter. Alle anderen Properties in der
        // Response von GitHub interessieren mich nicht.
        String url = "https://api.github.com/users/" + gitHubUser + "/repos";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Repository[]> response = restTemplate.getForEntity(url, Repository[].class);

        // Ich hole mir den Response-Body aus der Response von GitHub.
        return response.getBody();

    }
}