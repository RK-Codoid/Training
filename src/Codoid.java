public class Codoid {

    int employeeCount;
    String employeeName;
    int chairCount;
    int laptopCount;
    int desktopCount;

        void rk(){
            System.out.println("Manual Tester");
        }
        void zubair(){
            System.out.println("Full Stack QA");
        }
        void parkash(){
            System.out.println("ETL");
        }

    public static void main(String[] args) {
        Codoid etl = new Codoid();
        etl.parkash();
        Codoid provana = new Codoid();
        provana.zubair();
        Codoid magic = new Codoid();
        magic.rk();
    }
}
