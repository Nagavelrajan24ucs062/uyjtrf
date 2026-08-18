import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/ExamServlet")
public class ExamServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
                           throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String q1 = request.getParameter("q1");
        String q2 = request.getParameter("q2");
        String q3 = request.getParameter("q3");
        String q4 = request.getParameter("q4");
        String q5 = request.getParameter("q5");
        String q6 = request.getParameter("q6");
        String q7 = request.getParameter("q7");
        String q8 = request.getParameter("q8");
        String q9 = request.getParameter("q9");
        String q10 = request.getParameter("q10");

        int score = 0;

        if ("HTML".equals(q1))
            score++;

        if ("CSS".equals(q2))
            score++;

        if ("a".equals(q3))
            score++;

        if ("img".equals(q4))
            score++;

        if ("color".equals(q5))
            score++;

        if ("tr".equals(q6))
            score++;

        if ("href".equals(q7))
            score++;

        if ("background-color".equals(q8))
            score++;

        if ("radio".equals(q9))
            score++;

        if ("p".equals(q10))
            score++;

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Exam Result</title>");

        out.println("<style>");
        out.println("body{font-family:Arial;background-color:lightblue;text-align:center;}");
        out.println(".result{width:600px;margin:50px auto;background:white;padding:30px;}");
        out.println("h1{color:navy;}");
        out.println("h2{color:green;}");
        out.println("</style>");

        out.println("</head>");
        out.println("<body>");

        out.println("<div class='result'>");

        out.println("<h1>Online Examination Result</h1>");

        out.println("<h3>Answers Entered by User</h3>");

        out.println("<p>Question 1: " + q1 + "</p>");
        out.println("<p>Question 2: " + q2 + "</p>");
        out.println("<p>Question 3: " + q3 + "</p>");
        out.println("<p>Question 4: " + q4 + "</p>");
        out.println("<p>Question 5: " + q5 + "</p>");
        out.println("<p>Question 6: " + q6 + "</p>");
        out.println("<p>Question 7: " + q7 + "</p>");
        out.println("<p>Question 8: " + q8 + "</p>");
        out.println("<p>Question 9: " + q9 + "</p>");
        out.println("<p>Question 10: " + q10 + "</p>");

        out.println("<h2>Final Score: " + score + " / 10</h2>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}