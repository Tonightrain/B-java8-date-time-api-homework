package com.thoughtworks.capability.gtb;

import com.sun.org.apache.regexp.internal.RE;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = LocalDate.now().getYear();
    LocalDate laborDayOfTheTear = LocalDate.of(year,5,1);
    if (date.isBefore(laborDayOfTheTear)){
      return date.until(laborDayOfTheTear, ChronoUnit.DAYS);
    }
    LocalDate laborDayOfTheNextYear = laborDayOfTheTear.plusYears(1);
    return date.until(laborDayOfTheNextYear,ChronoUnit.DAYS);
  }
}
