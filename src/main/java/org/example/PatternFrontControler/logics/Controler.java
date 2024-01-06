package org.example.PatternFrontControler.logics;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Controler {
    String processingRequest(HttpServletRequest request, HttpServletResponse response);
}
