package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ProgramType extends h {
    public short program;
    public long subProgram;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2327;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.program = readUnsignedByte(byteBuffer);
        this.subProgram = readUnsignedInt(byteBuffer);
    }

    public ProgramType setProgram(short s11) {
        this.program = s11;
        return this;
    }

    public ProgramType setSubProgram(long j5) {
        this.subProgram = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.program);
        writeUnsignedInt(e11, this.subProgram);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProgramType(");
        return j.b(q.d(new StringBuilder("program = "), this.program, sb2, ", ", "subProgram = "), this.subProgram, sb2, ")");
    }
}
