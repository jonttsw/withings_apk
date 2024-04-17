package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: Vasistas.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n\u0082\u0001\n\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "", "()V", "duration", "Lorg/joda/time/Duration;", "getDuration", "()Lorg/joda/time/Duration;", "endDate", "Lorg/joda/time/DateTime;", "getEndDate", "()Lorg/joda/time/DateTime;", "id", "", "getId", "()J", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "startDate", "getStartDate", "MetaData", "Lcom/withings/vasistas/v2/model/AhiVasistas;", "Lcom/withings/vasistas/v2/model/BedVasistas;", "Lcom/withings/vasistas/v2/model/BodyVasistas;", "Lcom/withings/vasistas/v2/model/CoreTemperatureVasistas;", "Lcom/withings/vasistas/v2/model/ElevationVasistas;", "Lcom/withings/vasistas/v2/model/MotionVasistas;", "Lcom/withings/vasistas/v2/model/PauseVasistas;", "Lcom/withings/vasistas/v2/model/Spo2Vasistas;", "Lcom/withings/vasistas/v2/model/SwimVasistas;", "Lcom/withings/vasistas/v2/model/TrackerSleepVasistas;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Vasistas {

    /* compiled from: Vasistas.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010 \u001a\u00020\u000bHÆ\u0003JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006("}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "", NavigationArguments.USER_ID, "", "deviceId", "deviceModel", "", "version", "appPlatformId", "algoVersion", "isSynced", "", "(JLjava/lang/Long;IILjava/lang/Integer;Ljava/lang/Integer;Z)V", "getAlgoVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppPlatformId", "getDeviceId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeviceModel", "()I", "()Z", "getUserId", "()J", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/Long;IILjava/lang/Integer;Ljava/lang/Integer;Z)Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "equals", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MetaData {
        private final Integer algoVersion;
        private final Integer appPlatformId;
        private final Long deviceId;
        private final int deviceModel;
        private final boolean isSynced;
        private final long userId;
        private final int version;

        public MetaData(long j5, Long l5, int i11, int i12, Integer num, Integer num2, boolean z5) {
            this.userId = j5;
            this.deviceId = l5;
            this.deviceModel = i11;
            this.version = i12;
            this.appPlatformId = num;
            this.algoVersion = num2;
            this.isSynced = z5;
        }

        public static /* synthetic */ MetaData copy$default(MetaData metaData, long j5, Long l5, int i11, int i12, Integer num, Integer num2, boolean z5, int i13, Object obj) {
            long j11;
            Long l6;
            int i14;
            int i15;
            Integer num3;
            Integer num4;
            boolean z11;
            if ((i13 & 1) != 0) {
                j11 = metaData.userId;
            } else {
                j11 = j5;
            }
            if ((i13 & 2) != 0) {
                l6 = metaData.deviceId;
            } else {
                l6 = l5;
            }
            if ((i13 & 4) != 0) {
                i14 = metaData.deviceModel;
            } else {
                i14 = i11;
            }
            if ((i13 & 8) != 0) {
                i15 = metaData.version;
            } else {
                i15 = i12;
            }
            if ((i13 & 16) != 0) {
                num3 = metaData.appPlatformId;
            } else {
                num3 = num;
            }
            if ((i13 & 32) != 0) {
                num4 = metaData.algoVersion;
            } else {
                num4 = num2;
            }
            if ((i13 & 64) != 0) {
                z11 = metaData.isSynced;
            } else {
                z11 = z5;
            }
            return metaData.copy(j11, l6, i14, i15, num3, num4, z11);
        }

        public final long component1() {
            return this.userId;
        }

        public final Long component2() {
            return this.deviceId;
        }

        public final int component3() {
            return this.deviceModel;
        }

        public final int component4() {
            return this.version;
        }

        public final Integer component5() {
            return this.appPlatformId;
        }

        public final Integer component6() {
            return this.algoVersion;
        }

        public final boolean component7() {
            return this.isSynced;
        }

        public final MetaData copy(long j5, Long l5, int i11, int i12, Integer num, Integer num2, boolean z5) {
            return new MetaData(j5, l5, i11, i12, num, num2, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            if (this.userId == metaData.userId && u.e(this.deviceId, metaData.deviceId) && this.deviceModel == metaData.deviceModel && this.version == metaData.version && u.e(this.appPlatformId, metaData.appPlatformId) && u.e(this.algoVersion, metaData.algoVersion) && this.isSynced == metaData.isSynced) {
                return true;
            }
            return false;
        }

        public final Integer getAlgoVersion() {
            return this.algoVersion;
        }

        public final Integer getAppPlatformId() {
            return this.appPlatformId;
        }

        public final Long getDeviceId() {
            return this.deviceId;
        }

        public final int getDeviceModel() {
            return this.deviceModel;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = Long.hashCode(this.userId) * 31;
            Long l5 = this.deviceId;
            int i11 = 0;
            if (l5 == null) {
                hashCode = 0;
            } else {
                hashCode = l5.hashCode();
            }
            int a11 = h.a(this.version, h.a(this.deviceModel, (hashCode3 + hashCode) * 31, 31), 31);
            Integer num = this.appPlatformId;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i12 = (a11 + hashCode2) * 31;
            Integer num2 = this.algoVersion;
            if (num2 != null) {
                i11 = num2.hashCode();
            }
            return Boolean.hashCode(this.isSynced) + ((i12 + i11) * 31);
        }

        public final boolean isSynced() {
            return this.isSynced;
        }

        public String toString() {
            long j5 = this.userId;
            Long l5 = this.deviceId;
            int i11 = this.deviceModel;
            int i12 = this.version;
            Integer num = this.appPlatformId;
            Integer num2 = this.algoVersion;
            boolean z5 = this.isSynced;
            StringBuilder sb2 = new StringBuilder("MetaData(userId=");
            sb2.append(j5);
            sb2.append(", deviceId=");
            sb2.append(l5);
            q2.c(sb2, ", deviceModel=", i11, ", version=", i12);
            sb2.append(", appPlatformId=");
            sb2.append(num);
            sb2.append(", algoVersion=");
            sb2.append(num2);
            sb2.append(", isSynced=");
            sb2.append(z5);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public /* synthetic */ Vasistas(m mVar) {
        this();
    }

    public abstract Duration getDuration();

    public final DateTime getEndDate() {
        DateTime plus = getStartDate().plus(getDuration());
        u.i(plus, "plus(...)");
        return plus;
    }

    public abstract long getId();

    public abstract MetaData getMetaData();

    public abstract DateTime getStartDate();

    private Vasistas() {
    }
}
