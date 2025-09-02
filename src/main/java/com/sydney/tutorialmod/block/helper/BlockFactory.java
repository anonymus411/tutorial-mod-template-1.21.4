package com.sydney.tutorialmod.block.helper;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.function.Function;
import java.util.function.Predicate;

public class BlockFactory {
    public static BlockBuilder of(Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return new BlockBuilder(factory, settings);
    }

    public static BlockBuilder of(AbstractBlock.Settings settings) {
        return new BlockBuilder(settings);
    }

    public static BlockBuilder copy(Block block) {
        return new BlockBuilder(block);
    }

    public static BlockBuilder slab(Block baseBlock) {
        return copy(baseBlock).factory(SlabBlock::new);
    }

    public static BlockBuilder stairs(Block baseBlock) {
        return copy(baseBlock).factory(s -> new StairsBlock(baseBlock.getDefaultState(), s));
    }

    public static BlockBuilder wall(Block baseBlock) {
        return copy(baseBlock).factory(WallBlock::new).settings(AbstractBlock.Settings.copyShallow(baseBlock).solid());
    }

    public static BlockBuilder fence(Block baseBlock) {
        return copy(baseBlock).factory(FenceBlock::new).settings(AbstractBlock.Settings.copyShallow(baseBlock));
    }

    public static BlockBuilder fenceGate(Block baseBlock, WoodType woodType) {
        return copy(baseBlock).factory(s -> new FenceGateBlock(woodType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock).solid());
    }

    public static BlockBuilder trapdoor(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new TrapdoorBlock(setType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .strength(3.0f)
                .nonOpaque()
                .allowsSpawning(Blocks::never));
    }

    public static BlockBuilder door(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new DoorBlock(setType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .strength(3.0f)
                .nonOpaque()
                .pistonBehavior(PistonBehavior.DESTROY));
    }

    public static BlockBuilder woodenButton(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new ButtonBlock(setType, 30, s)).settings(AbstractBlock.Settings.create()
                .strength(0.5f)
                .noCollision()
                .pistonBehavior(PistonBehavior.DESTROY)
                .sounds(baseBlock.getDefaultState().getSoundGroup()));
    }

    public static BlockBuilder pressurePlate(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new PressurePlateBlock(setType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .solid()
                .strength(0.5f)
                .pistonBehavior(PistonBehavior.DESTROY)
                .requiresTool()
                .noCollision());
    }

    public static BlockBuilder sign(Block baseBlock, WoodType woodType) {
        return copy(baseBlock).factory(s -> new SignBlock(woodType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .mapColor(baseBlock.getDefaultMapColor())
                .solid()
                .noCollision()
                .strength(1.0F)).noItem();
    }

    public static BlockBuilder wallSign(Block standingSign, WoodType woodType) {
        return copy(standingSign).factory(s -> new WallSignBlock(woodType, s)).settings(AbstractBlock.Settings.copyShallow(standingSign)
                .lootTable(standingSign.getLootTableKey())
                .mapColor(standingSign.getDefaultMapColor())
                .solid()
                .noCollision()
                .strength(1.0F)).noItem();
    }

    public static BlockBuilder hangingSign(Block baseBlock, WoodType woodType, BlockSoundGroup soundGroup) {
        return copy(baseBlock).factory(s -> new HangingSignBlock(woodType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .mapColor(baseBlock.getDefaultMapColor())
                .solid()
                .noCollision()
                .strength(1.0F)
                .sounds(soundGroup)).noItem();
    }

    public static BlockBuilder wallHangingSign(Block standingSign, WoodType woodType, BlockSoundGroup soundGroup) {
        return copy(standingSign).factory(s -> new WallHangingSignBlock(woodType, s)).settings(AbstractBlock.Settings.copyShallow(standingSign)
                .lootTable(standingSign.getLootTableKey())
                .mapColor(standingSign.getDefaultMapColor())
                .solid()
                .noCollision()
                .strength(1.0F)
                .sounds(soundGroup)).noItem();
    }

    public static BlockBuilder log(MapColor woodColor, MapColor barkColor, BlockSoundGroup sounds, boolean flammable) {
        return log(woodColor, sounds, flammable)
                .settings(settings -> settings.mapColor((state) -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? woodColor : barkColor));
    }

    public static BlockBuilder log(MapColor color, BlockSoundGroup sounds, boolean flammable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(color)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sounds(sounds);
        if (flammable) settings.burnable();
        var builder = new BlockBuilder(PillarBlock::new, settings);
        return builder;
    }

    public static BlockBuilder sapling(MapColor mapColor, SaplingGenerator generator) {
        return new BlockBuilder(s -> new SaplingBlock(generator, s), AbstractBlock.Settings.create()
                .mapColor(mapColor)
                .sounds(BlockSoundGroup.GRASS)
                .breakInstantly()
                .noCollision()
                .ticksRandomly()
                .pistonBehavior(PistonBehavior.DESTROY));
    }

    public static BlockBuilder leaves(MapColor mapColor) {
        return new BlockBuilder(s -> new TintedParticleLeavesBlock(0.01f, s), AbstractBlock.Settings.create()
                .mapColor(mapColor)
                .strength(0.2f)
                .ticksRandomly()
                .sounds(BlockSoundGroup.GRASS)
                .nonOpaque()
                .allowsSpawning(Blocks::never)
                .suffocates(Blocks::never)
                .blockVision(Blocks::never)
                .pistonBehavior(PistonBehavior.DESTROY)
                .solidBlock(Blocks::never));
    }

    public static BlockBuilder leaves(MapColor mapColor, BlockSoundGroup soundGroup, float particleChance, ParticleEffect fallingParticle) {
        return new BlockBuilder(s -> new UntintedParticleLeavesBlock(particleChance, fallingParticle, s), AbstractBlock.Settings.create()
                .mapColor(mapColor)
                .strength(0.2f)
                .ticksRandomly()
                .sounds(soundGroup)
                .nonOpaque()
                .burnable()
                .allowsSpawning(Blocks::never)
                .suffocates(Blocks::never)
                .blockVision(Blocks::never)
                .pistonBehavior(PistonBehavior.DESTROY)
                .solidBlock(Blocks::never));




    }

    public static BlockBuilder pot(Block block) {
        return new BlockBuilder(s -> new FlowerPotBlock(block, s), AbstractBlock.Settings.create()
                .breakInstantly()
                .nonOpaque()
                .luminance(state -> block.getDefaultState().getLuminance())
                .pistonBehavior(PistonBehavior.DESTROY));
    }



    public static BlockBuilder fallenLeaves(MapColor color) {
        return fallenLeaves(color, BlockSoundGroup.LEAF_LITTER);
    }

    public static BlockBuilder fallenLeaves(MapColor color, BlockSoundGroup sounds) {
        return new BlockBuilder(LeafLitterBlock::new, AbstractBlock.Settings.create()
                .mapColor(color)
                .replaceable()
                .noCollision()
                .sounds(sounds)
                .pistonBehavior(PistonBehavior.DESTROY)
        );

    }
}


