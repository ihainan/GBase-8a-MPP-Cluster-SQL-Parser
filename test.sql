SELECT a.timegra
	,to_char(a.apn)
	,to_char(a.imsi)
	,to_char(a.msisdn)
	,trim(to_char(round(a.k60586, 2), 999999999999999999999999999999999999.99))
	,trim(to_char(round(a.k60587, 2), 999999999999999999999999999999999999.99))
	,trim(to_char(round(a.k60588, 2), 999999999999999999999999999999999999.99))
	,trim(to_char(round(a.k60589, 2), 999999999999999999999999999999999999.99))
	,trim(to_char(round(a.k60590, 2), 999999999999999999999999999999999999.99))
	,trim(to_char(round(a.k60591, 2), 999999999999999999999999999999999999.99))
	,trim(to_char(round(a.k60592, 0), 99999999999999999999999999999999999999))
FROM (
	SELECT timegra
		,apn
		,imsi
		,msisdn
		,round((((uflux + dflux) / cast(1024 AS DECIMAL(38, 10))) / cast(1024 AS DECIMAL(38, 10))), 2) AS k60586
		,round(((uflux / cast(1024 AS DECIMAL(38, 10))) / cast(1024 AS DECIMAL(38, 10))), 2) AS k60587
		,round(((dflux / cast(1024 AS DECIMAL(38, 10))) / cast(1024 AS DECIMAL(38, 10))), 2) AS k60588
		,round((uflux + dflux) * 8 * (
				CASE
					WHEN timeusage = 0
						THEN 0
					ELSE (1000 / cast(1024 AS DECIMAL(38, 10))) / cast(timeusage AS DECIMAL(38, 10))
					END
				), 2) AS k60589
		,round(uflux * 8 * (
				CASE
					WHEN uplinktimeusage = 0
						THEN 0
					ELSE (1000 / cast(1024 AS DECIMAL(38, 10))) / cast(uplinktimeusage AS DECIMAL(38, 10))
					END
				), 2) AS k60590
		,round(dflux * 8 * (
				CASE
					WHEN downlinktimeusage = 0
						THEN 0
					ELSE (1000 / cast(1024 AS DECIMAL(38, 10))) / cast(downlinktimeusage AS DECIMAL(38, 10))
					END
				), 2) AS k60591
		,abs(duration) AS k60592
	FROM (
		SELECT clttime_ AS timegra
			,a.apn
			,a.imsi
			,a.msisdn
			,sum(a.dflux) AS dflux
			,sum(a.uflux) AS uflux
			,sum(a.timeusage) AS timeusage
			,sum(a.uplinktimeusage) AS uplinktimeusage
			,sum(a.downlinktimeusage) AS downlinktimeusage
			,sum(a.duration) AS duration
		FROM (SELECT CASE
					WHEN minute(clttime) / 15 = 0
						THEN date_format(clttime, '%Y-%m-%d %H:00:00')
					WHEN minute(clttime) / 15 = 1
						THEN date_format(clttime, '%Y-%m-%d %H:15:00')
					WHEN minute(clttime) / 15 = 2
						THEN date_format(clttime, '%Y-%m-%d %H:30:00')
					WHEN minute(clttime) / 15 = 3
						THEN date_format(clttime, '%Y-%m-%d %H:45:00')
					END AS clttime_
				,apn
				,imsi
				,msisdn
				,sum(dflux) AS dflux
				,sum(uflux) AS uflux
				,sum(timeusage) AS timeusage
				,sum(uplinktimeusage) AS uplinktimeusage
				,sum(downlinktimeusage) AS downlinktimeusage
				,sum(duration) AS duration
			FROM fact_ipp_flux_20150526
			WHERE (
					clttime BETWEEN date_format('2015-05-26 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
						AND date_format('2015-05-31 16:29:59.999', '%Y-%m-%d %H:%i:%s.%f')
					)
				AND imsi = '46000000318059'
				AND neid IN (
					101
					,111
					)
			GROUP BY clttime_
				,apn
				,imsi
				,msisdn

			UNION ALL

			SELECT CASE
					WHEN minute(clttime) / 15 = 0
						THEN date_format(clttime, '%Y-%m-%d %H:00:00')
					WHEN minute(clttime) / 15 = 1
						THEN date_format(clttime, '%Y-%m-%d %H:15:00')
					WHEN minute(clttime) / 15 = 2
						THEN date_format(clttime, '%Y-%m-%d %H:30:00')
					WHEN minute(clttime) / 15 = 3
						THEN date_format(clttime, '%Y-%m-%d %H:45:00')
					END AS clttime_
				,apn
				,imsi
				,msisdn
				,sum(dflux) AS dflux
				,sum(uflux) AS uflux
				,sum(timeusage) AS timeusage
				,sum(uplinktimeusage) AS uplinktimeusage
				,sum(downlinktimeusage) AS downlinktimeusage
				,sum(duration) AS duration
			FROM fact_ipp_flux_20150527
			WHERE (
					clttime BETWEEN date_format('2015-05-26 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
						AND date_format('2015-05-28 16:29:59.999', '%Y-%m-%d %H:%i:%s.%f')
					)
				AND imsi = '46000000318059'
				AND neid IN (
					101
					,111
					)
			GROUP BY clttime_
				,apn
				,imsi
				,msisdn

			UNION ALL

			SELECT CASE
					WHEN minute(clttime) / 15 = 0
						THEN date_format(clttime, '%Y-%m-%d %H:00:00')
					WHEN minute(clttime) / 15 = 1
						THEN date_format(clttime, '%Y-%m-%d %H:15:00')
					WHEN minute(clttime) / 15 = 2
						THEN date_format(clttime, '%Y-%m-%d %H:30:00')
					WHEN minute(clttime) / 15 = 3
						THEN date_format(clttime, '%Y-%m-%d %H:45:00')
					END AS clttime_
				,apn
				,imsi
				,msisdn
				,sum(dflux) AS dflux
				,sum(uflux) AS uflux
				,sum(timeusage) AS timeusage
				,sum(uplinktimeusage) AS uplinktimeusage
				,sum(downlinktimeusage) AS downlinktimeusage
				,sum(duration) AS duration
			FROM fact_ipp_flux_20150528
			WHERE (
					clttime BETWEEN date_format('2015-05-26 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
						AND date_format('2015-05-28 16:29:59.999', '%Y-%m-%d %H:%i:%s.%f')
					)
				AND imsi = '46000000318059'
				AND neid IN (
					101
					,111
					)
			GROUP BY clttime_
				,apn
				,imsi
				,msisdn

			UNION ALL

			SELECT CASE
					WHEN minute(clttime) / 15 = 0
						THEN date_format(clttime, '%Y-%m-%d %H:00:00')
					WHEN minute(clttime) / 15 = 1
						THEN date_format(clttime, '%Y-%m-%d %H:15:00')
					WHEN minute(clttime) / 15 = 2
						THEN date_format(clttime, '%Y-%m-%d %H:30:00')
					WHEN minute(clttime) / 15 = 3
						THEN date_format(clttime, '%Y-%m-%d %H:45:00')
					END AS clttime_
				,apn
				,imsi
				,msisdn
				,sum(dflux) AS dflux
				,sum(uflux) AS uflux
				,sum(timeusage) AS timeusage
				,sum(uplinktimeusage) AS uplinktimeusage
				,sum(downlinktimeusage) AS downlinktimeusage
				,sum(duration) AS duration
			FROM fact_ipp_flux_20150529
			WHERE (
					clttime BETWEEN date_format('2015-05-26 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
						AND date_format('2015-05-31 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
					)
				AND imsi = '46000000318059'
				AND neid IN (
					101
					,111
					)
			GROUP BY clttime_
				,apn
				,imsi
				,msisdn

			UNION ALL

			SELECT CASE
					WHEN minute(clttime) / 15 = 0
						THEN date_format(clttime, '%Y-%m-%d %H:00:00')
					WHEN minute(clttime) / 15 = 1
						THEN date_format(clttime, '%Y-%m-%d %H:15:00')
					WHEN minute(clttime) / 15 = 2
						THEN date_format(clttime, '%Y-%m-%d %H:30:00')
					WHEN minute(clttime) / 15 = 3
						THEN date_format(clttime, '%Y-%m-%d %H:45:00')
					END AS clttime_
				,apn
				,imsi
				,msisdn
				,sum(dflux) AS dflux
				,sum(uflux) AS uflux
				,sum(timeusage) AS timeusage
				,sum(uplinktimeusage) AS uplinktimeusage
				,sum(downlinktimeusage) AS downlinktimeusage
				,sum(duration) AS duration
			FROM fact_ipp_flux_20150530
			WHERE (
					clttime BETWEEN date_format('2015-05-26 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
						AND date_format('2015-05-31 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
					)
				AND imsi = '46000000318059'
				AND neid IN (
					101
					,110
					,111
					)
			GROUP BY clttime_
				,apn
				,imsi
				,msisdn

			UNION ALL

			SELECT CASE
					WHEN minute(clttime) / 15 = 0
						THEN date_format(clttime, '%Y-%m-%d %H:00:00')
					WHEN minute(clttime) / 15 = 1
						THEN date_format(clttime, '%Y-%m-%d %H:15:00')
					WHEN minute(clttime) / 15 = 2
						THEN date_format(clttime, '%Y-%m-%d %H:30:00')
					WHEN minute(clttime) / 15 = 3
						THEN date_format(clttime, '%Y-%m-%d %H:45:00')
					END AS clttime_
				,apn
				,imsi
				,msisdn
				,sum(dflux) AS dflux
				,sum(uflux) AS uflux
				,sum(timeusage) AS timeusage
				,sum(uplinktimeusage) AS uplinktimeusage
				,sum(downlinktimeusage) AS downlinktimeusage
				,sum(duration) AS duration
			FROM fact_ipp_flux_20150531
			WHERE (
					clttime BETWEEN date_format('2015-05-26 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
						AND date_format('2015-05-31 16:30:00.000', '%Y-%m-%d %H:%i:%s.%f')
					)
				AND imsi = '46000000318059'
				AND neid IN (
					101
					,111
					)
			GROUP BY clttime_
				,apn
				,imsi
				,msisdn
			) a
		GROUP BY timegra
			,a.apn
			,a.imsi
			,a.msisdn
		HAVING sum(dflux) IS NOT NULL
			AND sum(uflux) IS NOT NULL
			AND sum(timeusage) IS NOT NULL
			AND sum(uplinktimeusage) IS NOT NULL
			AND sum(downlinktimeusage) IS NOT NULL
			AND sum(duration) IS NOT NULL
		) a
	) a
ORDER BY a.timegra ASC
	,a.k60586 DESC;
