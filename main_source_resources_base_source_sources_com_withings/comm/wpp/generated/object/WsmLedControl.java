package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsmLedControl extends h {
    public int blue;
    public short brightness;
    public long delay;
    public int green;

    /* renamed from: id  reason: collision with root package name */
    public long f33292id;
    public int red;
    public long timeout;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 19;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2058;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33292id = readUnsignedInt(byteBuffer);
        this.delay = readUnsignedInt(byteBuffer);
        this.timeout = readUnsignedInt(byteBuffer);
        this.red = readUnsignedShort(byteBuffer);
        this.green = readUnsignedShort(byteBuffer);
        this.blue = readUnsignedShort(byteBuffer);
        this.brightness = readUnsignedByte(byteBuffer);
    }

    public WsmLedControl setBlue(int i11) {
        this.blue = i11;
        return this;
    }

    public WsmLedControl setBrightness(short s11) {
        this.brightness = s11;
        return this;
    }

    public WsmLedControl setDelay(long j5) {
        this.delay = j5;
        return this;
    }

    public WsmLedControl setGreen(int i11) {
        this.green = i11;
        return this;
    }

    public WsmLedControl setId(long j5) {
        this.f33292id = j5;
        return this;
    }

    public WsmLedControl setRed(int i11) {
        this.red = i11;
        return this;
    }

    public WsmLedControl setTimeout(long j5) {
        this.timeout = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33292id);
        writeUnsignedInt(e11, this.delay);
        writeUnsignedInt(e11, this.timeout);
        writeUnsignedShort(e11, this.red);
        writeUnsignedShort(e11, this.green);
        writeUnsignedShort(e11, this.blue);
        writeUnsignedByte(e11, this.brightness);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsmLedControl(");
        sb2.append("id = " + this.f33292id);
        sb2.append(", ");
        sb2.append("delay = " + this.delay);
        sb2.append(", ");
        sb2.append("timeout = " + this.timeout);
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(new StringBuilder("red = "), this.red, sb2, ", ", "green = "), this.green, sb2, ", ", "blue = "), this.blue, sb2, ", ", "brightness = "), this.brightness, sb2, ")");
    }
}
