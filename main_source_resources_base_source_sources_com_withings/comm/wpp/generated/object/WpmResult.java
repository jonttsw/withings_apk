package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WpmResult extends h {
    public long dia;
    public long err;
    public int pmax;
    public int pmin;
    public long pul;
    public long sys;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 20;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1892;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.err = readUnsignedInt(byteBuffer);
        this.sys = readUnsignedInt(byteBuffer);
        this.dia = readUnsignedInt(byteBuffer);
        this.pul = readUnsignedInt(byteBuffer);
        this.pmax = readUnsignedShort(byteBuffer);
        this.pmin = readUnsignedShort(byteBuffer);
    }

    public WpmResult setDia(long j5) {
        this.dia = j5;
        return this;
    }

    public WpmResult setErr(long j5) {
        this.err = j5;
        return this;
    }

    public WpmResult setPmax(int i11) {
        this.pmax = i11;
        return this;
    }

    public WpmResult setPmin(int i11) {
        this.pmin = i11;
        return this;
    }

    public WpmResult setPul(long j5) {
        this.pul = j5;
        return this;
    }

    public WpmResult setSys(long j5) {
        this.sys = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.err);
        writeUnsignedInt(e11, this.sys);
        writeUnsignedInt(e11, this.dia);
        writeUnsignedInt(e11, this.pul);
        writeUnsignedShort(e11, this.pmax);
        writeUnsignedShort(e11, this.pmin);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WpmResult(");
        sb2.append("err = " + this.err);
        sb2.append(", ");
        sb2.append("sys = " + this.sys);
        sb2.append(", ");
        sb2.append("dia = " + this.dia);
        sb2.append(", ");
        sb2.append("pul = " + this.pul);
        sb2.append(", ");
        return e.a(q.d(new StringBuilder("pmax = "), this.pmax, sb2, ", ", "pmin = "), this.pmin, sb2, ")");
    }
}
