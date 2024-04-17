package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Spiflash extends h {
    public static final short CHECK = 0;
    public static final short ERASE = 1;
    public byte cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33271rc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 528;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.f33271rc = readByte(byteBuffer);
    }

    public Spiflash setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Spiflash setRc(byte b10) {
        this.f33271rc = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.f33271rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Spiflash(");
        return e.a(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33271rc, sb2, ")");
    }
}
