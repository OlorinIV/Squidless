package com.hilburn.squidless;

import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingPackSizeEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SquidHandler {
	private static Class squid = EntitySquid.class;

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void squidSpawn(LivingSpawnEvent.CheckSpawn event){
		if (event.entityLiving.getClass()==squid){
			event.setResult(Result.DENY);
		}
	}

	@SubscribeEvent
	public void squidSpawnPack(LivingPackSizeEvent event){
		if (event.entityLiving.getClass()==squid){
			event.setResult(Result.DENY);
		}
	}

}
