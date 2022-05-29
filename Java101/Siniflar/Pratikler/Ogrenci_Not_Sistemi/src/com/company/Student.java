package com.company;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matS, int fizik, int fizikS, int kimya, int kimyaS) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (matS >= 0 && matS <= 100) {
            this.mat.noteS = matS;
        }

        if (kimyaS >= 0 && kimyaS <= 100) {
            this.kimya.noteS = kimyaS;
        }

        if (fizikS >= 0 && fizikS <= 100) {
            this.fizik.noteS = fizikS;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.mat.note * 0.8) + (this.mat.noteS * 0.2)) + ((this.fizik.note * 0.8) + (this.fizik.noteS * 0.2)) + ((this.kimya.note * 0.8) + (this.kimya.noteS * 0.2))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.noteS);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.noteS);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.noteS);
    }

}
