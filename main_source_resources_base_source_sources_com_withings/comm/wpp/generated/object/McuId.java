package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class McuId extends h {
    public long high;
    public long low;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 311;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.high = readUnsignedInt(byteBuffer);
        this.low = readUnsignedInt(byteBuffer);
    }

    public McuId setHigh(long j5) {
        this.high = j5;
        return this;
    }

    public McuId setLow(long j5) {
        this.low = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.high);
        writeUnsignedInt(e11, this.low);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("McuId(");
        sb2.append("high = " + this.high);
        sb2.append(", ");
        return j.b(new StringBuilder("low = "), this.low, sb2, ")");
    }
}
