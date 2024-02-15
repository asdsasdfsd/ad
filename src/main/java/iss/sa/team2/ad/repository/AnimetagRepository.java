package iss.sa.team2.ad.repository;

import iss.sa.team2.ad.model.Animetag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimetagRepository extends JpaRepository<Animetag, Long> {
}
