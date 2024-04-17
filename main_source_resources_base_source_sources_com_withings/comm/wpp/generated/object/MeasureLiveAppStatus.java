package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class MeasureLiveAppStatus extends h {
    public short appLiveScreenDisplayed;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2463;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.appLiveScreenDisplayed = readUnsignedByte(byteBuffer);
    }

    public MeasureLiveAppStatus setAppLiveScreenDisplayed(short s11) {
        this.appLiveScreenDisplayed = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.appLiveScreenDisplayed);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("appLiveScreenDisplayed = "), this.appLiveScreenDisplayed, new StringBuilder("MeasureLiveAppStatus("), ")");
    }
}
