package com.zwy.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candie:candies) {
            if (candie > max) {
                max = candie;
            }
        }
        for (int candie : candies) {
            if (candie >= max - extraCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
