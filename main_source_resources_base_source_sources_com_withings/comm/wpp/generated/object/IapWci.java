package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class IapWci extends h {
    public static final short SECURITY_UNSECURED = 0;
    public static final short SECURITY_WEP = 1;
    public static final short SECURITY_WPA = 2;
    public static final short SECURITY_WPA1AND2 = 4;
    public static final short SECURITY_WPA2 = 3;
    public static final short STATUS_DECLINED = 2;
    public static final short STATUS_FAILED = 3;
    public static final short STATUS_SUCCESS = 0;
    public static final short STATUS_UNAVAILABLE = 1;
    public String passphrase;
    public short security;
    public String ssid;
    public short status;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.ssid;
        int i12 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i13 = i11 + 3;
        String str2 = this.passphrase;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        }
        return (short) (i12 + 1 + i13);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_IAP_WCI;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.status = readUnsignedByte(byteBuffer);
        this.security = readUnsignedByte(byteBuffer);
        this.ssid = readString(byteBuffer);
        this.passphrase = readString(byteBuffer);
    }

    public IapWci setPassphrase(String str) {
        this.passphrase = str;
        return this;
    }

    public IapWci setSecurity(short s11) {
        this.security = s11;
        return this;
    }

    public IapWci setSsid(String str) {
        this.ssid = str;
        return this;
    }

    public IapWci setStatus(short s11) {
        this.status = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.status);
        writeUnsignedByte(e11, this.security);
        writeString(e11, this.ssid);
        writeString(e11, this.passphrase);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IapWci(");
        return c.c(a0.c(q.d(q.d(new StringBuilder("status = "), this.status, sb2, ", ", "security = "), this.security, sb2, ", ", "ssid = "), this.ssid, sb2, ", ", "passphrase = "), this.passphrase, sb2, ")");
    }
}
