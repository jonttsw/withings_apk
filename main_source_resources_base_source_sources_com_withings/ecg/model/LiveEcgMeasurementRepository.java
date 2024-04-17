package com.withings.ecg.model;

import androidx.lifecycle.LiveData;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.TrackerWearPos;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import java.util.List;
import kotlin.Metadata;
import u70.i;
import ym0.p;
/* compiled from: LiveEcgMeasurementRepository.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0017J1\u0010\u001e\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002H&¢\u0006\u0004\b!\u0010\u0005J\u001f\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H&¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0002H&¢\u0006\u0004\b,\u0010\u0005JK\u00106\u001a\u0002052\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u001c\u00104\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001c01j\u0002`3H&¢\u0006\u0004\b6\u00107¨\u00068À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/model/LiveEcgMeasurementRepository;", "", "Landroidx/lifecycle/LiveData;", "Lcom/withings/ecg/model/LiveEcgStatus;", "getLiveStatus", "()Landroidx/lifecycle/LiveData;", "", "timeWindow", "Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;", "storedSignalMeta", "Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;", "storedSignalMetaExtend", "Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;", "unitConversionParameters", "Lcom/withings/comm/wpp/generated/object/TrackerWearPos;", "trackerWearPos", "Lu70/i;", "macAddress", "deviceModel", "Lnm0/y;", "start", "(ILcom/withings/comm/wpp/generated/object/StoredSignalMeta;Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;Lcom/withings/comm/wpp/generated/object/TrackerWearPos;Lu70/i;I)V", "onConnectionLost", "()V", "onTimeOut", "Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "storedMeasureMeta", "stopReason", "", "ecgInserted", "stop", "(Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;IZLu70/i;)V", "Lcom/withings/ecg/model/LiveEcgData;", "getLiveData", "timestamp", "", "sample", "setLiveData", "(I[B)V", "getLiveHRData", "hr", "setLiveHRData", "(I)V", "Lcom/withings/ecg/model/SignalMeta;", "getLiveSignalMeta", "modelId", "", "Lcom/withings/ecg/model/MeasurementHolder;", "measureHolderList", "Lkotlin/Function2;", "", "Lcom/withings/ecg/model/ShouldTrustSignalMeasure;", "shouldTrustSignalMeasure", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "getLiveEcg", "(ILcom/withings/comm/wpp/generated/object/StoredMeasureMeta;Ljava/util/List;Lym0/p;)Lcom/withings/ecg/model/HeartSignalMeasurement;", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LiveEcgMeasurementRepository {
    LiveData<LiveEcgData> getLiveData();

    HeartSignalMeasurement getLiveEcg(int i11, StoredMeasureMeta storedMeasureMeta, List<MeasurementHolder> list, p<? super Integer, ? super Long, Boolean> pVar);

    LiveData<Integer> getLiveHRData();

    LiveData<SignalMeta> getLiveSignalMeta();

    LiveData<LiveEcgStatus> getLiveStatus();

    void onConnectionLost();

    void onTimeOut();

    void setLiveData(int i11, byte[] bArr);

    void setLiveHRData(int i11);

    void start(int i11, StoredSignalMeta storedSignalMeta, StoredSignalMetaExtend storedSignalMetaExtend, UnitConversionParameters unitConversionParameters, TrackerWearPos trackerWearPos, i iVar, int i12);

    void stop(StoredMeasureMeta storedMeasureMeta, int i11, boolean z5, i iVar);
}
