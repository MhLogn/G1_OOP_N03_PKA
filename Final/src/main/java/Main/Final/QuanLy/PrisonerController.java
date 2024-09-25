package Main.Final.QuanLy;

import Main.Final.DoiTuong.TuNhan;
import Main.Final.Repositories.PrisonerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/prison")
public class PrisonerController {

    private final PrisonerRepositories prisonerRepositories;

    @GetMapping ("/index")
    public String index(){
        return "index";
    }

    @Autowired
    public PrisonerController(PrisonerRepositories prisonerRepositories) {
        this.prisonerRepositories = prisonerRepositories;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TuNhan>> getAllPrisoners() {
        List<TuNhan> prisoners = prisonerRepositories.findAll();
        return ResponseEntity.ok(prisoners);
    }
}
