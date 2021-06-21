package com.algorithm.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Example13_4 {

    public static void main(String[] args) {

        List<Directory> root =  new ArrayList<>();

        Directory flower = new Directory("꽃");
        flower.addChild(new Directory("장미"));
        flower.addChild(new Directory("민들레"));

        Directory food = new Directory("음식");
        Directory pizza = new Directory("피자");
        food.addChild(pizza);
        pizza.addChild(new Directory("가게 정보"));

        food.addChild(new Directory("치킨"));
        food.addChild(new Directory("햄버거"));

        Directory habitat = new Directory("서식지");
        habitat.addChild(new Directory("아프리카"));
        habitat.addChild(new Directory("아시아"));
        habitat.addChild(new Directory("유럽"));

        Directory lion = new Directory("사자");
        lion.addChild(habitat);

        Directory animal = new Directory("동물");
        animal.addChild(lion);

        root.add(flower);
        root.add(food);
        root.add(animal);

        String findName = "아시아";
        if (contains(root, findName)) {
            System.out.println(String.format("%s 디렉토리 존재\n", findName));
        } else {
            System.out.println(String.format("%s 디렉토리 미존재\n", findName));
        }
        deleteDirectory(root, findName);

        System.out.println("##### 유럽 디렉토리 경로 #####");
        System.out.println(getDirectoryPath(root, "유럽"));
        System.out.println("##############################");

        System.out.println("##### 모든 디렉토리 출력 #####");
        print(root);
        System.out.println("##############################");
    }

    private static class Directory {
        String name;
        List<Directory> childList;
        Directory parent;

        public Directory(String name) {
            this.name = name;
            this.childList = new ArrayList<>();
            this.parent = null;
        }

        private void addChild(Directory child) {
            this.childList.add(child);
            child.setParent(this);
        }

        private void setParent(Directory parent) {
            this.parent = parent;
        }

        public List<Directory> getChildList() {
            return this.childList;
        }

        public Directory getParent() {
            return this.parent;
        }

        public String getName() {
            return this.name;
        }

        public boolean hasChild() {
            return this.childList.size() > 0;
        }

        public boolean hasParent() {
            return this.parent != null;
        }

        public void delete() {
            this.parent = null;
            this.childList = null;
        }
    }

    private static Directory getDirectory(List<Directory> root, String name) {
        if (root.isEmpty()) {
            return null;
        }

        Directory result = null;
        for (int i = 0; i < root.size(); i++) {
            Directory directory = root.get(i);

            if (name.equals(directory.getName())) {
                result = directory;
                break;
            }

            if (!directory.hasChild()) {
                continue;
            }

            List<Directory> childList = directory.getChildList();
            for (int j = 0; j < childList.size(); j++) {
                if (result != null) {
                    break;
                }

                Directory child = childList.get(j);
                result = walkByDirectory(child, name);
            }
        }
        return result;
    }

    private static void deleteDirectory(List<Directory> root, String name) {
        Directory directory = getDirectory(root, name);
        directory.getParent().getChildList().remove(directory);
        directory.delete();
    }

    private static String getDirectoryPath(List<Directory> root, String name) {
        Directory directory = getDirectory(root, name);

        String path = directory.getName();
        while (directory.hasParent()) {
            directory = directory.getParent();
            path = String.format("%s / %s", directory.getName(), path);
        }

        return path;
    }

    private static void print(List<Directory> root) {
        if (root == null || root.size() == 0) {
            return;
        }

        for (int i = 0; i < root.size(); i++) {
            Directory directory = root.get(i);
            System.out.println(directory.getName());

            if (directory.hasChild()) {
                walkByPrint(directory, directory.getName());
            }
        }
    }

    private static boolean contains(List<Directory> root, String name) {
        return getDirectory(root, name) != null;
    }

    private static void walkByPrint(Directory directory, String path) {
        if (!directory.hasChild()) {
            System.out.println(path);
        }

        List<Directory> childList = directory.getChildList();
        for (int i = 0; i < childList.size(); i++) {
            Directory child = childList.get(i);
            walkByPrint(child, String.format("%s / %s", path, child.getName()));
        }
    }

    private static Directory walkByDirectory(Directory directory, String name) {
        Directory result = null;
        List<Directory> childList = directory.getChildList();
        if (name.equals(directory.getName())) {
            return directory;
        }

        for (int i = 0; i < childList.size(); i++) {
            if (result != null) {
                break;
            }

            Directory child = childList.get(i);
            result = walkByDirectory(child, name);
        }

        return result;
    }
}
