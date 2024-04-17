package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ImageMetadata extends h {
    public short height;
    public short type;
    public short width;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 3;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2397;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.width = readUnsignedByte(byteBuffer);
        this.height = readUnsignedByte(byteBuffer);
    }

    public ImageMetadata setHeight(short s11) {
        this.height = s11;
        return this;
    }

    public ImageMetadata setType(short s11) {
        this.type = s11;
        return this;
    }

    public ImageMetadata setWidth(short s11) {
        this.width = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.type);
        writeUnsignedByte(e11, this.width);
        writeUnsignedByte(e11, this.height);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageMetadata(");
        return e.a(q.d(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "width = "), this.width, sb2, ", ", "height = "), this.height, sb2, ")");
    }
}
