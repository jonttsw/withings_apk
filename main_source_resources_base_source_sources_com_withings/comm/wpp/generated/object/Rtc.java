package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Rtc extends h {
    public static final short GET_CLK = 0;
    public static final short GET_COUNTER = 1;
    public byte cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33266rc;
    public long val;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 529;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.f33266rc = readByte(byteBuffer);
        this.val = readUnsignedInt(byteBuffer);
    }

    public Rtc setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Rtc setRc(byte b10) {
        this.f33266rc = b10;
        return this;
    }

    public Rtc setVal(long j5) {
        this.val = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.f33266rc);
        writeUnsignedInt(e11, this.val);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Rtc(");
        return j.b(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33266rc, sb2, ", ", "val = "), this.val, sb2, ")");
    }
}
