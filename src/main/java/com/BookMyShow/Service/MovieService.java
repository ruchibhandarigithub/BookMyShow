package com.BookMyShow.Service;



import com.BookMyShow.Convertors.MovieConvertors;
import com.BookMyShow.EntryDTOs.MovieEntryDto;
import com.BookMyShow.Models.MovieEntity;
import com.BookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

       movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}
