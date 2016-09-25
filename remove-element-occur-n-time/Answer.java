package com.google.challenges;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class Answer
{
  public static int[] answer(int[] data, int n) {
    int[] mark = data;
    List<Integer> ans = new ArrayList<Integer>();

    for(int i = 0; i < data.length ; i++) {
      int countMark = 0;
      for(int x = 0; x < mark.lenght; x++){
        if(mark[x] == data[i]) {
          countMark++;
        }
      }

      if(countMark <= n) {
        ans.add(data[i])
      }
    }

    int[] finAns = new int[ans.size()];
    for(int y = 0; y < ans.size(); y++) {
      finAns[y] = ans.get(y);
    }

    return finAns;
  }
}
