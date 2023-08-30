import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Aluno aluno01 = new Aluno();

        Map<String, List<Integer>> disciplinas = new HashMap<>();

        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();

        
        aluno01.codigo = 01;
        aluno01.nome = "Webber";
        aluno01.datanascimento = LocalDate.of(2002, 02, 8);
        aluno01.endereco = "Rua churusbangos churunsbagos";
        aluno01.telefone = "4899344565";
        aluno01.matricula = 234234234;
        
        aluno01.sexo = "normal";
        aluno01.Turma = "503";
        aluno01.email = "flavinhoreidelas@sus";
        aluno01.frequencia = 100.00;
        aluno01.curso = 1;

        notasMatematica.add(10);
        notasMatematica.add(9);
        notasMatematica.add(8);
        
        notasPortugues.add(7);
        notasPortugues.add(6);
        notasPortugues.add(6);

        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Portugues", notasPortugues);

        aluno01.disciplinasNotas = disciplinas;
        
        Aluno.calcularMediaFinal();
    }
  
}
