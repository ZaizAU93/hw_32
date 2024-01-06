package org.example.PatternSessionFacade;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.PatternDTO.OrderDTO;

import java.io.IOException;

@WebServlet("/session")
public class SessionFacadeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String food = req.getParameter("food");
        String drink = req.getParameter("drink");
        OrderDTO dto = new OrderDTO(food, drink);
        SessionFacadeOrder sessionFacadeOrder = new SessionFacadeOrder(dto);
        req.setAttribute("food", sessionFacadeOrder.priceOrder().getFood());
        req.setAttribute("drink", sessionFacadeOrder.priceOrder().getDrink());
        req.setAttribute("price", sessionFacadeOrder.priceOrder().getPrice());
        getServletContext().getRequestDispatcher("/Order.jsp").forward(req, resp);
    }
}
