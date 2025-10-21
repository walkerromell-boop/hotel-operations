package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookRoom_whenRoomsAvailable_returnTrue() {
        //arrange: create object
        Hotel hiltonHead = new Hotel("Hilton Head", 20, 100, 0, 0);
        //act: call method
        boolean result= hiltonHead.bookRoom(4,true);
        //assert: verify changes
        assertTrue(result);
    }
    @Test
    void bookRoom_whenRoomsAreNotAvailable_returnFalse() {
        //arrange: create object
        Hotel hiltonHead = new Hotel("Hilton Head", 20, 100, 0, 0);
        //act: call method
        boolean result= hiltonHead.bookRoom(15,false);
        //assert: verify changes
        assertTrue(result);
    }



}