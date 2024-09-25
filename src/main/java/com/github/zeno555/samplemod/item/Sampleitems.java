package com.github.zeno555.samplemod.item;

import com.github.zeno555.samplemod.SampleMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Sampleitems {
    //レジストリを作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SampleMod.MODID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> IKURA = ITEMS.register("ikura", () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus){
        //レジストリにイベントバスを追加
        ITEMS.register(eventBus);
    }
}
