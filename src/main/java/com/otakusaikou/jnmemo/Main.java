package com.otakusaikou.jnmemo;

import com.otakusaikou.jnmemo.proxy.CommonProxy;
import com.otakusaikou.jnmemo.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main INSTANCE = new Main();

    @SidedProxy(serverSide = Reference.COMMONPROXY, clientSide = Reference.CLIENTPROXY)
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public static void onPreInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public static void onInit(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public static void onPostInit(FMLPostInitializationEvent event){

    }
}
