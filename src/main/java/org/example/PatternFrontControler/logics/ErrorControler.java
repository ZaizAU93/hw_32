package org.example.PatternFrontControler.logics;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ErrorControler implements Controler{
    @Override
    public String processingRequest(HttpServletRequest request, HttpServletResponse response) {
        return "error.jsp";
    }
}
