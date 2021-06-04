package Task15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Task15.models.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByGroupName(String groupName);
}
