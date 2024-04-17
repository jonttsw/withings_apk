package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class BootstrapRedirect extends h {
    public String domain;
    public String httpsSubdomain;
    public String wppsSubdomain;
    public long wsErrorCode;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        int i12;
        String str = this.httpsSubdomain;
        int i13 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i14 = i11 + 5;
        String str2 = this.wppsSubdomain;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        } else {
            i12 = 0;
        }
        int i15 = i12 + 1 + i14;
        String str3 = this.domain;
        if (str3 != null) {
            i13 = str3.getBytes().length;
        }
        return (short) (i13 + 1 + i15);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2467;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.wsErrorCode = readUnsignedInt(byteBuffer);
        this.httpsSubdomain = readString(byteBuffer);
        this.wppsSubdomain = readString(byteBuffer);
        this.domain = readString(byteBuffer);
    }

    public BootstrapRedirect setDomain(String str) {
        this.domain = str;
        return this;
    }

    public BootstrapRedirect setHttpsSubdomain(String str) {
        this.httpsSubdomain = str;
        return this;
    }

    public BootstrapRedirect setWppsSubdomain(String str) {
        this.wppsSubdomain = str;
        return this;
    }

    public BootstrapRedirect setWsErrorCode(long j5) {
        this.wsErrorCode = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.wsErrorCode);
        writeString(e11, this.httpsSubdomain);
        writeString(e11, this.wppsSubdomain);
        writeString(e11, this.domain);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BootstrapRedirect(");
        sb2.append("wsErrorCode = " + this.wsErrorCode);
        sb2.append(", ");
        return c.c(a0.c(a0.c(new StringBuilder("httpsSubdomain = "), this.httpsSubdomain, sb2, ", ", "wppsSubdomain = "), this.wppsSubdomain, sb2, ", ", "domain = "), this.domain, sb2, ")");
    }
}
