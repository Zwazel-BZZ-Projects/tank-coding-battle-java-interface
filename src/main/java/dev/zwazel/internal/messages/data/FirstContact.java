package dev.zwazel.internal.messages.data;

import com.fasterxml.jackson.annotation.JsonTypeName;
import dev.zwazel.internal.InternalGameWorld;
import dev.zwazel.internal.messages.MessageData;
import lombok.Builder;

@JsonTypeName("FIRST_CONTACT")
@Builder
public record FirstContact(String name, String lobby_id) implements MessageData {
    @Override
    public void applyOnReceive(InternalGameWorld internalWorld) {

    }
}
