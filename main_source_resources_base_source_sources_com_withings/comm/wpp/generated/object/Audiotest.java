package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Audiotest extends h {
    public static final short ERR_FAIL = -1;
    public static final short ERR_OK = 0;
    public static final short LOOPTEST = 0;
    public static final short LOOPTEST_PEER = 1;
    public static final short RESULT_FAIL = -1;
    public static final short RESULT_PASS = 0;
    public byte cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33239rc;
    public byte result;
    public byte volume1;
    public byte volume2;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 520;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.volume1 = readByte(byteBuffer);
        this.volume2 = readByte(byteBuffer);
        this.result = readByte(byteBuffer);
        this.f33239rc = readByte(byteBuffer);
    }

    public Audiotest setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Audiotest setRc(byte b10) {
        this.f33239rc = b10;
        return this;
    }

    public Audiotest setResult(byte b10) {
        this.result = b10;
        return this;
    }

    public Audiotest setVolume1(byte b10) {
        this.volume1 = b10;
        return this;
    }

    public Audiotest setVolume2(byte b10) {
        this.volume2 = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.volume1);
        writeByte(e11, this.volume2);
        writeByte(e11, this.result);
        writeByte(e11, this.f33239rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Audiotest(");
        return e.a(q.d(q.d(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "volume1 = "), this.volume1, sb2, ", ", "volume2 = "), this.volume2, sb2, ", ", "result = "), this.result, sb2, ", ", "rc = "), this.f33239rc, sb2, ")");
    }
}
