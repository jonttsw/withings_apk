package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Heartrate extends h {
    public short heartrate;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2452;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.heartrate = readUnsignedByte(byteBuffer);
    }

    public Heartrate setHeartrate(short s11) {
        this.heartrate = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.heartrate);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("heartrate = "), this.heartrate, new StringBuilder("Heartrate("), ")");
    }
}
