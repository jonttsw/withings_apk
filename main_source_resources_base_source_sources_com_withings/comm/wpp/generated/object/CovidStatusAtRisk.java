package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CovidStatusAtRisk extends h {
    public byte atRisk;
    public long lastExposureTimeframe;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2457;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.lastExposureTimeframe = readUnsignedInt(byteBuffer);
        this.atRisk = readByte(byteBuffer);
    }

    public CovidStatusAtRisk setAtRisk(byte b10) {
        this.atRisk = b10;
        return this;
    }

    public CovidStatusAtRisk setLastExposureTimeframe(long j5) {
        this.lastExposureTimeframe = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.lastExposureTimeframe);
        writeByte(e11, this.atRisk);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CovidStatusAtRisk(");
        sb2.append("lastExposureTimeframe = " + this.lastExposureTimeframe);
        sb2.append(", ");
        return e.a(new StringBuilder("atRisk = "), this.atRisk, sb2, ")");
    }
}
