package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class HomeScreen extends h {
    public static final short HOME_SCREEN_ALARM = 8;
    public static final short HOME_SCREEN_BATTERY = 3;
    public static final short HOME_SCREEN_CALORIES = 6;
    public static final short HOME_SCREEN_DATE = 1;
    public static final short HOME_SCREEN_DISTANCE = 7;
    public static final short HOME_SCREEN_FULLSCREEN_DATE = 9;
    public static final short HOME_SCREEN_HR_LIVE = 4;
    public static final short HOME_SCREEN_LOCAL_TIME = 2;
    public static final short HOME_SCREEN_STEPS = 5;

    /* renamed from: id  reason: collision with root package name */
    public short f33252id;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_HOME_SCREEN;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33252id = readUnsignedByte(byteBuffer);
    }

    public HomeScreen setId(short s11) {
        this.f33252id = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.f33252id);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("id = "), this.f33252id, new StringBuilder("HomeScreen("), ")");
    }
}
