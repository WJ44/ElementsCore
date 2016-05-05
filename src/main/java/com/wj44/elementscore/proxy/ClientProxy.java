package com.wj44.elementscore.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Wesley "WJ44" Joosten on 1-8-2015.
 *
 * Part of the ElementsCore Mod, distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (https://creativecommons.org/licenses/by-nc-sa/3.0/)
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit()
    {

    }

    @Override
    public void init()
    {

    }

    @Override
    public void postInit()
    {

    }

    @Override
    public EntityPlayer getEntityPlayer()
    {
        return Minecraft.getMinecraft().thePlayer;
    }
}
