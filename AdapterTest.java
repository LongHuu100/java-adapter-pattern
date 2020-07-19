import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.Test;

import eric.designpattern.adapter.AnalogSignal;
import eric.designpattern.adapter.AnalogToDigitAdapter;
import eric.designpattern.adapter.BinDigitSignal;
import eric.designpattern.adapter.DigitSignal;
import eric.designpattern.adapter.FloatAnalogSignal;

public class AdapterTest {
    private float[] analogData = { 0.2f, 1.4f, 3.12f, 0.9f };
    private byte[] binData = { 0, 1, 1, 0 };
    private float[] analogData2 = { 1.2f, 1.4f, 0.12f, 0.9f };

    public static void main(String[] args) {
        AnalogSignal analogSignal = new FloatAnalogSignal(analogData);
        analogSignal.printAnalog();

        DigitSignal digitSignal = new BinDigitSignal(binData);
        digitSignal.printDigit();

        // adapter
        AnalogToDigitAdapter adAdapter = new AnalogToDigitAdapter(analogSignal);
        adAdapter.printDigit();
        assertTrue(Arrays.equals(digitSignal.getDigit(), adAdapter.getDigit()));

        adAdapter.setAnalogData(analogData2);
        adAdapter.printDigit();
        assertFalse(Arrays.equals(digitSignal.getDigit(), adAdapter.getDigit()));
    }
}
