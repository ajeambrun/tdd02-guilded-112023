package com.gildedrose;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    private static final int MAXIMUM_QUALITY = 50;
    Item[] items;

    private void increaseQuality(int i) {
        if (items[i].quality < MAXIMUM_QUALITY) {
            items[i].quality = items[i].quality + 1;
        }
    }

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals(AGED_BRIE)
                    || items[i].name.equals(BACKSTAGE)) {
                        if (items[i].quality < MAXIMUM_QUALITY) {
                            items[i].quality = items[i].quality + 1;

                            if (items[i].name.equals(BACKSTAGE)) {
                                if (items[i].sellIn < 11) {
                                    increaseQuality(i);
                                }

                                if (items[i].sellIn < 6) {
                                    increaseQuality(i);
                                }
                            }
                        }
                    } else {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            }

            if (!items[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (items[i].name.equals(AGED_BRIE)) {
                    increaseQuality(i);
                } else {
                    if (items[i].name.equals(BACKSTAGE)) {
                        items[i].quality = items[i].quality - items[i].quality;
                    } else {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    }
                }
            }
        }
    }
}
