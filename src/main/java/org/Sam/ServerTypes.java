package org.Sam;

public enum ServerTypes {
    HUB(100),
    SURVIVAL(50),
    SKYWARS(12);

    private final int maxPlayers;

    ServerTypes(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
