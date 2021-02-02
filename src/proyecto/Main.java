import java.util.List;

public class Main {

    public static void main(String[] args) throws Throwable {
        ReporteDAO reporte1 = new ReporteDAO();
        List<Reporte1DTO> reporte1DTOs = reporte1.reporte1DTOs(2017);
        System.out.println(" ---------------- Reporte 1 --------------- \n");
        reporte1DTOs.forEach(System.out::println);

        ReporteDAO reporte2 = new ReporteDAO();
        List<Reporte2DTO> reporte2DTOs = reporte2.reporte2DTOs(2017);
        System.out.println(" ---------------- Reporte 2 --------------- \n");
        reporte2DTOs.forEach(System.out::println);

        ReporteDAO reporte3 = new ReporteDAO();
        List<Reporte3DTO> reporte3DTOs = reporte3.reporte3DTOs();
        System.out.println(" ---------------- Reporte 3 --------------- \n");
        reporte3DTOs.forEach(System.out::println);
    }
}
