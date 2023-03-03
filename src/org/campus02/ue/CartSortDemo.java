package org.campus02.ue;

import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {

        // new ArrayList<Cart>(); + strg + alt + v
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("john", 4, 10,125.90));
        carts.add(new Cart("jane", 1, 1, 8.87));
        carts.add(new Cart("max", 5,10, 400));

        Collections.sort(carts);
        System.out.println(carts);


        //sortiere nach username asc definiert in CartUsernameComparator
        Collections.sort(carts, new CartUsernameComparator());
        System.out.println(carts);

        //sortiere mittels CartTotalItemsComparator
        // 2. Möglichkeit carts.sort(new CartTotalItemsComparator());  - funktioniert nur mit comperator
        Collections.sort(carts, new CartTotalItemsComparator());
        System.out.println(carts);

    }



}
