package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class BreatheParam extends h {
    public static final short BREATHS_PER_MIN = 1;
    public static final short DURATION_SECONDS = 0;

    /* renamed from: id  reason: collision with root package name */
    public short f33241id;
    public long value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2476;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33241id = readUnsignedByte(byteBuffer);
        this.value = readUnsignedInt(byteBuffer);
    }

    public BreatheParam setId(short s11) {
        this.f33241id = s11;
        return this;
    }

    public BreatheParam setValue(long j5) {
        this.value = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.f33241id);
        writeUnsignedInt(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BreatheParam(");
        return j.b(q.d(new StringBuilder("id = "), this.f33241id, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
