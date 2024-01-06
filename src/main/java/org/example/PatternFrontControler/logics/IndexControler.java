package org.example.PatternFrontControler.logics;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexControler implements Controler{
    @Override
    public String processingRequest(HttpServletRequest request, HttpServletResponse response) {
        return "index.jsp";
    }
}
