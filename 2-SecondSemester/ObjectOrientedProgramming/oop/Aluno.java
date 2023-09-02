import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Aluno 
{
    Integer codigo;
    Integer matricula;
    static String nome;
    LocalDate datanascimento;
    String telefone;
    String endereco;
    static Map <String, List<Integer>> disciplinasNotas;
    
    String sexo;
    String Turma;
    String email;
    Double frequencia;
    Integer curso;

    public static void imprimirDadosAluno()
    {
        System.out.println("nome: "+ Aluno.nome);
    }

    public static void calcularMedia()
    {
        for (Entry<String, List<Integer>> entry : disciplinasNotas.entrySet())
        {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina: "+nomeDisciplina);

            Integer somaNotas = 0;

            for(Integer nota : notas)
            {
                somaNotas = somaNotas + nota;
            }

            Integer media = (somaNotas / notas.size()); 
            
            System.out.println("Média: " + media);            
        }
    }

    public static void calcularMediaFinal() 
    {
        double totalMedia = 0.0;
        int numDisciplinas = disciplinasNotas.size();
    
        for (List<Integer> notas : disciplinasNotas.values()) 
        {
            int somaNotas = 0;
            for (Integer nota : notas) 
            {
                somaNotas += nota;
            }

            double mediaDisciplina = (double) somaNotas / notas.size();
            totalMedia += mediaDisciplina;
        }
    
        double mediaFinal = totalMedia / numDisciplinas;
        
        System.out.println("Média Final: " + mediaFinal);
    }
    
}