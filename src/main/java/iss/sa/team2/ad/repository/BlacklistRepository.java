package iss.sa.team2.ad.repository;

import iss.sa.team2.ad.model.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlacklistRepository extends JpaRepository<Blacklist, Integer> {
}
