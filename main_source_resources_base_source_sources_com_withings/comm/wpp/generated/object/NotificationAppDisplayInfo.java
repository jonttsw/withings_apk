package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class NotificationAppDisplayInfo extends h {
    public static final short NOTIFICATION_APP_DISPLAY_INFO_FIELD__APP_NAME = 4;
    public static final short NOTIFICATION_APP_DISPLAY_INFO_FIELD__MESSAGE = 3;
    public static final short NOTIFICATION_APP_DISPLAY_INFO_FIELD__NONE = 0;
    public static final short NOTIFICATION_APP_DISPLAY_INFO_FIELD__SUBTITLE = 2;
    public static final short NOTIFICATION_APP_DISPLAY_INFO_FIELD__TITLE = 1;
    public static final short NOTIFICATION_APP_DISPLAY_INFO__HIDE = 0;
    public static final short NOTIFICATION_APP_DISPLAY_INFO__SHOW_WITH_ICON = 1;
    public static final short NOTIFICATION_APP_DISPLAY_INFO__SHOW_WITH_PLACEHOLDER = 2;
    public short display;
    public byte[] fieldsOrder;
    public short mode;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.fieldsOrder;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 3);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2405;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mode = readUnsignedByte(byteBuffer);
        this.display = readUnsignedByte(byteBuffer);
        this.fieldsOrder = readByteArray(byteBuffer);
    }

    public NotificationAppDisplayInfo setDisplay(short s11) {
        this.display = s11;
        return this;
    }

    public NotificationAppDisplayInfo setFieldsOrder(byte[] bArr) {
        this.fieldsOrder = bArr;
        return this;
    }

    public NotificationAppDisplayInfo setMode(short s11) {
        this.mode = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.mode);
        writeUnsignedByte(e11, this.display);
        writeByteArray(e11, this.fieldsOrder);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationAppDisplayInfo(");
        StringBuilder d11 = q.d(q.d(new StringBuilder("mode = "), this.mode, sb2, ", ", "display = "), this.display, sb2, ", ", "fieldsOrder = ");
        d11.append(Wpp.prettyBytes(this.fieldsOrder));
        sb2.append(d11.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
