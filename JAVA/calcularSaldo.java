
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class calcularSaldo extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            String nombreusuario = request.getParameter("nombreusuario");
            int sueldo = Integer.getInteger(request.getParameter("sueldo"));
            int dias = Integer.getInteger(request.getParameter("dias"));
            int result = saldoCalculado(sueldo, dias);
            
        }catch (NumberFormatException e){
            e.printStackTrace();
        }  catch (Exception e) {
            e.getMessage();
        }
    }
    public int saldoCalculado(int sueldo, int dias){
        return sueldo * dias;
    }

}