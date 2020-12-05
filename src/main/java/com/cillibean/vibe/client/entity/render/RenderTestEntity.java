package com.cillibean.vibe.client.entity.render;

import com.cillibean.vibe.entities.TestEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.entity.model.SheepModel;
import net.minecraft.client.renderer.entity.model.ShulkerModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTestEntity extends MobRenderer<TestEntity, PigModel<TestEntity>> {

    public RenderTestEntity(EntityRendererManager renderManagerIn, PigModel<TestEntity> entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
        //Bazinga
    }

    @Override
    public ResourceLocation getEntityTexture(TestEntity entity) {
        return null;
    }
}
