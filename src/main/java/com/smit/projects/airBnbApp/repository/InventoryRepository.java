package com.smit.projects.airBnbApp.repository;

import com.smit.projects.airBnbApp.entity.Inventory;
import com.smit.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

   void deleteBydateAfterAndRoom(LocalDate date, Room room);

}
