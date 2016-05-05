package com.wj44.elementscore.init;

import com.wj44.elementscore.api.Element;
import com.wj44.elementscore.api.ElementList;
import com.wj44.elementscore.api.ElementAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

/**
 * Created by Wesley "WJ44" Joosten on 22-2-2015.
 *
 * Part of the ElementsCore Mod, distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (https://creativecommons.org/licenses/by-nc-sa/3.0/)
 */
public class Elements
{
    public static void init()
    {
        //Items
        ElementAPI.registerItemElements(Items.coal, new ElementList().add(Element.CARBON, 1));
        ElementAPI.registerItemElements(Items.diamond, new ElementList().add(Element.CARBON, 1));
        ElementAPI.registerItemElements(Items.iron_ingot, new ElementList().add(Element.IRON, 1));
        ElementAPI.registerItemElements(Items.gold_ingot, new ElementList().add(Element.GOLD, 1));
        ElementAPI.registerItemElements(Items.sugar, new ElementList().add(Element.CARBON, 12).add(Element.HYDROGEN, 22).add(Element.OXYGEN, 11));
        ElementAPI.registerItemElements(Items.gold_nugget, new ElementList().add(Element.GOLD, 1));
        ElementAPI.registerItemElements(Items.emerald, new ElementList().add(Element.BERYLLIUM, 3).add(Element.ALUMINIUM, 2).add(Element.SILICON, 6).add(Element.OXYGEN, 18));
        ElementAPI.registerItemElements(Items.quartz, new ElementList().add(Element.SILICON, 1).add(Element.OXYGEN, 2));
        //Blocks
        ElementAPI.registerItemElements(Blocks.gold_block, new ElementList().add(Element.GOLD, 1));
        ElementAPI.registerItemElements(Blocks.iron_block, new ElementList().add(Element.IRON, 1));
        ElementAPI.registerItemElements(Blocks.obsidian, new ElementList().add(Element.SILICON, 1).add(Element.OXYGEN, 2));
        ElementAPI.registerItemElements(Blocks.diamond_block, new ElementList().add(Element.CARBON, 1));
        ElementAPI.registerItemElements(Blocks.emerald_block, new ElementList().add(Element.BERYLLIUM, 3).add(Element.ALUMINIUM, 2).add(Element.SILICON, 6).add(Element.OXYGEN, 18));
        ElementAPI.registerItemElements(Blocks.quartz_block, new ElementList().add(Element.SILICON, 1).add(Element.OXYGEN, 2));
        ElementAPI.registerItemElements(Blocks.coal_block, new ElementList().add(Element.CARBON, 1));
    }
}
