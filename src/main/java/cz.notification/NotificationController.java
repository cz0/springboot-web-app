package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("/notification")
    Notification notify(@RequestBody Notification notification) {
        return notificationService.notify(notification);
    }
}
