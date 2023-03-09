package com.BookMyShow.EntryDTOs;


import com.BookMyShow.Enums.Genre;
import com.BookMyShow.Enums.Language;
import lombok.Data;

import java.awt.geom.GeneralPath;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
