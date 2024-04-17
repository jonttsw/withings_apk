package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ColorHsl extends h {
    public int hue;
    public short luminosity;
    public short saturation;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2322;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hue = readUnsignedShort(byteBuffer);
        this.saturation = readUnsignedByte(byteBuffer);
        this.luminosity = readUnsignedByte(byteBuffer);
    }

    public ColorHsl setHue(int i11) {
        this.hue = i11;
        return this;
    }

    public ColorHsl setLuminosity(short s11) {
        this.luminosity = s11;
        return this;
    }

    public ColorHsl setSaturation(short s11) {
        this.saturation = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.hue);
        writeUnsignedByte(e11, this.saturation);
        writeUnsignedByte(e11, this.luminosity);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorHsl(");
        return e.a(q.d(q.d(new StringBuilder("hue = "), this.hue, sb2, ", ", "saturation = "), this.saturation, sb2, ", ", "luminosity = "), this.luminosity, sb2, ")");
    }
}
