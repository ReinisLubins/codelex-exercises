package io.codelex.typesandvariables.exercises;

public class Exercise5
{
    public static void main(String[] args)
    {
        String[] nameOfClass = {"English III |", "Precalculus |", "Music Theory |", "Biotechnology |", "Principles of Technology I |", "Latin II |", "AP US History |",
                "Business Computer Information Systems |"};
        String[] nameOfTeacher = {"Ms. Lapan |", "Mrs. Gideon |", "Mr. Davis |", "Ms. Palmer |", "Ms. Garcia |", "Mrs. Barnett |", "Ms. Johannessen |", "Mr. James |"};

        System.out.println("+-------------------------------------------------------------------------------------+\n");
        for (int i = 0; i < nameOfClass.length; i++)
        {
            String str = String.format("| %d | %50s %30s\n", (i+1), nameOfClass[i], nameOfTeacher[i]);
            System.out.println(str);
        }
        System.out.println("+-------------------------------------------------------------------------------------+");
    }
}
