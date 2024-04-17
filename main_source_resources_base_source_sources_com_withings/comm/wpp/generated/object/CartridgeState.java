package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CartridgeState extends h {
    public static final short ACTIVATED_READY = 0;
    public static final short BEING_ACTIVATED = 5;
    public static final short MEAS_IN_PROGRESS = 1;
    public static final short NOT_ACTIVATED = 4;
    public static final short NOT_VALID = 3;
    public static final short START_MEASURE_FAILED = 6;
    public static final short UNREADABLE = 2;
    public short state;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2478;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.state = readUnsignedByte(byteBuffer);
    }

    public CartridgeState setState(short s11) {
        this.state = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.state);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("state = "), this.state, new StringBuilder("CartridgeState("), ")");
    }
}
