/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 652343
 */
public class NoteServlet extends HttpServlet
  {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
      {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String titleFromTxt = br.readLine();
        String contentFromTxt = br.readLine();

        Note n = new Note();
        n.setTitle(titleFromTxt);
        n.setContent(contentFromTxt);

        request.setAttribute("note", n);

        String a = request.getParameter("edit");

        if (a == null)
          {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
          } else

          {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
          }

        br.close();
      }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
      {


        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        String newTitle = request.getParameter("editTitleBox");
        String newContent = request.getParameter("editContentBox");

        pw.write(newTitle + "\n" + newContent + "\n");
        pw.close();
        
        Note n = new Note(newTitle, newContent);
        
        request.setAttribute("note", n);

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

      }

  }
