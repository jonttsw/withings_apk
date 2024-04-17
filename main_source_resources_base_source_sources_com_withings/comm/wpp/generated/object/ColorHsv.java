package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ColorHsv extends h {
    public int hue;
    public short saturation;
    public short value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2323;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hue = readUnsignedShort(byteBuffer);
        this.saturation = readUnsignedByte(byteBuffer);
        this.value = readUnsignedByte(byteBuffer);
    }

    public ColorHsv setHue(int i11) {
        this.hue = i11;
        return this;
    }

    public ColorHsv setSaturation(short s11) {
        this.saturation = s11;
        return this;
    }

    public ColorHsv setValue(short s11) {
        this.value = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.hue);
        writeUnsignedByte(e11, this.saturation);
        writeUnsignedByte(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorHsv(");
        return e.a(q.d(q.d(new StringBuilder("hue = "), this.hue, sb2, ", ", "saturation = "), this.saturation, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
