

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CustomTNT {

    public static ItemStack tnt;
    public static ItemStack dia;
    public static ItemStack drink;
	private static ItemStack trank;


    public static void init() {
    	//crafting table und dia zu zaubbertisch
        createBomb();
        createDia();
        createDrink();
        createSueßerTrank();
    }

    
    
    private static void createSueßerTrank() {
        ItemStack item = new ItemStack(Material.POTION, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lltrank");

        List<String> lore = new ArrayList<>();
        lore.add("§7Opis AutoTNTDrinkibinki!");

        meta.setLore(lore);
        item.setItemMeta(meta);
        trank = item;

        ShapedRecipe drank = new ShapedRecipe(NamespacedKey.minecraft("IsabellasZauberTrankLecka_special"), trank);
        drank.shape("121", "343", "565");
        
        drank.setIngredient('1', Material.MELON_SLICE);
        drank.setIngredient('2', Material.SUGAR);
        drank.setIngredient('3', Material.SWEET_BERRIES);
        drank.setIngredient('4', Material.GLASS_BOTTLE);
        drank.setIngredient('5', Material.CAKE);
        drank.setIngredient('6', Material.ENCHANTED_GOLDEN_APPLE);
        Bukkit.getServer().addRecipe(drank);
    }
    
    private static void createDia() {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lDIA");

        List<String> lore = new ArrayList<>();
        lore.add("§7Opis DIAMANT!");

        meta.setLore(lore);
        item.setItemMeta(meta);
        dia = item;

        ShapedRecipe diamant = new ShapedRecipe(NamespacedKey.minecraft("dia_special"), dia);
        diamant.shape("111", "222", "333");
        
        diamant.setIngredient('1', Material.IRON_BLOCK);
        diamant.setIngredient('2', Material.COAL_BLOCK);
        diamant.setIngredient('3', Material.SOUL_CAMPFIRE);

        Bukkit.getServer().addRecipe(diamant);
    }
    
    private static void createDrink() {
        ItemStack item = new ItemStack(Material.POTION, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lDrink");

        List<String> lore = new ArrayList<>();
        lore.add("§7Opis Drink!");

        meta.setLore(lore);
        item.setItemMeta(meta);
        drink = item;

        ShapedRecipe drinki = new ShapedRecipe(NamespacedKey.minecraft("drink_special"), drink);
        drinki.shape("121", "438", "675");
        
        drinki.setIngredient('1', Material.CREEPER_HEAD);
        drinki.setIngredient('2', Material.POISONOUS_POTATO);
        drinki.setIngredient('3', Material.CAULDRON);
        drinki.setIngredient('4', Material.SLIME_BALL);
        drinki.setIngredient('5', Material.SPIDER_EYE);
        drinki.setIngredient('6', Material.FERMENTED_SPIDER_EYE);
        drinki.setIngredient('7', Material.HONEY_BOTTLE);
        drinki.setIngredient('8', Material.BIRCH_LEAVES);

        Bukkit.getServer().addRecipe(drinki);
    }
    
    private static void createBomb() {
        ItemStack item = new ItemStack(Material.TNT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lBomba");

        List<String> lore = new ArrayList<>();
        lore.add("§7Opis itemku!");

        meta.setLore(lore);
        item.setItemMeta(meta);
        tnt = item;

        ShapedRecipe bomb = new ShapedRecipe(NamespacedKey.minecraft("tnt_special"), tnt);
        bomb.shape("112", "113", "112");

        bomb.setIngredient('3', Material.WHITE_DYE);
        bomb.setIngredient('2', Material.RED_DYE);
        bomb.setIngredient('1', Material.GRAVEL);

        Bukkit.getServer().addRecipe(bomb);
    }
    
    
  
}

