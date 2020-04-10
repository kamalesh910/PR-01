package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.data.phase.ShowInstruction;

public class RecipeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 Configuration con = new Configuration().configure().addAnnotatedClass(ShowInstruction.class);
     
     ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
     
     SessionFactory sf = con.buildSessionFactory(reg);
     
     Session session = sf.openSession();
     
     Transaction tx ;
	
	public void saveData(Object data)
	{
        tx = session.beginTransaction();
        
        session.save(data);
        
        tx.commit();
	}

	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws IOException, ServletException
		   {
		 String svg ="<svg height=\"590px\" ;=\"\" width=\"650px\" style=\"border:1px solid black\">\r\n" + 
		 		"<g>\r\n" + 
		 		"<rect id=\"box\" x=\"250\" y=\"20\" height=\"50\" width=\"130\" ondblclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\" fill=\"gray\"></rect>\r\n" + 
		 		" <text x=\"280\" y=\"50\" font-family=\"sans-serif\" fill=\"white\" font-size=\"20\">Start</text> \r\n" + 
		 		"</g>\r\n" + 
		 		" <rect id=\"rec250\" x=\"150\" y=\"120\" height=\"50\" width=\"130\" ondblclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\" fill=\"gray\"></rect><rect id=\"rec250\" x=\"350\" y=\"120\" height=\"50\" width=\"130\" ondblclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\" fill=\"gray\"></rect><rect id=\"rec150\" x=\"150\" y=\"220\" height=\"50\" width=\"130\" ondblclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\" fill=\"gray\"></rect><rect id=\"rec150\" x=\"50\" y=\"320\" height=\"50\" width=\"130\" ondblclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\" fill=\"gray\"></rect><rect id=\"rec150\" x=\"250\" y=\"320\" height=\"50\" width=\"130\" ondblclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\" fill=\"gray\"></rect><line id=\"line2\" x1=\"315\" y1=\"70\" x2=\"215\" y2=\"120\" onclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\"></line><line id=\"line2\" x1=\"215\" y1=\"170\" x2=\"215\" y2=\"220\" onclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\"></line><line id=\"line2\" x1=\"215\" y1=\"270\" x2=\"115\" y2=\"320\" onclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\"></line><line id=\"line2\" x1=\"215\" y1=\"270\" x2=\"315\" y2=\"320\" onclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\"></line><line id=\"line2\" x1=\"315\" y1=\"70\" x2=\"415\" y2=\"120\" onclick=\"myFunction(this)\" style=\"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)\"></line><text id=\"t150\" x=\"155\" y=\"140\" font-family=\"sans-serif\" font-size=\"15px\" fill=\"yellow\">Get process Value</text></svg>";	
		 request.getParameter("svg");
		 System.out.println( request.getCookies().toString());
		     response.getWriter().println("<html><head>\r\n" + 
		     		"<meta charset=\"ISO-8859-1\">\r\n" + 
		     		"<title>Designer</title>\r\n" + 
		     		"<link rel=\"stylesheet\" href=\"Css/style.css\">\r\n" + 
		     		"<script src=\"Javascript/backend.js\"></script>\r\n" + 
		     		"<script src=\"Javascript/action.js\"></script>\r\n" + 
		     		"<script src=\"Javascript/phases.js\"></script>\r\n" + 
		     		"</head>\r\n" + 
		     		"<body data-gr-c-s-loaded=\"true\" cz-shortcut-listen=\"true\">\r\n" + 
		     		"<style>\r\n" + 
		     		"middle{border-style: solid;}\r\n" + 
		     		"\r\n" + 
		     		"body {\r\n" + 
		     		"  font-family: Arial, Helvetica, sans-serif;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".navbar {\r\n" + 
		     		"  overflow: hidden;\r\n" + 
		     		"  background-color: #333;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".navbar a {\r\n" + 
		     		"  float: left;\r\n" + 
		     		"  font-size: 16px;\r\n" + 
		     		"  color: white;\r\n" + 
		     		"  text-align: center;\r\n" + 
		     		"  padding: 14px 16px;\r\n" + 
		     		"  text-decoration: none;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".dropdown {\r\n" + 
		     		"  float: left;\r\n" + 
		     		"  overflow: hidden;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".dropdown .dropbtn {\r\n" + 
		     		"  font-size: 16px;  \r\n" + 
		     		"  border: none;\r\n" + 
		     		"  outline: none;\r\n" + 
		     		"  color: white;\r\n" + 
		     		"  padding: 14px 16px;\r\n" + 
		     		"  background-color: inherit;\r\n" + 
		     		"  font-family: inherit;\r\n" + 
		     		"  margin: 0;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".navbar a:hover, .dropdown:hover .dropbtn {\r\n" + 
		     		"  background-color: #008000;\r\n" + 
		     		"}\r\n" + 
		     		" \r\n" + 
		     		".dropdown-content {\r\n" + 
		     		"  display: none;\r\n" + 
		     		"  position: absolute;\r\n" + 
		     		"  background-color: #f9f9f9;\r\n" + 
		     		"  min-width: 160px;\r\n" + 
		     		"  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n" + 
		     		"  z-index: 1;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".dropdown-content a {\r\n" + 
		     		"  float: none;\r\n" + 
		     		"  color: black;\r\n" + 
		     		"  padding: 12px 16px;\r\n" + 
		     		"  text-decoration: none;\r\n" + 
		     		"  display: block;\r\n" + 
		     		"  text-align: left;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".dropdown-content a:hover {\r\n" + 
		     		"  background-color: #ddd;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		".dropdown:hover .dropdown-content {\r\n" + 
		     		"  display: block;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		"#BUTTON button{\r\n" + 
		     		" height:25px;\r\n" + 
		     		" width:150px;\r\n" + 
		     		" color:black;\r\n" + 
		     		" font-size:15px;\r\n" + 
		     		"}\r\n" + 
		     		"\r\n" + 
		     		" #btn button\r\n" + 
		     		" {\r\n" + 
		     		" height:25px;\r\n" + 
		     		" width:80px;\r\n" + 
		     		" color:red;\r\n" + 
		     		" font-size:20px;\r\n" + 
		     		" }\r\n" + 
		     		" \r\n" + 
		     		" #parameter {\r\n" + 
		     		"  height:400px;\r\n" + 
		     		" width:230px;\r\n" + 
		     		" margin:10px;\r\n" + 
		     		" background-color:white;\r\n" + 
		     		" }\r\n" + 
		     		" \r\n" + 
		     		"  #details{\r\n" + 
		     		"  height:60px;\r\n" + 
		     		" width:230px;\r\n" + 
		     		" margin:10px;\r\n" + 
		     		" color:white;\r\n" + 
		     		" }\r\n" + 
		     		" \r\n" + 
		     		" *label{font-size:20px;}\r\n" + 
		     		"</style>\r\n" + 
		     		"\r\n" + 
		     		"<div class=\"navbar\">\r\n" + 
		     		"<div class=\"dropdown\">\r\n" + 
		     		"    <button class=\"dropbtn\">File \r\n" + 
		     		"      <i class=\"fa fa-caret-down\"></i>\r\n" + 
		     		"    </button>\r\n" + 
		     		"    <div class=\"dropdown-content\">\r\n" + 
		     		"      <a onclick=\"promptP()\">new</a>\r\n" + 
		     		"      <a href=\"#\">open</a>\r\n" + 
		     		"      <a href=\"#\">clear</a>\r\n" + 
		     		"    </div>\r\n" + 
		     		"  </div> \r\n" + 
		     		"  <a href=\"#home\">Edit</a>\r\n" + 
		     		"  <a href=\"#news\">View</a>\r\n" + 
		     		"   <a href=\"#news\">help</a>\r\n" + 
		     		"  \r\n" + 
		     		"</div>\r\n" + 
		     		"\r\n" + 
		     		"\r\n" + 
		     		"<div id=\"container\">\r\n" + 
		     		" \r\n" + 
		     		"   <div id=\"setlist\" style=\"border-style: ridge;\">\r\n" + 
		     		"       <h1 align=\"center\" style=\"color: white;\">SETLIST</h1>\r\n" + 
		     		"    <div id=\"BUTTON\" style=\"margin: 10; padding: 10;\">                \r\n" + 
		     		"     <ul style=\"list-style-type:square;\">\r\n" + 
		     		"       <li><button type=\"button\" id=\"shi\" onclick=\"shwin(this)\">Show Instruction</button></li>\r\n" + 
		     		"          <br>\r\n" + 
		     		"       <li><button type=\"button\" id=\"gtv\" onclick=\"gett(this)\">Get Text</button></li>\r\n" + 
		     		"          <br>    \r\n" + 
		     		"       <li><button type=\"button\" id=\"gpv\" onclick=\"getprv(this)\">Get Processing Value</button></li>    \r\n" + 
		     		"     </ul>\r\n" + 
		     		"    </div>\r\n" + 
		     		"    </div>\r\n" + 
		     		"\r\n" + 
		     		"\r\n" + 
		     		"    <div id=\"workspace\" style=\"border-style: ridge;\">\r\n" + 
		     		"       <h1 align=\"center\" style=\"color:white;background-color:#333\">WORKSPACE</h1>\r\n" + 
		     		"    <div id=\"control\" style=\"height:40px\">     \r\n" + 
		     		"<div id=\"btn\" align=\"center\" style=\"padding-top:7px;\">\r\n" + 
		     		"<button id=\"insert\" onclick=\"insertPh(this)\" style=\"font-color:white;\">Insert</button>\r\n" + 
		     		"	\r\n" + 
		     		"<button id=\"add\" onclick=\"add(this)\" style=\"font-color:yellow;\">Add</button>\r\n" + 
		     		"\r\n" + 
		     		"<button id=\"delt\" onclick=\"deleteAc(this)\" style=\"font-color:blue;\">Delete</button>\r\n" + 
		     		"\r\n" + 
		     		"<button id=\"conn\" onclick=\"connectBlock(this)\" style=\"font-color:pink;\">Connect</button>\r\n" + 
		     		"\r\n" + 
		     		"<button id=\"para\" onclick=\"parallel(this)\" style=\"font-color:black;\">Parallel</button>\r\n" + 
		     		"\r\n" + 
		     		"<button id=\"branch\" onclick=\"branch(this)\" style=\"font-color:golden;\">Branch</button>\r\n" + 
		     		"\r\n" + 
		     		"<button id=\"para\" onclick=\"parameter(this)\" style=\"font-color:yellow;\">Edit</button>\r\n" + 
		     		"\r\n" + 
		     		"	</div>\r\n" + 
		     		"    </div> \r\n" +svg + 
		     		"    </div>\r\n" + 
		     		"\r\n" + 
		     		"\r\n" + 
		     		"    <div id=\"view\" style=\"border-style: ridge;\">\r\n" + 
		     		"       <h1 align=\"center\" style=\"color:white;\">   View</h1>\r\n" + 
		     		"       <div id=\"details\">\r\n" + 
		     		"            <h3 align=\"center\">Basic Details</h3>\r\n" + 
		     		"         <br>   \r\n" + 
		     		"        <p id=\"rname\" for=\"fname\">Workflow : </p>\r\n" + 
		     		"        \r\n" + 
		     		"        <br>\r\n" + 
		     		"        <label for=\"lname\">User     : kdhage</label>\r\n" + 
		     		"         <br>     \r\n" + 
		     		"       </div>\r\n" + 
		     		"             \r\n" + 
		     		"       <div id=\"parameter\">\r\n" + 
		     		"       <h3 align=\"center\">Parameter Details</h3>\r\n" + 
		     		"     <form action=\"addData\">     \r\n" + 
		     		"  <label for=\"fname\">Instruction :</label>\r\n" + 
		     		"  <br> \r\n" + 
		     		"  <input type=\"text\" id=\"instruction\" name=\"instrcution\">\r\n" + 
		     		"  <br><br>\r\n" + 
		     		"  <label for=\"low\">Low Limit:</label>\r\n" + 
		     		"  <br>\r\n" + 
		     		"  <input type=\"text\" id=\"llimit\" name=\"low\"><br><br>\r\n" + 
		     		"  <label for=\"high\">High Limit:</label>\r\n" + 
		     		"  <br>\r\n" + 
		     		"  <input type=\"text\" id=\"hlimit\" name=\"high\"><br><br>      \r\n" + 
		     		"  <input type=\"submit\" value=\"Return Menu\">  \r\n" + 
		     		"  </form>     \r\n" + 
		     		"      </div>\r\n" + 
		     		"    </div>\r\n" + 
		     		"\r\n" + 
		     		"\r\n" + 
		     		"</div>\r\n" + 
		     		"\r\n" + 
		     		"\r\n" + 
		     		"</body></html>");
		      System.out.println("kamalesh");             		  
           }

}
