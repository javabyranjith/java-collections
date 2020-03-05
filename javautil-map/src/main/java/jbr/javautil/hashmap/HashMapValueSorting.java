package jbr.javautil.hashmap;

import jbr.javautil.maputil.MapSortingByValue;
import jbr.javautil.maputil.MyHashMap;

public class HashMapValueSorting {
  public static void main(String[] args) {

    MapSortingByValue.sortByValueUsingCollectionSort(MyHashMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValueUsingCollectionSort(MyHashMap.getMapStringInteger(), "DESC");

    System.out.println("\n");
    MapSortingByValue.sortByValue(MyHashMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValue(MyHashMap.getMapStringInteger(), "DESC");

  }
}
