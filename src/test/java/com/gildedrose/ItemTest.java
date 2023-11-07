package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ItemTest {
    @Test
    public void testQuality(){
        Item item = new Item("", 0, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        int sellIn = item.sellIn;
        Assertions.assertEquals(8, quality);
        Assertions.assertEquals(-1, sellIn);
    }

    @Test
    public void testAgeBrie() {
        Item item = new Item("Aged Brie", 0, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        int sellIn = item.sellIn;
        Assertions.assertEquals(12, quality);
        Assertions.assertEquals(-1, sellIn);
    }

    @Test
    public void testBackstage() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        int sellIn = item.sellIn;
        Assertions.assertEquals(12, quality, "quality : ");
        Assertions.assertEquals(9, sellIn, "sellIn : ");
    }

    @Test
    public void testSulfuras() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 8, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        int sellIn = item.sellIn;
        Assertions.assertEquals(10, quality, "quality : ");
        Assertions.assertEquals(8, sellIn, "sellIn : ");
    }

}
