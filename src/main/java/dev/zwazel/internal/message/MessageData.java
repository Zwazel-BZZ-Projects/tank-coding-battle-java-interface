package dev.zwazel.internal.message;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import dev.zwazel.internal.InternalGameWorld;
import dev.zwazel.internal.message.data.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "message_type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GameState.class),
        @JsonSubTypes.Type(value = FirstContact.class),
        @JsonSubTypes.Type(value = SimpleTextMessage.class),
        @JsonSubTypes.Type(value = MessageError.class),
        @JsonSubTypes.Type(value = GameConfig.class),
        @JsonSubTypes.Type(value = SuccessfullyJoinedLobby.class),
        @JsonSubTypes.Type(value = StartGameConfig.class),
})
public interface MessageData {
    /**
     * Applies to the world when received
     * @param world
     * @return if true, we add it to the Input Queue, so Bots can read them. If false, we don't.
     */
    default boolean applyOnReceive(InternalGameWorld world) {
        return true;
    }
}
