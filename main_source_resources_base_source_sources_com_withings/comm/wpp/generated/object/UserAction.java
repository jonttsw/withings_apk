package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class UserAction extends h {
    public static final short USER_ACTION_PHONE_ALERT = 0;
    public static final short USER_ACTION_START_SPORT_SESSION = 1;
    public static final short USER_ACTION_STOP_SPORT_SESSION = 2;
    public short action;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2368;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.action = readUnsignedByte(byteBuffer);
    }

    public UserAction setAction(short s11) {
        this.action = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.action);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("action = "), this.action, new StringBuilder("UserAction("), ")");
    }
}
