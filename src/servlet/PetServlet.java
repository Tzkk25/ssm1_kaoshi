package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Pet;
import service.PetService;
import service.impl.PetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/petServlet")
public class PetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PetService ps = new PetServiceImpl();

        List<Pet> list = ps.getPets();

        if (list.size()>0){
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(list);
            PrintWriter out = response.getWriter();
            out.print(json);
            out.close();
        }
    }
}