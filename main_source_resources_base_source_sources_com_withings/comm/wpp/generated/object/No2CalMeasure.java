package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class No2CalMeasure extends h {
    public int no2Level;
    public int rhtRh;
    public int rhtT;
    public int timestamp;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 16;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2385;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.timestamp = readInt(byteBuffer);
        this.no2Level = readInt(byteBuffer);
        this.rhtT = readInt(byteBuffer);
        this.rhtRh = readInt(byteBuffer);
    }

    public No2CalMeasure setNo2Level(int i11) {
        this.no2Level = i11;
        return this;
    }

    public No2CalMeasure setRhtRh(int i11) {
        this.rhtRh = i11;
        return this;
    }

    public No2CalMeasure setRhtT(int i11) {
        this.rhtT = i11;
        return this;
    }

    public No2CalMeasure setTimestamp(int i11) {
        this.timestamp = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.timestamp);
        writeInt(e11, this.no2Level);
        writeInt(e11, this.rhtT);
        writeInt(e11, this.rhtRh);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("No2CalMeasure(");
        return e.a(q.d(q.d(q.d(new StringBuilder("timestamp = "), this.timestamp, sb2, ", ", "no2Level = "), this.no2Level, sb2, ", ", "rhtT = "), this.rhtT, sb2, ", ", "rhtRh = "), this.rhtRh, sb2, ")");
    }
}
