package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsdProgramInfo extends h {
    public short available;

    /* renamed from: id  reason: collision with root package name */
    public short f33288id;
    public short progress;
    public short selected;
    public short type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2313;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.f33288id = readUnsignedByte(byteBuffer);
        this.selected = readUnsignedByte(byteBuffer);
        this.available = readUnsignedByte(byteBuffer);
        this.progress = readUnsignedByte(byteBuffer);
    }

    public WsdProgramInfo setAvailable(short s11) {
        this.available = s11;
        return this;
    }

    public WsdProgramInfo setId(short s11) {
        this.f33288id = s11;
        return this;
    }

    public WsdProgramInfo setProgress(short s11) {
        this.progress = s11;
        return this;
    }

    public WsdProgramInfo setSelected(short s11) {
        this.selected = s11;
        return this;
    }

    public WsdProgramInfo setType(short s11) {
        this.type = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.type);
        writeUnsignedByte(e11, this.f33288id);
        writeUnsignedByte(e11, this.selected);
        writeUnsignedByte(e11, this.available);
        writeUnsignedByte(e11, this.progress);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsdProgramInfo(");
        return e.a(q.d(q.d(q.d(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "id = "), this.f33288id, sb2, ", ", "selected = "), this.selected, sb2, ", ", "available = "), this.available, sb2, ", ", "progress = "), this.progress, sb2, ")");
    }
}
