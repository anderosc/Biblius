package ee.andero.Biblius_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ee.andero.Biblius_backend.entity.Picture;

//faili nimi pole oluline, see kellele me sedda teeme on määratud JpaRepository <KLASS, PRIMAARVVÕTI>
public interface PicturesRepository extends JpaRepository<Picture, Long> {
}
