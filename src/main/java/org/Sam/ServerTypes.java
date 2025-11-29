package org.Sam;

public enum ServerTypes {
    /**
     * Auth in this context means only specific players who reserved a slot can join
     */
    HUB(100, false),
    SURVIVAL(50, false),
    SKYWARS(12,true);

    private final int maxPlayers;
    private final boolean requireAuth;

    ServerTypes(int maxPlayers, boolean requireAuth) {
        this.maxPlayers = maxPlayers;
        this.requireAuth = requireAuth;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public boolean getRequireAuth() {
        return requireAuth;
    }
}
