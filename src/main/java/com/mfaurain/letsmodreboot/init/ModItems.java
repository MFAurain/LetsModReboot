package com.mfaurain.letsmodreboot.init;

import com.mfaurain.letsmodreboot.item.ItemLMRB;
import com.mfaurain.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleleaf");
    }
}
