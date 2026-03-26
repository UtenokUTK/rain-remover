package dev.rainremove.mixin.client;

import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.WeatherRendering;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WeatherRendering.class)
public abstract class WeatherRenderingMixin {
	@Inject(
		method = "renderPrecipitation(Lnet/minecraft/world/World;Lnet/minecraft/client/render/LightmapTextureManager;IFLnet/minecraft/util/math/Vec3d;)V",
		at = @At("HEAD"),
		cancellable = true
	)
	private void rainremove$cancelWeatherRendering(
		World world,
		LightmapTextureManager lightmapTextureManager,
		int ticks,
		float delta,
		Vec3d pos,
		CallbackInfo ci
	) {
		ci.cancel();
	}
}
