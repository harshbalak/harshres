/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author harshjainn
 */
@WebServlet(urlPatterns = {"/github"})
public class github extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
        
   {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    
    out.println("<h1>JAI MODI</h1>");
    
    }
    
     public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
        
   {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    
    out.println("<h1>Bharat mata ki jay</h1>");
            }
   
      

    }

