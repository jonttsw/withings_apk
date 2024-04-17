package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AncsConfig extends h {
    public static final short ANCS_CONFIGURATION_STATUS_DISABLE = 0;
    public static final short ANCS_CONFIGURATION_STATUS_ENABLE = 1;
    public static final short ANCS_CONFIGURATION_STATUS_ENABLE_ON_OTHER_PHONE = 2;
    public static final short ANCS_CONFIGURATION_TYPE_BUSINESS_AND_FINANCE_CAT = 9;
    public static final short ANCS_CONFIGURATION_TYPE_EMAIL_CAT = 6;
    public static final short ANCS_CONFIGURATION_TYPE_ENTERTAINMENT_CAT = 11;
    public static final short ANCS_CONFIGURATION_TYPE_HEALTH_AND_FITNESS_CAT = 8;
    public static final short ANCS_CONFIGURATION_TYPE_INCOMMING_CALL_CAT = 1;
    public static final short ANCS_CONFIGURATION_TYPE_LOCATION_CAT = 10;
    public static final short ANCS_CONFIGURATION_TYPE_MISSED_CALL_CAT = 2;
    public static final short ANCS_CONFIGURATION_TYPE_NEWS_CAT = 7;
    public static final short ANCS_CONFIGURATION_TYPE_OTHER_CAT = 0;
    public static final short ANCS_CONFIGURATION_TYPE_SCHEDULE_CAT = 5;
    public static final short ANCS_CONFIGURATION_TYPE_SOCIAL_CAT = 4;
    public static final short ANCS_CONFIGURATION_TYPE_VOICE_MAIL_CAT = 3;
    public short status;
    public short type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2347;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.status = readUnsignedByte(byteBuffer);
    }

    public AncsConfig setStatus(short s11) {
        this.status = s11;
        return this;
    }

    public AncsConfig setType(short s11) {
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
        StringBuilder sb2 = new StringBuilder("AncsConfig(");
        return e.a(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "status = "), this.status, sb2, ")");
    }
}
