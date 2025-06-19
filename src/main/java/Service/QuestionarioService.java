package Service;

import Repository.QuestionarioRepository;
import entity.Questionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionarioService {

    @Autowired
    private QuestionarioRepository questionarioRepository;

    public Questionario save(Questionario questionario){
        return questionarioRepository.save(questionario);
    }
    public void delete(Questionario questionario){
        questionarioRepository.delete(questionario);
    }
    public Questionario findById(Long id){
        return questionarioRepository.findById(id).orElse(null);
    }
    public Iterable<Questionario> findAll(){
        return questionarioRepository.findAll();
    }
}
