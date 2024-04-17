package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsdProgramId extends h {

    /* renamed from: id  reason: collision with root package name */
    public short f33287id;
    public short type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2312;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.f33287id = readUnsignedByte(byteBuffer);
    }

    public WsdProgramId setId(short s11) {
        this.f33287id = s11;
        return this;
    }

    public WsdProgramId setType(short s11) {
        this.type = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.type);
        writeUnsignedByte(e11, this.f33287id);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsdProgramId(");
        return e.a(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "id = "), this.f33287id, sb2, ")");
    }
}
