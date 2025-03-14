import java.util.HashMap;

public class RelatedDataStructure {

    public static void main(String[] args) {

        HashMap<String, String> studentNames = new HashMap<>();

        studentNames.put("Turkey", "Tughan");
        studentNames.put("Italy", "Diego");
        studentNames.put("United Kingdom", "John");
        studentNames.put("Germany", "Merkel");


        System.out.println(studentNames);

        studentNames.entrySet();

        System.out.println(studentNames.entrySet());
        HashMap copy =(HashMap)  studentNames.clone();

        copy.remove("Turkey");
        System.out.println(copy);


        String merkel = studentNames.get("Germany");

        System.out.println(merkel);

        String s= studentNames.getOrDefault("Bulgaria","Unknown");
        System.out.println(s);


        HashMap<String, String> studentsName = new HashMap<>();

        studentNames.put("Gana", "Uffla");
        studentNames.put("Arabia", "Tariq");
        studentNames.put("Egypt", "Omar");

        studentsName.putAll(studentNames);

        System.out.println(studentsName);

        System.out.println(studentNames.keySet().stream().findFirst().orElseThrow());

        System.out.println(studentNames.values());

        studentsName.forEach((s1, s2) -> System.out.println(s1 + "->" + s2));

    }
}
