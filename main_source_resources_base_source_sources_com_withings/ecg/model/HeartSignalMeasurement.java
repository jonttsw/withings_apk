package com.withings.ecg.model;

import an0.a;
import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.compose.material.o;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import rq.d;
/* compiled from: HeartSignalMeasurement.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001[B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0016J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\fHÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u009e\u0001\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u0006HÖ\u0001J\t\u0010Y\u001a\u00020ZHÖ\u0001R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001cR\u0013\u0010/\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00105\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00102\"\u0004\b;\u00104R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010>\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b?\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00102¨\u0006\\"}, d2 = {"Lcom/withings/ecg/model/HeartSignalMeasurement;", "", "id", "", "userID", "deviceModel", "", "timestamp", "Lorg/joda/time/DateTime;", "signal", "Lcom/withings/ecg/model/Signal;", "synced", "", "modified", "deviceId", "trackerWearPos", "deleted", "measures", "", "Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "firmwareVersion", "brand", "(JJILorg/joda/time/DateTime;Lcom/withings/ecg/model/Signal;ZJLjava/lang/Long;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "afibAttrib", "getAfibAttrib", "()Ljava/lang/Integer;", "getBrand", "setBrand", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDeleted", "()Z", "setDeleted", "(Z)V", "getDeviceId", "()Ljava/lang/Long;", "setDeviceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDeviceModel", "()I", "setDeviceModel", "(I)V", "diagnostic", "getDiagnostic", "getFirmwareVersion", "setFirmwareVersion", "heartRate", "getHeartRate", "getId", "()J", "setId", "(J)V", "isReviewed", "getMeasures", "()Ljava/util/List;", "setMeasures", "(Ljava/util/List;)V", "getModified", "setModified", "getSignal", "()Lcom/withings/ecg/model/Signal;", "spo2", "getSpo2", "getSynced", "setSynced", "getTimestamp", "()Lorg/joda/time/DateTime;", "getTrackerWearPos", "setTrackerWearPos", "getUserID", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJILorg/joda/time/DateTime;Lcom/withings/ecg/model/Signal;ZJLjava/lang/Long;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/ecg/model/HeartSignalMeasurement;", "equals", "other", "hashCode", "toString", "", "Measure", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartSignalMeasurement {
    public static final int $stable = 8;
    private Integer brand;
    private boolean deleted;
    private Long deviceId;
    private int deviceModel;
    private Integer firmwareVersion;

    /* renamed from: id  reason: collision with root package name */
    private long f38717id;
    private List<Measure> measures;
    private long modified;
    private final Signal signal;
    private boolean synced;
    private final DateTime timestamp;
    private Integer trackerWearPos;
    private final long userID;

    /* compiled from: HeartSignalMeasurement.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J^\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "", "type", "", "value", "", "algoVersion", "appVersion", "platform", "attrib", "algoParams", "", "(IFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAlgoParams", "()Ljava/lang/String;", "setAlgoParams", "(Ljava/lang/String;)V", "getAlgoVersion", "()Ljava/lang/Integer;", "setAlgoVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAppVersion", "setAppVersion", "getAttrib", "setAttrib", "getPlatform", "setPlatform", "getType", "()I", "setType", "(I)V", "getValue", "()F", "setValue", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "equals", "", "other", "hashCode", "toString", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Measure {
        public static final int $stable = 8;
        private String algoParams;
        private Integer algoVersion;
        private Integer appVersion;
        private Integer attrib;
        private Integer platform;
        private int type;
        private float value;

        public Measure(int i11, float f11) {
            this(i11, f11, null, null, null, null, null, 124, null);
        }

        public static /* synthetic */ Measure copy$default(Measure measure, int i11, float f11, Integer num, Integer num2, Integer num3, Integer num4, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = measure.type;
            }
            if ((i12 & 2) != 0) {
                f11 = measure.value;
            }
            float f12 = f11;
            if ((i12 & 4) != 0) {
                num = measure.algoVersion;
            }
            Integer num5 = num;
            if ((i12 & 8) != 0) {
                num2 = measure.appVersion;
            }
            Integer num6 = num2;
            if ((i12 & 16) != 0) {
                num3 = measure.platform;
            }
            Integer num7 = num3;
            if ((i12 & 32) != 0) {
                num4 = measure.attrib;
            }
            Integer num8 = num4;
            if ((i12 & 64) != 0) {
                str = measure.algoParams;
            }
            return measure.copy(i11, f12, num5, num6, num7, num8, str);
        }

        public final int component1() {
            return this.type;
        }

        public final float component2() {
            return this.value;
        }

        public final Integer component3() {
            return this.algoVersion;
        }

        public final Integer component4() {
            return this.appVersion;
        }

        public final Integer component5() {
            return this.platform;
        }

        public final Integer component6() {
            return this.attrib;
        }

        public final String component7() {
            return this.algoParams;
        }

        public final Measure copy(int i11, float f11, Integer num, Integer num2, Integer num3, Integer num4, String str) {
            return new Measure(i11, f11, num, num2, num3, num4, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Measure)) {
                return false;
            }
            Measure measure = (Measure) obj;
            if (this.type == measure.type && Float.compare(this.value, measure.value) == 0 && u.e(this.algoVersion, measure.algoVersion) && u.e(this.appVersion, measure.appVersion) && u.e(this.platform, measure.platform) && u.e(this.attrib, measure.attrib) && u.e(this.algoParams, measure.algoParams)) {
                return true;
            }
            return false;
        }

        public final String getAlgoParams() {
            return this.algoParams;
        }

        public final Integer getAlgoVersion() {
            return this.algoVersion;
        }

        public final Integer getAppVersion() {
            return this.appVersion;
        }

        public final Integer getAttrib() {
            return this.attrib;
        }

        public final Integer getPlatform() {
            return this.platform;
        }

        public final int getType() {
            return this.type;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a11 = o.a(this.value, Integer.hashCode(this.type) * 31, 31);
            Integer num = this.algoVersion;
            int i11 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i12 = (a11 + hashCode) * 31;
            Integer num2 = this.appVersion;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            Integer num3 = this.platform;
            if (num3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            Integer num4 = this.attrib;
            if (num4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = num4.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str = this.algoParams;
            if (str != null) {
                i11 = str.hashCode();
            }
            return i15 + i11;
        }

        public final void setAlgoParams(String str) {
            this.algoParams = str;
        }

        public final void setAlgoVersion(Integer num) {
            this.algoVersion = num;
        }

        public final void setAppVersion(Integer num) {
            this.appVersion = num;
        }

        public final void setAttrib(Integer num) {
            this.attrib = num;
        }

        public final void setPlatform(Integer num) {
            this.platform = num;
        }

        public final void setType(int i11) {
            this.type = i11;
        }

        public final void setValue(float f11) {
            this.value = f11;
        }

        public String toString() {
            int i11 = this.type;
            float f11 = this.value;
            Integer num = this.algoVersion;
            Integer num2 = this.appVersion;
            Integer num3 = this.platform;
            Integer num4 = this.attrib;
            String str = this.algoParams;
            StringBuilder sb2 = new StringBuilder("Measure(type=");
            sb2.append(i11);
            sb2.append(", value=");
            sb2.append(f11);
            sb2.append(", algoVersion=");
            sb2.append(num);
            sb2.append(", appVersion=");
            sb2.append(num2);
            sb2.append(", platform=");
            sb2.append(num3);
            sb2.append(", attrib=");
            sb2.append(num4);
            sb2.append(", algoParams=");
            return y1.e(sb2, str, ")");
        }

        public Measure(int i11, float f11, Integer num) {
            this(i11, f11, num, null, null, null, null, 120, null);
        }

        public Measure(int i11, float f11, Integer num, Integer num2) {
            this(i11, f11, num, num2, null, null, null, 112, null);
        }

        public Measure(int i11, float f11, Integer num, Integer num2, Integer num3) {
            this(i11, f11, num, num2, num3, null, null, 96, null);
        }

        public Measure(int i11, float f11, Integer num, Integer num2, Integer num3, Integer num4) {
            this(i11, f11, num, num2, num3, num4, null, 64, null);
        }

        public Measure(int i11, float f11, Integer num, Integer num2, Integer num3, Integer num4, String str) {
            this.type = i11;
            this.value = f11;
            this.algoVersion = num;
            this.appVersion = num2;
            this.platform = num3;
            this.attrib = num4;
            this.algoParams = str;
        }

        public /* synthetic */ Measure(int i11, float f11, Integer num, Integer num2, Integer num3, Integer num4, String str, int i12, m mVar) {
            this(i11, f11, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : num3, (i12 & 32) != 0 ? null : num4, (i12 & 64) != 0 ? null : str);
        }
    }

    public HeartSignalMeasurement(long j5, long j11, int i11, DateTime timestamp, Signal signal, boolean z5, long j12, Long l5, Integer num, boolean z11, List<Measure> measures, Integer num2, Integer num3) {
        u.j(timestamp, "timestamp");
        u.j(signal, "signal");
        u.j(measures, "measures");
        this.f38717id = j5;
        this.userID = j11;
        this.deviceModel = i11;
        this.timestamp = timestamp;
        this.signal = signal;
        this.synced = z5;
        this.modified = j12;
        this.deviceId = l5;
        this.trackerWearPos = num;
        this.deleted = z11;
        this.measures = measures;
        this.firmwareVersion = num2;
        this.brand = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeartSignalMeasurement copy$default(HeartSignalMeasurement heartSignalMeasurement, long j5, long j11, int i11, DateTime dateTime, Signal signal, boolean z5, long j12, Long l5, Integer num, boolean z11, List list, Integer num2, Integer num3, int i12, Object obj) {
        long j13;
        long j14;
        int i13;
        DateTime dateTime2;
        Signal signal2;
        boolean z12;
        long j15;
        Long l6;
        Integer num4;
        boolean z13;
        List<Measure> list2;
        Integer num5;
        Integer num6;
        if ((i12 & 1) != 0) {
            j13 = heartSignalMeasurement.f38717id;
        } else {
            j13 = j5;
        }
        if ((i12 & 2) != 0) {
            j14 = heartSignalMeasurement.userID;
        } else {
            j14 = j11;
        }
        if ((i12 & 4) != 0) {
            i13 = heartSignalMeasurement.deviceModel;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            dateTime2 = heartSignalMeasurement.timestamp;
        } else {
            dateTime2 = dateTime;
        }
        if ((i12 & 16) != 0) {
            signal2 = heartSignalMeasurement.signal;
        } else {
            signal2 = signal;
        }
        if ((i12 & 32) != 0) {
            z12 = heartSignalMeasurement.synced;
        } else {
            z12 = z5;
        }
        if ((i12 & 64) != 0) {
            j15 = heartSignalMeasurement.modified;
        } else {
            j15 = j12;
        }
        if ((i12 & 128) != 0) {
            l6 = heartSignalMeasurement.deviceId;
        } else {
            l6 = l5;
        }
        if ((i12 & 256) != 0) {
            num4 = heartSignalMeasurement.trackerWearPos;
        } else {
            num4 = num;
        }
        if ((i12 & 512) != 0) {
            z13 = heartSignalMeasurement.deleted;
        } else {
            z13 = z11;
        }
        if ((i12 & 1024) != 0) {
            list2 = heartSignalMeasurement.measures;
        } else {
            list2 = list;
        }
        List<Measure> list3 = list2;
        if ((i12 & ModuleCopy.f28574b) != 0) {
            num5 = heartSignalMeasurement.firmwareVersion;
        } else {
            num5 = num2;
        }
        if ((i12 & 4096) != 0) {
            num6 = heartSignalMeasurement.brand;
        } else {
            num6 = num3;
        }
        return heartSignalMeasurement.copy(j13, j14, i13, dateTime2, signal2, z12, j15, l6, num4, z13, list3, num5, num6);
    }

    public final long component1() {
        return this.f38717id;
    }

    public final boolean component10() {
        return this.deleted;
    }

    public final List<Measure> component11() {
        return this.measures;
    }

    public final Integer component12() {
        return this.firmwareVersion;
    }

    public final Integer component13() {
        return this.brand;
    }

    public final long component2() {
        return this.userID;
    }

    public final int component3() {
        return this.deviceModel;
    }

    public final DateTime component4() {
        return this.timestamp;
    }

    public final Signal component5() {
        return this.signal;
    }

    public final boolean component6() {
        return this.synced;
    }

    public final long component7() {
        return this.modified;
    }

    public final Long component8() {
        return this.deviceId;
    }

    public final Integer component9() {
        return this.trackerWearPos;
    }

    public final HeartSignalMeasurement copy(long j5, long j11, int i11, DateTime timestamp, Signal signal, boolean z5, long j12, Long l5, Integer num, boolean z11, List<Measure> measures, Integer num2, Integer num3) {
        u.j(timestamp, "timestamp");
        u.j(signal, "signal");
        u.j(measures, "measures");
        return new HeartSignalMeasurement(j5, j11, i11, timestamp, signal, z5, j12, l5, num, z11, measures, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartSignalMeasurement)) {
            return false;
        }
        HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) obj;
        if (this.f38717id == heartSignalMeasurement.f38717id && this.userID == heartSignalMeasurement.userID && this.deviceModel == heartSignalMeasurement.deviceModel && u.e(this.timestamp, heartSignalMeasurement.timestamp) && u.e(this.signal, heartSignalMeasurement.signal) && this.synced == heartSignalMeasurement.synced && this.modified == heartSignalMeasurement.modified && u.e(this.deviceId, heartSignalMeasurement.deviceId) && u.e(this.trackerWearPos, heartSignalMeasurement.trackerWearPos) && this.deleted == heartSignalMeasurement.deleted && u.e(this.measures, heartSignalMeasurement.measures) && u.e(this.firmwareVersion, heartSignalMeasurement.firmwareVersion) && u.e(this.brand, heartSignalMeasurement.brand)) {
            return true;
        }
        return false;
    }

    public final Integer getAfibAttrib() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Measure) obj).getType() == 130) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Measure measure = (Measure) obj;
        if (measure == null) {
            return null;
        }
        return measure.getAttrib();
    }

    public final Integer getBrand() {
        return this.brand;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final Integer getDiagnostic() {
        Measure diagnosticMeasure = HeartSignalMeasurementKt.getDiagnosticMeasure(this);
        if (diagnosticMeasure != null) {
            return Integer.valueOf((int) diagnosticMeasure.getValue());
        }
        return null;
    }

    public final Integer getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final Integer getHeartRate() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Measure) obj).getType() == 11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Measure measure = (Measure) obj;
        if (measure == null) {
            return null;
        }
        return Integer.valueOf((int) measure.getValue());
    }

    public final long getId() {
        return this.f38717id;
    }

    public final List<Measure> getMeasures() {
        return this.measures;
    }

    public final long getModified() {
        return this.modified;
    }

    public final Signal getSignal() {
        return this.signal;
    }

    public final Integer getSpo2() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Measure) obj).getType() == 54) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Measure measure = (Measure) obj;
        if (measure == null) {
            return null;
        }
        return Integer.valueOf(a.b(measure.getValue()));
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public final Integer getTrackerWearPos() {
        return this.trackerWearPos;
    }

    public final long getUserID() {
        return this.userID;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int a11 = c.a(this.modified, y1.a(this.synced, (this.signal.hashCode() + com.google.android.gms.internal.mlkit_common.a.b(this.timestamp, h.a(this.deviceModel, c.a(this.userID, Long.hashCode(this.f38717id) * 31, 31), 31), 31)) * 31, 31), 31);
        Long l5 = this.deviceId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Integer num = this.trackerWearPos;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int b10 = e.b(this.measures, y1.a(this.deleted, (i12 + hashCode2) * 31, 31), 31);
        Integer num2 = this.firmwareVersion;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i13 = (b10 + hashCode3) * 31;
        Integer num3 = this.brand;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return i13 + i11;
    }

    public final boolean isReviewed() {
        Integer num;
        Measure measure = (Measure) x.K(this.measures);
        if (measure != null) {
            num = measure.getAttrib();
        } else {
            num = null;
        }
        if (num != null && l.l(d.a(), num.intValue())) {
            return false;
        }
        return true;
    }

    public final void setBrand(Integer num) {
        this.brand = num;
    }

    public final void setDeleted(boolean z5) {
        this.deleted = z5;
    }

    public final void setDeviceId(Long l5) {
        this.deviceId = l5;
    }

    public final void setDeviceModel(int i11) {
        this.deviceModel = i11;
    }

    public final void setFirmwareVersion(Integer num) {
        this.firmwareVersion = num;
    }

    public final void setId(long j5) {
        this.f38717id = j5;
    }

    public final void setMeasures(List<Measure> list) {
        u.j(list, "<set-?>");
        this.measures = list;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setSynced(boolean z5) {
        this.synced = z5;
    }

    public final void setTrackerWearPos(Integer num) {
        this.trackerWearPos = num;
    }

    public String toString() {
        long j5 = this.f38717id;
        long j11 = this.userID;
        int i11 = this.deviceModel;
        DateTime dateTime = this.timestamp;
        Signal signal = this.signal;
        boolean z5 = this.synced;
        long j12 = this.modified;
        Long l5 = this.deviceId;
        Integer num = this.trackerWearPos;
        boolean z11 = this.deleted;
        List<Measure> list = this.measures;
        Integer num2 = this.firmwareVersion;
        Integer num3 = this.brand;
        StringBuilder e11 = v.e("HeartSignalMeasurement(id=", j5, ", userID=");
        e11.append(j11);
        e11.append(", deviceModel=");
        e11.append(i11);
        e11.append(", timestamp=");
        e11.append(dateTime);
        e11.append(", signal=");
        e11.append(signal);
        e11.append(", synced=");
        e11.append(z5);
        e11.append(", modified=");
        e11.append(j12);
        e11.append(", deviceId=");
        e11.append(l5);
        e11.append(", trackerWearPos=");
        e11.append(num);
        e11.append(", deleted=");
        e11.append(z11);
        e11.append(", measures=");
        e11.append(list);
        e11.append(", firmwareVersion=");
        e11.append(num2);
        e11.append(", brand=");
        e11.append(num3);
        e11.append(")");
        return e11.toString();
    }

    public /* synthetic */ HeartSignalMeasurement(long j5, long j11, int i11, DateTime dateTime, Signal signal, boolean z5, long j12, Long l5, Integer num, boolean z11, List list, Integer num2, Integer num3, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0L : j5, j11, i11, dateTime, signal, (i12 & 32) != 0 ? false : z5, (i12 & 64) != 0 ? 0L : j12, l5, num, (i12 & 512) != 0 ? false : z11, list, num2, num3);
    }
}
