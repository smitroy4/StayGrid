package com.smit.projects.airBnbApp.service;

import com.smit.projects.airBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
}
