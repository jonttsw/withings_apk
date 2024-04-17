package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class PlsReturnCode extends h {
    public int err;
    public int free;
    public int total;
    public int used;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 16;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 296;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.err = readInt(byteBuffer);
        this.total = readInt(byteBuffer);
        this.free = readInt(byteBuffer);
        this.used = readInt(byteBuffer);
    }

    public PlsReturnCode setErr(int i11) {
        this.err = i11;
        return this;
    }

    public PlsReturnCode setFree(int i11) {
        this.free = i11;
        return this;
    }

    public PlsReturnCode setTotal(int i11) {
        this.total = i11;
        return this;
    }

    public PlsReturnCode setUsed(int i11) {
        this.used = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.err);
        writeInt(e11, this.total);
        writeInt(e11, this.free);
        writeInt(e11, this.used);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlsReturnCode(");
        return e.a(q.d(q.d(q.d(new StringBuilder("err = "), this.err, sb2, ", ", "total = "), this.total, sb2, ", ", "free = "), this.free, sb2, ", ", "used = "), this.used, sb2, ")");
    }
}
