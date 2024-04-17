package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SignalHeader extends h {
    public int signaltime;
    public short signaltype;
    public long userid;
    public short version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 10;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SIGNAL_HEADER;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.signaltype = readUnsignedByte(byteBuffer);
        this.version = readUnsignedByte(byteBuffer);
        this.userid = readUnsignedInt(byteBuffer);
        this.signaltime = readInt(byteBuffer);
    }

    public SignalHeader setSignaltime(int i11) {
        this.signaltime = i11;
        return this;
    }

    public SignalHeader setSignaltype(short s11) {
        this.signaltype = s11;
        return this;
    }

    public SignalHeader setUserid(long j5) {
        this.userid = j5;
        return this;
    }

    public SignalHeader setVersion(short s11) {
        this.version = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.signaltype);
        writeUnsignedByte(e11, this.version);
        writeUnsignedInt(e11, this.userid);
        writeInt(e11, this.signaltime);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignalHeader(");
        StringBuilder d11 = q.d(q.d(new StringBuilder("signaltype = "), this.signaltype, sb2, ", ", "version = "), this.version, sb2, ", ", "userid = ");
        d11.append(this.userid);
        sb2.append(d11.toString());
        sb2.append(", ");
        return e.a(new StringBuilder("signaltime = "), this.signaltime, sb2, ")");
    }
}
