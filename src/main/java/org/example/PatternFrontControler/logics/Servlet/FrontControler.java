package org.example.PatternFrontControler.logics.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.PatternFrontControler.logics.Controler;
import org.example.PatternFrontControler.logics.ErrorControler;
import org.example.PatternFrontControler.logics.IndexControler;
import org.example.PatternFrontControler.logics.downloadControler;

import java.io.IOException;

@WebServlet ("/")
public class FrontControler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirectToSpecificController(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirectToSpecificController(req, resp);
    }
    void redirectToSpecificController(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String path = req.getServletPath();
        Controler controler;

        if (path.equals("/index")){
            controler = new IndexControler();
        }else if (path.equals("/download")) {
            controler = new downloadControler();
        } else {
            controler = new ErrorControler();
        }

        String answer = controler.processingRequest(req, res);
        req.getRequestDispatcher(answer).forward(req, res);

    }
}
