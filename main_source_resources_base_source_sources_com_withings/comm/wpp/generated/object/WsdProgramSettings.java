package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsdProgramSettings extends h {
    public short brightness;

    /* renamed from: id  reason: collision with root package name */
    public short f33289id;
    public short type;
    public short volume;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2310;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.volume = readUnsignedByte(byteBuffer);
        this.brightness = readUnsignedByte(byteBuffer);
        this.type = readUnsignedByte(byteBuffer);
        this.f33289id = readUnsignedByte(byteBuffer);
    }

    public WsdProgramSettings setBrightness(short s11) {
        this.brightness = s11;
        return this;
    }

    public WsdProgramSettings setId(short s11) {
        this.f33289id = s11;
        return this;
    }

    public WsdProgramSettings setType(short s11) {
        this.type = s11;
        return this;
    }

    public WsdProgramSettings setVolume(short s11) {
        this.volume = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.volume);
        writeUnsignedByte(e11, this.brightness);
        writeUnsignedByte(e11, this.type);
        writeUnsignedByte(e11, this.f33289id);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsdProgramSettings(");
        return e.a(q.d(q.d(q.d(new StringBuilder("volume = "), this.volume, sb2, ", ", "brightness = "), this.brightness, sb2, ", ", "type = "), this.type, sb2, ", ", "id = "), this.f33289id, sb2, ")");
    }
}
