package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item> itemArray = new ArrayList<Item>(Arrays.asList(items));
        int arrayLength = items.length;
        if (comparator.equals(new IdComparator())) {
            Collections.sort(itemArray, new IdComparator());
        } else if (comparator.equals(new NameComparator())) {
            Collections.sort(itemArray, new NameComparator());
        } else {
            Collections.sort(itemArray, new PriceComparator());

        }
        return itemArray.toArray(new Item[arrayLength]);

    }
}
