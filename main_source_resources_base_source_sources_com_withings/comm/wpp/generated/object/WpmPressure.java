package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WpmPressure extends h {
    public short pression;
    public long time;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1923;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.time = readUnsignedInt(byteBuffer);
        this.pression = readShort(byteBuffer);
    }

    public WpmPressure setPression(short s11) {
        this.pression = s11;
        return this;
    }

    public WpmPressure setTime(long j5) {
        this.time = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.time);
        writeShort(e11, this.pression);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WpmPressure(");
        sb2.append("time = " + this.time);
        sb2.append(", ");
        return e.a(new StringBuilder("pression = "), this.pression, sb2, ")");
    }
}
