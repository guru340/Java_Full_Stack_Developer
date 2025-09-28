package com.jpa.JPA01.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepo extends JpaRepository<Student,Long> {
}

////In this case we have to add the Repo Annotations if WE using Crud Repo
//public interface StudentRepo extends CrudRepository {
//@Repository
//}
