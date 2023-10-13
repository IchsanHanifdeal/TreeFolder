/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foldertree;

/**
 * Kelas untuk mendefinisikan pohon folder/berkas
 * @author tisha
 */
public class FolderTree {

    public static void main(String[] args) {
        //Pohon berkas/folder
        Tree folderTree = new Tree();
        
        //Folder teratas
        folderTree.addNode("", "C:/", 0);
        
        //Isi folder C:/
        folderTree.addNode("C:/", "Documents", 0);
        folderTree.addNode("C:/", "Data", 0);
        folderTree.addNode("C:/", "Desktop", 0);
        folderTree.addNode("C:/", "Downloads", 0);
        
        //Isifolder Documents
        folderTree.addNode("Documents", "Slide",  0);
        folderTree.addNode("Documents", "My_Pictures",  0);
        
        //Isi folder Slide
        folderTree.addNode("Slide", "Slide1.pptx",  67545366);
        folderTree.addNode("Slide", "Slide2.pptx",  6820603);
        folderTree.addNode("Slide", "Slide3.pptx",  5909391);
        folderTree.addNode("Slide", "Slide4.pptx",  19324884);
        
        //Isi folder My Pictures
        folderTree.addNode("My_Pictures", "pic1.png",  27556);
        folderTree.addNode("My_Pictures", "pic2.png",  94712);
        folderTree.addNode("My_Pictures", "pic3.png",  70743);
        folderTree.addNode("My_Pictures", "pic4.png",  89635);
        folderTree.addNode("My_Pictures", "pic5.png",  74476);
        
        //Isi folder Data
        folderTree.addNode("Data", "Research", 0);
        folderTree.addNode("Data", "parse_input.R", 3638);
        folderTree.addNode("Data", "make_cluster.R", 7781);
        folderTree.addNode("Data", "Tree.java", 10180);
        folderTree.addNode("Data", "Node.java", 10446);
        
        //Isi folder Research
        folderTree.addNode("Research", "research_proposal.docx", 29324888);
        folderTree.addNode("Research", "draft.pdf", 12324007);
       
        //Isi folder Desktop
        folderTree.addNode("Desktop", "icon1.ico", 3559);
        folderTree.addNode("Desktop", "icon2.ico", 1471);
        
        //Isi folder Downloads
        folderTree.addNode("Downloads", "temp.xlsx", 152441);
        
        //Menghitung ukuran berkas/folder 
        int totalSize = folderTree.calculateSize();
        
        System.out.println("Total Size:" + totalSize + "bytes");
    }
}