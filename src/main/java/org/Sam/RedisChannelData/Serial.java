package org.Sam.RedisChannelData;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serial {


    private static final ObjectMapper MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    // Serialize a StartupMessage to JSON
    public static String toStartupJson(StartupMessage message) {
        try {
            return MAPPER.writeValueAsString(message);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize StartupMessage to JSON", e);
        }
    }

    // Deserialize JSON to StartupMessage
    public static StartupMessage fromStartupJson(String json) {
        try {
            return MAPPER.readValue(json, StartupMessage.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize JSON to StartupMessage", e);
        }
    }

}
