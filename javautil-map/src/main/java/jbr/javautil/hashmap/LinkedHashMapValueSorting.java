package jbr.javautil.hashmap;

import jbr.javautil.maputil.MapSortingByValue;
import jbr.javautil.maputil.MyLinkedHashMap;

/**
 * LinkedHashMap - 1) Maintains the order of insertion
 */
public class LinkedHashMapValueSorting {

  public static void main(String[] args) {

    MapSortingByValue.sortByValue(MyLinkedHashMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValue(MyLinkedHashMap.getMapStringInteger(), "DESC");
  }
}
