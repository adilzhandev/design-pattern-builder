public class ComputerDirector {

    public Computer buildGamingPc(ComputerBuilder builder) {
        return builder
                .setCpu("Ryzen 7 7700X")
                .setRam(32)
                .setStorage("1 TB SSD")
                .setGpu("RTX 4070")
                .build();
    }

    public Computer buildOfficePc(ComputerBuilder builder) {
        return builder
                .setCpu("Intel i5-14400")
                .setRam(16)
                .setStorage("512 GB SSD")
                .build();
    }
}
