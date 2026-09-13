public interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(int ramGb);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGpu(String gpu);
    Computer build();
}
