package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class StoredSignalMeta extends h {
    public short channel;
    public short format;
    public short resolution;
    public int samplingFreq;
    public short size;
    public int type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 323;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedShort(byteBuffer);
        this.samplingFreq = readUnsignedShort(byteBuffer);
        this.format = readUnsignedByte(byteBuffer);
        this.size = readUnsignedByte(byteBuffer);
        this.resolution = readUnsignedByte(byteBuffer);
        this.channel = readUnsignedByte(byteBuffer);
    }

    public StoredSignalMeta setChannel(short s11) {
        this.channel = s11;
        return this;
    }

    public StoredSignalMeta setFormat(short s11) {
        this.format = s11;
        return this;
    }

    public StoredSignalMeta setResolution(short s11) {
        this.resolution = s11;
        return this;
    }

    public StoredSignalMeta setSamplingFreq(int i11) {
        this.samplingFreq = i11;
        return this;
    }

    public StoredSignalMeta setSize(short s11) {
        this.size = s11;
        return this;
    }

    public StoredSignalMeta setType(int i11) {
        this.type = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.type);
        writeUnsignedShort(e11, this.samplingFreq);
        writeUnsignedByte(e11, this.format);
        writeUnsignedByte(e11, this.size);
        writeUnsignedByte(e11, this.resolution);
        writeUnsignedByte(e11, this.channel);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoredSignalMeta(");
        return e.a(q.d(q.d(q.d(q.d(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "samplingFreq = "), this.samplingFreq, sb2, ", ", "format = "), this.format, sb2, ", ", "size = "), this.size, sb2, ", ", "resolution = "), this.resolution, sb2, ", ", "channel = "), this.channel, sb2, ")");
    }
}
