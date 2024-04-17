package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class BatteryPercent extends h {
    public int percent;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 263;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.percent = readUnsignedShort(byteBuffer);
    }

    public BatteryPercent setPercent(int i11) {
        this.percent = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.percent);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("percent = "), this.percent, new StringBuilder("BatteryPercent("), ")");
    }
}
