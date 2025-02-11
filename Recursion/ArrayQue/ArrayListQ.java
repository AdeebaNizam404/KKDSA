package Recursion.ArrayQue;

import java.util.ArrayList;

public class ArrayListQ {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 4, 5, 8, 4, 9, 4 };
    findAllIndex(arr, 4, 0);
    System.out.println(list);
    findAllIndexArg2(arr, 4, 0);
    System.out.println(list);
    
    System.out.println(findAllIndexArg(arr,4,0, list));
  }


static ArrayList<Integer> list = new ArrayList<>();

static void findAllIndex(int[] arr, int target, int index) {
  if (index == arr.length) {
    return;
  }
  if (arr[index] == target) {
    list.add(index);
  }

  findAllIndex(arr, target, index + 1);
}
//static ArrayList<Integer> list = new ArrayList<>();

static ArrayList findAllIndexArg(int[] arr, int target, int index ,ArrayList<Integer>li) {
  if (index == arr.length) {
    return li;
  }
  if (arr[index] == target) {
    list.add(index);
  }

   return findAllIndexArg(arr, target, index + 1,li);
}
static ArrayList findAllIndexArg2(int[] arr, int target, int index ) {
  ArrayList<Integer>li=new ArrayList<>();
  if (index == arr.length) {
    return li;
  }
  //this will contatin answer for that function call only
  if (arr[index] == target) {
    list.add(index);
  }

   ArrayList<Integer>ansFromBelowCalls= findAllIndexArg(arr, target, index + 1,li);
   li.addAll(ansFromBelowCalls);
   return li;
}
}
