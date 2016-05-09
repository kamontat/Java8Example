package com.kamontat.libraries.datetime;

import java.time.*;

/**
 * @author kamontat
 * @since 9/5/59 - 23:13
 */
public class Time {
	public static void main(String[] args) {
		// clock
		final Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());

		// date
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now(clock);

		System.out.println();
		System.out.println(date);
		System.out.println(dateFromClock);

		// time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now(clock);

		System.out.println();
		System.out.println("time = " + time);
		System.out.println("timeFromClock = " + timeFromClock);

		// date and time by zone
		final ZonedDateTime zone = ZonedDateTime.now();
		final ZonedDateTime zoneFromClock = ZonedDateTime.now(clock);
		final ZonedDateTime zoneFromZone = ZonedDateTime.now(ZoneId.of("+8"));

		System.out.println();
		System.out.println("zone = " + zone);
		System.out.println("zoneFromClock = " + zoneFromClock);
		System.out.println("zoneFromZone = " + zoneFromZone);

		// find duration time
		LocalDateTime from = LocalDateTime.of(2011, 1, 6, 12, 0);
		LocalDateTime to = LocalDateTime.of(LocalDate.now(), LocalTime.now());

		Duration duration = Duration.between(from, to);

		System.out.println();
		System.out.println("Duration in hour: " + duration.toHours());
	}
}
