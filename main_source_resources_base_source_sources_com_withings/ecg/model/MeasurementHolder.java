package com.withings.ecg.model;

import com.withings.comm.wpp.generated.object.AlgoParam;
import com.withings.comm.wpp.generated.object.AlgorithmVersion;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.comm.wpp.generated.object.StoredMeasureData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: HeartSignalMeasurementBuilder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J=\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/withings/ecg/model/MeasurementHolder;", "", "data", "Lcom/withings/comm/wpp/generated/object/StoredMeasureData;", "algoVersions", "Lcom/withings/comm/wpp/generated/object/AlgorithmVersion;", "firmwareVersion", "Lcom/withings/comm/wpp/generated/object/FirmwareVersion;", "algoParams", "", "Lcom/withings/comm/wpp/generated/object/AlgoParam;", "(Lcom/withings/comm/wpp/generated/object/StoredMeasureData;Lcom/withings/comm/wpp/generated/object/AlgorithmVersion;Lcom/withings/comm/wpp/generated/object/FirmwareVersion;Ljava/util/List;)V", "getAlgoParams", "()Ljava/util/List;", "setAlgoParams", "(Ljava/util/List;)V", "getAlgoVersions", "()Lcom/withings/comm/wpp/generated/object/AlgorithmVersion;", "setAlgoVersions", "(Lcom/withings/comm/wpp/generated/object/AlgorithmVersion;)V", "getData", "()Lcom/withings/comm/wpp/generated/object/StoredMeasureData;", "getFirmwareVersion", "()Lcom/withings/comm/wpp/generated/object/FirmwareVersion;", "setFirmwareVersion", "(Lcom/withings/comm/wpp/generated/object/FirmwareVersion;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MeasurementHolder {
    public static final int $stable = 8;
    private List<? extends AlgoParam> algoParams;
    private AlgorithmVersion algoVersions;
    private final StoredMeasureData data;
    private FirmwareVersion firmwareVersion;

    public MeasurementHolder(StoredMeasureData data, AlgorithmVersion algorithmVersion, FirmwareVersion firmwareVersion, List<? extends AlgoParam> list) {
        u.j(data, "data");
        this.data = data;
        this.algoVersions = algorithmVersion;
        this.firmwareVersion = firmwareVersion;
        this.algoParams = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeasurementHolder copy$default(MeasurementHolder measurementHolder, StoredMeasureData storedMeasureData, AlgorithmVersion algorithmVersion, FirmwareVersion firmwareVersion, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            storedMeasureData = measurementHolder.data;
        }
        if ((i11 & 2) != 0) {
            algorithmVersion = measurementHolder.algoVersions;
        }
        if ((i11 & 4) != 0) {
            firmwareVersion = measurementHolder.firmwareVersion;
        }
        if ((i11 & 8) != 0) {
            list = measurementHolder.algoParams;
        }
        return measurementHolder.copy(storedMeasureData, algorithmVersion, firmwareVersion, list);
    }

    public final StoredMeasureData component1() {
        return this.data;
    }

    public final AlgorithmVersion component2() {
        return this.algoVersions;
    }

    public final FirmwareVersion component3() {
        return this.firmwareVersion;
    }

    public final List<AlgoParam> component4() {
        return this.algoParams;
    }

    public final MeasurementHolder copy(StoredMeasureData data, AlgorithmVersion algorithmVersion, FirmwareVersion firmwareVersion, List<? extends AlgoParam> list) {
        u.j(data, "data");
        return new MeasurementHolder(data, algorithmVersion, firmwareVersion, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeasurementHolder)) {
            return false;
        }
        MeasurementHolder measurementHolder = (MeasurementHolder) obj;
        if (u.e(this.data, measurementHolder.data) && u.e(this.algoVersions, measurementHolder.algoVersions) && u.e(this.firmwareVersion, measurementHolder.firmwareVersion) && u.e(this.algoParams, measurementHolder.algoParams)) {
            return true;
        }
        return false;
    }

    public final List<AlgoParam> getAlgoParams() {
        return this.algoParams;
    }

    public final AlgorithmVersion getAlgoVersions() {
        return this.algoVersions;
    }

    public final StoredMeasureData getData() {
        return this.data;
    }

    public final FirmwareVersion getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.data.hashCode() * 31;
        AlgorithmVersion algorithmVersion = this.algoVersions;
        int i11 = 0;
        if (algorithmVersion == null) {
            hashCode = 0;
        } else {
            hashCode = algorithmVersion.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        FirmwareVersion firmwareVersion = this.firmwareVersion;
        if (firmwareVersion == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = firmwareVersion.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        List<? extends AlgoParam> list = this.algoParams;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i13 + i11;
    }

    public final void setAlgoParams(List<? extends AlgoParam> list) {
        this.algoParams = list;
    }

    public final void setAlgoVersions(AlgorithmVersion algorithmVersion) {
        this.algoVersions = algorithmVersion;
    }

    public final void setFirmwareVersion(FirmwareVersion firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String toString() {
        StoredMeasureData storedMeasureData = this.data;
        AlgorithmVersion algorithmVersion = this.algoVersions;
        FirmwareVersion firmwareVersion = this.firmwareVersion;
        List<? extends AlgoParam> list = this.algoParams;
        return "MeasurementHolder(data=" + storedMeasureData + ", algoVersions=" + algorithmVersion + ", firmwareVersion=" + firmwareVersion + ", algoParams=" + list + ")";
    }

    public /* synthetic */ MeasurementHolder(StoredMeasureData storedMeasureData, AlgorithmVersion algorithmVersion, FirmwareVersion firmwareVersion, List list, int i11, m mVar) {
        this(storedMeasureData, (i11 & 2) != 0 ? null : algorithmVersion, (i11 & 4) != 0 ? null : firmwareVersion, (i11 & 8) != 0 ? null : list);
    }
}
