package dev.zwazel.internal.messages.data;

import dev.zwazel.internal.InternalGameWorld;
import dev.zwazel.internal.messages.MessageData;

public record GameState(Long tick) implements MessageData {

    @Override
    public void applyOnReceive(InternalGameWorld internalWorld) {
        internalWorld.updateState(this);
    }
}
