package com.withings.ecg.model;

import android.support.v4.media.a;
import com.withings.comm.wpp.generated.object.AlgoParam;
import com.withings.comm.wpp.generated.object.AlgorithmVersion;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.EcgSignalFormat;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.diag.AfibStatus;
import com.withings.library.ecg.diag.DiagnosticResult;
import com.withings.library.ecg.diag.EcgDiagnosticProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import l2.d;
import m0.t;
/* compiled from: HeartSignalMeasurementBuilder.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010*.\u0010\u0014\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¨\u0006\u0015"}, d2 = {"Lcom/withings/ecg/model/HeartSignalInfo;", "", "Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "getSignalMeasures", "(Lcom/withings/ecg/model/HeartSignalInfo;)Ljava/util/List;", "", "modelId", "Lcom/withings/library/ecg/diag/DiagnosticResult;", "computeEcgDiagnostic", "(Lcom/withings/ecg/model/HeartSignalInfo;I)Lcom/withings/library/ecg/diag/DiagnosticResult;", "Lcom/withings/library/ecg/diag/AfibStatus;", "", "getValue", "(Lcom/withings/library/ecg/diag/AfibStatus;)F", "Lcom/withings/ecg/model/SignalMeta;", "getSignalMeta", "(Lcom/withings/ecg/model/HeartSignalInfo;)Lcom/withings/ecg/model/SignalMeta;", "Lkotlin/Function2;", "", "", "ShouldTrustSignalMeasure", "ecg_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeartSignalMeasurementBuilderKt {

    /* compiled from: HeartSignalMeasurementBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AfibStatus.values().length];
            try {
                iArr[AfibStatus.AFIB_UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AfibStatus.AFIB_NOT_PROCESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AfibStatus.AFIB_NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AfibStatus.AFIB_POSITIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AfibStatus.AFIB_INCONCLUSIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AfibStatus.AFIB_NO_SIGNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AfibStatus.AFIB_OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AfibStatus.AFIB_NOISE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AfibStatus.AFIB_LOW_HEART_RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AfibStatus.AFIB_HIGH_HEART_RATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DiagnosticResult computeEcgDiagnostic(HeartSignalInfo heartSignalInfo, int i11) {
        EcgSignalType ecgSignalType;
        EcgSignalFormat ecgSignalFormat;
        byte[] samples = heartSignalInfo.getSignalData().samples;
        u.i(samples, "samples");
        int i12 = heartSignalInfo.getSignalMeta().type;
        if (i12 != 1) {
            if (i12 != 13) {
                if (i12 != 6) {
                    if (i12 != 7) {
                        if (i12 == 8) {
                            ecgSignalType = EcgSignalType.DII_DIII_FILTERED;
                        } else {
                            throw new IllegalArgumentException(a.a("Unknown EcgSignalType for HeartSignalMeasurement with type : ", i12));
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
        short s11 = heartSignalInfo.getSignalMeta().format;
        if (s11 != 0 && s11 != 1 && s11 != 2) {
            if (s11 == 3) {
                ecgSignalFormat = EcgSignalFormat.DELTA;
            } else {
                throw new IllegalArgumentException(a.a("Unknown EcgSignalFormat for HeartSignalMeasurement with format : ", s11));
            }
        } else {
            ecgSignalFormat = EcgSignalFormat.OTHER;
        }
        return new EcgDiagnosticProvider().computeDiagnostic(heartSignalInfo.getSignalMeta().samplingFreq, heartSignalInfo.getUnitConversionParameters().gain, d.d(heartSignalInfo.getTrackerWearPos()), DeviceModelHackForNativeLibKt.hackDeviceModel(i11), heartSignalInfo.getSignalMetaExtend().duration, true, new EcgSignal(samples, ecgSignalType, ecgSignalFormat));
    }

    public static final List<HeartSignalMeasurement.Measure> getSignalMeasures(HeartSignalInfo heartSignalInfo) {
        Integer num;
        Integer num2;
        String str;
        List<MeasurementHolder> measureHolderList = heartSignalInfo.getMeasureHolderList();
        ArrayList arrayList = new ArrayList(x.y(measureHolderList, 10));
        for (MeasurementHolder measurementHolder : measureHolderList) {
            int i11 = measurementHolder.getData().type;
            float pow = (float) (Math.pow(10.0d, measurementHolder.getData().exponent) * measurementHolder.getData().value);
            AlgorithmVersion algoVersions = measurementHolder.getAlgoVersions();
            if (algoVersions != null) {
                num = Integer.valueOf(algoVersions.version);
            } else {
                num = null;
            }
            FirmwareVersion firmwareVersion = measurementHolder.getFirmwareVersion();
            if (firmwareVersion != null) {
                num2 = Integer.valueOf(firmwareVersion.version);
            } else {
                num2 = null;
            }
            Integer valueOf = Integer.valueOf(heartSignalInfo.getMeasureMeta().attrib);
            List<AlgoParam> algoParams = measurementHolder.getAlgoParams();
            if (algoParams != null) {
                str = t.C(algoParams);
            } else {
                str = null;
            }
            arrayList.add(new HeartSignalMeasurement.Measure(i11, pow, num, num2, 9, valueOf, str));
        }
        return arrayList;
    }

    public static final SignalMeta getSignalMeta(HeartSignalInfo heartSignalInfo) {
        long j5 = heartSignalInfo.getSignalMetaExtend().duration;
        long j11 = heartSignalInfo.getSignalMetaExtend().totalSize;
        int i11 = heartSignalInfo.getUnitConversionParameters().offset;
        int i12 = heartSignalInfo.getUnitConversionParameters().gain;
        long j12 = heartSignalInfo.getUnitConversionParameters().qfix;
        short s11 = heartSignalInfo.getSignalMeta().channel;
        short s12 = heartSignalInfo.getSignalMeta().format;
        short s13 = heartSignalInfo.getSignalMeta().resolution;
        return new SignalMeta(0, j5, j11, i11, i12, j12, heartSignalInfo.getSignalMeta().type, heartSignalInfo.getSignalMeta().samplingFreq, s11, s12, heartSignalInfo.getSignalMeta().size, s13, heartSignalInfo.getSignalMetaExtend().filterBank, 1, null);
    }

    public static final float getValue(AfibStatus afibStatus) {
        int i11;
        u.j(afibStatus, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[afibStatus.ordinal()]) {
            case 1:
                i11 = -2;
                break;
            case 2:
                i11 = -1;
                break;
            case 3:
                i11 = 0;
                break;
            case 4:
                i11 = 1;
                break;
            case 5:
                i11 = 2;
                break;
            case 6:
                i11 = 3;
                break;
            case 7:
                i11 = 4;
                break;
            case 8:
                i11 = 5;
                break;
            case 9:
                i11 = 6;
                break;
            case 10:
                i11 = 7;
                break;
            default:
                throw new IllegalArgumentException("Unknown value for Ecg diagnostic with AfibStatus : " + afibStatus);
        }
        return i11;
    }
}
