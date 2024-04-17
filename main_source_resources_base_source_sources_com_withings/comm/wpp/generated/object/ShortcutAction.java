package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ShortcutAction extends h {
    public static final short BREATH = 5;
    public static final short DND = 8;
    public static final short ECG_MEAS = 1;
    public static final short FINDMYPHONE = 10;
    public static final short FLASHLIGHT = 11;
    public static final short NONE = 0;
    public static final short QUICKLOOK = 9;
    public static final short SPO2_MEAS = 2;
    public static final short STOPWATCH = 6;
    public static final short TIMER = 7;
    public static final short WORKOUT_SELECTION = 4;
    public static final short WORKOUT_START = 3;
    public short value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2465;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readUnsignedByte(byteBuffer);
    }

    public ShortcutAction setValue(short s11) {
        this.value = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("value = "), this.value, new StringBuilder("ShortcutAction("), ")");
    }
}
