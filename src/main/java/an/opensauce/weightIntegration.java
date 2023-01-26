package an.opensauce;

import an.opensauce.armourweight.Armourweight;
import an.opensauce.armourweight.api.armourType;
import an.opensauce.armourweight.api.armourWeightDef;
import an.opensauce.armourweight.util.WeightUtil;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class weightIntegration implements ModInitializer {




    public static ArmorMaterial Mudmat = new mudmat();
    public static Item Mud_Chestplate = new ArmorItem(Mudmat, EquipmentSlot.CHEST, new Item.Settings());

    public static armourWeightDef Mud_Chestplate_Def = new armourWeightDef(armourType.CHEST,1f,Mud_Chestplate); // define the weight for Mud_Chestplate

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM,new Identifier("weight_integration","mud_chestplate"),Mud_Chestplate); 
        WeightUtil.addElement(Mud_Chestplate_Def); // register our armour
    }
}
