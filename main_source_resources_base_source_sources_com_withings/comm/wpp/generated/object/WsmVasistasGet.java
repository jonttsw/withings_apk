package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsmVasistasGet extends h {
    public int max;
    public long utcStart;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2056;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.utcStart = readUnsignedInt(byteBuffer);
        this.max = readUnsignedShort(byteBuffer);
    }

    public WsmVasistasGet setMax(int i11) {
        this.max = i11;
        return this;
    }

    public WsmVasistasGet setUtcStart(long j5) {
        this.utcStart = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.utcStart);
        writeUnsignedShort(e11, this.max);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsmVasistasGet(");
        sb2.append("utcStart = " + this.utcStart);
        sb2.append(", ");
        return e.a(new StringBuilder("max = "), this.max, sb2, ")");
    }
}
