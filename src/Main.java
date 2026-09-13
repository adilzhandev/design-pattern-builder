public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        System.out.println(director.buildGamingPc(new GamingComputerBuilder()));
        System.out.println(director.buildOfficePc(new OfficeComputerBuilder()));

        Computer custom = new GamingComputerBuilder()
                .setCpu("Intel i7-14700K")
                .setRam(32)
                .setStorage("2 TB SSD")
                .setGpu("RTX 4070 Ti")
                .build();
        System.out.println(custom);

        try {
            new GamingComputerBuilder()
                    .setCpu("Ryzen 5")
                    .setRam(32)
                    .setStorage("1 TB SSD")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
