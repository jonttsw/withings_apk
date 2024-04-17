package com.withings.ecg.model;

import android.content.Context;
import androidx.compose.foundation.lazy.layout.d;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.diag.DiagnosticResult;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import ky.a;
import m70.i;
import mq.h;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: HeartSignalMeasurementBuilder.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020 \u0012\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'0&j\u0002`(¢\u0006\u0004\b2\u00103J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b*\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b*\b\u0012\u0004\u0012\u00020\b0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010%R-\u0010)\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'0&j\u0002`(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010/\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00101¨\u00064"}, d2 = {"Lcom/withings/ecg/model/HeartSignalMeasurementBuilder;", "", "", "firmware", "()J", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "", "Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "getEcgMeasures", "(Lcom/withings/user/User;)Ljava/util/List;", "", "replaceByStoredMeasuresIfNecessary", "(Ljava/util/List;Lcom/withings/user/User;)Ljava/util/List;", "replaceByComputedValueIfNecessary", "(Ljava/util/List;)Ljava/util/List;", "Lcom/withings/ecg/model/HeartSignalInfo;", "info", "setInfo", "(Lcom/withings/ecg/model/HeartSignalInfo;)Lcom/withings/ecg/model/HeartSignalMeasurementBuilder;", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "build", "()Lcom/withings/ecg/model/HeartSignalMeasurement;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "deviceId", "Ljava/lang/Long;", "getDeviceId", "()Ljava/lang/Long;", "", "deviceFirmware", "I", "modelId", "getModelId", "()I", "Lkotlin/Function2;", "", "Lcom/withings/ecg/model/ShouldTrustSignalMeasure;", "shouldTrustSignalMeasure", "Lym0/p;", "getShouldTrustSignalMeasure", "()Lym0/p;", "Lm70/i;", "kotlin.jvm.PlatformType", "userManager", "Lm70/i;", "Lcom/withings/ecg/model/HeartSignalInfo;", "<init>", "(Landroid/content/Context;Ljava/lang/Long;IILym0/p;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeartSignalMeasurementBuilder {
    public static final int $stable = 8;
    private final Context context;
    private final int deviceFirmware;
    private final Long deviceId;
    private HeartSignalInfo info;
    private final int modelId;
    private final p<Integer, Long, Boolean> shouldTrustSignalMeasure;
    private final i userManager;

    /* JADX WARN: Multi-variable type inference failed */
    public HeartSignalMeasurementBuilder(Context context, Long l5, int i11, int i12, p<? super Integer, ? super Long, Boolean> shouldTrustSignalMeasure) {
        u.j(context, "context");
        u.j(shouldTrustSignalMeasure, "shouldTrustSignalMeasure");
        this.context = context;
        this.deviceId = l5;
        this.deviceFirmware = i11;
        this.modelId = i12;
        this.shouldTrustSignalMeasure = shouldTrustSignalMeasure;
        this.userManager = i.b();
    }

    private final long firmware() {
        int i11;
        FirmwareVersion firmwareVersion;
        HeartSignalInfo heartSignalInfo = this.info;
        if (heartSignalInfo != null) {
            MeasurementHolder measurementHolder = (MeasurementHolder) x.K(heartSignalInfo.getMeasureHolderList());
            if (measurementHolder != null && (firmwareVersion = measurementHolder.getFirmwareVersion()) != null) {
                i11 = firmwareVersion.version;
            } else {
                i11 = this.deviceFirmware;
            }
            return i11;
        }
        u.s("info");
        throw null;
    }

    private final List<HeartSignalMeasurement.Measure> getEcgMeasures(User user) {
        HeartSignalInfo heartSignalInfo = this.info;
        if (heartSignalInfo != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : HeartSignalMeasurementBuilderKt.access$getSignalMeasures(heartSignalInfo)) {
                if (this.shouldTrustSignalMeasure.invoke(Integer.valueOf(((HeartSignalMeasurement.Measure) obj).getType()), Long.valueOf(firmware())).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return replaceByComputedValueIfNecessary(replaceByStoredMeasuresIfNecessary(x.S0(arrayList), user));
        }
        u.s("info");
        throw null;
    }

    private final List<HeartSignalMeasurement.Measure> replaceByComputedValueIfNecessary(List<HeartSignalMeasurement.Measure> list) {
        HeartSignalInfo heartSignalInfo = this.info;
        if (heartSignalInfo != null) {
            DiagnosticResult access$computeEcgDiagnostic = HeartSignalMeasurementBuilderKt.access$computeEcgDiagnostic(heartSignalInfo, this.modelId);
            if (!HeartSignalMeasurementKt.isAfibValid(list)) {
                float value = HeartSignalMeasurementBuilderKt.getValue(access$computeEcgDiagnostic.getAfibStatus());
                Integer valueOf = Integer.valueOf(access$computeEcgDiagnostic.getAlgoVersion());
                Integer valueOf2 = Integer.valueOf(d.c());
                HeartSignalInfo heartSignalInfo2 = this.info;
                if (heartSignalInfo2 != null) {
                    HeartSignalMeasurementKt.replaceMeasure(list, 130, new HeartSignalMeasurement.Measure(130, value, valueOf, valueOf2, 6, Integer.valueOf(heartSignalInfo2.getMeasureMeta().attrib), null));
                    float heartRate = access$computeEcgDiagnostic.getHeartRate();
                    Integer valueOf3 = Integer.valueOf(access$computeEcgDiagnostic.getAlgoVersion());
                    Integer valueOf4 = Integer.valueOf(d.c());
                    HeartSignalInfo heartSignalInfo3 = this.info;
                    if (heartSignalInfo3 != null) {
                        HeartSignalMeasurementKt.replaceMeasure(list, 11, new HeartSignalMeasurement.Measure(11, heartRate, valueOf3, valueOf4, 6, Integer.valueOf(heartSignalInfo3.getMeasureMeta().attrib), null, 64, null));
                    } else {
                        u.s("info");
                        throw null;
                    }
                } else {
                    u.s("info");
                    throw null;
                }
            }
            return list;
        }
        u.s("info");
        throw null;
    }

    private final List<HeartSignalMeasurement.Measure> replaceByStoredMeasuresIfNecessary(List<HeartSignalMeasurement.Measure> list, User user) {
        ky.d dVar;
        a aVar;
        Object runBlocking$default;
        a aVar2 = null;
        if (this.deviceId != null) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1(this, user, null), 1, null);
            dVar = (ky.d) runBlocking$default;
        } else {
            dVar = null;
        }
        if (dVar != null && ly.a.g(11, dVar) && ly.a.g(130, dVar) && !HeartSignalMeasurementKt.isAfibValid(list)) {
            if (dVar != null) {
                aVar = ly.a.c(130, dVar);
            } else {
                aVar = null;
            }
            if (dVar != null) {
                aVar2 = ly.a.c(11, dVar);
            }
            if (aVar != null && aVar2 != null) {
                HeartSignalMeasurementKt.replaceMeasure(list, 130, HeartSignalMeasurementKt.toSignalMeasure(aVar, Integer.valueOf(dVar.e().b())));
                HeartSignalMeasurementKt.replaceMeasure(list, 11, HeartSignalMeasurementKt.toSignalMeasure(aVar2, Integer.valueOf(dVar.e().b())));
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final HeartSignalMeasurement build() {
        ?? ecgMeasures;
        HeartSignalInfo heartSignalInfo = this.info;
        if (heartSignalInfo != null) {
            long j5 = 1000;
            DateTime dateTime = new DateTime(heartSignalInfo.getMeasureMeta().time * j5);
            HeartSignalInfo heartSignalInfo2 = this.info;
            if (heartSignalInfo2 != null) {
                SignalMeta access$getSignalMeta = HeartSignalMeasurementBuilderKt.access$getSignalMeta(heartSignalInfo2);
                HeartSignalInfo heartSignalInfo3 = this.info;
                if (heartSignalInfo3 != null) {
                    byte[] bArr = heartSignalInfo3.getSignalData().samples;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    h hVar = new h(this.context);
                    HeartSignalInfo heartSignalInfo4 = this.info;
                    if (heartSignalInfo4 != null) {
                        Signal signal = new Signal(null, access$getSignalMeta, hVar.a(heartSignalInfo4.getMeasureMeta().time * j5, access$getSignalMeta, bArr), 1, null);
                        HeartSignalInfo heartSignalInfo5 = this.info;
                        if (heartSignalInfo5 != null) {
                            long[] userId = heartSignalInfo5.getMeasureMeta().userId;
                            u.i(userId, "userId");
                            ArrayList arrayList = new ArrayList(userId.length);
                            for (long j11 : userId) {
                                arrayList.add(this.userManager.i(j11));
                            }
                            User user = (User) x.K(x.G(arrayList));
                            if (user == null) {
                                return null;
                            }
                            HeartSignalInfo heartSignalInfo6 = this.info;
                            if (heartSignalInfo6 != null) {
                                int i11 = heartSignalInfo6.getSignalMeta().type;
                                if (i11 != 1 && i11 != 13 && i11 != 6 && i11 != 7 && i11 != 8) {
                                    HeartSignalInfo heartSignalInfo7 = this.info;
                                    if (heartSignalInfo7 != null) {
                                        ecgMeasures = new ArrayList();
                                        for (Object obj : HeartSignalMeasurementBuilderKt.access$getSignalMeasures(heartSignalInfo7)) {
                                            if (this.shouldTrustSignalMeasure.invoke(Integer.valueOf(((HeartSignalMeasurement.Measure) obj).getType()), Long.valueOf(firmware())).booleanValue()) {
                                                ecgMeasures.add(obj);
                                            }
                                        }
                                    } else {
                                        u.s("info");
                                        throw null;
                                    }
                                } else {
                                    ecgMeasures = getEcgMeasures(user);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : (Iterable) ecgMeasures) {
                                    HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) obj2;
                                    if (measure.getType() != 11 || measure.getValue() != 0.0f) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                long q11 = user.q();
                                int i12 = this.modelId;
                                ArrayList arrayList3 = new ArrayList(arrayList2);
                                Long l5 = this.deviceId;
                                HeartSignalInfo heartSignalInfo8 = this.info;
                                if (heartSignalInfo8 != null) {
                                    return new HeartSignalMeasurement(0L, q11, i12, dateTime, signal, true, 0L, l5, heartSignalInfo8.getTrackerWearPos(), false, arrayList3, Integer.valueOf((int) firmware()), 1, 577, null);
                                }
                                u.s("info");
                                throw null;
                            }
                            u.s("info");
                            throw null;
                        }
                        u.s("info");
                        throw null;
                    }
                    u.s("info");
                    throw null;
                }
                u.s("info");
                throw null;
            }
            u.s("info");
            throw null;
        }
        u.s("info");
        throw null;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final p<Integer, Long, Boolean> getShouldTrustSignalMeasure() {
        return this.shouldTrustSignalMeasure;
    }

    public final HeartSignalMeasurementBuilder setInfo(HeartSignalInfo info) {
        u.j(info, "info");
        this.info = info;
        return this;
    }
}
