package com.lecture.carrental.repository;

import com.lecture.carrental.domain.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Transactional
@Repository
public interface FileDBRepository extends JpaRepository<FileDB,String> {

}
