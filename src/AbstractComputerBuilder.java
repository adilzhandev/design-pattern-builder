public abstract class AbstractComputerBuilder implements ComputerBuilder {
    protected String cpu;
    protected int ramGb;
    protected String storage;
    protected String gpu;

    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ramGb) {
        this.ramGb = ramGb;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
}
