package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FeatureMask extends h {
    public static final short ALARM_BIT_END_TIME_POSITION = 3;
    public static final short ALARM_BIT_LONG_CMD_POSITION = 0;
    public static final short ALARM_BIT_NAME_POSITION = 1;
    public static final short ALARM_BIT_START_TIME_POSITION = 2;
    public long mask;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 307;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mask = readUnsignedInt(byteBuffer);
    }

    public FeatureMask setMask(long j5) {
        this.mask = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.mask);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return j.b(new StringBuilder("mask = "), this.mask, new StringBuilder("FeatureMask("), ")");
    }
}
