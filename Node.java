/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foldertree;

/**
 * Kelas ini merepresentasikan sebuah simpul, baik berupa folder atau berkas
 * Simpul ini memiliki nama folder/berkas (name), ukuran berkas (diskSize) dan referensi ke simpul anak (children).
 * Variabel pembantu yang kita gunakan adalah numChildNode yang menyimpan jumlah simpul anak yang dipunyai.
 */
public class Node {
    public static final int CAPACITY = 1000; // kapasitas array jumlah simpul anak
    private String name = ""; // Nama berkas/folder
    private int diskSize = 0; // Ukuran dari berkas/folder.
    private int numChildNode = 0; // Jumlah simpul anak
    private Node[] children; // Simpul anak

    /**
     * Konstruktor
     */
    public Node() {
        children = new Node[CAPACITY];
    }

    /**
     * Konstruktor
     * @param inputName nama file/folder
     * @param inputDiskSize ukuran berkas/folder
     */
    public Node(String inputName, int inputDiskSize) {
        this.setName(inputName);
        this.setDiskSize(inputDiskSize);
        children = new Node[CAPACITY];
    }

    /**
     * Menambah simpul anak
     * @param child simpul anak yang akan ditambah
     * @return true jika penambahan berhasil, false jika penuh
     */
    public boolean addChildNode(Node child) {
        if (numChildNode < CAPACITY) {
            children[numChildNode] = child;
            numChildNode++;
            return true;
        } else {
            // Penuh, tidak bisa menambah simpul anak lagi
            return false;
        }
    }

    /**
     * Menemukan simpul anak dengan nama berkas/folder tertentu
     * @param nodeName nama berkas/folder yang dicari
     * @return simpul anak yang sesuai dengan nama, atau null jika tidak ditemukan
     */
    public Node findChildNode(String nodeName) {
        if (nodeName.equals(this.name)) {
            // Ketemu simpul yang dicari
            return this;
        } else {
            // Cek simpul anak
            for (int i = 0; i < numChildNode; i++) {
                Node node = children[i].findChildNode(nodeName);
                if (node != null) {
                    return node;
                }
            }
            return null; // Tidak ada simpul yang dicari
        }
    }

    /**
     * Getter untuk simpul anak
     * @return array dari simpul anak
     */
    public Node[] getChildren() {
        return children;
    }

    /**
     * Getter untuk nama berkas/folder
     * @return nama berkas/folder
     */
    public String getName() {
        return name;
    }

    /**
     * Getter untuk ukuran berkas/folder
     * @return ukuran berkas/folder
     */
    public int getDiskSize() {
        return diskSize;
    }

    /**
     * Setter untuk nama berkas/folder
     * @param name nama berkas/folder
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter untuk ukuran berkas/folder
     * @param diskSize ukuran berkas/folder
     */
    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }
}