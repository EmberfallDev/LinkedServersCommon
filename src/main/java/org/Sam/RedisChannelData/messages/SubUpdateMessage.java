package org.Sam.RedisChannelData.messages;

import org.Sam.ServerStates;

import java.util.List;
import java.util.UUID;

public record SubUpdateMessage(ServerStates serverState, List<UUID> currentPlayers) {
}
