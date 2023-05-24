package net.mcreator.smpmodv.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcopper_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("smp_mod_v", "modelcopper_armor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelcopper_armor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition helmet = Head.addOrReplaceChild("helmet",
				CubeListBuilder.create().texOffs(24, 24).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(24, 8).addBox(-4.0F, -8.7F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 32)
						.addBox(-3.5F, -7.0F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(16, 59).addBox(-4.2F, -7.0F, -1.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 66)
						.addBox(4.3F, -7.0F, -1.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 44).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 34).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition copperbody = Body.addOrReplaceChild("copperbody",
				CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(24, 0).addBox(-4.0F, -16.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(80, 44)
						.addBox(-4.0F, -24.0F, -2.6F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 78).addBox(-4.0F, -24.0F, -2.5F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(64, 42).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 62).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition right_copper_arm = RightArm.addOrReplaceChild("right_copper_arm",
				CubeListBuilder.create().texOffs(72, 0).addBox(-9.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(16, 59).addBox(-9.2F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 59)
						.addBox(-10.2F, -3.0F, -4.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F)).texOffs(0, 76).addBox(-9.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(102, 27)
						.addBox(-9.0F, 5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(60, 58).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 60).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition left_copper_arm = LeftArm.addOrReplaceChild("left_copper_arm",
				CubeListBuilder.create().texOffs(68, 24).addBox(-9.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(16, 101).addBox(-9.2F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 74)
						.addBox(-9.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(80, 21).addBox(-9.0F, 5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightArm_r1 = left_copper_arm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(16, 101).addBox(-15.2F, -4.0F, 2.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(5.0F, 6.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(24, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition left_copper_leg = LeftLeg.addOrReplaceChild("left_copper_leg",
				CubeListBuilder.create().texOffs(76, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(72, 11).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(16, 59)
						.addBox(2.3F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(76, 63).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.2F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(56, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 30).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition right_copper_leg = RightLeg.addOrReplaceChild("right_copper_leg",
				CubeListBuilder.create().texOffs(76, 54).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(72, 70).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(76, 63)
						.addBox(-2.0F, 5.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 66).addBox(-2.3F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
