package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class PlsStation extends h {

    /* renamed from: id  reason: collision with root package name */
    public int f33264id;
    public long timestamp;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 297;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33264id = readUnsignedShort(byteBuffer);
        this.timestamp = readUnsignedInt(byteBuffer);
    }

    public PlsStation setId(int i11) {
        this.f33264id = i11;
        return this;
    }

    public PlsStation setTimestamp(long j5) {
        this.timestamp = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.f33264id);
        writeUnsignedInt(e11, this.timestamp);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlsStation(");
        return j.b(q.d(new StringBuilder("id = "), this.f33264id, sb2, ", ", "timestamp = "), this.timestamp, sb2, ")");
    }
}
