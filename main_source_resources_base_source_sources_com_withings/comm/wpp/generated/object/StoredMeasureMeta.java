package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class StoredMeasureMeta extends h {
    public short attrib;
    public long time;
    public long uid;
    public long[] userId;
    public short userIdCnt;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 23;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 278;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.uid = readUnsignedInt(byteBuffer);
        this.userIdCnt = readUnsignedByte(byteBuffer);
        this.userId = readUnsignedIntArray(byteBuffer);
        this.attrib = readUnsignedByte(byteBuffer);
        this.time = readUnsignedInt(byteBuffer);
    }

    public StoredMeasureMeta setAttrib(short s11) {
        this.attrib = s11;
        return this;
    }

    public StoredMeasureMeta setTime(long j5) {
        this.time = j5;
        return this;
    }

    public StoredMeasureMeta setUid(long j5) {
        this.uid = j5;
        return this;
    }

    public StoredMeasureMeta setUserId(long[] jArr) {
        this.userId = jArr;
        return this;
    }

    public StoredMeasureMeta setUserIdCnt(short s11) {
        this.userIdCnt = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.uid);
        writeUnsignedByte(e11, this.userIdCnt);
        writeUnsignedIntArray(e11, this.userId);
        writeUnsignedByte(e11, this.attrib);
        writeUnsignedInt(e11, this.time);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoredMeasureMeta(");
        sb2.append("uid = " + this.uid);
        sb2.append(", ");
        StringBuilder d11 = q.d(new StringBuilder("userIdCnt = "), this.userIdCnt, sb2, ", ", "userId = ");
        d11.append(Arrays.toString(this.userId));
        sb2.append(d11.toString());
        sb2.append(", ");
        return j.b(q.d(new StringBuilder("attrib = "), this.attrib, sb2, ", ", "time = "), this.time, sb2, ")");
    }
}
