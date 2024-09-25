package Main.Final.Create;


import Main.Final.DoiTuong.TuNhan;
import Main.Final.Repositories.PrisonerRepositories;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;

@Configuration
public class Tao_TuNhan {
    private final PrisonerRepositories prisonerRepositories;

    public Tao_TuNhan(PrisonerRepositories prisonerRepositories) {
        this.prisonerRepositories = prisonerRepositories;
    }

    @Bean
    CommandLineRunner initDatabase(PrisonerRepositories prisonerRepositories) {
        return new CommandLineRunner() {
            private static final Logger logger = LoggerFactory.getLogger(Tao_TuNhan.class);

            @Override
            public void run(String... args) throws Exception {
                TuNhan TuNhanA = new TuNhan("Bùi Anh Quốc", 19, "Nam", "Thanh Hóa", "Nghiện Valorant", "3 năm tù", "24/09/2024", "24/09/2027");
                logger.info("TuNhanA: " + prisonerRepositories.save(TuNhanA));
            }
        };
    }
}
