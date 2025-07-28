package deploy.railway.spring_boot_railway.api;

import deploy.railway.spring_boot_railway.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(
        path = "users",
        collectionResourceRel = "users"
)
public interface UserRestRepository extends
        CrudRepository<User, Long>,
        PagingAndSortingRepository<User, Long> {

}
