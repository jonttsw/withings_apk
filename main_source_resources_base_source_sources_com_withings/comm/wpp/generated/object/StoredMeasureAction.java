package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class StoredMeasureAction extends h {
    public short cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33272rc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 276;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readUnsignedByte(byteBuffer);
        this.f33272rc = readByte(byteBuffer);
    }

    public StoredMeasureAction setCmd(short s11) {
        this.cmd = s11;
        return this;
    }

    public StoredMeasureAction setRc(byte b10) {
        this.f33272rc = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.cmd);
        writeByte(e11, this.f33272rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoredMeasureAction(");
        return e.a(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33272rc, sb2, ")");
    }
}
