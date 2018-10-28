package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class NotificationService {

    @Value("${echoServerUrl}")
    private String echoServerUrl;

    public Notification notify(Notification notification) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(notification.toMap(), headers);

        return new RestTemplate().postForObject(echoServerUrl, request , Notification.class);
    }
}
