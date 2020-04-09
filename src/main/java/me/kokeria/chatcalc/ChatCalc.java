package me.kokeria.chatcalc;

import me.kokeria.chatcalc.event.EventListener;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ChatCalc.MODID, version = ChatCalc.VERSION, clientSideOnly = true)
public class ChatCalc
{
    public static final String MODID = "chatcalc";
    public static final String VERSION = "2.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventListener());
    }
}