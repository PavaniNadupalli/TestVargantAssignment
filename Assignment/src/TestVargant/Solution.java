package TestVargant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {
		
		ShoppingCart object1 = new ShoppingCart("Umbrella",  800, 8, 2);
		ShoppingCart object2 = new ShoppingCart("leather wallet",  1000, 18, 1);
		ShoppingCart object3 = new ShoppingCart("Shuttle racket",  200, 28, 3);
		ShoppingCart object4 = new ShoppingCart("key chain",  100, 1, 4);
		
		ArrayList<ShoppingCart> alist = new ArrayList();
		alist.add(object1);
		alist.add(object2);
		alist.add(object3);
		alist.add(object4);
		HashMap productTotalCost = TotalCost(alist);
		System.out.println("Total Amount Paid: "+productTotalCost.get("total"));
		Iterator list =  productTotalCost.entrySet().iterator();
		int data = 0;
		while(list.hasNext()) {
			Map.Entry entry = (Entry) list.next();
			if(entry.getKey() != "total") {
				if(data > 0 && data < (int) entry.getValue()) {
					data = (int) entry.getValue();
				} else if(data > (int) entry.getValue()){
					data = data;
				} else {
					data = (int) entry.getValue();
				}
			}
		}
		System.out.println("maxgst : "+data);
	}
	/* static method to calculate total and gst
	 * Shopping cart object is the method param
	 * return hashMap string and integer
	 */
	public static HashMap TotalCost(ArrayList<ShoppingCart> aList) {
		HashMap hmap = new HashMap();
		int sum =0;
		Iterator<ShoppingCart> ilist = aList.iterator();
		while(ilist.hasNext()){
		ShoppingCart p = ilist.next();
		double gst = ((p.getUnitprice() * p.getGst())/100);
		double total =  gst*(p.getQuantity());
		//hm.put(p.getProduct(), d);
		hmap.put(p.getProduct(), (int) gst);
		sum = sum +(int) total;
		}
		hmap.put("total", sum);
		return hmap;
	}
}
