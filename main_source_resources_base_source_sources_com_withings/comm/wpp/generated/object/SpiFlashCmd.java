package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SpiFlashCmd extends h {
    public long arg1;
    public long arg2;
    public long arg3;
    public long cmd;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 16;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2372;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readUnsignedInt(byteBuffer);
        this.arg1 = readUnsignedInt(byteBuffer);
        this.arg2 = readUnsignedInt(byteBuffer);
        this.arg3 = readUnsignedInt(byteBuffer);
    }

    public SpiFlashCmd setArg1(long j5) {
        this.arg1 = j5;
        return this;
    }

    public SpiFlashCmd setArg2(long j5) {
        this.arg2 = j5;
        return this;
    }

    public SpiFlashCmd setArg3(long j5) {
        this.arg3 = j5;
        return this;
    }

    public SpiFlashCmd setCmd(long j5) {
        this.cmd = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.cmd);
        writeUnsignedInt(e11, this.arg1);
        writeUnsignedInt(e11, this.arg2);
        writeUnsignedInt(e11, this.arg3);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SpiFlashCmd(");
        sb2.append("cmd = " + this.cmd);
        sb2.append(", ");
        sb2.append("arg1 = " + this.arg1);
        sb2.append(", ");
        sb2.append("arg2 = " + this.arg2);
        sb2.append(", ");
        return j.b(new StringBuilder("arg3 = "), this.arg3, sb2, ")");
    }
}
