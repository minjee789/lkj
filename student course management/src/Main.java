import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int student_Num = 5;
        final int student_info = 5;
        String[][] student = new String[student_Num][student_info];
        //0: id, 1: name, 2: status, 3: birthData, 4: contact

        ArrayList<String>[] courseLists = new ArrayList[student_Num];
        for (int i = 0; i < student_Num; i++)
            courseLists[i] = new ArrayList<>();


        student[0][0] = "2023001"; student[0][1] = "홍길동"; student[0][2] = "재학"; student[0][3] = "2003-01-01"; student[0][4] = "010-1234-5678";
        student[1][0] = "2023002"; student[1][1] = "길동"; student[1][2] = "재학"; student[1][3] = "2003-03-01"; student[1][4] = "010-1234-5378";
        student[2][0] = "2023003"; student[2][1] = "이철수"; student[2][2] = "재학"; student[2][3] = "2003-04-01"; student[2][4] = "010-1278-5678";

        courseLists[0].add("자료구조");
        courseLists[0].add("운영체제");

        courseLists[1].add("데이터베이스");

        courseLists[2].add("자료구조");
        courseLists[2].add("운영체제");
        courseLists[2].add("데이터베이스");

        for (int i = 0; i < student_Num; i++) {
            System.out.println("===학생" + (i + 1) + "정보" + "===");
            System.out.println("ID:" + student[i][0]);
            System.out.println("Name:" + student[i][1]);
            System.out.println("상태:" + student[i][2]);
            System.out.println("생년월일:" + student[i][3]);
            System.out.println("연락처:" + student[i][4]);

            System.out.println("수강 교과목 목록");
            if (courseLists[i].isEmpty())
                System.out.println("없음");
            else
                for (int j = 0; j < courseLists[i].size(); j++)
                    System.out.println(courseLists[i].get(j));
        }

        //ArrayList<String> enrolledCourses = new ArrayList<>();
        //
        //        student[0] = "123456789";
        //        student[1] = "홍길동";
        //        student[2] = "재학";
        //        student[3] = "2001-05-10";
        //        student[4] = "010-1234-5678";
        //
        //        enrolledCourses.add("java");
        //        enrolledCourses.add("자료구조");
        //        enrolledCourses.add("네트워크");
        //
        //        enrolledCourses.remove("자료구조");
        //
        //        System.out.println("ID:" + student[0]);
        //        System.out.println("Name:" + student[1]);
        //        System.out.println("상태:" + student[2]);
        //        System.out.println("생년월일:" + student[3]);
        //        System.out.println("연락처:" + student[4]);
        //
        //        System.out.println("수강 교과목 목록");
        //        if (enrolledCourses.isEmpty())
        //            System.out.println("없음");
        //        else
        //            for (int i = 0; i < enrolledCourses.size(); i++)
        //                System.out.println(enrolledCourses.get(i));
    }
}