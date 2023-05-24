// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelcustom_model(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet = Head.addOrReplaceChild("helmet",
				CubeListBuilder.create().texOffs(24, 8)
						.addBox(-4.0F, -2.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 16)
						.addBox(-4.0F, -8.7F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(20, 78)
						.addBox(-3.5F, -7.0F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(29, 25)
						.addBox(-4.2F, -7.0F, -1.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(31, 37)
						.addBox(4.3F, -7.0F, -1.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 26)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition copperbody = Body.addOrReplaceChild("copperbody",
				CubeListBuilder.create().texOffs(0, 30)
						.addBox(-4.0F, -24.0F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(24, 0)
						.addBox(-4.0F, -16.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(64, 21)
						.addBox(-4.0F, -24.0F, -2.6F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-4.0F, -24.0F, -2.5F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_copper_arm = RightArm.addOrReplaceChild("right_copper_arm",
				CubeListBuilder.create().texOffs(48, 49)
						.addBox(-9.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(29, 25)
						.addBox(-9.2F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(29, 25)
						.addBox(-10.2F, -3.0F, -4.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F)).texOffs(32, 58)
						.addBox(-9.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(60, 45)
						.addBox(-9.0F, 5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 42)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_copper_arm = LeftArm.addOrReplaceChild("left_copper_arm",
				CubeListBuilder.create().texOffs(48, 38)
						.addBox(-9.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(31, 37)
						.addBox(-9.2F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 58)
						.addBox(-9.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(60, 45)
						.addBox(-9.0F, 5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition RightArm_r1 = left_copper_arm
				.addOrReplaceChild("RightArm_r1",
						CubeListBuilder.create().texOffs(31, 37).addBox(-15.2F, -4.0F, 2.5F, 0.0F, 7.0F, 7.0F,
								new CubeDeformation(-1.0F)),
						PartPose.offsetAndRotation(5.0F, 6.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition left_copper_leg = LeftLeg.addOrReplaceChild("left_copper_leg",
				CubeListBuilder.create().texOffs(60, 12)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(52, 25)
						.addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(29, 25)
						.addBox(2.3F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 35)
						.addBox(-2.0F, 5.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.2F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(16, 42)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition right_copper_leg = RightLeg.addOrReplaceChild("right_copper_leg",
				CubeListBuilder.create().texOffs(48, 60)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 58)
						.addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(60, 35)
						.addBox(-2.0F, 5.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 37)
						.addBox(-2.3F, 2.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}