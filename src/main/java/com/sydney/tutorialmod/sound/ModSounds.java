package com.sydney.tutorialmod.sound;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {


    public static final SoundEvent HEAVY1 = registerSoundEvent("heavy1");
    public static final SoundEvent HEAVY2 = registerSoundEvent("heavy2");
    public static final SoundEvent HEAVY3 = registerSoundEvent("heavy3");
    public static final SoundEvent HEAVY4 = registerSoundEvent("heavy4");


    public static final SoundEvent LIGHT1 = registerSoundEvent("light1");
    public static final SoundEvent LIGHT2 = registerSoundEvent("light2");
    public static final SoundEvent LIGHT3 = registerSoundEvent("light3");
    public static final SoundEvent LIGHT4 = registerSoundEvent("light4");

    public static final BlockSoundGroup SILT_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
           HEAVY1,HEAVY2,HEAVY3,HEAVY4,LIGHT1);





    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TutorialMod.LOGGER.info("Registering Mod Sounds for " + TutorialMod.MOD_ID);
    }
}


