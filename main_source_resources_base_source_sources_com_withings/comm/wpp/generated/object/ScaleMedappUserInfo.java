package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ScaleMedappUserInfo extends h {
    public int age;
    public short fatmethod;
    public int height;
    public short sex;
    public long userId;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 10;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 308;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.userId = readUnsignedInt(byteBuffer);
        this.height = readUnsignedShort(byteBuffer);
        this.age = readUnsignedShort(byteBuffer);
        this.sex = readUnsignedByte(byteBuffer);
        this.fatmethod = readUnsignedByte(byteBuffer);
    }

    public ScaleMedappUserInfo setAge(int i11) {
        this.age = i11;
        return this;
    }

    public ScaleMedappUserInfo setFatmethod(short s11) {
        this.fatmethod = s11;
        return this;
    }

    public ScaleMedappUserInfo setHeight(int i11) {
        this.height = i11;
        return this;
    }

    public ScaleMedappUserInfo setSex(short s11) {
        this.sex = s11;
        return this;
    }

    public ScaleMedappUserInfo setUserId(long j5) {
        this.userId = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.userId);
        writeUnsignedShort(e11, this.height);
        writeUnsignedShort(e11, this.age);
        writeUnsignedByte(e11, this.sex);
        writeUnsignedByte(e11, this.fatmethod);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScaleMedappUserInfo(");
        sb2.append("userId = " + this.userId);
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(new StringBuilder("height = "), this.height, sb2, ", ", "age = "), this.age, sb2, ", ", "sex = "), this.sex, sb2, ", ", "fatmethod = "), this.fatmethod, sb2, ")");
    }
}
