/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foldertree;

/**
 * Kelas Tree untuk menyimpan pohon dari kelas simpul
 */
public class Tree {
    private Node root; // simpul akar

    /**
     * Konstruktor
     */
    public Tree() {
        root = new Node();
    }

    /**
     * Menambah simpul ke dalam pohon sebagai simpul anak dari simpul parentName
     * @param parentName nama simpul orangtua dari simpul anak yang akan ditambah
     * @param name nama berkas/file untuk simpul anak yang akan ditambah
     * @param diskSize ukuran berkas/file untuk simpul anak yang akan ditambah
     * @return true jika penambahan berhasil, false jika gagal
     */
    public boolean addNode(String parentName, String name, int diskSize) {
        if (root == null) {
            root = new Node(name, diskSize);
            return true;
        } else {
            Node parent = root.findChildNode(parentName);
            if (parent != null) {
                Node newNode = new Node(name, diskSize);
                return parent.addChildNode(newNode);
            }
            return false;
        }
    }

    /**
     * Menghitung jumlah bytes dari semua folder/berkas di pohon ini
     * @return Jumlah bytes dari semua berkas/folder di pohon
     */
    public int calculateSize() {
        if (root != null) {
            return calculateSize(root);
        }
        return 0;
    }

    /**
     * Metode rekursif untuk menghitung jumlah bytes dari semua folder/berkas di pohon
     * @param node Simpul saat ini yang akan dihitung ukuran berkasnya
     * @return Jumlah bytes dari folder/berkas pada simpul saat ini dan semua anak-anaknya
     */
    private int calculateSize(Node node) {
        if (node == null) {
            return 0;
        }
        int totalSize = node.getDiskSize();
        for (Node child : node.getChildren()) {
            totalSize += calculateSize(child);
        }
        return totalSize;
    }
}