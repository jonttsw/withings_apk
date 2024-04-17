package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AmazonAuth extends h {
    public String authCode;
    public String clientId;
    public String redirectUri;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        int i12;
        String str = this.authCode;
        int i13 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i14 = i11 + 1;
        String str2 = this.clientId;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        } else {
            i12 = 0;
        }
        int i15 = i12 + 1 + i14;
        String str3 = this.redirectUri;
        if (str3 != null) {
            i13 = str3.getBytes().length;
        }
        return (short) (i13 + 1 + i15);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_AMAZON_AUTH;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.authCode = readString(byteBuffer);
        this.clientId = readString(byteBuffer);
        this.redirectUri = readString(byteBuffer);
    }

    public AmazonAuth setAuthCode(String str) {
        this.authCode = str;
        return this;
    }

    public AmazonAuth setClientId(String str) {
        this.clientId = str;
        return this;
    }

    public AmazonAuth setRedirectUri(String str) {
        this.redirectUri = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.authCode);
        writeString(e11, this.clientId);
        writeString(e11, this.redirectUri);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AmazonAuth(");
        return c.c(a0.c(a0.c(new StringBuilder("authCode = "), this.authCode, sb2, ", ", "clientId = "), this.clientId, sb2, ", ", "redirectUri = "), this.redirectUri, sb2, ")");
    }
}
