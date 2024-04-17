package com.withings.ecg.model;

import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredSignalData;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HeartSignalMeasurementBuilder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\\\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\tHÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006>"}, d2 = {"Lcom/withings/ecg/model/HeartSignalInfo;", "", "signalMeta", "Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;", "signalMetaExtend", "Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;", "unitConversionParameters", "Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;", "trackerWearPos", "", "signalData", "Lcom/withings/comm/wpp/generated/object/StoredSignalData;", "measureMeta", "Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "measureHolderList", "", "Lcom/withings/ecg/model/MeasurementHolder;", "(Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;Ljava/lang/Integer;Lcom/withings/comm/wpp/generated/object/StoredSignalData;Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;Ljava/util/List;)V", "getMeasureHolderList", "()Ljava/util/List;", "setMeasureHolderList", "(Ljava/util/List;)V", "getMeasureMeta", "()Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "setMeasureMeta", "(Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;)V", "getSignalData", "()Lcom/withings/comm/wpp/generated/object/StoredSignalData;", "setSignalData", "(Lcom/withings/comm/wpp/generated/object/StoredSignalData;)V", "getSignalMeta", "()Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;", "setSignalMeta", "(Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;)V", "getSignalMetaExtend", "()Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;", "setSignalMetaExtend", "(Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;)V", "getTrackerWearPos", "()Ljava/lang/Integer;", "setTrackerWearPos", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUnitConversionParameters", "()Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;", "setUnitConversionParameters", "(Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;Ljava/lang/Integer;Lcom/withings/comm/wpp/generated/object/StoredSignalData;Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;Ljava/util/List;)Lcom/withings/ecg/model/HeartSignalInfo;", "equals", "", "other", "hashCode", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartSignalInfo {
    public static final int $stable = 8;
    private List<MeasurementHolder> measureHolderList;
    private StoredMeasureMeta measureMeta;
    private StoredSignalData signalData;
    private StoredSignalMeta signalMeta;
    private StoredSignalMetaExtend signalMetaExtend;
    private Integer trackerWearPos;
    private UnitConversionParameters unitConversionParameters;

    public HeartSignalInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ HeartSignalInfo copy$default(HeartSignalInfo heartSignalInfo, StoredSignalMeta storedSignalMeta, StoredSignalMetaExtend storedSignalMetaExtend, UnitConversionParameters unitConversionParameters, Integer num, StoredSignalData storedSignalData, StoredMeasureMeta storedMeasureMeta, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            storedSignalMeta = heartSignalInfo.signalMeta;
        }
        if ((i11 & 2) != 0) {
            storedSignalMetaExtend = heartSignalInfo.signalMetaExtend;
        }
        StoredSignalMetaExtend storedSignalMetaExtend2 = storedSignalMetaExtend;
        if ((i11 & 4) != 0) {
            unitConversionParameters = heartSignalInfo.unitConversionParameters;
        }
        UnitConversionParameters unitConversionParameters2 = unitConversionParameters;
        if ((i11 & 8) != 0) {
            num = heartSignalInfo.trackerWearPos;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            storedSignalData = heartSignalInfo.signalData;
        }
        StoredSignalData storedSignalData2 = storedSignalData;
        if ((i11 & 32) != 0) {
            storedMeasureMeta = heartSignalInfo.measureMeta;
        }
        StoredMeasureMeta storedMeasureMeta2 = storedMeasureMeta;
        List<MeasurementHolder> list2 = list;
        if ((i11 & 64) != 0) {
            list2 = heartSignalInfo.measureHolderList;
        }
        return heartSignalInfo.copy(storedSignalMeta, storedSignalMetaExtend2, unitConversionParameters2, num2, storedSignalData2, storedMeasureMeta2, list2);
    }

    public final StoredSignalMeta component1() {
        return this.signalMeta;
    }

    public final StoredSignalMetaExtend component2() {
        return this.signalMetaExtend;
    }

    public final UnitConversionParameters component3() {
        return this.unitConversionParameters;
    }

    public final Integer component4() {
        return this.trackerWearPos;
    }

    public final StoredSignalData component5() {
        return this.signalData;
    }

    public final StoredMeasureMeta component6() {
        return this.measureMeta;
    }

    public final List<MeasurementHolder> component7() {
        return this.measureHolderList;
    }

    public final HeartSignalInfo copy(StoredSignalMeta signalMeta, StoredSignalMetaExtend signalMetaExtend, UnitConversionParameters unitConversionParameters, Integer num, StoredSignalData signalData, StoredMeasureMeta measureMeta, List<MeasurementHolder> measureHolderList) {
        u.j(signalMeta, "signalMeta");
        u.j(signalMetaExtend, "signalMetaExtend");
        u.j(unitConversionParameters, "unitConversionParameters");
        u.j(signalData, "signalData");
        u.j(measureMeta, "measureMeta");
        u.j(measureHolderList, "measureHolderList");
        return new HeartSignalInfo(signalMeta, signalMetaExtend, unitConversionParameters, num, signalData, measureMeta, measureHolderList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartSignalInfo)) {
            return false;
        }
        HeartSignalInfo heartSignalInfo = (HeartSignalInfo) obj;
        if (u.e(this.signalMeta, heartSignalInfo.signalMeta) && u.e(this.signalMetaExtend, heartSignalInfo.signalMetaExtend) && u.e(this.unitConversionParameters, heartSignalInfo.unitConversionParameters) && u.e(this.trackerWearPos, heartSignalInfo.trackerWearPos) && u.e(this.signalData, heartSignalInfo.signalData) && u.e(this.measureMeta, heartSignalInfo.measureMeta) && u.e(this.measureHolderList, heartSignalInfo.measureHolderList)) {
            return true;
        }
        return false;
    }

    public final List<MeasurementHolder> getMeasureHolderList() {
        return this.measureHolderList;
    }

    public final StoredMeasureMeta getMeasureMeta() {
        return this.measureMeta;
    }

    public final StoredSignalData getSignalData() {
        return this.signalData;
    }

    public final StoredSignalMeta getSignalMeta() {
        return this.signalMeta;
    }

    public final StoredSignalMetaExtend getSignalMetaExtend() {
        return this.signalMetaExtend;
    }

    public final Integer getTrackerWearPos() {
        return this.trackerWearPos;
    }

    public final UnitConversionParameters getUnitConversionParameters() {
        return this.unitConversionParameters;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.signalMetaExtend.hashCode();
        int hashCode3 = (this.unitConversionParameters.hashCode() + ((hashCode2 + (this.signalMeta.hashCode() * 31)) * 31)) * 31;
        Integer num = this.trackerWearPos;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = this.signalData.hashCode();
        int hashCode5 = this.measureMeta.hashCode();
        return this.measureHolderList.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + hashCode) * 31)) * 31)) * 31);
    }

    public final void setMeasureHolderList(List<MeasurementHolder> list) {
        u.j(list, "<set-?>");
        this.measureHolderList = list;
    }

    public final void setMeasureMeta(StoredMeasureMeta storedMeasureMeta) {
        u.j(storedMeasureMeta, "<set-?>");
        this.measureMeta = storedMeasureMeta;
    }

    public final void setSignalData(StoredSignalData storedSignalData) {
        u.j(storedSignalData, "<set-?>");
        this.signalData = storedSignalData;
    }

    public final void setSignalMeta(StoredSignalMeta storedSignalMeta) {
        u.j(storedSignalMeta, "<set-?>");
        this.signalMeta = storedSignalMeta;
    }

    public final void setSignalMetaExtend(StoredSignalMetaExtend storedSignalMetaExtend) {
        u.j(storedSignalMetaExtend, "<set-?>");
        this.signalMetaExtend = storedSignalMetaExtend;
    }

    public final void setTrackerWearPos(Integer num) {
        this.trackerWearPos = num;
    }

    public final void setUnitConversionParameters(UnitConversionParameters unitConversionParameters) {
        u.j(unitConversionParameters, "<set-?>");
        this.unitConversionParameters = unitConversionParameters;
    }

    public String toString() {
        StoredSignalMeta storedSignalMeta = this.signalMeta;
        StoredSignalMetaExtend storedSignalMetaExtend = this.signalMetaExtend;
        UnitConversionParameters unitConversionParameters = this.unitConversionParameters;
        Integer num = this.trackerWearPos;
        StoredSignalData storedSignalData = this.signalData;
        StoredMeasureMeta storedMeasureMeta = this.measureMeta;
        List<MeasurementHolder> list = this.measureHolderList;
        StringBuilder sb2 = new StringBuilder("HeartSignalInfo(signalMeta=");
        sb2.append(storedSignalMeta);
        sb2.append(", signalMetaExtend=");
        sb2.append(storedSignalMetaExtend);
        sb2.append(", unitConversionParameters=");
        sb2.append(unitConversionParameters);
        sb2.append(", trackerWearPos=");
        sb2.append(num);
        sb2.append(", signalData=");
        sb2.append(storedSignalData);
        sb2.append(", measureMeta=");
        sb2.append(storedMeasureMeta);
        sb2.append(", measureHolderList=");
        return d.i(sb2, list, ")");
    }

    public HeartSignalInfo(StoredSignalMeta signalMeta, StoredSignalMetaExtend signalMetaExtend, UnitConversionParameters unitConversionParameters, Integer num, StoredSignalData signalData, StoredMeasureMeta measureMeta, List<MeasurementHolder> measureHolderList) {
        u.j(signalMeta, "signalMeta");
        u.j(signalMetaExtend, "signalMetaExtend");
        u.j(unitConversionParameters, "unitConversionParameters");
        u.j(signalData, "signalData");
        u.j(measureMeta, "measureMeta");
        u.j(measureHolderList, "measureHolderList");
        this.signalMeta = signalMeta;
        this.signalMetaExtend = signalMetaExtend;
        this.unitConversionParameters = unitConversionParameters;
        this.trackerWearPos = num;
        this.signalData = signalData;
        this.measureMeta = measureMeta;
        this.measureHolderList = measureHolderList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HeartSignalInfo(com.withings.comm.wpp.generated.object.StoredSignalMeta r6, com.withings.comm.wpp.generated.object.StoredSignalMetaExtend r7, com.withings.comm.wpp.generated.object.UnitConversionParameters r8, java.lang.Integer r9, com.withings.comm.wpp.generated.object.StoredSignalData r10, com.withings.comm.wpp.generated.object.StoredMeasureMeta r11, java.util.List r12, int r13, kotlin.jvm.internal.m r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L9
            com.withings.comm.wpp.generated.object.StoredSignalMeta r6 = new com.withings.comm.wpp.generated.object.StoredSignalMeta
            r6.<init>()
        L9:
            r14 = r13 & 2
            if (r14 == 0) goto L12
            com.withings.comm.wpp.generated.object.StoredSignalMetaExtend r7 = new com.withings.comm.wpp.generated.object.StoredSignalMetaExtend
            r7.<init>()
        L12:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L1c
            com.withings.comm.wpp.generated.object.UnitConversionParameters r8 = new com.withings.comm.wpp.generated.object.UnitConversionParameters
            r8.<init>()
        L1c:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L22
            r9 = 0
        L22:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L31
            com.withings.comm.wpp.generated.object.StoredSignalData r10 = new com.withings.comm.wpp.generated.object.StoredSignalData
            r10.<init>()
            r7 = 0
            byte[] r7 = new byte[r7]
            r10.samples = r7
        L31:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L3b
            com.withings.comm.wpp.generated.object.StoredMeasureMeta r11 = new com.withings.comm.wpp.generated.object.StoredMeasureMeta
            r11.<init>()
        L3b:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L45
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L45:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.model.HeartSignalInfo.<init>(com.withings.comm.wpp.generated.object.StoredSignalMeta, com.withings.comm.wpp.generated.object.StoredSignalMetaExtend, com.withings.comm.wpp.generated.object.UnitConversionParameters, java.lang.Integer, com.withings.comm.wpp.generated.object.StoredSignalData, com.withings.comm.wpp.generated.object.StoredMeasureMeta, java.util.List, int, kotlin.jvm.internal.m):void");
    }
}
