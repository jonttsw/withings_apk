package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class TimeSet extends h {
    public long dstChangeTime;
    public int gmtOffset;
    public int nextGmtOffset;
    public long utc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 16;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1281;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.utc = readUnsignedInt(byteBuffer);
        this.gmtOffset = readInt(byteBuffer);
        this.dstChangeTime = readUnsignedInt(byteBuffer);
        this.nextGmtOffset = readInt(byteBuffer);
    }

    public TimeSet setDstChangeTime(long j5) {
        this.dstChangeTime = j5;
        return this;
    }

    public TimeSet setGmtOffset(int i11) {
        this.gmtOffset = i11;
        return this;
    }

    public TimeSet setNextGmtOffset(int i11) {
        this.nextGmtOffset = i11;
        return this;
    }

    public TimeSet setUtc(long j5) {
        this.utc = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.utc);
        writeInt(e11, this.gmtOffset);
        writeUnsignedInt(e11, this.dstChangeTime);
        writeInt(e11, this.nextGmtOffset);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TimeSet(");
        sb2.append("utc = " + this.utc);
        sb2.append(", ");
        StringBuilder d11 = q.d(new StringBuilder("gmtOffset = "), this.gmtOffset, sb2, ", ", "dstChangeTime = ");
        d11.append(this.dstChangeTime);
        sb2.append(d11.toString());
        sb2.append(", ");
        return e.a(new StringBuilder("nextGmtOffset = "), this.nextGmtOffset, sb2, ")");
    }
}
