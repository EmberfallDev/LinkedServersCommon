package org.Sam.RedisChannelData.messages;

import java.util.List;
import java.util.UUID;

public record MainServerMessage(List<UUID> authedPlayers) {
}
