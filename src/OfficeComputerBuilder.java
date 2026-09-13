public class OfficeComputerBuilder extends AbstractComputerBuilder {
    private static final int MIN_RAM_GB = 8;
    private static final String DEFAULT_GPU = "Integrated";
    private static final String TYPE = "Office";

    public OfficeComputerBuilder() {
        this.gpu = DEFAULT_GPU;
    }

    @Override
    public Computer build() {
        if (cpu == null || storage == null) {
            throw new IllegalStateException("Office PC needs CPU and storage");
        }
        if (ramGb < MIN_RAM_GB) {
            throw new IllegalStateException("Office PC needs at least " + MIN_RAM_GB + " GB RAM");
        }
        return new Computer(cpu, ramGb, storage, gpu, TYPE);
    }
}
