package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Color extends h {
    public int blue;
    public int green;
    public int red;
    public int white;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2315;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.red = readUnsignedShort(byteBuffer);
        this.green = readUnsignedShort(byteBuffer);
        this.blue = readUnsignedShort(byteBuffer);
        this.white = readUnsignedShort(byteBuffer);
    }

    public Color setBlue(int i11) {
        this.blue = i11;
        return this;
    }

    public Color setGreen(int i11) {
        this.green = i11;
        return this;
    }

    public Color setRed(int i11) {
        this.red = i11;
        return this;
    }

    public Color setWhite(int i11) {
        this.white = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.red);
        writeUnsignedShort(e11, this.green);
        writeUnsignedShort(e11, this.blue);
        writeUnsignedShort(e11, this.white);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Color(");
        return e.a(q.d(q.d(q.d(new StringBuilder("red = "), this.red, sb2, ", ", "green = "), this.green, sb2, ", ", "blue = "), this.blue, sb2, ", ", "white = "), this.white, sb2, ")");
    }
}
