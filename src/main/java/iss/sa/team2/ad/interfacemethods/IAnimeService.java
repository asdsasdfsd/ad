package iss.sa.team2.ad.interfacemethods;

import iss.sa.team2.ad.model.Anime;

import java.util.List;
import java.util.Optional;

public interface IAnimeService {
    Optional<Anime> findById(Long id);
    Anime save(Anime anime);
    void deleteById(Long id);
    List<Anime> findAll();
    List<Anime> getTop20AnimeByAverageRating();
    List<Anime> getLatest20Anime();
    List<Anime> findAllByOrderByAverageRatingDesc();
    List<Anime> findAllByOrderByReleaseDateDesc();
}
