public class GamingComputerBuilder extends AbstractComputerBuilder {
    private static final int MIN_RAM_GB = 16;
    private static final String TYPE = "Gaming";

    @Override
    public Computer build() {
        if (cpu == null || storage == null || gpu == null) {
            throw new IllegalStateException("Gaming PC needs CPU, storage and GPU");
        }
        if (ramGb < MIN_RAM_GB) {
            throw new IllegalStateException("Gaming PC needs at least " + MIN_RAM_GB + " GB RAM");
        }
        return new Computer(cpu, ramGb, storage, gpu, TYPE);
    }
}
