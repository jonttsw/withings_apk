package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DigitalCrownResolutionParams extends h {

    /* renamed from: x  reason: collision with root package name */
    public short f33246x;

    /* renamed from: y  reason: collision with root package name */
    public short f33247y;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2446;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33246x = readUnsignedByte(byteBuffer);
        this.f33247y = readUnsignedByte(byteBuffer);
    }

    public DigitalCrownResolutionParams setX(short s11) {
        this.f33246x = s11;
        return this;
    }

    public DigitalCrownResolutionParams setY(short s11) {
        this.f33247y = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.f33246x);
        writeUnsignedByte(e11, this.f33247y);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DigitalCrownResolutionParams(");
        return e.a(q.d(new StringBuilder("x = "), this.f33246x, sb2, ", ", "y = "), this.f33247y, sb2, ")");
    }
}
