package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ScreenList extends h {
    public short embeddedId;
    public long endTs;

    /* renamed from: id  reason: collision with root package name */
    public long f33267id;
    public short source;
    public long startTs;
    public long userid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 18;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SCREEN_LIST;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33267id = readUnsignedInt(byteBuffer);
        this.userid = readUnsignedInt(byteBuffer);
        this.startTs = readUnsignedInt(byteBuffer);
        this.endTs = readUnsignedInt(byteBuffer);
        this.embeddedId = readUnsignedByte(byteBuffer);
        this.source = readUnsignedByte(byteBuffer);
    }

    public ScreenList setEmbeddedId(short s11) {
        this.embeddedId = s11;
        return this;
    }

    public ScreenList setEndTs(long j5) {
        this.endTs = j5;
        return this;
    }

    public ScreenList setId(long j5) {
        this.f33267id = j5;
        return this;
    }

    public ScreenList setSource(short s11) {
        this.source = s11;
        return this;
    }

    public ScreenList setStartTs(long j5) {
        this.startTs = j5;
        return this;
    }

    public ScreenList setUserid(long j5) {
        this.userid = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33267id);
        writeUnsignedInt(e11, this.userid);
        writeUnsignedInt(e11, this.startTs);
        writeUnsignedInt(e11, this.endTs);
        writeUnsignedByte(e11, this.embeddedId);
        writeUnsignedByte(e11, this.source);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenList(");
        sb2.append("id = " + this.f33267id);
        sb2.append(", ");
        sb2.append("userid = " + this.userid);
        sb2.append(", ");
        sb2.append("startTs = " + this.startTs);
        sb2.append(", ");
        sb2.append("endTs = " + this.endTs);
        sb2.append(", ");
        return e.a(q.d(new StringBuilder("embeddedId = "), this.embeddedId, sb2, ", ", "source = "), this.source, sb2, ")");
    }
}
