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
}
