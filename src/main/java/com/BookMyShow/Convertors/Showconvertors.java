package com.BookMyShow.Convertors;

import com.BookMyShow.EntryDTOs.ShowEntryDto;
import com.BookMyShow.Models.ShowEntity;

public class Showconvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                                .build();

        return showEntity;
    }
}
