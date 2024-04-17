package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AlgorithmVersion extends h {
    public static final short UNDEFINED = 0;
    public int type;
    public int version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 329;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readInt(byteBuffer);
        this.version = readInt(byteBuffer);
    }

    public AlgorithmVersion setType(int i11) {
        this.type = i11;
        return this;
    }

    public AlgorithmVersion setVersion(int i11) {
        this.version = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.type);
        writeInt(e11, this.version);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlgorithmVersion(");
        return e.a(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "version = "), this.version, sb2, ")");
    }
}
