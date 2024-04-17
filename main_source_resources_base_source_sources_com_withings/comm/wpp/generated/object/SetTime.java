package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SetTime extends h {
    public int gmtOffset;
    public long utc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SET_TIME;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.utc = readUnsignedInt(byteBuffer);
        this.gmtOffset = readInt(byteBuffer);
    }

    public SetTime setGmtOffset(int i11) {
        this.gmtOffset = i11;
        return this;
    }

    public SetTime setUtc(long j5) {
        this.utc = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.utc);
        writeInt(e11, this.gmtOffset);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetTime(");
        sb2.append("utc = " + this.utc);
        sb2.append(", ");
        return e.a(new StringBuilder("gmtOffset = "), this.gmtOffset, sb2, ")");
    }
}
