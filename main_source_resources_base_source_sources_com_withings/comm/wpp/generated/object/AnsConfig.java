package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AnsConfig extends h {
    public static final short ANS_CONFIGURATION_STATUS_DISABLE = 0;
    public static final short ANS_CONFIGURATION_STATUS_ENABLE = 1;
    public static final short ANS_CONFIGURATION_STATUS_ENABLE_ON_OTHER_PHONE = 2;
    public static final short ANS_CONFIGURATION_TYPE_EMAIL = 1;
    public static final short ANS_CONFIGURATION_TYPE_HIGH_PRIORITIZED_ALERT = 8;
    public static final short ANS_CONFIGURATION_TYPE_INSTANT_MESSAGE = 9;
    public static final short ANS_CONFIGURATION_TYPE_MISSED_CALL = 4;
    public static final short ANS_CONFIGURATION_TYPE_NEWS = 2;
    public static final short ANS_CONFIGURATION_TYPE_NOTIFICATION_CALL = 3;
    public static final short ANS_CONFIGURATION_TYPE_SCHEDULE = 7;
    public static final short ANS_CONFIGURATION_TYPE_SIMPLE_ALERT = 0;
    public static final short ANS_CONFIGURATION_TYPE_SMS_MMS = 5;
    public static final short ANS_CONFIGURATION_TYPE_VOICE_MAIL = 6;
    public short status;
    public short type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_ANS_CONFIGURATION;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.status = readUnsignedByte(byteBuffer);
    }

    public AnsConfig setStatus(short s11) {
        this.status = s11;
        return this;
    }

    public AnsConfig setType(short s11) {
        this.type = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.type);
        writeUnsignedByte(e11, this.status);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnsConfig(");
        return e.a(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "status = "), this.status, sb2, ")");
    }
}
