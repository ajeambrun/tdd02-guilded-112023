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
        Assertions.assertEquals(8, quality);
    }

    @Test
    public void testAgeBrie() {
        Item item = new Item("Aged Brie", 0, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        Assertions.assertEquals(12, quality);
    }

    @Test
    public void testBackstage() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        Assertions.assertEquals(0, quality);
    }

    @Test
    public void testSulfuras() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 10);
        Item[] items = new Item[] {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        int quality = item.quality;
        Assertions.assertEquals(10, quality);
    }

}
