package com.algorithm.chapter13;

import java.util.*;

public class Example13_6 {

    public static void main(String[] args) {

        Map<Integer, List<Map<Integer, String>>> attendance = new HashMap<>();
        addStudent(attendance, 3, 12, "A");
        addStudent(attendance, 1, 20, "B");
        addStudent(attendance, 2, 5, "C");
        addStudent(attendance, 1, 12, "D");
        addStudent(attendance, 3, 14, "B");
        addStudent(attendance, 2, 9, "E");

        System.out.println("========= 전체 학생 출력 =========");
        printAll(attendance);
        System.out.println("");


        System.out.println("=> 2학년 중에 학생 번호 5번 출석부에서 제외");
        deleteStudent(attendance, 2, 5);

        System.out.println("========= 2학년 중에 학생 번호 5번이 제외된 전체 학생 출력 =========");
        printAll(attendance);
        System.out.println("");

        System.out.println("========= B 검색 =========");
        findStudent(attendance, "B");
        System.out.println("");

        System.out.println("========= 학생 번호가 12인 학생들 검색=========");
        findStudent(attendance, 12);
        System.out.println("");

        System.out.println("========= 3학년 학생들 검색=========");
        findStudentsByGrade(attendance, 3);
    }

    private static void addStudent(Map<Integer, List<Map<Integer, String>>> attendance, int grade, int studentId, String name) {
        if (!attendance.containsKey(grade)) {
            List<Map<Integer, String>> firstGrade = new ArrayList<>();
            firstGrade.add(createStudent(studentId, name));
            attendance.put(grade, firstGrade);

            return;
        }

        List<Map<Integer, String>> students = attendance.get(grade);
        students.add(createStudent(studentId, name));
    }

    private static Map<Integer, String> createStudent(int studentId, String name) {
        Map<Integer, String> student = new HashMap<>();
        student.put(studentId, name);

        return student;
    }

    private static void deleteStudent(Map<Integer, List<Map<Integer, String>>> attendance, int grade, int studentId) {
        List<Map<Integer, String>> students = attendance.get(grade);
        Map<Integer, String> student = getStudent(attendance, grade, studentId);
        students.remove(student);
    }

    private static Map<Integer, String> getStudent(Map<Integer, List<Map<Integer, String>>> attendance, int grade, int studentId) {
        Map<Integer, String> result = null;

        List<Map<Integer, String>> students = attendance.get(grade);
        for (Map<Integer, String> student: students) {
            if (student.containsKey(studentId)) {
                result = student;
                break;
            }
        }
        return result;
    }

    private static void findStudent(Map<Integer, List<Map<Integer, String>>> attendance, String name) {
        Set<Integer> grades = attendance.keySet();
        for (int grade: grades) {
            List<Map<Integer, String>> students = attendance.get(grade);
            for (Map<Integer, String> student: students) {
                Set<Integer> studentIds = student.keySet();
                for (int studentId: studentIds) {
                    if (name.contains(student.get(studentId))) {
                        System.out.println(String.format("%s학년 %s번 %s", grade, studentId, student.get(studentId)));
                    }
                }
            }
        }
    }

    private static void findStudent(Map<Integer, List<Map<Integer, String>>> attendance, int studentId) {
        Set<Integer> grades = attendance.keySet();
        for (int grade: grades) {
            List<Map<Integer, String>> students = attendance.get(grade);
            for (Map<Integer, String> student: students) {
                if (student.containsKey(studentId)) {
                    System.out.println(String.format("%s학년 %s번 %s", grade, studentId, student.get(studentId)));
                    break;
                }
            }
        }
    }

    private static void findStudentsByGrade(Map<Integer, List<Map<Integer, String>>> attendance, int grade) {
        List<Map<Integer, String>> students = attendance.get(grade);
        for (Map<Integer, String> student: students) {
            Set<Integer> studentIds = student.keySet();
            for (int studentId: studentIds) {
                System.out.println(String.format("%s학년 %s번 %s", grade, studentId, student.get(studentId)));
            }
        }
    }

    private static void printAll(Map<Integer, List<Map<Integer, String>>> attendance) {
        Set<Integer> keys = attendance.keySet();
        for (int grade: keys) {
            List<Map<Integer, String>> students = attendance.get(grade);
            for (Map<Integer, String> student: students) {
                Set<Integer> studentIds = student.keySet();
                for (int studentId: studentIds) {
                    System.out.println(String.format("%s학년 %s번 %s", grade, studentId, student.get(studentId)));
                }
            }
        }
    }
}
