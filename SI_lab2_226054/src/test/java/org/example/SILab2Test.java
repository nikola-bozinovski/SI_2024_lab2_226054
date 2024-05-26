package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void checkCart() {
        List<Item> nullItems = null;
        RuntimeException ex;
        ex = Assertions.assertThrows(RuntimeException.class, () -> SILab2.checkCart(nullItems, 4));
        Assertions.assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        List<Item> nullBarcode = Arrays.asList(
                new Item("ABC", null, 0, 0.0F)
        );
        ex = Assertions.assertThrows(RuntimeException.class, () -> SILab2.checkCart(nullBarcode, 4));
        Assertions.assertTrue(ex.getMessage().contains("No barcode!"));

        List<Item> invalidBarcode = Arrays.asList(
                new Item("","0123",0,0.0F),
                new Item("ABCD","0123",0,1.0F),
                new Item("ABCD","Z",0,1.0F)
        );
        ex = Assertions.assertThrows(RuntimeException.class, () -> SILab2.checkCart(invalidBarcode, 400));
        Assertions.assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        List<Item> retFalse = Arrays.asList(
                new Item("ABC", "0123", 400, 0.5F)
        );
        Assertions.assertDoesNotThrow(() -> SILab2.checkCart(retFalse, 0));
        Assertions.assertFalse(() -> SILab2.checkCart(retFalse, 0));

        List<Item> retTrue = Arrays.asList(
                new Item("ABC", "0123", 400, 0.5F)
        );
        Assertions.assertTrue(SILab2.checkCart(retTrue, 1000));
    }
}