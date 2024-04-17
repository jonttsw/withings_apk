package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ConnectReason extends h {
    public static final short BAT_LVL_INFO = 8;
    public static final short DEVICE_REQ = 2;
    public static final short EVENT = 7;
    public static final short FIRM_UPDATE = 3;
    public static final short READY_TO_UPDATE = 4;
    public static final short RESCUE_FW = 5;
    public static final short TRAINING = 6;
    public static final short UNKNOWN = 0;
    public static final short USER_REQ = 1;
    public static final short WUP_SYNC_REQ = 9;
    public int reason;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 280;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.reason = readUnsignedShort(byteBuffer);
    }

    public ConnectReason setReason(int i11) {
        this.reason = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.reason);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("reason = "), this.reason, new StringBuilder("ConnectReason("), ")");
    }
}
