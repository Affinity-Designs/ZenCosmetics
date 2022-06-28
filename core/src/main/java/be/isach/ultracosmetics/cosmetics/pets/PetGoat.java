package be.isach.ultracosmetics.cosmetics.pets;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.cosmetics.type.PetType;
import be.isach.ultracosmetics.player.UltraPlayer;
import com.cryptomorin.xseries.XMaterial;

/**
 * Represents an instance of a goat pet summoned by a player.
 *
 * @author Chris6ix
 * @since 18-01-2022
 */

public class PetGoat extends Pet {
    public PetGoat(UltraPlayer owner, UltraCosmetics ultraCosmetics) {
        super(owner, ultraCosmetics, PetType.getByName("goat"), XMaterial.GOAT_HORN);
    }
}
