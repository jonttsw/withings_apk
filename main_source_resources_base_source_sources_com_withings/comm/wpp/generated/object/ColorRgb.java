package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ColorRgb extends h {
    public int blue;
    public int green;
    public int red;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2324;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.red = readUnsignedShort(byteBuffer);
        this.green = readUnsignedShort(byteBuffer);
        this.blue = readUnsignedShort(byteBuffer);
    }

    public ColorRgb setBlue(int i11) {
        this.blue = i11;
        return this;
    }

    public ColorRgb setGreen(int i11) {
        this.green = i11;
        return this;
    }

    public ColorRgb setRed(int i11) {
        this.red = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.red);
        writeUnsignedShort(e11, this.green);
        writeUnsignedShort(e11, this.blue);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorRgb(");
        return e.a(q.d(q.d(new StringBuilder("red = "), this.red, sb2, ", ", "green = "), this.green, sb2, ", ", "blue = "), this.blue, sb2, ")");
    }
}
