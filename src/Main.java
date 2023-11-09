public class Main {
    public static void main(String[] args) {

        Vehiculo car = new Vehiculo();
        car.setMatricula("AA 123455");
        car.setModelo("Rogue");
        car.setMarca("nissan");
        car.setColor("platinum");
        car.setCombustible("Diesel");
        car.setMotor("30/37 MPG");
        car.setCaballos("201");
        System.out.println(car.getMatricula());
        System.out.println(car.getModelo());
        System.out.println(car.getMarca());
        System.out.println(car.getColor());
        System.out.println(car.getCombustible());
        System.out.println(car.getMotor());
        System.out.println(car.getCaballos());

        Cliente cliente = new Cliente();
        cliente.setNombre("Jungkook");
        cliente.setApellidos("Dominguez lopez");
        cliente.setDni("70001501T");
        cliente.setDireccion("Paseo San Roque 29 1A");
        cliente.setTelefono("677-997-798");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getApellidos());
        System.out.println(cliente.getDni());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getTelefono());

        DatoDeVenta datodeventa = new DatoDeVenta();
        datodeventa.setCodigodeventa("06997");
        datodeventa.setFechadeventa("09/11/2023");
        datodeventa.setFormadepago("credit card");
        datodeventa.setPreciodeventa("27,900");
        System.out.println(datodeventa.getCodigodeventa());
        System.out.println(datodeventa.getFechadeventa());
        System.out.println(datodeventa.getFormadepago());
        System.out.println(datodeventa.getPreciodeventa());

    }
}