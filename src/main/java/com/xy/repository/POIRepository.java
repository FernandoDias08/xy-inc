package com.xy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xy.domain.POI;

public interface POIRepository extends JpaRepository<POI, String> {

	@Query("SELECT p FROM POI p WHERE SQRT((p.coordX - :x) * (p.coordX - :x) + (p.coordY - :y) * (p.coordY - :y)) < :range")
	public List<POI> listByProximity(@Param("x") Integer coordX, @Param("y") Integer coordY,
			@Param("range") Double range);
}
