package com.withings.ecg.model;

import android.content.Context;
import android.support.v4.media.a;
import androidx.lifecycle.k0;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredSignalData;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.TrackerWearPos;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignalFormat;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.WearPosition;
import com.withings.library.ecg.filter.EcgFilter;
import com.withings.library.ecg.filter.EcgFilterConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jq.f;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import u70.i;
import wm0.b;
import xw.d;
import ym0.p;
/* compiled from: LiveEcgMeasurementRepository.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bS\u0010TJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010\"\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010'\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u001aH\u0016¢\u0006\u0004\b-\u0010\u001dJ\u001f\u00101\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001aH\u0016¢\u0006\u0004\b3\u0010\u001dJ\u0017\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001aH\u0016¢\u0006\u0004\b7\u0010\u001dJK\u0010?\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u001c\u0010>\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020%0;j\u0002`=H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/withings/ecg/model/LiveEcgMeasurementRepositoryImpl;", "Lcom/withings/ecg/model/LiveEcgMeasurementRepository;", "", "deviceModel", "Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;", "storedSignalMeta", "Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;", "storedSignalMetaExtend", "Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;", "unitConversionParameters", "Lnm0/y;", "setupEcgFilter", "(ILcom/withings/comm/wpp/generated/object/StoredSignalMeta;Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;)V", "Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "storedMeasureMeta", "modelId", "Lcom/withings/ecg/model/SignalMeta;", "signalMeta", "", "signalPath", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "emptyHeartSignalMeasurement", "(Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;ILcom/withings/ecg/model/SignalMeta;Ljava/lang/String;)Lcom/withings/ecg/model/HeartSignalMeasurement;", "timeWindow", "getSignalMeta", "(ILcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;)Lcom/withings/ecg/model/SignalMeta;", "Landroidx/lifecycle/k0;", "Lcom/withings/ecg/model/LiveEcgStatus;", "getLiveStatus", "()Landroidx/lifecycle/k0;", "Lcom/withings/comm/wpp/generated/object/TrackerWearPos;", "trackerWearPos", "Lu70/i;", "macAddress", "start", "(ILcom/withings/comm/wpp/generated/object/StoredSignalMeta;Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;Lcom/withings/comm/wpp/generated/object/TrackerWearPos;Lu70/i;I)V", "stopReason", "", "ecgInserted", "stop", "(Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;IZLu70/i;)V", "onTimeOut", "()V", "onConnectionLost", "Lcom/withings/ecg/model/LiveEcgData;", "getLiveData", "timestamp", "", "sample", "setLiveData", "(I[B)V", "getLiveHRData", "hr", "setLiveHRData", "(I)V", "getLiveSignalMeta", "", "Lcom/withings/ecg/model/MeasurementHolder;", "measureHolderList", "Lkotlin/Function2;", "", "Lcom/withings/ecg/model/ShouldTrustSignalMeasure;", "shouldTrustSignalMeasure", "getLiveEcg", "(ILcom/withings/comm/wpp/generated/object/StoredMeasureMeta;Ljava/util/List;Lym0/p;)Lcom/withings/ecg/model/HeartSignalMeasurement;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/ecg/model/EcgSignalSaver;", "ecgSignalSaver", "Lcom/withings/ecg/model/EcgSignalSaver;", "liveEcgStatus", "Landroidx/lifecycle/k0;", "liveEcgLiveData", "liveEcgSignalInfo", "liveHR", "Lcom/withings/library/ecg/filter/EcgFilter;", "ecgFilter", "Lcom/withings/library/ecg/filter/EcgFilter;", "Ljava/lang/Integer;", "Ljq/f;", "ecgAnalytics", "Ljq/f;", "<init>", "(Landroid/content/Context;Lcom/withings/ecg/model/EcgSignalSaver;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveEcgMeasurementRepositoryImpl implements LiveEcgMeasurementRepository {
    public static final int $stable = 8;
    private final Context context;
    private final f ecgAnalytics;
    private EcgFilter ecgFilter;
    private final EcgSignalSaver ecgSignalSaver;
    private final k0<LiveEcgData> liveEcgLiveData;
    private final k0<SignalMeta> liveEcgSignalInfo;
    private final k0<LiveEcgStatus> liveEcgStatus;
    private final k0<Integer> liveHR;
    private Integer trackerWearPos;

    public LiveEcgMeasurementRepositoryImpl(Context context, EcgSignalSaver ecgSignalSaver) {
        u.j(context, "context");
        u.j(ecgSignalSaver, "ecgSignalSaver");
        this.context = context;
        this.ecgSignalSaver = ecgSignalSaver;
        this.liveEcgStatus = d.b(null);
        this.liveEcgLiveData = d.b(null);
        this.liveEcgSignalInfo = d.b(null);
        this.liveHR = d.b(null);
        f fVar = f.f74749d;
        if (fVar != null) {
            this.ecgAnalytics = fVar;
        } else {
            u.s("instance");
            throw null;
        }
    }

    private final HeartSignalMeasurement emptyHeartSignalMeasurement(StoredMeasureMeta storedMeasureMeta, int i11, SignalMeta signalMeta, String str) {
        long[] userId = storedMeasureMeta.userId;
        u.i(userId, "userId");
        if (userId.length != 0) {
            return new HeartSignalMeasurement(0L, userId[0], i11, new DateTime(storedMeasureMeta.time * 1000), new Signal(null, signalMeta, str, 1, null), false, 0L, null, this.trackerWearPos, false, new ArrayList(), null, 1, 609, null);
        }
        throw new NoSuchElementException("Array is empty.");
    }

    private final SignalMeta getSignalMeta(int i11, StoredSignalMetaExtend storedSignalMetaExtend, UnitConversionParameters unitConversionParameters, StoredSignalMeta storedSignalMeta) {
        long j5 = storedSignalMetaExtend.duration;
        long j11 = storedSignalMetaExtend.totalSize;
        int i12 = unitConversionParameters.offset;
        int i13 = unitConversionParameters.gain;
        long j12 = unitConversionParameters.qfix;
        short s11 = storedSignalMeta.channel;
        short s12 = storedSignalMeta.format;
        short s13 = storedSignalMeta.resolution;
        return new SignalMeta(i11, j5, j11, i12, i13, j12, storedSignalMeta.type, storedSignalMeta.samplingFreq, s11, s12, storedSignalMeta.size, s13, storedSignalMetaExtend.filterBank);
    }

    private final void setupEcgFilter(int i11, StoredSignalMeta storedSignalMeta, StoredSignalMetaExtend storedSignalMetaExtend, UnitConversionParameters unitConversionParameters) {
        EcgSignalFormat ecgSignalFormat;
        EcgSignalType ecgSignalType;
        int i12 = storedSignalMeta.samplingFreq;
        int i13 = ((int) storedSignalMetaExtend.totalSize) / storedSignalMeta.size;
        int i14 = unitConversionParameters.gain;
        WearPosition d11 = l2.d.d(this.trackerWearPos);
        short s11 = storedSignalMeta.format;
        if (s11 != 0 && s11 != 1 && s11 != 2) {
            if (s11 == 3) {
                ecgSignalFormat = EcgSignalFormat.DELTA;
            } else {
                throw new IllegalArgumentException(a.a("Unknown EcgSignalFormat for HeartSignalMeasurement with format : ", s11));
            }
        } else {
            ecgSignalFormat = EcgSignalFormat.OTHER;
        }
        EcgSignalFormat ecgSignalFormat2 = ecgSignalFormat;
        int i15 = storedSignalMeta.type;
        if (i15 != 1) {
            if (i15 != 13) {
                if (i15 != 6) {
                    if (i15 != 7) {
                        if (i15 == 8) {
                            ecgSignalType = EcgSignalType.DII_DIII_FILTERED;
                        } else {
                            throw new IllegalArgumentException(a.a("Unknown EcgSignalType for HeartSignalMeasurement with type : ", i15));
                        }
                    } else {
                        ecgSignalType = EcgSignalType.DI_FILTERED;
                    }
                } else {
                    ecgSignalType = EcgSignalType.DII_DIII;
                }
            } else {
                ecgSignalType = EcgSignalType.DI_DI_FILTERED;
            }
        } else {
            ecgSignalType = EcgSignalType.DI;
        }
        this.ecgFilter = new EcgFilter(new EcgFilterConfig(i12, i13, d11, i14, DeviceModelHackForNativeLibKt.hackDeviceModel(i11), ecgSignalFormat2, ecgSignalType, new EcgFilter.HrListener() { // from class: com.withings.ecg.model.LiveEcgMeasurementRepositoryImpl$setupEcgFilter$1
            @Override // com.withings.library.ecg.filter.EcgFilter.HrListener
            public void onHrReceived(int i16) {
                LiveEcgMeasurementRepositoryImpl.this.setLiveHRData(i16);
            }
        }));
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public HeartSignalMeasurement getLiveEcg(int i11, StoredMeasureMeta storedMeasureMeta, List<MeasurementHolder> measureHolderList, p<? super Integer, ? super Long, Boolean> shouldTrustSignalMeasure) {
        u.j(storedMeasureMeta, "storedMeasureMeta");
        u.j(measureHolderList, "measureHolderList");
        u.j(shouldTrustSignalMeasure, "shouldTrustSignalMeasure");
        SignalMeta value = this.liveEcgSignalInfo.getValue();
        if (value != null) {
            String signalPath = this.ecgSignalSaver.getSignalPath(storedMeasureMeta.time * 1000);
            StoredSignalData samples = new StoredSignalData().setSamples(b.c(new File(signalPath)));
            StoredSignalMeta storedSignalMeta = HeartSignalMeasurementKt.toStoredSignalMeta(value);
            StoredSignalMetaExtend storedSignalMetaExtend = HeartSignalMeasurementKt.toStoredSignalMetaExtend(value);
            UnitConversionParameters unitConversionParameters = HeartSignalMeasurementKt.toUnitConversionParameters(value);
            Integer num = this.trackerWearPos;
            u.g(samples);
            HeartSignalInfo heartSignalInfo = new HeartSignalInfo(storedSignalMeta, storedSignalMetaExtend, unitConversionParameters, num, samples, storedMeasureMeta, measureHolderList);
            e c11 = e.c();
            LiveEcgStatus value2 = this.liveEcgStatus.getValue();
            u.g(value2);
            Device f11 = c11.f(value2.getMacAddress());
            HeartSignalMeasurement build = new HeartSignalMeasurementBuilder(this.context, Long.valueOf(f11.getId()), f11.getFirmware(), f11.getModelId(), shouldTrustSignalMeasure).setInfo(heartSignalInfo).build();
            if (build == null) {
                return emptyHeartSignalMeasurement(storedMeasureMeta, i11, value, signalPath);
            }
            return build;
        }
        throw new IllegalStateException("When calling this method, we should already have a valid liveEcgSignalInfo object from start");
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public void onConnectionLost() {
        i iVar;
        this.ecgAnalytics.a(false);
        k0<LiveEcgStatus> k0Var = this.liveEcgStatus;
        Integer num = this.trackerWearPos;
        LiveEcgStatus value = this.liveEcgStatus.getValue();
        if (value != null) {
            iVar = value.getMacAddress();
        } else {
            iVar = null;
        }
        k0Var.postValue(new LiveEcgStatus(false, null, 0, false, num, iVar));
        this.liveEcgLiveData.postValue(null);
        this.ecgSignalSaver.cancel();
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public void onTimeOut() {
        i iVar;
        this.ecgAnalytics.a(false);
        k0<LiveEcgStatus> k0Var = this.liveEcgStatus;
        Integer num = this.trackerWearPos;
        LiveEcgStatus value = this.liveEcgStatus.getValue();
        if (value != null) {
            iVar = value.getMacAddress();
        } else {
            iVar = null;
        }
        k0Var.postValue(new LiveEcgStatus(false, null, 1, false, num, iVar));
        this.liveEcgLiveData.postValue(null);
        this.ecgSignalSaver.cancel();
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public void setLiveData(int i11, byte[] sample) {
        u.j(sample, "sample");
        EcgFilter ecgFilter = this.ecgFilter;
        if (ecgFilter == null) {
            return;
        }
        byte[] fillGap = EcgSignalGapFiller.INSTANCE.fillGap(this.liveEcgLiveData.getValue(), i11, sample);
        Map<EcgLeadType, int[]> filterBatch = ecgFilter.filterBatch(sample);
        int[] iArr = filterBatch.get(EcgLeadType.DI_FILTERED);
        if (iArr == null && (iArr = filterBatch.get(EcgLeadType.DI)) == null) {
            iArr = new int[0];
        }
        this.liveEcgLiveData.postValue(new LiveEcgData(i11, iArr));
        this.ecgSignalSaver.savePayloads(fillGap);
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public void setLiveHRData(int i11) {
        this.liveHR.postValue(Integer.valueOf(i11));
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public void start(int i11, StoredSignalMeta storedSignalMeta, StoredSignalMetaExtend storedSignalMetaExtend, UnitConversionParameters unitConversionParameters, TrackerWearPos trackerWearPos, i macAddress, int i12) {
        int i13;
        u.j(storedSignalMeta, "storedSignalMeta");
        u.j(storedSignalMetaExtend, "storedSignalMetaExtend");
        u.j(unitConversionParameters, "unitConversionParameters");
        u.j(macAddress, "macAddress");
        if (trackerWearPos != null) {
            if (trackerWearPos.value == 3) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            this.trackerWearPos = i13;
        }
        setupEcgFilter(i12, storedSignalMeta, storedSignalMetaExtend, unitConversionParameters);
        this.liveHR.postValue(null);
        this.liveEcgStatus.postValue(new LiveEcgStatus(true, null, null, false, this.trackerWearPos, macAddress, 14, null));
        this.liveEcgSignalInfo.postValue(getSignalMeta(i11, storedSignalMetaExtend, unitConversionParameters, storedSignalMeta));
        this.ecgSignalSaver.start();
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public void stop(StoredMeasureMeta storedMeasureMeta, int i11, boolean z5, i macAddress) {
        u.j(macAddress, "macAddress");
        this.liveEcgStatus.postValue(new LiveEcgStatus(false, storedMeasureMeta, Integer.valueOf(i11), z5, this.trackerWearPos, macAddress));
        this.liveEcgLiveData.postValue(null);
        if (i11 != 0) {
            this.ecgAnalytics.a(false);
            this.ecgSignalSaver.cancel();
        } else {
            this.ecgAnalytics.a(true);
        }
        EcgFilter ecgFilter = this.ecgFilter;
        if (ecgFilter != null) {
            ecgFilter.clean();
        }
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public k0<LiveEcgData> getLiveData() {
        return this.liveEcgLiveData;
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public k0<Integer> getLiveHRData() {
        return this.liveHR;
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public k0<SignalMeta> getLiveSignalMeta() {
        return this.liveEcgSignalInfo;
    }

    @Override // com.withings.ecg.model.LiveEcgMeasurementRepository
    public k0<LiveEcgStatus> getLiveStatus() {
        return this.liveEcgStatus;
    }
}
