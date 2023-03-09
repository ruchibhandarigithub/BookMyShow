package com.BookMyShow.Convertors;

import com.BookMyShow.EntryDTOs.TheaterEntryDto;
import com.BookMyShow.Models.TheaterEntity;


public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
