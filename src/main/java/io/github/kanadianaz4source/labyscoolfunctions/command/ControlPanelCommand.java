package io.github.kanadianaz4source.labyscoolfunctions.command;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

/**
 * ControlPanelCommand.java
 * A comprehensive command control panel for Minecraft 1.21.4
 * Provides access to various command categories and utilities
 *
 * @author kanadianaz4-source
 * @version 1.0
 * @since 2025-12-24
 */
public class ControlPanelCommand {

    private final ServerPlayer player;

    /**
     * Constructor for ControlPanelCommand
     *
     * @param player The ServerPlayer executing the command
     */
    public ControlPanelCommand(ServerPlayer player) {
        this.player = player;
    }

    /**
     * Displays the main menu with all available command categories
     */
    public void showMainMenu() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lLaby's Cool Functions - Main Menu"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b1. §aPlayer Commands"), false);
        player.displayClientMessage(Component.literal("§b2. §aGameplay Commands"), false);
        player.displayClientMessage(Component.literal("§b3. §aWorld & Blocks Commands"), false);
        player.displayClientMessage(Component.literal("§b4. §aItems & Inventory Commands"), false);
        player.displayClientMessage(Component.literal("§b5. §aEntities Commands"), false);
        player.displayClientMessage(Component.literal("§b6. §aTeams & Chat Commands"), false);
        player.displayClientMessage(Component.literal("§b7. §aSound & Particles Commands"), false);
        player.displayClientMessage(Component.literal("§b8. §aData & Execute Commands"), false);
        player.displayClientMessage(Component.literal("§b9. §aFunctions & Datapacks Commands"), false);
        player.displayClientMessage(Component.literal("§b10. §aServer Management Commands"), false);
        player.displayClientMessage(Component.literal("§b11. §aDebugging & Info Commands"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Player Commands category menu
     */
    public void showPlayerCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lPlayer Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/gamemode <mode> §7[player] - §aChange game mode"), false);
        player.displayClientMessage(Component.literal("§b/give <player> <item> §7[count] - §aGive player items"), false);
        player.displayClientMessage(Component.literal("§b/effect give <player> <effect> §7[duration] [amplifier] - §aApply effects"), false);
        player.displayClientMessage(Component.literal("§b/tp <player> <x> <y> <z> - §aTeleport player"), false);
        player.displayClientMessage(Component.literal("§b/xp add <player> <amount> §7[points|levels] - §aAdd experience"), false);
        player.displayClientMessage(Component.literal("§b/health §7[set|add|remove] <amount> - §aModify health"), false);
        player.displayClientMessage(Component.literal("§b/hunger §7[set|add|remove] <amount> - §aModify hunger"), false);
        player.displayClientMessage(Component.literal("§b/attribute <player> <attribute> <operation> <value> - §aModify attributes"), false);
        player.displayClientMessage(Component.literal("§b/advancement §7[grant|revoke] <player> <advancement> - §aManage advancements"), false);
        player.displayClientMessage(Component.literal("§b/ban <player> §7[reason] - §aBan player from server"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Gameplay Commands category menu
     */
    public void showGameplayCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lGameplay Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/difficulty <level> - §aSet world difficulty"), false);
        player.displayClientMessage(Component.literal("§b/gamerule <rule> §7[value] - §aModify gamerules"), false);
        player.displayClientMessage(Component.literal("§b/time set <time|day|night|sunrise|sunset> - §aSet time of day"), false);
        player.displayClientMessage(Component.literal("§b/weather <clear|rain|thunder> §7[duration] - §aChange weather"), false);
        player.displayClientMessage(Component.literal("§b/worldborder §7[set|center|damage|warning] <value> - §aManage world border"), false);
        player.displayClientMessage(Component.literal("§b/spawnpoint §7[player] [x] [y] [z] - §aSet spawn point"), false);
        player.displayClientMessage(Component.literal("§b/setworldspawn §7[x] [y] [z] [angle] - §aSet world spawn"), false);
        player.displayClientMessage(Component.literal("§b/seed - §aDisplay world seed"), false);
        player.displayClientMessage(Component.literal("§b/fill <x1> <y1> <z1> <x2> <y2> <z2> <block> - §aFill area with blocks"), false);
        player.displayClientMessage(Component.literal("§b/clone <x1> <y1> <z1> <x2> <y2> <z2> <x> <y> <z> - §aClone region"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the World & Blocks Commands category menu
     */
    public void showWorldBlocksCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lWorld & Blocks Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/setblock <x> <y> <z> <block> - §aPlace a single block"), false);
        player.displayClientMessage(Component.literal("§b/fill <x1> <y1> <z1> <x2> <y2> <z2> <block> - §aFill area with block"), false);
        player.displayClientMessage(Component.literal("§b/clone <x1> <y1> <z1> <x2> <y2> <z2> <x> <y> <z> - §aClone blocks"), false);
        player.displayClientMessage(Component.literal("§b/structure save <name> <x1> <y1> <z1> <x2> <y2> <z2> - §aSave structure"), false);
        player.displayClientMessage(Component.literal("§b/structure load <name> <x> <y> <z> - §aLoad structure"), false);
        player.displayClientMessage(Component.literal("§b/place feature <feature> - §aPlace feature at location"), false);
        player.displayClientMessage(Component.literal("§b/locate <structure|biome> <name> - §aLocate structures or biomes"), false);
        player.displayClientMessage(Component.literal("§b/forceload add|remove <x1> <z1> §7[x2] [z2] - §aForce chunk loading"), false);
        player.displayClientMessage(Component.literal("§b/debug rebuild - §aRebuild chunks"), false);
        player.displayClientMessage(Component.literal("§b/worldborder center <x> <z> - §aSet world border center"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Items & Inventory Commands category menu
     */
    public void showItemsInventoryCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lItems & Inventory Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/give <player> <item> §7[count] [nbt] - §aGive items"), false);
        player.displayClientMessage(Component.literal("§b/clear §7[player] [item] [maxCount] - §aClear inventory"), false);
        player.displayClientMessage(Component.literal("§b/item replace entity <entity> <slot> with <item> - §aReplace items in entity"), false);
        player.displayClientMessage(Component.literal("§b/loot give <player> loot <loot_table> - §aGive loot"), false);
        player.displayClientMessage(Component.literal("§b/item modify entity <entity> <slot> <modifier> - §aModify item properties"), false);
        player.displayClientMessage(Component.literal("§b/enchant <player> <enchantment> §7[level] - §aEnchant items"), false);
        player.displayClientMessage(Component.literal("§b/repair - §aRepair held item"), false);
        player.displayClientMessage(Component.literal("§b/itemname <name> - §aName held item"), false);
        player.displayClientMessage(Component.literal("§b/itemnbtdata - §aView NBT data of item"), false);
        player.displayClientMessage(Component.literal("§b/dropitem [amount] - §aDrop items"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Entities Commands category menu
     */
    public void showEntitiesCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lEntities Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/summon <entity> §7[x] [y] [z] [nbt] - §aSummon entity"), false);
        player.displayClientMessage(Component.literal("§b/kill §7[entity] - §aKill entity"), false);
        player.displayClientMessage(Component.literal("§b/tp <entity> <x> <y> <z> - §aTeleport entity"), false);
        player.displayClientMessage(Component.literal("§b/data modify entity <entity> <path> - §aModify entity data"), false);
        player.displayClientMessage(Component.literal("§b/attribute <entity> <attribute> base set <value> - §aModify entity attributes"), false);
        player.displayClientMessage(Component.literal("§b/ride mount <entity1> <entity2> - §aMount entities"), false);
        player.displayClientMessage(Component.literal("§b/ride dismount - §aDismount from entity"), false);
        player.displayClientMessage(Component.literal("§b/entitydata <entity> - §aView entity NBT data"), false);
        player.displayClientMessage(Component.literal("§b/projectile <type> - §aShoot projectile"), false);
        player.displayClientMessage(Component.literal("§b/leash <entity> - §aLeash entity"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Teams & Chat Commands category menu
     */
    public void showTeamsChatCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lTeams & Chat Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/team create <team> §7[color|'{'color':value'}'] - §aCreate team"), false);
        player.displayClientMessage(Component.literal("§b/team remove <team> - §aRemove team"), false);
        player.displayClientMessage(Component.literal("§b/team join <team> §7[member] - §aAdd member to team"), false);
        player.displayClientMessage(Component.literal("§b/team leave §7[member] - §aRemove member from team"), false);
        player.displayClientMessage(Component.literal("§b/team option <team> <option> <value> - §aSet team options"), false);
        player.displayClientMessage(Component.literal("§b/team list §7[team] - §aList teams"), false);
        player.displayClientMessage(Component.literal("§b/say <message> - §aBroadcast message"), false);
        player.displayClientMessage(Component.literal("§b/msg <player> <message> - §aPrivate message"), false);
        player.displayClientMessage(Component.literal("§b/discord - §aLink Discord account"), false);
        player.displayClientMessage(Component.literal("§b/nickname <name> - §aSet display name"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Sound & Particles Commands category menu
     */
    public void showSoundParticlesCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lSound & Particles Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/playsound <sound> <source> §7[player] [x] [y] [z] [volume] [pitch] - §aPlay sound"), false);
        player.displayClientMessage(Component.literal("§b/stopsound §7[player] [source] [sound] - §aStop sound"), false);
        player.displayClientMessage(Component.literal("§b/particle <particle> <x> <y> <z> §7[dx] [dy] [dz] [speed] [count] - §aDisplay particles"), false);
        player.displayClientMessage(Component.literal("§b/effect give <player> <effect> §7[duration] [amplifier] - §aApply effect"), false);
        player.displayClientMessage(Component.literal("§b/effect clear <player> §7[effect] - §aClear effect"), false);
        player.displayClientMessage(Component.literal("§b/title <player> title|subtitle|actionbar <message> - §aDisplay title"), false);
        player.displayClientMessage(Component.literal("§b/titleanim <player> - §aDisplay title animation"), false);
        player.displayClientMessage(Component.literal("§b/ambientmusic - §aControl ambient music"), false);
        player.displayClientMessage(Component.literal("§b/bonemeal - §aUse bone meal effect"), false);
        player.displayClientMessage(Component.literal("§b/nether_portal_effect - §aDisplay nether portal effect"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Data & Execute Commands category menu
     */
    public void showDataExecuteCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lData & Execute Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/data get entity <entity> §7[path] - §aRead entity data"), false);
        player.displayClientMessage(Component.literal("§b/data get block <x> <y> <z> §7[path] - §aRead block data"), false);
        player.displayClientMessage(Component.literal("§b/data modify entity <entity> <path> <operation> <value> - §aModify entity data"), false);
        player.displayClientMessage(Component.literal("§b/data modify block <x> <y> <z> <path> <operation> <value> - §aModify block data"), false);
        player.displayClientMessage(Component.literal("§b/data remove entity <entity> <path> - §aRemove entity data"), false);
        player.displayClientMessage(Component.literal("§b/data remove block <x> <y> <z> <path> - §aRemove block data"), false);
        player.displayClientMessage(Component.literal("§b/execute as <target> run <command> - §aExecute as entity"), false);
        player.displayClientMessage(Component.literal("§b/execute at <target> run <command> - §aExecute at position"), false);
        player.displayClientMessage(Component.literal("§b/execute if <condition> run <command> - §aConditional execution"), false);
        player.displayClientMessage(Component.literal("§b/execute store result <target> <path> <type> <scale> run <command> - §aStore command result"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Functions & Datapacks Commands category menu
     */
    public void showFunctionsDatapacksCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lFunctions & Datapacks Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/function <namespace:path> - §aExecute function"), false);
        player.displayClientMessage(Component.literal("§b/function <namespace:path> with storage - §aExecute with parameters"), false);
        player.displayClientMessage(Component.literal("§b/datapack list [available|enabled] - §aList datapacks"), false);
        player.displayClientMessage(Component.literal("§b/datapack enable <datapack> - §aEnable datapack"), false);
        player.displayClientMessage(Component.literal("§b/datapack disable <datapack> - §aDisable datapack"), false);
        player.displayClientMessage(Component.literal("§b/reload - §aReload datapacks"), false);
        player.displayClientMessage(Component.literal("§b/schedule function <function> <time> - §aSchedule function"), false);
        player.displayClientMessage(Component.literal("§b/schedule clear <function> - §aClear scheduled function"), false);
        player.displayClientMessage(Component.literal("§b/scoreboard - §aManage scoreboards"), false);
        player.displayClientMessage(Component.literal("§b/bossbar create <id> <name> - §aCreate boss bar"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Server Management Commands category menu
     */
    public void showServerManagementCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lServer Management Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/op <player> - §aGrant operator status"), false);
        player.displayClientMessage(Component.literal("§b/deop <player> - §aRevoke operator status"), false);
        player.displayClientMessage(Component.literal("§b/ban <player> §7[reason] - §aBan player"), false);
        player.displayClientMessage(Component.literal("§b/ban-ip <ip|player> §7[reason] - §aBan IP address"), false);
        player.displayClientMessage(Component.literal("§b/pardon <player> - §aUnban player"), false);
        player.displayClientMessage(Component.literal("§b/pardon-ip <ip> - §aUnban IP address"), false);
        player.displayClientMessage(Component.literal("§b/kick <player> §7[reason] - §aKick player from server"), false);
        player.displayClientMessage(Component.literal("§b/save-all - §aSave world"), false);
        player.displayClientMessage(Component.literal("§b/stop - §aStop server"), false);
        player.displayClientMessage(Component.literal("§b/whitelist <add|remove|on|off> §7[player] - §aManage whitelist"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Displays the Debugging & Info Commands category menu
     */
    public void showDebuggingInfoCommands() {
        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal("§d§lDebugging & Info Commands"), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);

        player.displayClientMessage(Component.literal("§b/seed - §aDisplay world seed"), false);
        player.displayClientMessage(Component.literal("§b/serverinfo - §aDisplay server information"), false);
        player.displayClientMessage(Component.literal("§b/locate <structure|biome> <name> - §aLocate features"), false);
        player.displayClientMessage(Component.literal("§b/list - §aList online players"), false);
        player.displayClientMessage(Component.literal("§b/where - §aDisplay current location"), false);
        player.displayClientMessage(Component.literal("§b/playerdata <player> - §aView player data"), false);
        player.displayClientMessage(Component.literal("§b/nbtdata - §aView NBT data"), false);
        player.displayClientMessage(Component.literal("§b/debug start|stop - §aStart/stop debug profiler"), false);
        player.displayClientMessage(Component.literal("§b/debug report - §aGenerate debug report"), false);
        player.displayClientMessage(Component.literal("§b/time query day|daytime|gametime - §aQuery time information"), false);

        player.displayClientMessage(Component.literal(""), false);
        player.displayClientMessage(Component.literal("§6§l═══════════════════════════════════════════════════════"), false);
        player.displayClientMessage(Component.literal(""), false);
    }

    /**
     * Gets the ServerPlayer executing the command
     *
     * @return The ServerPlayer instance
     */
    public ServerPlayer getPlayer() {
        return this.player;
    }
}
