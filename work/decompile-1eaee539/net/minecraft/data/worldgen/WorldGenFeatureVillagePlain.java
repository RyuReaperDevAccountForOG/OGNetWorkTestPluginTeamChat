package net.minecraft.data.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.VillagePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.pools.WorldGenFeatureDefinedStructurePoolStructure;
import net.minecraft.world.level.levelgen.structure.pools.WorldGenFeatureDefinedStructurePoolTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorList;

public class WorldGenFeatureVillagePlain {

    public static final ResourceKey<WorldGenFeatureDefinedStructurePoolTemplate> START = WorldGenFeaturePieces.createKey("village/plains/town_centers");
    private static final ResourceKey<WorldGenFeatureDefinedStructurePoolTemplate> TERMINATORS_KEY = WorldGenFeaturePieces.createKey("village/plains/terminators");

    public WorldGenFeatureVillagePlain() {}

    public static void bootstrap(BootstrapContext<WorldGenFeatureDefinedStructurePoolTemplate> bootstrapcontext) {
        HolderGetter<PlacedFeature> holdergetter = bootstrapcontext.lookup(Registries.PLACED_FEATURE);
        Holder<PlacedFeature> holder = holdergetter.getOrThrow(VillagePlacements.OAK_VILLAGE);
        Holder<PlacedFeature> holder1 = holdergetter.getOrThrow(VillagePlacements.FLOWER_PLAIN_VILLAGE);
        Holder<PlacedFeature> holder2 = holdergetter.getOrThrow(VillagePlacements.PILE_HAY_VILLAGE);
        HolderGetter<ProcessorList> holdergetter1 = bootstrapcontext.lookup(Registries.PROCESSOR_LIST);
        Holder<ProcessorList> holder3 = holdergetter1.getOrThrow(ProcessorLists.MOSSIFY_10_PERCENT);
        Holder<ProcessorList> holder4 = holdergetter1.getOrThrow(ProcessorLists.MOSSIFY_20_PERCENT);
        Holder<ProcessorList> holder5 = holdergetter1.getOrThrow(ProcessorLists.MOSSIFY_70_PERCENT);
        Holder<ProcessorList> holder6 = holdergetter1.getOrThrow(ProcessorLists.ZOMBIE_PLAINS);
        Holder<ProcessorList> holder7 = holdergetter1.getOrThrow(ProcessorLists.STREET_PLAINS);
        Holder<ProcessorList> holder8 = holdergetter1.getOrThrow(ProcessorLists.FARM_PLAINS);
        HolderGetter<WorldGenFeatureDefinedStructurePoolTemplate> holdergetter2 = bootstrapcontext.lookup(Registries.TEMPLATE_POOL);
        Holder<WorldGenFeatureDefinedStructurePoolTemplate> holder9 = holdergetter2.getOrThrow(WorldGenFeaturePieces.EMPTY);
        Holder<WorldGenFeatureDefinedStructurePoolTemplate> holder10 = holdergetter2.getOrThrow(WorldGenFeatureVillagePlain.TERMINATORS_KEY);

        bootstrapcontext.register(WorldGenFeatureVillagePlain.START, new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/town_centers/plains_fountain_01", holder4), 50), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/town_centers/plains_meeting_point_1", holder4), 50), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/town_centers/plains_meeting_point_2"), 50), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/town_centers/plains_meeting_point_3", holder5), 50), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/town_centers/plains_fountain_01", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/town_centers/plains_meeting_point_1", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/town_centers/plains_meeting_point_2", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/town_centers/plains_meeting_point_3", holder6), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/streets", new WorldGenFeatureDefinedStructurePoolTemplate(holder10, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/corner_01", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/corner_02", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/corner_03", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/straight_01", holder7), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/straight_02", holder7), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/straight_03", holder7), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/straight_04", holder7), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/straight_05", holder7), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/straight_06", holder7), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/crossroad_01", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/crossroad_02", holder7), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/crossroad_03", holder7), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/crossroad_04", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/crossroad_05", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/crossroad_06", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/streets/turn_01", holder7), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/zombie/streets", new WorldGenFeatureDefinedStructurePoolTemplate(holder10, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/corner_01", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/corner_02", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/corner_03", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/straight_01", holder7), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/straight_02", holder7), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/straight_03", holder7), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/straight_04", holder7), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/straight_05", holder7), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/straight_06", holder7), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/crossroad_01", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/crossroad_02", holder7), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/crossroad_03", holder7), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/crossroad_04", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/crossroad_05", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/crossroad_06", holder7), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/streets/turn_01", holder7), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/houses", new WorldGenFeatureDefinedStructurePoolTemplate(holder10, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_2", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_3", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_4", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_5", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_6", holder3), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_7", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_house_8", holder3), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_medium_house_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_medium_house_2", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_big_house_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_butcher_shop_1", holder3), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_butcher_shop_2", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_tool_smith_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_fletcher_house_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_shepherds_house_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_armorer_house_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_fisher_cottage_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_tannery_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_cartographer_1", holder3), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_library_1", holder3), 5), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_library_2", holder3), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_masons_house_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_weaponsmith_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_temple_3", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_temple_4", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_stable_1", holder3), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_stable_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_large_farm_1", holder8), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_farm_1", holder8), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_animal_pen_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_animal_pen_2"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_animal_pen_3"), 5), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_accessory_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_meeting_point_4", holder5), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_meeting_point_5"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.empty(), 10)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/zombie/houses", new WorldGenFeatureDefinedStructurePoolTemplate(holder10, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_2", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_3", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_4", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_5", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_6", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_7", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_small_house_8", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_medium_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_medium_house_2", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_big_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_butcher_shop_1", holder6), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_butcher_shop_2", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_tool_smith_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_fletcher_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_shepherds_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_armorer_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_fisher_cottage_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_tannery_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_cartographer_1", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_library_1", holder6), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_library_2", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_masons_house_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_weaponsmith_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_temple_3", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_temple_4", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_stable_1", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_stable_2", holder6), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_large_farm_1", holder6), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_small_farm_1", holder6), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_animal_pen_1", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/houses/plains_animal_pen_2", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_animal_pen_3", holder6), 5), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_meeting_point_4", holder6), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/houses/plains_meeting_point_5", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.empty(), 10)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        bootstrapcontext.register(WorldGenFeatureVillagePlain.TERMINATORS_KEY, new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/terminators/terminator_01", holder7), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/terminators/terminator_02", holder7), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/terminators/terminator_03", holder7), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/terminators/terminator_04", holder7), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/trees", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/decor", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/plains_lamp_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder1), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder2), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.empty(), 2)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/zombie/decor", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/plains_lamp_1", holder6), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder1), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.feature(holder2), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.empty(), 2)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/villagers", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/villagers/nitwit"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/villagers/baby"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/plains/zombie/villagers", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/villagers/nitwit"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/plains/zombie/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/common/animals", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cows_1"), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/pigs_1"), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/horses_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/horses_2"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/horses_3"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/horses_4"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/horses_5"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/sheep_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/sheep_2"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.empty(), 5)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/common/sheep", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/sheep_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/sheep_2"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/common/cats", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_black"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_british"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_calico"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_persian"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_ragdoll"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_red"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_siamese"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_tabby"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_white"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cat_jellie"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.empty(), 3)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/common/butcher_animals", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/cows_1"), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/pigs_1"), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/sheep_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/animals/sheep_2"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/common/iron_golem", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/iron_golem"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(bootstrapcontext, "village/common/well_bottoms", new WorldGenFeatureDefinedStructurePoolTemplate(holder9, ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.legacy("village/common/well_bottom"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
