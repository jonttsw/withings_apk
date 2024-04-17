package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VasistasFlags extends h {
    public int enabledFlags;
    public int supportedFlags;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2461;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.enabledFlags = readUnsignedShort(byteBuffer);
        this.supportedFlags = readUnsignedShort(byteBuffer);
    }

    public VasistasFlags setEnabledFlags(int i11) {
        this.enabledFlags = i11;
        return this;
    }

    public VasistasFlags setSupportedFlags(int i11) {
        this.supportedFlags = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.enabledFlags);
        writeUnsignedShort(e11, this.supportedFlags);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VasistasFlags(");
        return e.a(q.d(new StringBuilder("enabledFlags = "), this.enabledFlags, sb2, ", ", "supportedFlags = "), this.supportedFlags, sb2, ")");
    }
}
