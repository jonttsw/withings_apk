package com.withings.library.authentication.api.account;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AccountContext.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\b\u0000\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b)\u0010*BK\b\u0017\u0012\u0006\u0010+\u001a\u00020\n\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\fR\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\fR\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\fR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\f¨\u00061"}, d2 = {"Lcom/withings/library/authentication/api/account/SharedUnit;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/SharedUnit;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "distance", "height", "temperature", "weight", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/library/authentication/api/account/SharedUnit;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getDistance", "getDistance$annotations", "()V", "getHeight", "getHeight$annotations", "getTemperature", "getTemperature$annotations", "getWeight", "getWeight$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class SharedUnit {
    public static final Companion Companion = new Companion(null);
    private final Integer distance;
    private final Integer height;
    private final Integer temperature;
    private final Integer weight;

    /* compiled from: AccountContext.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/SharedUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/SharedUnit;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<SharedUnit> serializer() {
            return SharedUnit$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SharedUnit() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (m) null);
    }

    public static /* synthetic */ SharedUnit copy$default(SharedUnit sharedUnit, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = sharedUnit.distance;
        }
        if ((i11 & 2) != 0) {
            num2 = sharedUnit.height;
        }
        if ((i11 & 4) != 0) {
            num3 = sharedUnit.temperature;
        }
        if ((i11 & 8) != 0) {
            num4 = sharedUnit.weight;
        }
        return sharedUnit.copy(num, num2, num3, num4);
    }

    public static final /* synthetic */ void write$Self(SharedUnit sharedUnit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sharedUnit.distance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, sharedUnit.distance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sharedUnit.height != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, sharedUnit.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sharedUnit.temperature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, sharedUnit.temperature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || sharedUnit.weight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, sharedUnit.weight);
        }
    }

    public final Integer component1() {
        return this.distance;
    }

    public final Integer component2() {
        return this.height;
    }

    public final Integer component3() {
        return this.temperature;
    }

    public final Integer component4() {
        return this.weight;
    }

    public final SharedUnit copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new SharedUnit(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedUnit)) {
            return false;
        }
        SharedUnit sharedUnit = (SharedUnit) obj;
        if (u.e(this.distance, sharedUnit.distance) && u.e(this.height, sharedUnit.height) && u.e(this.temperature, sharedUnit.temperature) && u.e(this.weight, sharedUnit.weight)) {
            return true;
        }
        return false;
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getTemperature() {
        return this.temperature;
    }

    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.distance;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.height;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.temperature;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num4 = this.weight;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        Integer num = this.distance;
        Integer num2 = this.height;
        Integer num3 = this.temperature;
        Integer num4 = this.weight;
        return "SharedUnit(distance=" + num + ", height=" + num2 + ", temperature=" + num3 + ", weight=" + num4 + ")";
    }

    public /* synthetic */ SharedUnit(int i11, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i11 & 1) == 0) {
            this.distance = null;
        } else {
            this.distance = num;
        }
        if ((i11 & 2) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i11 & 4) == 0) {
            this.temperature = null;
        } else {
            this.temperature = num3;
        }
        if ((i11 & 8) == 0) {
            this.weight = null;
        } else {
            this.weight = num4;
        }
    }

    public SharedUnit(Integer num, Integer num2, Integer num3, Integer num4) {
        this.distance = num;
        this.height = num2;
        this.temperature = num3;
        this.weight = num4;
    }

    public /* synthetic */ SharedUnit(Integer num, Integer num2, Integer num3, Integer num4, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
    }

    public static /* synthetic */ void getDistance$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getTemperature$annotations() {
    }

    public static /* synthetic */ void getWeight$annotations() {
    }
}
