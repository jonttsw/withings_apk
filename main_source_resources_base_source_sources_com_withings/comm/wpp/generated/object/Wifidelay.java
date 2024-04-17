package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Wifidelay extends h {
    public byte cmd;
    public int delay;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33284rc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 268;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.f33284rc = readByte(byteBuffer);
        this.delay = readInt(byteBuffer);
    }

    public Wifidelay setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Wifidelay setDelay(int i11) {
        this.delay = i11;
        return this;
    }

    public Wifidelay setRc(byte b10) {
        this.f33284rc = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.f33284rc);
        writeInt(e11, this.delay);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Wifidelay(");
        return e.a(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33284rc, sb2, ", ", "delay = "), this.delay, sb2, ")");
    }
}
