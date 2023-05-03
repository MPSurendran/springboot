package com.example.ebook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebook.Model.Sign;


@Repository
public interface SignRepository extends JpaRepository <Sign,Integer>{

}
