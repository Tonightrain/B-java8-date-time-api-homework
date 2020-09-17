package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    LocalDate nextWorkDay;
    int dayOfTheWeek = date.getDayOfWeek().getValue();
    switch (dayOfTheWeek) {
      case 5:
        nextWorkDay = date.plusDays(3);
        break;
      case 6:
        nextWorkDay = date.plusDays(2);
        break;
      default:
        nextWorkDay = date.plusDays(1);
    }
    return nextWorkDay;
  }
}
