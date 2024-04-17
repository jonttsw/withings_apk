package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Wl extends h {
    public String buf;
    public long cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33285rc;
    public short set;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.buf;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 7);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 525;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33285rc = readByte(byteBuffer);
        this.cmd = readUnsignedInt(byteBuffer);
        this.set = readUnsignedByte(byteBuffer);
        this.buf = readString(byteBuffer);
    }

    public Wl setBuf(String str) {
        this.buf = str;
        return this;
    }

    public Wl setCmd(long j5) {
        this.cmd = j5;
        return this;
    }

    public Wl setRc(byte b10) {
        this.f33285rc = b10;
        return this;
    }

    public Wl setSet(short s11) {
        this.set = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.f33285rc);
        writeUnsignedInt(e11, this.cmd);
        writeUnsignedByte(e11, this.set);
        writeString(e11, this.buf);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Wl(");
        StringBuilder d11 = q.d(new StringBuilder("rc = "), this.f33285rc, sb2, ", ", "cmd = ");
        d11.append(this.cmd);
        sb2.append(d11.toString());
        sb2.append(", ");
        return c.c(q.d(new StringBuilder("set = "), this.set, sb2, ", ", "buf = "), this.buf, sb2, ")");
    }
}
