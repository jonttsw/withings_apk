package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Dac extends h {
    public static final short INIT = 0;
    public static final short RELEASE = 1;
    public static final short SET = 2;
    public byte bank;
    public byte cmd;
    public byte dac;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33243rc;
    public long val;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 523;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.bank = readByte(byteBuffer);
        this.dac = readByte(byteBuffer);
        this.val = readUnsignedInt(byteBuffer);
        this.f33243rc = readByte(byteBuffer);
    }

    public Dac setBank(byte b10) {
        this.bank = b10;
        return this;
    }

    public Dac setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Dac setDac(byte b10) {
        this.dac = b10;
        return this;
    }

    public Dac setRc(byte b10) {
        this.f33243rc = b10;
        return this;
    }

    public Dac setVal(long j5) {
        this.val = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.bank);
        writeByte(e11, this.dac);
        writeUnsignedInt(e11, this.val);
        writeByte(e11, this.f33243rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dac(");
        StringBuilder d11 = q.d(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "bank = "), this.bank, sb2, ", ", "dac = "), this.dac, sb2, ", ", "val = ");
        d11.append(this.val);
        sb2.append(d11.toString());
        sb2.append(", ");
        return e.a(new StringBuilder("rc = "), this.f33243rc, sb2, ")");
    }
}
