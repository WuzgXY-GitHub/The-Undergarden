package quek.undergarden.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import quek.undergarden.Undergarden;

public class UGSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Undergarden.MODID);

    public static final RegistryObject<SoundEvent> UNDERGARDEN_AMBIENCE = register("ambient.undergarden_ambience");
    public static final RegistryObject<SoundEvent> ABYSS_AMBIENCE = register("ambient.abyss_ambience");
    public static final RegistryObject<SoundEvent> SPIRES_AMBIENCE = register("ambient.spires_ambience");
    public static final RegistryObject<SoundEvent> FROST_AMBIENCE = register("ambient.frost_ambience");

    public static final RegistryObject<SoundEvent> ABYSS_AMBIENT_ADDITION = register("ambient.abyss_addition");
    public static final RegistryObject<SoundEvent> BOG_AMBIENT_ADDITION = register("ambient.bog_addition");
    public static final RegistryObject<SoundEvent> FIELDS_AMBIENT_ADDITION = register("ambient.fields_addition");
    public static final RegistryObject<SoundEvent> FOREST_AMBIENT_ADDITION = register("ambient.forest_addition");
    public static final RegistryObject<SoundEvent> GRONGLE_AMBIENT_ADDITION = register("ambient.grongle_addition");
    public static final RegistryObject<SoundEvent> FROSTFIELDS_AMBIENT_ADDITION = register("ambient.frostfields_addition");
    public static final RegistryObject<SoundEvent> SPIRES_AMBIENT_ADDITION = register("ambient.spires_addition");

    public static final RegistryObject<SoundEvent> ABYSS_MOOD = register("ambient.abyss_mood");

    public static final RegistryObject<SoundEvent> UNDERGARDEN_MUSIC = register("music.undergarden_music");

    public static final RegistryObject<SoundEvent> MAMMOTH_DISC = register("music.disc.mammoth");
    public static final RegistryObject<SoundEvent> LIMAX_MAXIMUS_DISC = register("music.disc.limax_maximus");
    public static final RegistryObject<SoundEvent> RELICT_DISC = register("music.disc.relict");
    public static final RegistryObject<SoundEvent> GLOOMPER_ANTHEM_DISC = register("music.disc.gloomper_anthem");
    public static final RegistryObject<SoundEvent> GLOOMPER_SECRET_DISC = register("music.disc.gloomper_secret");

    public static final RegistryObject<SoundEvent> UNDERGARDEN_PORTAL_AMBIENT = register("block.undergarden_portal_ambient");
    public static final RegistryObject<SoundEvent> UNDERGARDEN_PORTAL_ACTIVATE = register("block.undergarden_portal_activate");
    public static final RegistryObject<SoundEvent> UNDERGARDEN_PORTAL_TRAVEL = register("block.undergarden_portal_travel");

    public static final RegistryObject<SoundEvent> BLISTERBOMB_THROW = register("item.blisterbomb");

    public static final RegistryObject<SoundEvent> SLINGSHOT_SHOOT = register("item.slingshot_shoot");
    public static final RegistryObject<SoundEvent> SLINGSHOT_DRAW = register("item.slingshot_draw");

    public static final RegistryObject<SoundEvent> DWELLER_AMBIENT = register("entity.dweller_ambient");
    public static final RegistryObject<SoundEvent> DWELLER_HURT = register("entity.dweller_hurt");
    public static final RegistryObject<SoundEvent> DWELLER_DEATH = register("entity.dweller_death");

    public static final RegistryObject<SoundEvent> ROTWALKER_AMBIENT = register("entity.rotwalker_ambient");
    public static final RegistryObject<SoundEvent> ROTWALKER_HURT = register("entity.rotwalker_hurt");
    public static final RegistryObject<SoundEvent> ROTWALKER_DEATH = register("entity.rotwalker_death");

    public static final RegistryObject<SoundEvent> ROTBEAST_AMBIENT = register("entity.rotbeast_ambient");
    public static final RegistryObject<SoundEvent> ROTBEAST_HURT = register("entity.rotbeast_hurt");
    public static final RegistryObject<SoundEvent> ROTBEAST_DEATH = register("entity.rotbeast_death");

    public static final RegistryObject<SoundEvent> BRUTE_AMBIENT = register("entity.brute_ambient");
    public static final RegistryObject<SoundEvent> BRUTE_HURT = register("entity.brute_hurt");
    public static final RegistryObject<SoundEvent> BRUTE_DEATH = register("entity.brute_death");
    public static final RegistryObject<SoundEvent> BRUTE_ANGRY = register("entity.brute_angry");

    public static final RegistryObject<SoundEvent> GLOOMPER_AMBIENT = register("entity.gloomper_ambient");
    public static final RegistryObject<SoundEvent> GLOOMPER_HURT = register("entity.gloomper_hurt");
    public static final RegistryObject<SoundEvent> GLOOMPER_DEATH = register("entity.gloomper_death");
    public static final RegistryObject<SoundEvent> GLOOMPER_HOP = register("entity.gloomper_hop");
    public static final RegistryObject<SoundEvent> GLOOMPER_FART = register("entity.gloomper_fart");

    public static final RegistryObject<SoundEvent> STONEBORN_STEP = register("entity.stoneborn_step");
    public static final RegistryObject<SoundEvent> STONEBORN_SPEAKING = register("entity.stoneborn_speaking");
    public static final RegistryObject<SoundEvent> STONEBORN_PLEASED = register("entity.stoneborn_pleased");
    public static final RegistryObject<SoundEvent> STONEBORN_HURT = register("entity.stoneborn_hurt");
    public static final RegistryObject<SoundEvent> STONEBORN_ANGRY = register("entity.stoneborn_angry");
    public static final RegistryObject<SoundEvent> STONEBORN_CONFUSED = register("entity.stoneborn_confused");
    public static final RegistryObject<SoundEvent> STONEBORN_CHANT = register("entity.stoneborn_chant");
    public static final RegistryObject<SoundEvent> STONEBORN_DEATH = register("entity.stoneborn_death");

    public static final RegistryObject<SoundEvent> ROTLING_AMBIENT = register("entity.rotling_ambient");
    public static final RegistryObject<SoundEvent> ROTLING_HURT = register("entity.rotling_hurt");
    public static final RegistryObject<SoundEvent> ROTLING_DEATH = register("entity.rotling_death");

    public static final RegistryObject<SoundEvent> FORGOTTEN_GUARDIAN_ambient = register("entity.forgotten_guardian_ambient");
    public static final RegistryObject<SoundEvent> FORGOTTEN_GUARDIAN_HURT = register("entity.forgotten_guardian_hurt");
    public static final RegistryObject<SoundEvent> FORGOTTEN_GUARDIAN_DEATH = register("entity.forgotten_guardian_death");
    public static final RegistryObject<SoundEvent> FORGOTTEN_GUARDIAN_ATTACK = register("entity.forgotten_guardian_attack");
    public static final RegistryObject<SoundEvent> FORGOTTEN_GUARDIAN_DEFLECT = register("entity.forgotten_guardian_deflect");
    public static final RegistryObject<SoundEvent> FORGOTTEN_GUARDIAN_STEP = register("entity.forgotten_guardian_step");

    public static final RegistryObject<SoundEvent> MINION_SHOOT = register("entity.minion_shoot");
    public static final RegistryObject<SoundEvent> MINION_DEATH = register("entity.minion_death");

    public static final RegistryObject<SoundEvent> NARGOYLE_HURT = register("entity.nargoyle_hurt");
    public static final RegistryObject<SoundEvent> NARGOYLE_DEATH = register("entity.nargoyle_death");
    public static final RegistryObject<SoundEvent> NARGOYLE_ATTACK = register("entity.nargoyle_attack");

    public static final RegistryObject<SoundEvent> MUNCHER_AMBIENT = register("entity.muncher_ambient");
    public static final RegistryObject<SoundEvent> MUNCHER_HURT = register("entity.muncher_hurt");
    public static final RegistryObject<SoundEvent> MUNCHER_DEATH = register("entity.muncher_death");
    public static final RegistryObject<SoundEvent> MUNCHER_CHEW = register("entity.muncher_chew");

    public static final RegistryObject<SoundEvent> SPLOOGIE_AMBIENT = register("entity.sploogie_ambient");
    public static final RegistryObject<SoundEvent> SPLOOGIE_HURT = register("entity.sploogie_hurt");
    public static final RegistryObject<SoundEvent> SPLOOGIE_DEATH = register("entity.sploogie_death");
    public static final RegistryObject<SoundEvent> SPLOOGIE_SPIT = register("entity.sploogie_spit");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Undergarden.MODID, name)));
    }
}