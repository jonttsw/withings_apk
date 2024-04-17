package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DigitalCrownMotionDelta extends h {

    /* renamed from: x  reason: collision with root package name */
    public short f33244x;

    /* renamed from: y  reason: collision with root package name */
    public short f33245y;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2445;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33244x = readShort(byteBuffer);
        this.f33245y = readShort(byteBuffer);
    }

    public DigitalCrownMotionDelta setX(short s11) {
        this.f33244x = s11;
        return this;
    }

    public DigitalCrownMotionDelta setY(short s11) {
        this.f33245y = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeShort(e11, this.f33244x);
        writeShort(e11, this.f33245y);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DigitalCrownMotionDelta(");
        return e.a(q.d(new StringBuilder("x = "), this.f33244x, sb2, ", ", "y = "), this.f33245y, sb2, ")");
    }
}
