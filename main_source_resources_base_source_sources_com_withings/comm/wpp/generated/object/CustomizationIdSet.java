package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CustomizationIdSet extends h {
    public long identifier;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_CUSTOMIZATION_ID_SET;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.identifier = readUnsignedInt(byteBuffer);
    }

    public CustomizationIdSet setIdentifier(long j5) {
        this.identifier = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.identifier);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return j.b(new StringBuilder("identifier = "), this.identifier, new StringBuilder("CustomizationIdSet("), ")");
    }
}
