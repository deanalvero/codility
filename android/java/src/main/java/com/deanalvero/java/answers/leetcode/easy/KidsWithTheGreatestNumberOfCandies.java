package com.deanalvero.java.answers.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for (int candy: candies) {
            maxCandy = Math.max(candy, maxCandy);
        }

        for (int candy: candies) {
            result.add(candy + extraCandies >= maxCandy);
        }
        return result;
    }
}
