package org.gulyaich.rabbit.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AuditRequestListener {

    private final ObjectMapper objectMapper;

    @RabbitListener(queues = "${queues.name.test}")
    public void listen(Object message) {
        log.info("RECEIVED MESSAGE: {}", message);
    }
}
