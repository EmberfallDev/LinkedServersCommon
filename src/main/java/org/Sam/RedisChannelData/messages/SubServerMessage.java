package org.Sam.RedisChannelData.messages;

import org.Sam.ServerStates;

import java.util.List;
import java.util.UUID;

public record SubServerMessage(ServerStates serverState, List<UUID> currentPlayers) {
}
