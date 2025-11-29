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
    
    // Helper method to check if a record matches this message type
    public boolean isOfType(Record record) {
        return recordClass != null && recordClass.isInstance(record);
    }
}