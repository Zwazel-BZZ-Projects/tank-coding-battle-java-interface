package dev.zwazel.internal.game.tank.implemented;

import dev.zwazel.internal.game.tank.ILightTank;

public class LightTank implements ILightTank {
    @Override
    public String getTankType() {
        return "LIGHT_TANK";
    }
}
