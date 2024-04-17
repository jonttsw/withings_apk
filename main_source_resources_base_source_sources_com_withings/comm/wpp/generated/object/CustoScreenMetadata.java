package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CustoScreenMetadata extends h {
    public short displayStyle;
    public long endTs;

    /* renamed from: id  reason: collision with root package name */
    public long f33242id;
    public String msg;
    public long startTs;
    public long userid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.msg;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 18);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 328;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.userid = readUnsignedInt(byteBuffer);
        this.startTs = readUnsignedInt(byteBuffer);
        this.endTs = readUnsignedInt(byteBuffer);
        this.f33242id = readUnsignedInt(byteBuffer);
        this.displayStyle = readUnsignedByte(byteBuffer);
        this.msg = readString(byteBuffer);
    }

    public CustoScreenMetadata setDisplayStyle(short s11) {
        this.displayStyle = s11;
        return this;
    }

    public CustoScreenMetadata setEndTs(long j5) {
        this.endTs = j5;
        return this;
    }

    public CustoScreenMetadata setId(long j5) {
        this.f33242id = j5;
        return this;
    }

    public CustoScreenMetadata setMsg(String str) {
        this.msg = str;
        return this;
    }

    public CustoScreenMetadata setStartTs(long j5) {
        this.startTs = j5;
        return this;
    }

    public CustoScreenMetadata setUserid(long j5) {
        this.userid = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.userid);
        writeUnsignedInt(e11, this.startTs);
        writeUnsignedInt(e11, this.endTs);
        writeUnsignedInt(e11, this.f33242id);
        writeUnsignedByte(e11, this.displayStyle);
        writeString(e11, this.msg);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustoScreenMetadata(");
        sb2.append("userid = " + this.userid);
        sb2.append(", ");
        sb2.append("startTs = " + this.startTs);
        sb2.append(", ");
        sb2.append("endTs = " + this.endTs);
        sb2.append(", ");
        sb2.append("id = " + this.f33242id);
        sb2.append(", ");
        return c.c(q.d(new StringBuilder("displayStyle = "), this.displayStyle, sb2, ", ", "msg = "), this.msg, sb2, ")");
    }
}
