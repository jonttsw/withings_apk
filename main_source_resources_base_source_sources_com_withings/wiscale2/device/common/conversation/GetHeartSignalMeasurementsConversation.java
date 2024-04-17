package com.withings.wiscale2.device.common.conversation;

import android.content.Context;
import com.withings.clinicalstudy.repository.PatientSessionRepository;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.NoTypeNullReceivedException;
import com.withings.comm.wpp.generated.object.AlgoParam;
import com.withings.comm.wpp.generated.object.AlgorithmVersion;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.comm.wpp.generated.object.Null;
import com.withings.comm.wpp.generated.object.StoredMeasureData;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredSignalData;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.TrackerWearPos;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import com.withings.ecg.model.HeartSignalInfo;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementBuilder;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.MeasurementHolder;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteGroupKt;
import com.withings.note.model.NoteRepository;
import com.withings.user.User;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nj.c;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetHeartSignalMeasurementsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetHeartSignalMeasurementsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final m70.i f50717f;

    /* renamed from: g  reason: collision with root package name */
    private final vf.c f50718g;

    /* renamed from: h  reason: collision with root package name */
    private final StoredMeasureMeta f50719h;

    /* renamed from: i  reason: collision with root package name */
    private final StoredSignalMeta f50720i;

    /* renamed from: j  reason: collision with root package name */
    private final fy.v f50721j;

    /* renamed from: k  reason: collision with root package name */
    private final HeartSignalRepository f50722k;

    /* renamed from: l  reason: collision with root package name */
    private final jq.k f50723l;

    /* renamed from: m  reason: collision with root package name */
    private final kn.e f50724m;

    /* renamed from: n  reason: collision with root package name */
    private final NoteRepository f50725n;

    /* renamed from: o  reason: collision with root package name */
    private final pi.d f50726o;

    /* renamed from: p  reason: collision with root package name */
    private final ym0.l<Double, y> f50727p;

    /* renamed from: q  reason: collision with root package name */
    private fl.o f50728q;

    /* renamed from: r  reason: collision with root package name */
    private Long f50729r;

    /* renamed from: s  reason: collision with root package name */
    private HeartSignalInfo f50730s;

    /* renamed from: t  reason: collision with root package name */
    private double f50731t;

    /* renamed from: u  reason: collision with root package name */
    private jq.i f50732u;

    /* compiled from: GetHeartSignalMeasurementsConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetHeartSignalMeasurementsConversation$a;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface a {
        sq.a j();
    }

    public GetHeartSignalMeasurementsConversation(m70.i userManager, vf.c accountManager, StoredMeasureMeta storedMeasureMeta, StoredSignalMeta storedSignalMeta, fy.v insertMeasureGroupUseCase, HeartSignalRepository heartSignalRepository, jq.k kVar, kn.e deviceManager, NoteRepository noteRepository, ym0.l lVar, int i11) {
        StoredMeasureMeta storedMeasureMeta2;
        StoredSignalMeta storedSignalMeta2;
        if ((i11 & 4) != 0) {
            storedMeasureMeta2 = null;
        } else {
            storedMeasureMeta2 = storedMeasureMeta;
        }
        if ((i11 & 8) != 0) {
            storedSignalMeta2 = null;
        } else {
            storedSignalMeta2 = storedSignalMeta;
        }
        pi.d dVar = new pi.d(PatientSessionRepository.Companion.get(), new pi.i(new pb0.a(accountManager)));
        ym0.l lVar2 = (i11 & 1024) == 0 ? lVar : null;
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(insertMeasureGroupUseCase, "insertMeasureGroupUseCase");
        kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        this.f50717f = userManager;
        this.f50718g = accountManager;
        this.f50719h = storedMeasureMeta2;
        this.f50720i = storedSignalMeta2;
        this.f50721j = insertMeasureGroupUseCase;
        this.f50722k = heartSignalRepository;
        this.f50723l = kVar;
        this.f50724m = deviceManager;
        this.f50725n = noteRepository;
        this.f50726o = dVar;
        this.f50727p = lVar2;
    }

    public static void L(GetHeartSignalMeasurementsConversation this$0, com.withings.comm.wpp.h hVar) {
        List<AlgoParam> list;
        List<MeasurementHolder> measureHolderList;
        List<MeasurementHolder> measureHolderList2;
        MeasurementHolder measurementHolder;
        List<MeasurementHolder> measureHolderList3;
        List<MeasurementHolder> measureHolderList4;
        StoredSignalData signalData;
        Object runBlocking$default;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        MeasurementHolder measurementHolder2 = null;
        Integer num = null;
        r1 = null;
        MeasurementHolder measurementHolder3 = null;
        r1 = null;
        MeasurementHolder measurementHolder4 = null;
        measurementHolder2 = null;
        boolean z5 = false;
        if (hVar instanceof Null) {
            HeartSignalInfo heartSignalInfo = this$0.f50730s;
            if (heartSignalInfo != null) {
                byte[] samples = heartSignalInfo.getSignalData().samples;
                kotlin.jvm.internal.u.i(samples, "samples");
                if (samples.length == 0) {
                    z5 = true;
                }
                if (!z5) {
                    Context r7 = this$0.r();
                    kotlin.jvm.internal.u.i(r7, "getContext(...)");
                    Long l5 = this$0.f50729r;
                    int i11 = (int) this$0.x().i().softVersion;
                    fl.o oVar = this$0.f50728q;
                    if (oVar != null) {
                        HeartSignalMeasurement build = new HeartSignalMeasurementBuilder(r7, l5, i11, oVar.a(), new b(this$0)).setInfo(heartSignalInfo).build();
                        if (build != null) {
                            this$0.f50722k.insertOrUpdate(build);
                            Context r11 = this$0.r();
                            kotlin.jvm.internal.u.i(r11, "getContext(...)");
                            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new com.withings.wiscale2.device.common.conversation.a(build, ((a) ah.o.c(r11, a.class)).j(), null), 1, null);
                            HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) runBlocking$default;
                        }
                    } else {
                        kotlin.jvm.internal.u.s(WsVasistasSerie.KEY_MODEL);
                        throw null;
                    }
                }
            }
        } else if (hVar instanceof StoredMeasureMeta) {
            kotlin.jvm.internal.u.g(hVar);
            HeartSignalInfo heartSignalInfo2 = new HeartSignalInfo(null, null, null, null, null, null, null, 127, null);
            heartSignalInfo2.setMeasureMeta((StoredMeasureMeta) hVar);
            this$0.f50730s = heartSignalInfo2;
        } else if (hVar instanceof StoredMeasureData) {
            kotlin.jvm.internal.u.g(hVar);
            StoredMeasureData storedMeasureData = (StoredMeasureData) hVar;
            HeartSignalInfo heartSignalInfo3 = this$0.f50730s;
            if (heartSignalInfo3 != null) {
                heartSignalInfo3.setMeasureHolderList(x.m0(new MeasurementHolder(storedMeasureData, null, null, null, 14, null), heartSignalInfo3.getMeasureHolderList()));
            }
        } else if (hVar instanceof StoredSignalMeta) {
            kotlin.jvm.internal.u.g(hVar);
            StoredSignalMeta storedSignalMeta = (StoredSignalMeta) hVar;
            HeartSignalInfo heartSignalInfo4 = this$0.f50730s;
            if (heartSignalInfo4 != null) {
                heartSignalInfo4.setSignalMeta(storedSignalMeta);
            }
        } else if (hVar instanceof StoredSignalMetaExtend) {
            kotlin.jvm.internal.u.g(hVar);
            StoredSignalMetaExtend storedSignalMetaExtend = (StoredSignalMetaExtend) hVar;
            HeartSignalInfo heartSignalInfo5 = this$0.f50730s;
            if (heartSignalInfo5 != null) {
                heartSignalInfo5.setSignalMetaExtend(storedSignalMetaExtend);
            }
        } else if (hVar instanceof UnitConversionParameters) {
            kotlin.jvm.internal.u.g(hVar);
            UnitConversionParameters unitConversionParameters = (UnitConversionParameters) hVar;
            HeartSignalInfo heartSignalInfo6 = this$0.f50730s;
            if (heartSignalInfo6 != null) {
                heartSignalInfo6.setUnitConversionParameters(unitConversionParameters);
            }
        } else if (hVar instanceof StoredSignalData) {
            kotlin.jvm.internal.u.g(hVar);
            StoredSignalData storedSignalData = (StoredSignalData) hVar;
            HeartSignalInfo heartSignalInfo7 = this$0.f50730s;
            if (heartSignalInfo7 != null && (signalData = heartSignalInfo7.getSignalData()) != null) {
                byte[] bArr = signalData.samples;
                int length = bArr.length;
                int length2 = storedSignalData.samples.length;
                byte[] bArr2 = new byte[length + length2];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                System.arraycopy(storedSignalData.samples, 0, bArr2, length, length2);
                signalData.samples = bArr2;
            }
        } else if (hVar instanceof TrackerWearPos) {
            kotlin.jvm.internal.u.g(hVar);
            TrackerWearPos trackerWearPos = (TrackerWearPos) hVar;
            HeartSignalInfo heartSignalInfo8 = this$0.f50730s;
            if (heartSignalInfo8 != null) {
                short s11 = trackerWearPos.value;
                if (s11 == 3) {
                    num = 0;
                } else if (s11 == 2) {
                    num = 1;
                }
                heartSignalInfo8.setTrackerWearPos(num);
            }
        } else if (hVar instanceof AlgorithmVersion) {
            kotlin.jvm.internal.u.g(hVar);
            AlgorithmVersion algorithmVersion = (AlgorithmVersion) hVar;
            HeartSignalInfo heartSignalInfo9 = this$0.f50730s;
            if (heartSignalInfo9 != null && (measureHolderList4 = heartSignalInfo9.getMeasureHolderList()) != null) {
                measurementHolder3 = (MeasurementHolder) x.U(measureHolderList4);
            }
            if (measurementHolder3 != null) {
                measurementHolder3.setAlgoVersions(algorithmVersion);
            }
        } else if (hVar instanceof FirmwareVersion) {
            kotlin.jvm.internal.u.g(hVar);
            FirmwareVersion firmwareVersion = (FirmwareVersion) hVar;
            HeartSignalInfo heartSignalInfo10 = this$0.f50730s;
            if (heartSignalInfo10 != null && (measureHolderList3 = heartSignalInfo10.getMeasureHolderList()) != null) {
                measurementHolder4 = (MeasurementHolder) x.U(measureHolderList3);
            }
            if (measurementHolder4 != null) {
                measurementHolder4.setFirmwareVersion(firmwareVersion);
            }
        } else if (hVar instanceof AlgoParam) {
            kotlin.jvm.internal.u.g(hVar);
            AlgoParam algoParam = (AlgoParam) hVar;
            HeartSignalInfo heartSignalInfo11 = this$0.f50730s;
            if (heartSignalInfo11 != null && (measureHolderList2 = heartSignalInfo11.getMeasureHolderList()) != null && (measurementHolder = (MeasurementHolder) x.U(measureHolderList2)) != null) {
                list = measurementHolder.getAlgoParams();
            } else {
                list = null;
            }
            if (list == null) {
                list = i0.f76187a;
            }
            HeartSignalInfo heartSignalInfo12 = this$0.f50730s;
            if (heartSignalInfo12 != null && (measureHolderList = heartSignalInfo12.getMeasureHolderList()) != null) {
                measurementHolder2 = (MeasurementHolder) x.U(measureHolderList);
            }
            if (measurementHolder2 != null) {
                measurementHolder2.setAlgoParams(x.m0(algoParam, list));
            }
        }
        double min = Math.min(this$0.f50731t + 0.001d, 0.9d);
        this$0.f50731t = min;
        ym0.l<Double, y> lVar = this$0.f50727p;
        if (lVar != null) {
            lVar.invoke(Double.valueOf(min));
        }
    }

    public static final void Q(GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation, StoredMeasureMeta storedMeasureMeta, StoredSignalMeta storedSignalMeta) {
        Object runBlocking$default;
        long longValue;
        Object runBlocking$default2;
        Object runBlocking$default3;
        getHeartSignalMeasurementsConversation.getClass();
        long[] userId = storedMeasureMeta.userId;
        kotlin.jvm.internal.u.i(userId, "userId");
        for (long j5 : userId) {
            if (j5 != 0) {
                HeartSignalMeasurement byTimestampAndType = getHeartSignalMeasurementsConversation.f50722k.getByTimestampAndType(j5, storedMeasureMeta.time * 1000, storedSignalMeta.type);
                if (byTimestampAndType != null) {
                    byTimestampAndType.setSynced(false);
                    getHeartSignalMeasurementsConversation.f50722k.update(byTimestampAndType);
                    User i11 = getHeartSignalMeasurementsConversation.f50717f.i(byTimestampAndType.getUserID());
                    kotlin.jvm.internal.u.g(i11);
                    fl.o oVar = getHeartSignalMeasurementsConversation.f50728q;
                    if (oVar != null) {
                        if (oVar.a() == 44 && getHeartSignalMeasurementsConversation.f50729r != null) {
                            runBlocking$default3 = BuildersKt__BuildersKt.runBlocking$default(null, new e(getHeartSignalMeasurementsConversation, i11, byTimestampAndType, null), 1, null);
                            ky.d dVar = (ky.d) runBlocking$default3;
                            if (dVar != null) {
                                List<ky.a> f11 = dVar.f();
                                if (!(f11 instanceof Collection) || !f11.isEmpty()) {
                                    loop1: for (ky.a aVar : f11) {
                                        List<HeartSignalMeasurement.Measure> measures = byTimestampAndType.getMeasures();
                                        if (!(measures instanceof Collection) || !measures.isEmpty()) {
                                            for (HeartSignalMeasurement.Measure measure : measures) {
                                                if (measure.getType() == aVar.e()) {
                                                    longValue = dVar.d();
                                                    break loop1;
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new d(getHeartSignalMeasurementsConversation, i11, HeartSignalMeasurementKt.convertAsMeasureGroup(byTimestampAndType), null), 1, null);
                        longValue = ((Number) runBlocking$default).longValue();
                        NoteGroup noteGroup = new NoteGroup(0L, null, Long.valueOf(i11.q()), 0L, Long.valueOf(longValue), Long.valueOf(byTimestampAndType.getId()), null, new DateTime(byTimestampAndType.getTimestamp()), null, null, DateTime.now(), false, null, false, false, 31563, null);
                        getHeartSignalMeasurementsConversation.f50725n.insertOrUpdateNoteGroup(noteGroup);
                        if (byTimestampAndType.getSignal().getMeta().getType() == 1 || byTimestampAndType.getSignal().getMeta().getType() == 7 || byTimestampAndType.getSignal().getMeta().getType() == 13 || byTimestampAndType.getSignal().getMeta().getType() == 8 || byTimestampAndType.getSignal().getMeta().getType() == 6) {
                            runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new f(getHeartSignalMeasurementsConversation, i11, getHeartSignalMeasurementsConversation.f50718g.h().b(), byTimestampAndType, null), 1, null);
                            String str = (String) runBlocking$default2;
                            if (str != null) {
                                NoteGroupKt.addNoteText(noteGroup, str);
                            }
                            getHeartSignalMeasurementsConversation.f50732u = new jq.i(byTimestampAndType.getDiagnostic(), byTimestampAndType.getId(), byTimestampAndType.getTimestamp(), byTimestampAndType.getUserID());
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.u.s(WsVasistasSerie.KEY_MODEL);
                    throw null;
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        jq.k kVar;
        ArrayList z5;
        fl.o oVar;
        fl.p a11 = fl.p.f67672b.a();
        cj.b x11 = x();
        kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
        this.f50728q = a11.f(x11);
        this.f50729r = Long.valueOf(this.f50724m.f(x().g()).getId());
        do {
            Collection collection = null;
            this.f50730s = null;
            nj.c cVar = new nj.c(x());
            cVar.z(new c.b() { // from class: xb0.a
                @Override // nj.c.b
                public final void a(com.withings.comm.wpp.h hVar) {
                    GetHeartSignalMeasurementsConversation.L(GetHeartSignalMeasurementsConversation.this, hVar);
                }
            });
            try {
                z5 = kotlin.collections.l.z(new com.withings.comm.wpp.h[]{this.f50719h, this.f50720i});
                oVar = this.f50728q;
            } catch (NoTypeNullReceivedException unused) {
                x70.b.t(this, "No response from CMD_STORED_MEASURE_SIGNAL_GET", x(), Long.valueOf(x().i().softVersion));
            }
            if (oVar != null) {
                if (oVar instanceof gl.m) {
                    collection = z5;
                }
                if (collection == null) {
                    collection = i0.f76187a;
                }
                com.withings.comm.wpp.h[] hVarArr = (com.withings.comm.wpp.h[]) collection.toArray(new com.withings.comm.wpp.h[0]);
                cVar.c((short) 327, (com.withings.comm.wpp.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
                cVar.j();
                HeartSignalInfo heartSignalInfo = this.f50730s;
                if (heartSignalInfo != null) {
                    y yVar = (y) cr.a.a(new nm0.j(heartSignalInfo.getMeasureMeta(), heartSignalInfo.getSignalMeta()), new c(this));
                }
            } else {
                kotlin.jvm.internal.u.s(WsVasistasSerie.KEY_MODEL);
                throw null;
                break;
            }
        } while (this.f50730s != null);
        jq.i iVar = this.f50732u;
        if (iVar != null && (kVar = this.f50723l) != null) {
            Context r7 = r();
            kotlin.jvm.internal.u.i(r7, "getContext(...)");
            kVar.a(r7, iVar);
        }
    }
}
