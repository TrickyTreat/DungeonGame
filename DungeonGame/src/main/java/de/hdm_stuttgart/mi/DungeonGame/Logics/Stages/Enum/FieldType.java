/*
 * FieldTypes.java
 *
 * List of all possible FieldTypes.
 *
 * author: Sascha W.
 * last edit / by: 2019-12-13 / Sascha W.
 */
package de.hdm_stuttgart.mi.DungeonGame.Logics.Stages.Enum;

//Import statements

/**
 * List of usable FieldTypes (Wall, Water, ...).
 */
public enum FieldType {
    /**
     * Wall is a FiledType which shapes the basic shape of the Field and creates simple walls to interfere with the players path.
     */
    Wall(false),

    /**
     * Floor is a FieldType on which the player is able to move to reach his goal.
     */
    Floor(true),

    /**
     * Water is a FieldType which creates another interference for the player.
     * Only used in prebuild Fields.
     */
    Water(false),

    /**
     * Door is a FieldType which is accessible and leads to a Field change.
     */
    Door(true),

    /**
     * Stairs are a FieldType which are accessible and are leading to a Field change.
     */
    Stairs(true);

    /**
     * Adding a boolean to check the FieldTypes accessibility.
     */
    private final boolean walkable;

    /**
     * Constructor to add a parameter.
     *
     * @param walkable setting if its possible to walk on this particular FieldType.
     */
    private FieldType(boolean walkable){
        this.walkable = walkable;
    }
}