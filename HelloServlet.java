

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.apache.catalina.ant.SessionsTask;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   response.setContentType("text/html;charset=UTF-8");
	       String btn=request.getParameter("btn");
	       HttpSession session = request.getSession();
	       
	       if(session.getAttribute("currentVal")==null){
	    	   double dd=0.0;
	    	   session.setAttribute("currentVal", dd);
	       }
	       System.out.println("Abc");
	       try {
	    	   
	       double currentValue=Double.parseDouble(request.getParameter("inputText"));

	       System.out.println("def");
	       double res;
	       ModelComputation mc=new ModelComputation();
	      
	            
	            if(btn.equalsIgnoreCase("Add") )
	            {
		             mc.setOperand1(Double.parseDouble(session.getAttribute("currentVal").toString()));
	        	     System.out.println("inside");
			         mc.setOperand2(Double.parseDouble(request.getParameter("inputText")));
			         res=mc.addition();
			         session.setAttribute("currentVal",res);
			         request.setAttribute("update", res);
			         System.out.println(res);
		        }	
	            if(btn.equalsIgnoreCase("Sub") )
	            {
	            	 mc.setOperand1(Double.parseDouble(session.getAttribute("currentVal").toString()));
	        	     System.out.println("inside");
			         mc.setOperand2(Double.parseDouble(request.getParameter("inputText")));
			         res=mc.subtitution();
			         session.setAttribute("currentVal",res);
			         request.setAttribute("update", res);
			         System.out.println(res);
	            }
	            if(btn.equalsIgnoreCase("Div") )
	            {
	            	 mc.setOperand1(Double.parseDouble(session.getAttribute("currentVal").toString()));
	        	     System.out.println("inside");
			         mc.setOperand2(Double.parseDouble(request.getParameter("inputText")));
			         res=mc.division();
			         session.setAttribute("currentVal",res);
			         request.setAttribute("update", res);
			         System.out.println(res);
	            }
	            if(btn.equalsIgnoreCase("Mul") )
	            {
	            	 mc.setOperand1(Double.parseDouble(session.getAttribute("currentVal").toString()));
	        	     System.out.println("inside");
			         mc.setOperand2(Double.parseDouble(request.getParameter("inputText")));
			         res=mc.multiplication();
			         session.setAttribute("currentVal",res);
			         request.setAttribute("update", res);
			         System.out.println(res);
	            }
	            if(btn.equalsIgnoreCase("Clear") )
	            {
	            	 request.setAttribute("update", 0.0);
	            }
	            if(btn.equalsIgnoreCase("Clear All") )
	            {
	            	 request.setAttribute("update", 0.0);
	            	 session.removeAttribute("currentVal");
	            }
	            	
		}catch (Exception e2) {System.out.println(e2);}  
		          
	    ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
	     
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
