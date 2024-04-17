package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FwChunk extends h {
    public long offset;
    public byte[] packet;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.packet;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 5);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2416;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.offset = readUnsignedInt(byteBuffer);
        this.packet = readByteArray(byteBuffer);
    }

    public FwChunk setOffset(long j5) {
        this.offset = j5;
        return this;
    }

    public FwChunk setPacket(byte[] bArr) {
        this.packet = bArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.offset);
        writeByteArray(e11, this.packet);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FwChunk(");
        sb2.append("offset = " + this.offset);
        sb2.append(", ");
        sb2.append("packet = " + Wpp.prettyBytes(this.packet));
        sb2.append(")");
        return sb2.toString();
    }
}
