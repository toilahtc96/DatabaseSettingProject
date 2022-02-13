package com.ezy.databasesetting.repository;

import com.ezy.databasesetting.entitiy.DatabaseList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseListRepository extends JpaRepository<DatabaseList,Long> {
}
