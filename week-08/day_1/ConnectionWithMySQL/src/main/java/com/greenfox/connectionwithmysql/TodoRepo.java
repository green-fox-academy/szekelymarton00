package com.greenfox.connectionwithmysql;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

  @Query(value = "SELECT * FROM todo WHERE is_done = 0", nativeQuery = true)

  public List<Todo> filterisUrgent();

  public List<Todo> findAllByIsDoneIsFalse();

  public List<Todo> findAllByTitleContains(String search);


  @Query (value = "select t.* from todo t join assignee_todos j on t.id = j.todos_id join assignee a on j.assignee_assignee_id = a.assignee_id where assignee_id = ?1", nativeQuery = true)
  public List<Todo> searchByAssignee(int assignee_id);

}
