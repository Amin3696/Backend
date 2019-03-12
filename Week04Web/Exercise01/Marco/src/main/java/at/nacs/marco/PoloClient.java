package at.nacs.marco;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class PoloClient {

    private final RestTemplate restTemplate;

    @Value("${message.server.url}")
    private String url;

    public String post(String message) {

        return restTemplate.postForObject(url, message, String.class);
    }
}
