public class Computer {
    private final String cpu;
    private final int ramGb;
    private final String storage;
    private final String gpu;
    private final String type;

    public Computer(String cpu, int ramGb, String storage, String gpu, String type) {
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.storage = storage;
        this.gpu = gpu;
        this.type = type;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamGb() {
        return ramGb;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " PC: " + cpu + ", " + ramGb + " GB RAM, " + storage + ", GPU: " + gpu;
    }
}
