package org.example.PatternFrontControler.logics;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class downloadControler implements Controler{
    @Override
    public String processingRequest(HttpServletRequest request, HttpServletResponse response) {
        return "download.jsp";
    }
}
