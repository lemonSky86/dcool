package com.dcool.demo.repository;

import com.dcool.demo.domain.PhotoInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<PhotoInfo, Long> {

}
