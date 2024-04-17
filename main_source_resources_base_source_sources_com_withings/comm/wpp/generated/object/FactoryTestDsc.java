package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FactoryTestDsc extends h {
    public long arg;
    public short status;
    public short type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_FACTORY_TEST_DSC;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.status = readUnsignedByte(byteBuffer);
        this.arg = readUnsignedInt(byteBuffer);
    }

    public FactoryTestDsc setArg(long j5) {
        this.arg = j5;
        return this;
    }

    public FactoryTestDsc setStatus(short s11) {
        this.status = s11;
        return this;
    }

    public FactoryTestDsc setType(short s11) {
        this.type = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.type);
        writeUnsignedByte(e11, this.status);
        writeUnsignedInt(e11, this.arg);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FactoryTestDsc(");
        return j.b(q.d(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "status = "), this.status, sb2, ", ", "arg = "), this.arg, sb2, ")");
    }
}
