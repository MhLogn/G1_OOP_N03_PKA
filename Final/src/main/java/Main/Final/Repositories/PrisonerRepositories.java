package Main.Final.Repositories;

import Main.Final.DoiTuong.TuNhan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrisonerRepositories extends JpaRepository<TuNhan, Integer> {
}
