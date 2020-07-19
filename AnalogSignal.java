package eric.designpattern.adapter;

public interface AnalogSignal {
    float[] getAnalog();

    void setAnalog(float[] analogData);

    void printAnalog();
}
