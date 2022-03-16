package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Exercise003 {
    List<Item> iceCreamList = new ArrayList<>();

    public Exercise003() {
        iceCreamList.add(new Item(0, "Pistachio"));
        iceCreamList.add(new Item(1, "Raspberry Ripple"));
        iceCreamList.add(new Item(2, "Vanilla"));
        iceCreamList.add(new Item(3, "Mint Chocolate Chip"));
        iceCreamList.add(new Item(4, "Chocolate"));
        iceCreamList.add(new Item(5, "Mango Sorbet"));
    }

    int getIceCreamCode(String iceCreamFlavour) {
        OptionalInt iceCream = OptionalInt.of(iceCreamList.stream().filter(i -> i.getName().equals(iceCreamFlavour)).mapToInt(i -> i.getId()).findFirst()
                .orElseThrow(()->new NoSuchIceCreamFlavourException(iceCreamFlavour)));

        return iceCream.getAsInt();

    }

    String[] iceCreamFlavours() {
        List<String> flavourList = iceCreamList.stream().map(i -> i.getName()).collect(Collectors.toList());
        String[] flavours = new String[flavourList.size()];
        flavourList.toArray(flavours);
        return flavours;
    }

    static class Item implements Comparable<Item> {
        final int id;
        final String name;

        Item(int id, String name) {
            this.id = id;
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        int getId() {
            return this.id;
        }

        @Override
        public int compareTo(Item item) {
              int compareId=item.getId();

               return this.id - compareId;
            }
        }


}
