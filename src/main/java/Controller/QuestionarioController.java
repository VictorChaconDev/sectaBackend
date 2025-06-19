package Controller;

import Service.QuestionarioService;
import entity.Questionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/questionarios")
@CrossOrigin(origins = "*") // opcional: habilita CORS si accedes desde front
public class QuestionarioController {

    @Autowired
    private QuestionarioService questionarioService;

    @PostMapping
    public ResponseEntity<Questionario> create(@RequestBody Questionario questionario) {
        Questionario saved = questionarioService.save(questionario);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questionario> getById(@PathVariable Long id) {
        Questionario questionario = questionarioService.findById(id);
        if (questionario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(questionario);
    }

    @GetMapping
    public ResponseEntity<Iterable<Questionario>> getAll() {
        Iterable<Questionario> all = questionarioService.findAll();
        return ResponseEntity.ok(all);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Questionario questionario = questionarioService.findById(id);
        if (questionario == null) {
            return ResponseEntity.notFound().build();
        }
        questionarioService.delete(questionario);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Questionario> update(@PathVariable Long id, @RequestBody Questionario updated) {
        Questionario existing = questionarioService.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        // Opción 1: setear campos uno a uno
        updated.setId(id); // Asegúrate de que tenga setter de ID
        Questionario saved = questionarioService.save(updated);
        return ResponseEntity.ok(saved);
    }
}

