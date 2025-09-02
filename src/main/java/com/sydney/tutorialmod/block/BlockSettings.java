package com.sydney.tutorialmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;

public class BlockSettings {

    public static AbstractBlock.Settings planks(MapColor color, BlockSoundGroup sounds, boolean flammable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(color)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0f, 3.0f)
                .sounds(sounds);
        if (flammable) settings.burnable();
        return settings;
    }
}