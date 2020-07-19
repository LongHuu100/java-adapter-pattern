package eric.designpattern.adapter;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinDigitSignal implements DigitSignal {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private byte[] data;

    public BinDigitSignal(byte[] data) {
        this.data = data;
    }

    @Override
    public byte[] getDigit() {
        return data;
    }

    @Override
    public void setDigit(byte[] digitData) {
        this.data = digitData;
    }

    @Override
    public void printDigit() {
        logger.info("{}", Arrays.toString(getDigit()));
    }
}
