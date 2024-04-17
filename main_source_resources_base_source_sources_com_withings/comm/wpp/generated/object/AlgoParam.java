package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AlgoParam extends h {

    /* renamed from: id  reason: collision with root package name */
    public short f33237id;
    public int value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2489;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33237id = readShort(byteBuffer);
        this.value = readInt(byteBuffer);
    }

    public AlgoParam setId(short s11) {
        this.f33237id = s11;
        return this;
    }

    public AlgoParam setValue(int i11) {
        this.value = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeShort(e11, this.f33237id);
        writeInt(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlgoParam(");
        return e.a(q.d(new StringBuilder("id = "), this.f33237id, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
