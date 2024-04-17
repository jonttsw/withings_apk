package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class SpiFlashChunk extends h {
    public static final short SPI_FLASH_CHUNK_MAX = 16;
    public short[] chunk;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 17;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2373;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.chunk = readUnsignedByteArray(byteBuffer);
    }

    public SpiFlashChunk setChunk(short[] sArr) {
        this.chunk = sArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByteArray(e11, this.chunk);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SpiFlashChunk(");
        sb2.append("chunk = " + Arrays.toString(this.chunk));
        sb2.append(")");
        return sb2.toString();
    }
}
