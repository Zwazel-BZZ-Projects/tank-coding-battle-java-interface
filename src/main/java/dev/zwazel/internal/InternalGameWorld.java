package dev.zwazel.internal;

import dev.zwazel.bot.BotInterface;
import dev.zwazel.internal.connection.ConnectionManager;
import dev.zwazel.internal.messages.MessageContainer;
import dev.zwazel.internal.messages.data.GameState;

import java.util.Optional;

public interface InternalGameWorld {
    void stop();

    PublicGameWorld getPublicGameWorld();

    ConnectionManager getConnectionManager();

    BotInterface getBot();

    Optional<MessageContainer> pollOutgoingMessage();

    void pushIncomingMessage(MessageContainer message);

    void updateState(GameState newState);
}
