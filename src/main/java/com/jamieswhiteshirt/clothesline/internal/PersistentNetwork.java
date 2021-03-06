package com.jamieswhiteshirt.clothesline.internal;

import com.jamieswhiteshirt.clothesline.api.NetworkState;

import java.util.UUID;

public final class PersistentNetwork {
    private final UUID uuid;
    private final NetworkState state;

    public PersistentNetwork(UUID uuid, NetworkState state) {
        this.uuid = uuid;
        this.state = state;
    }

    public UUID getUuid() {
        return uuid;
    }

    public NetworkState getState() {
        return state;
    }
}
