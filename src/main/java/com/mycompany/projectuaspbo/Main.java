/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectuaspbo;

import com.mycompany.projectuaspbo.db.NoteAppMenu;


/**
 *2
 * @author Wafiudin
 */
public class Main{

    public static void main(String[] args) {
        NoteAppMenu noteapp = new NoteAppMenu("notes.db");
        noteapp.start();
    }
}
