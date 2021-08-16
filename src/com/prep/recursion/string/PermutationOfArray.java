package com.prep.recursion.string;

import java.util.ArrayList;

public class PermutationOfArray {
  public static void main(String[] args) {

    ArrayList<Integer> input = new ArrayList<>();
    input.add(1);
    input.add(2);
    input.add(3);
    input.add(4);

    ArrayList<ArrayList<Integer>> out = permute(input);
    for (int i = 0; i < out.size(); i++) {
      System.out.print("[");
      for (int j = 0; j < out.get(i).size(); j++) {
        System.out.print(out.get(i).get(j) + ",");
      }
      System.out.print("]");

    }


  }

  public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[nums.size()];
    ArrayList<Integer> permutation = new ArrayList<>();

    permute(result, nums, permutation, used);

    return result;
  }

  static void permute(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> nums, ArrayList<Integer> permutation, boolean[] used) {

    if (permutation.size() == nums.size()) {
      result.add(new ArrayList<>(permutation));
      return;
    }


    for (int i = 0; i < nums.size(); i++) {
      if (used[i]) continue;
      used[i] = true;
      permutation.add(nums.get(i));
      permute(result, nums, permutation, used);
      used[i] = false;
      permutation.remove(permutation.size() - 1);
    }

  }

}
