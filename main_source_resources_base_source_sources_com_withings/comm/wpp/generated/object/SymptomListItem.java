package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SymptomListItem extends h {
    public short activated;

    /* renamed from: id  reason: collision with root package name */
    public long f33273id;
    public String label;
    public long timestamp;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.label;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 10);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SYMPTOM_LIST_ITEM;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33273id = readUnsignedInt(byteBuffer);
        this.activated = readUnsignedByte(byteBuffer);
        this.timestamp = readUnsignedInt(byteBuffer);
        this.label = readString(byteBuffer);
    }

    public SymptomListItem setActivated(short s11) {
        this.activated = s11;
        return this;
    }

    public SymptomListItem setId(long j5) {
        this.f33273id = j5;
        return this;
    }

    public SymptomListItem setLabel(String str) {
        this.label = str;
        return this;
    }

    public SymptomListItem setTimestamp(long j5) {
        this.timestamp = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33273id);
        writeUnsignedByte(e11, this.activated);
        writeUnsignedInt(e11, this.timestamp);
        writeString(e11, this.label);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SymptomListItem(");
        sb2.append("id = " + this.f33273id);
        sb2.append(", ");
        StringBuilder d11 = q.d(new StringBuilder("activated = "), this.activated, sb2, ", ", "timestamp = ");
        d11.append(this.timestamp);
        sb2.append(d11.toString());
        sb2.append(", ");
        return c.c(new StringBuilder("label = "), this.label, sb2, ")");
    }
}
