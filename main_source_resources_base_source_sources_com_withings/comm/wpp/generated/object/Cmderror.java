package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Cmderror extends h {
    public int cmd;
    public int err;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 272;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readUnsignedShort(byteBuffer);
        this.err = readInt(byteBuffer);
    }

    public Cmderror setCmd(int i11) {
        this.cmd = i11;
        return this;
    }

    public Cmderror setErr(int i11) {
        this.err = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.cmd);
        writeInt(e11, this.err);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Cmderror(");
        return e.a(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "err = "), this.err, sb2, ")");
    }
}
