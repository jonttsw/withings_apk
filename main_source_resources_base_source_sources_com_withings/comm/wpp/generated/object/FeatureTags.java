package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FeatureTags extends h {
    public long endTime;

    /* renamed from: id  reason: collision with root package name */
    public int f33250id;
    public long startTime;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 10;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2460;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33250id = readUnsignedShort(byteBuffer);
        this.startTime = readUnsignedInt(byteBuffer);
        this.endTime = readUnsignedInt(byteBuffer);
    }

    public FeatureTags setEndTime(long j5) {
        this.endTime = j5;
        return this;
    }

    public FeatureTags setId(int i11) {
        this.f33250id = i11;
        return this;
    }

    public FeatureTags setStartTime(long j5) {
        this.startTime = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.f33250id);
        writeUnsignedInt(e11, this.startTime);
        writeUnsignedInt(e11, this.endTime);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureTags(");
        StringBuilder d11 = q.d(new StringBuilder("id = "), this.f33250id, sb2, ", ", "startTime = ");
        d11.append(this.startTime);
        sb2.append(d11.toString());
        sb2.append(", ");
        return j.b(new StringBuilder("endTime = "), this.endTime, sb2, ")");
    }
}
