package domain.commands.handlers;

import java.util.UUID;

public abstract class Result {

    private UUID inventoryItemId;

    public Result(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
}
