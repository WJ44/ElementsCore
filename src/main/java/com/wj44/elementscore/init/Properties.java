package com.wj44.elementscore.init;

import com.wj44.elementscore.api.ElementAPI;
import com.wj44.elementscore.api.ItemProperties;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

/**
 * Created by Wesley "WJ44" Joosten on 7-5-2015.
 *
 * Part of the ElementsCore Mod, distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (https://creativecommons.org/licenses/by-nc-sa/3.0/)
 */
public class Properties
{
    public static void init()
    {
        //Items
        ElementAPI.registerItemProperties(Items.coal, new ItemProperties(1250, (float) 1/9));
        ElementAPI.registerItemProperties(Items.diamond, new ItemProperties(3500, (float) 1/9));
        ElementAPI.registerItemProperties(Items.iron_ingot, new ItemProperties(7870, (float) 1/9));
        ElementAPI.registerItemProperties(Items.gold_ingot, new ItemProperties(19320, (float) 1/9));
        ElementAPI.registerItemProperties(Items.sugar, new ItemProperties(1590, (float) 1/9));
        ElementAPI.registerItemProperties(Items.gold_nugget, new ItemProperties(19320, (float) 1/9/9));
        ElementAPI.registerItemProperties(Items.emerald, new ItemProperties(2710, (float) 1 / 9));
        ElementAPI.registerItemProperties(Items.quartz, new ItemProperties(2650, (float) 1/4));
        //Blocks
        ElementAPI.registerItemProperties(Blocks.iron_block, new ItemProperties(7870, 1));
        ElementAPI.registerItemProperties(Blocks.gold_block, new ItemProperties(19320, 1));
        ElementAPI.registerItemProperties(Blocks.obsidian,  new ItemProperties(2350, 1));
        ElementAPI.registerItemProperties(Blocks.diamond_block, new ItemProperties(3500, 1));
        ElementAPI.registerItemProperties(Blocks.emerald_block, new ItemProperties(2710, 1));
        ElementAPI.registerItemProperties(Blocks.quartz_block, new ItemProperties(2650, 1));
        ElementAPI.registerItemProperties(Blocks.coal_block, new ItemProperties(1250, 1));
    }
}
