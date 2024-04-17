package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AppProbe extends h {
    public static final short HEALTHMATE = 1;
    public static final short HOME = 2;
    public static final short OS_ANDROID = 1;
    public static final short OS_APPLE = 2;
    public static final short OS_VERSION_ANDROID4 = 20;
    public static final short OS_VERSION_NOT_SPECIFIED = 0;
    public static final short THERMO = 3;
    public static final short WPPSERVER = 4;
    public short app;

    /* renamed from: os  reason: collision with root package name */
    public short f33238os;
    public long version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 298;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33238os = readUnsignedByte(byteBuffer);
        this.app = readUnsignedByte(byteBuffer);
        this.version = readUnsignedInt(byteBuffer);
    }

    public AppProbe setApp(short s11) {
        this.app = s11;
        return this;
    }

    public AppProbe setOs(short s11) {
        this.f33238os = s11;
        return this;
    }

    public AppProbe setVersion(long j5) {
        this.version = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.f33238os);
        writeUnsignedByte(e11, this.app);
        writeUnsignedInt(e11, this.version);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppProbe(");
        return j.b(q.d(q.d(new StringBuilder("os = "), this.f33238os, sb2, ", ", "app = "), this.app, sb2, ", ", "version = "), this.version, sb2, ")");
    }
}
