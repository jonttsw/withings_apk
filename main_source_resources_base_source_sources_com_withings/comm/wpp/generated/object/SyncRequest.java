package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SyncRequest extends h {
    public static final short BACKGROUND_SYNC = 0;
    public static final short DEBUG_DUMP = 1;
    public int reserved;
    public int type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 320;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedShort(byteBuffer);
        this.reserved = readUnsignedShort(byteBuffer);
    }

    public SyncRequest setReserved(int i11) {
        this.reserved = i11;
        return this;
    }

    public SyncRequest setType(int i11) {
        this.type = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.type);
        writeUnsignedShort(e11, this.reserved);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SyncRequest(");
        return e.a(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "reserved = "), this.reserved, sb2, ")");
    }
}
