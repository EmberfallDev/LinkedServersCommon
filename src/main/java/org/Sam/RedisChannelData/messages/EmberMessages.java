package org.Sam.RedisChannelData.messages;

import org.Sam.RedisChannelData.messages.mainServerMessages.UpdateAuthPlayers;
import org.Sam.RedisChannelData.messages.subServerMessages.UpdateConnectedPlayers;
import org.Sam.RedisChannelData.messages.subServerMessages.UpdateServerState;

public enum EmberMessages {
    STARTUP_MESSAGE(StartupMessage.class),
    UPDATE_SERVER_STATE(UpdateServerState.class),
    UPDATE_CONNECTED_PLAYERS(UpdateConnectedPlayers.class),
    UPDATE_AUTH_PLAYERS(UpdateAuthPlayers.class);

    private final Class<? extends Record> recordClass;
    
    EmberMessages(Class<? extends Record> recordClass) {
        this.recordClass = recordClass;
    }
    
    public Class<? extends Record> getRecordClass() {
        return recordClass;
    }

    public boolean isOfType(Record record) {
        return recordClass != null && recordClass.isInstance(record);
    }

    /**
     * Find the EmberMessage type for a given record instance
     * @param record the record to find the message type for
     * @return the corresponding EmberMessages enum value, or null if not found
     */
    public static EmberMessages fromRecord(Record record) {
        for (EmberMessages msg : EmberMessages.values()) {
            if (msg.isOfType(record)) {
                return msg;
            }
        }
        return null;
    }
}