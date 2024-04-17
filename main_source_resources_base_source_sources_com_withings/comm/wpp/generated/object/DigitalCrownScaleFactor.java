package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DigitalCrownScaleFactor extends h {
    public int denominator;
    public int numerator;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_DIGITAL_CROWN_SCALE_FACTOR;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.numerator = readUnsignedShort(byteBuffer);
        this.denominator = readUnsignedShort(byteBuffer);
    }

    public DigitalCrownScaleFactor setDenominator(int i11) {
        this.denominator = i11;
        return this;
    }

    public DigitalCrownScaleFactor setNumerator(int i11) {
        this.numerator = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.numerator);
        writeUnsignedShort(e11, this.denominator);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DigitalCrownScaleFactor(");
        return e.a(q.d(new StringBuilder("numerator = "), this.numerator, sb2, ", ", "denominator = "), this.denominator, sb2, ")");
    }
}
