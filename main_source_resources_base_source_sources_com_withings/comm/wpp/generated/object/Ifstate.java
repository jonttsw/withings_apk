package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Ifstate extends h {
    public byte cmd;
    public byte iface;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33254rc;
    public int state;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 271;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.f33254rc = readByte(byteBuffer);
        this.iface = readByte(byteBuffer);
        this.state = readUnsignedShort(byteBuffer);
    }

    public Ifstate setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Ifstate setIface(byte b10) {
        this.iface = b10;
        return this;
    }

    public Ifstate setRc(byte b10) {
        this.f33254rc = b10;
        return this;
    }

    public Ifstate setState(int i11) {
        this.state = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.f33254rc);
        writeByte(e11, this.iface);
        writeUnsignedShort(e11, this.state);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ifstate(");
        return e.a(q.d(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33254rc, sb2, ", ", "iface = "), this.iface, sb2, ", ", "state = "), this.state, sb2, ")");
    }
}
