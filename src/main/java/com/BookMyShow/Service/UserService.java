package com.BookMyShow.Service;


import com.BookMyShow.Convertors.UserConvertor;
import com.BookMyShow.EntryDTOs.UserEntryDto;
import com.BookMyShow.Models.UserEntity;
import com.BookMyShow.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
