package com.example.addon.modules;

import com.example.addon.DaltonUtils;
import java.util.ArrayList;
import java.util.List;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.movement.Scaffold;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

public class Daltonraum extends Module {
    public Daltonraum() {
        super(DaltonUtils.CATEGORY, "Daltonraum", "description");
    }

    @Override
    public void onActivate() {
    }
}
