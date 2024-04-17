package com.withings.ecg.model;

import an0.a;
import android.content.Context;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.diag.DiagnosticResult;
import com.withings.library.ecg.diag.EcgDiagnosticProvider;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import en0.k;
import en0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.l;
import kotlin.collections.p0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import l2.d;
import mq.c;
import org.joda.time.DateTime;
import org.json.JSONObject;
/* compiled from: HeartSignalMeasurement.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u001d¢\u0006\u0004\b \u0010!\u001a\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\"¢\u0006\u0004\b \u0010#\u001a\u0019\u0010'\u001a\u00020&*\u00020\u001c2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(\u001a\u001d\u0010+\u001a\u00020\u000b*\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b+\u0010,\"\u0017\u0010/\u001a\u0004\u0018\u00010\u000b*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0017\u00102\u001a\u0004\u0018\u00010\u0010*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/withings/ecg/model/SignalMeta;", "Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;", "toStoredSignalMetaExtend", "(Lcom/withings/ecg/model/SignalMeta;)Lcom/withings/comm/wpp/generated/object/StoredSignalMetaExtend;", "Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;", "toStoredSignalMeta", "(Lcom/withings/ecg/model/SignalMeta;)Lcom/withings/comm/wpp/generated/object/StoredSignalMeta;", "Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;", "toUnitConversionParameters", "(Lcom/withings/ecg/model/SignalMeta;)Lcom/withings/comm/wpp/generated/object/UnitConversionParameters;", "", "Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "", "isAfibValid", "(Ljava/util/List;)Z", "", "", "type", "measure", "Lnm0/y;", "replaceMeasure", "(Ljava/util/List;ILcom/withings/ecg/model/HeartSignalMeasurement$Measure;)V", "", "computedGain", "(Lcom/withings/ecg/model/SignalMeta;)F", "", "getDurationSeconds", "(Lcom/withings/ecg/model/SignalMeta;)J", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "Lcom/withings/library/measure/MeasuresGroup;", "convertAsMeasureGroup", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)Lcom/withings/library/measure/MeasuresGroup;", "toHeartSignalMeasures", "(Lcom/withings/library/measure/MeasuresGroup;)Ljava/util/List;", "Lky/d;", "(Lky/d;)Ljava/util/List;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/library/ecg/diag/DiagnosticResult;", "computeEcgDiagnostic", "(Lcom/withings/ecg/model/HeartSignalMeasurement;Landroid/content/Context;)Lcom/withings/library/ecg/diag/DiagnosticResult;", "Lky/a;", "attrib", "toSignalMeasure", "(Lky/a;Ljava/lang/Integer;)Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "getDiagnosticMeasure", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "diagnosticMeasure", "getClassification", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)Ljava/lang/Integer;", "classification", "ecg_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeartSignalMeasurementKt {
    public static final DiagnosticResult computeEcgDiagnostic(HeartSignalMeasurement heartSignalMeasurement, Context context) {
        u.j(heartSignalMeasurement, "<this>");
        u.j(context, "context");
        return new EcgDiagnosticProvider().computeDiagnostic(heartSignalMeasurement.getSignal().getMeta().getSamplingFreq(), heartSignalMeasurement.getSignal().getMeta().getGain(), d.d(heartSignalMeasurement.getTrackerWearPos()), DeviceModelHackForNativeLibKt.hackDeviceModel(heartSignalMeasurement.getDeviceModel()), heartSignalMeasurement.getSignal().getMeta().getDuration(), true, new EcgSignal(new c(context).b(heartSignalMeasurement.getSignal().getMeta().getType(), heartSignalMeasurement.getTimestamp().getMillis()), androidx.collection.c.l(heartSignalMeasurement), androidx.collection.c.k(heartSignalMeasurement)));
    }

    public static final float computedGain(SignalMeta signalMeta) {
        u.j(signalMeta, "<this>");
        return (float) (Math.pow(2.0d, signalMeta.getQfix()) * signalMeta.getGain());
    }

    public static final MeasuresGroup convertAsMeasureGroup(HeartSignalMeasurement heartSignalMeasurement) {
        int i11;
        int i12;
        Integer attrib;
        u.j(heartSignalMeasurement, "<this>");
        HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) x.K(heartSignalMeasurement.getMeasures());
        if (measure != null && (attrib = measure.getAttrib()) != null) {
            i11 = attrib.intValue();
        } else {
            i11 = 0;
        }
        List<HeartSignalMeasurement.Measure> measures = heartSignalMeasurement.getMeasures();
        ArrayList<Measure> arrayList = new ArrayList(x.y(measures, 10));
        for (HeartSignalMeasurement.Measure measure2 : measures) {
            Measure measure3 = new Measure();
            measure3.f95793x = heartSignalMeasurement.getTimestamp().getMillis();
            measure3.setValue(a.b(measure2.getValue()));
            measure3.setType(measure2.getType());
            measure3.setAlgoVersion(measure2.getAlgoVersion());
            measure3.setAppVersion(measure2.getAppVersion());
            measure3.setPlatform(measure2.getPlatform());
            measure3.setAlgoParams(measure2.getAlgoParams());
            arrayList.add(measure3);
        }
        MeasuresGroup measuresGroup = new MeasuresGroup();
        int deviceModel = heartSignalMeasurement.getDeviceModel();
        if (deviceModel != 10) {
            if (deviceModel != 44) {
                i12 = 16;
            } else {
                i12 = 4;
            }
        } else {
            i12 = 1;
        }
        measuresGroup.setDevtype(i12);
        measuresGroup.setDeviceModelId(Integer.valueOf(heartSignalMeasurement.getDeviceModel()));
        measuresGroup.setAttrib(i11);
        measuresGroup.setDate(new DateTime(heartSignalMeasurement.getTimestamp()).toDate());
        measuresGroup.setUserId(heartSignalMeasurement.getUserID());
        Long deviceId = heartSignalMeasurement.getDeviceId();
        if (deviceId != null) {
            measuresGroup.setDeviceId(Long.valueOf(deviceId.longValue()));
        }
        for (Measure measure4 : arrayList) {
            measuresGroup.addMeasure(measure4);
        }
        return measuresGroup;
    }

    public static final Integer getClassification(HeartSignalMeasurement heartSignalMeasurement) {
        String algoParams;
        u.j(heartSignalMeasurement, "<this>");
        HeartSignalMeasurement.Measure diagnosticMeasure = getDiagnosticMeasure(heartSignalMeasurement);
        if (diagnosticMeasure != null && (algoParams = diagnosticMeasure.getAlgoParams()) != null) {
            return Integer.valueOf(new JSONObject(algoParams).getInt("1"));
        }
        return null;
    }

    public static final HeartSignalMeasurement.Measure getDiagnosticMeasure(HeartSignalMeasurement heartSignalMeasurement) {
        u.j(heartSignalMeasurement, "<this>");
        int type = heartSignalMeasurement.getSignal().getMeta().getType();
        Object obj = null;
        if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 6 && type != 7 && type != 8 && type != 13) {
                        throw new IllegalStateException(android.support.v4.media.a.a("Try to sync signal of unknown type: ", heartSignalMeasurement.getSignal().getMeta().getType()));
                    }
                } else {
                    Iterator<T> it = heartSignalMeasurement.getMeasures().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((HeartSignalMeasurement.Measure) next).getType() == 3) {
                            obj = next;
                            break;
                        }
                    }
                    return (HeartSignalMeasurement.Measure) obj;
                }
            } else {
                Iterator<T> it2 = heartSignalMeasurement.getMeasures().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((HeartSignalMeasurement.Measure) next2).getType() == 131) {
                        obj = next2;
                        break;
                    }
                }
                return (HeartSignalMeasurement.Measure) obj;
            }
        }
        Iterator<T> it3 = heartSignalMeasurement.getMeasures().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((HeartSignalMeasurement.Measure) next3).getType() == 130) {
                obj = next3;
                break;
            }
        }
        return (HeartSignalMeasurement.Measure) obj;
    }

    public static final long getDurationSeconds(SignalMeta signalMeta) {
        u.j(signalMeta, "<this>");
        if (signalMeta.getDuration() > 0) {
            return signalMeta.getDuration();
        }
        if (!l.l(new int[]{1, 0}, signalMeta.getFormat()) || signalMeta.getSize() == 0 || signalMeta.getSamplingFreq() == 0) {
            return 0L;
        }
        return signalMeta.getTotalSize() / (signalMeta.getSamplingFreq() * signalMeta.getSize());
    }

    public static final boolean isAfibValid(List<HeartSignalMeasurement.Measure> list) {
        Object obj;
        int i11;
        u.j(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((HeartSignalMeasurement.Measure) obj).getType() == 130) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) obj;
        if (measure != null) {
            i11 = Float.valueOf(measure.getValue());
        } else {
            i11 = -1;
        }
        return !u.e(i11, Float.valueOf(-1.0f));
    }

    public static final void replaceMeasure(List<HeartSignalMeasurement.Measure> list, int i11, HeartSignalMeasurement.Measure measure) {
        u.j(list, "<this>");
        u.j(measure, "measure");
        b0.j(list, new HeartSignalMeasurementKt$replaceMeasure$1(i11));
        list.add(measure);
    }

    public static final List<HeartSignalMeasurement.Measure> toHeartSignalMeasures(ky.d dVar) {
        u.j(dVar, "<this>");
        List<ky.a> f11 = dVar.f();
        ArrayList arrayList = new ArrayList(x.y(f11, 10));
        for (ky.a aVar : f11) {
            Integer c11 = aVar.d().c();
            Integer f12 = aVar.d().f();
            Integer d11 = aVar.d().d();
            int b10 = dVar.e().b();
            arrayList.add(new HeartSignalMeasurement.Measure(aVar.e(), (float) aVar.f(), c11, d11, f12, Integer.valueOf(b10), aVar.d().b()));
        }
        return arrayList;
    }

    public static final HeartSignalMeasurement.Measure toSignalMeasure(ky.a aVar, Integer num) {
        u.j(aVar, "<this>");
        return new HeartSignalMeasurement.Measure(aVar.e(), (float) aVar.f(), aVar.d().c(), aVar.d().d(), aVar.d().f(), num, aVar.d().b());
    }

    public static /* synthetic */ HeartSignalMeasurement.Measure toSignalMeasure$default(ky.a aVar, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return toSignalMeasure(aVar, num);
    }

    public static final StoredSignalMeta toStoredSignalMeta(SignalMeta signalMeta) {
        u.j(signalMeta, "<this>");
        StoredSignalMeta storedSignalMeta = new StoredSignalMeta();
        storedSignalMeta.type = signalMeta.getType();
        storedSignalMeta.samplingFreq = signalMeta.getSamplingFreq();
        storedSignalMeta.format = signalMeta.getFormat();
        storedSignalMeta.size = signalMeta.getSize();
        storedSignalMeta.resolution = signalMeta.getResolution();
        storedSignalMeta.channel = signalMeta.getChannel();
        return storedSignalMeta;
    }

    public static final StoredSignalMetaExtend toStoredSignalMetaExtend(SignalMeta signalMeta) {
        u.j(signalMeta, "<this>");
        StoredSignalMetaExtend storedSignalMetaExtend = new StoredSignalMetaExtend();
        storedSignalMetaExtend.duration = signalMeta.getDuration();
        storedSignalMetaExtend.filterBank = signalMeta.getFilterBank();
        storedSignalMetaExtend.totalSize = signalMeta.getTotalSize();
        return storedSignalMetaExtend;
    }

    public static final UnitConversionParameters toUnitConversionParameters(SignalMeta signalMeta) {
        u.j(signalMeta, "<this>");
        UnitConversionParameters unitConversionParameters = new UnitConversionParameters();
        unitConversionParameters.offset = signalMeta.getOffset();
        unitConversionParameters.gain = signalMeta.getGain();
        unitConversionParameters.qfix = signalMeta.getQfix();
        return unitConversionParameters;
    }

    public static final List<HeartSignalMeasurement.Measure> toHeartSignalMeasures(MeasuresGroup measuresGroup) {
        u.j(measuresGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        k w11 = r.w(0, measuresGroup.getMeasureCount());
        ArrayList arrayList2 = new ArrayList(x.y(w11, 10));
        Iterator<Integer> it = w11.iterator();
        while (it.hasNext()) {
            Measure measureAt = measuresGroup.getMeasureAt(((p0) it).a());
            Integer algoVersion = measureAt.getAlgoVersion();
            Integer platform = measureAt.getPlatform();
            Integer appVersion = measureAt.getAppVersion();
            int attrib = measuresGroup.getAttrib();
            arrayList2.add(new HeartSignalMeasurement.Measure(measureAt.getType(), (float) measureAt.getValue(), algoVersion, appVersion, platform, Integer.valueOf(attrib), measureAt.getAlgoParams()));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
