package in.projecteka.fidelius.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class HealthController {

    @GetMapping(value = "/health", produces = "application/json")
    public ResponseEntity<HealthResponse> health() {
        return ResponseEntity.ok(new HealthResponse(
                true,
                "Encryption Decryption service is working!!!!",
                Collections.emptyMap()
        ));
    }
}
