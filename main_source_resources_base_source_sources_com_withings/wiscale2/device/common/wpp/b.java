package com.withings.wiscale2.device.common.wpp;

import androidx.compose.foundation.lazy.layout.d;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.object.AlgoParam;
import com.withings.comm.wpp.generated.object.AlgorithmVersion;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.comm.wpp.generated.object.MeasureCategory;
import com.withings.comm.wpp.generated.object.MeasureLiveEcg;
import com.withings.comm.wpp.generated.object.MeasureLiveMeta;
import com.withings.comm.wpp.generated.object.MeasureStopReason;
import com.withings.comm.wpp.generated.object.StoredMeasureData;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.Timestamp;
import com.withings.comm.wpp.generated.object.TrackerWearPos;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import com.withings.comm.wpp.h;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.LiveEcgMeasurementRepository;
import com.withings.ecg.model.MeasurementHolder;
import com.withings.note.model.NoteRepository;
import com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation;
import ej.w;
import fl.p;
import fy.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kn.e;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import m70.i;
import nm0.k;
import nm0.l;
import nm0.y;
import vf.c;
/* compiled from: LiveEcgMeasurementDelegate.kt */
/* loaded from: classes5.dex */
public final class b implements ll.b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveEcgMeasurementRepository f54138a;

    /* renamed from: b  reason: collision with root package name */
    private final HeartSignalRepository f54139b;

    /* renamed from: c  reason: collision with root package name */
    private final w f54140c;

    /* renamed from: d  reason: collision with root package name */
    private final i f54141d;

    /* renamed from: e  reason: collision with root package name */
    private final e f54142e;

    /* renamed from: f  reason: collision with root package name */
    private final NoteRepository f54143f;

    /* renamed from: g  reason: collision with root package name */
    private final v f54144g;

    /* renamed from: h  reason: collision with root package name */
    private StoredSignalMeta f54145h;

    public b(LiveEcgMeasurementRepository liveEcgMeasurementRepository, HeartSignalRepository heartSignalRepository, w wppDeviceManager, i userManager, e deviceManager, NoteRepository noteRepository, v insertMeasureGroupUseCase) {
        u.j(liveEcgMeasurementRepository, "liveEcgMeasurementRepository");
        u.j(heartSignalRepository, "heartSignalRepository");
        u.j(wppDeviceManager, "wppDeviceManager");
        u.j(userManager, "userManager");
        u.j(deviceManager, "deviceManager");
        u.j(noteRepository, "noteRepository");
        u.j(insertMeasureGroupUseCase, "insertMeasureGroupUseCase");
        this.f54138a = liveEcgMeasurementRepository;
        this.f54139b = heartSignalRepository;
        this.f54140c = wppDeviceManager;
        this.f54141d = userManager;
        this.f54142e = deviceManager;
        this.f54143f = noteRepository;
        this.f54144g = insertMeasureGroupUseCase;
    }

    @Override // ll.b
    public final boolean a(f message) {
        u.j(message, "message");
        List<h> d11 = message.d();
        u.i(d11, "getObjects(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : d11) {
            if (obj instanceof MeasureCategory) {
                arrayList.add(obj);
            }
        }
        MeasureCategory measureCategory = (MeasureCategory) x.K(arrayList);
        if (measureCategory != null && measureCategory.value == 1) {
            return true;
        }
        return false;
    }

    @Override // ll.b
    public final boolean b(cj.b wppDevice, f wppMessage) {
        u.j(wppDevice, "wppDevice");
        u.j(wppMessage, "wppMessage");
        List<h> d11 = wppMessage.d();
        u.g(d11);
        List<h> list = d11;
        boolean z5 = list instanceof Collection;
        if (!z5 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((h) it.next()) instanceof MeasureCategory) {
                    if (!z5 || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (((h) it2.next()) instanceof MeasureLiveMeta) {
                                if (!z5 || !list.isEmpty()) {
                                    Iterator<T> it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        } else if (((h) it3.next()) instanceof StoredSignalMeta) {
                                            if (!z5 || !list.isEmpty()) {
                                                Iterator<T> it4 = list.iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        break;
                                                    } else if (((h) it4.next()) instanceof StoredSignalMetaExtend) {
                                                        if (!z5 || !list.isEmpty()) {
                                                            for (h hVar : list) {
                                                                if (hVar instanceof UnitConversionParameters) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    @Override // ll.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withings.comm.wpp.f c(cj.b r9, com.withings.comm.wpp.f r10) {
        /*
            r8 = this;
            java.lang.String r0 = "wppDevice"
            kotlin.jvm.internal.u.j(r9, r0)
            java.lang.String r0 = "wppMessage"
            kotlin.jvm.internal.u.j(r10, r0)
            com.withings.comm.wpp.generated.object.MeasureLiveAppStatus r0 = new com.withings.comm.wpp.generated.object.MeasureLiveAppStatus
            r0.<init>()
            u70.a r1 = u70.a.b()
            boolean r1 = r1.e()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L40
            kn.e r1 = r8.f54142e
            u70.i r9 = r9.g()
            com.withings.device.Device r9 = r1.f(r9)
            java.lang.Long r9 = r9.getUserId()
            m70.i r1 = r8.f54141d
            com.withings.user.User r1 = r1.e()
            long r4 = r1.q()
            if (r9 != 0) goto L36
            goto L40
        L36:
            long r6 = r9.longValue()
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 != 0) goto L40
            r9 = r3
            goto L41
        L40:
            r9 = r2
        L41:
            r0.appLiveScreenDisplayed = r9
            r9 = 2
            com.withings.comm.wpp.h[] r9 = new com.withings.comm.wpp.h[r9]
            java.util.List r10 = r10.d()
            java.lang.String r1 = "getObjects(...)"
            kotlin.jvm.internal.u.i(r10, r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L5a:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r10.next()
            boolean r5 = r4 instanceof com.withings.comm.wpp.generated.object.MeasureCategory
            if (r5 == 0) goto L5a
            r1.add(r4)
            goto L5a
        L6c:
            java.lang.Object r10 = kotlin.collections.x.K(r1)
            r9[r2] = r10
            r9[r3] = r0
            com.withings.comm.wpp.f r10 = new com.withings.comm.wpp.f
            r0 = 2419(0x973, float:3.39E-42)
            r10.<init>(r3, r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.wpp.b.c(cj.b, com.withings.comm.wpp.f):com.withings.comm.wpp.f");
    }

    @Override // ll.b
    public final boolean d(cj.b wppDevice, f wppMessage) {
        u.j(wppDevice, "wppDevice");
        u.j(wppMessage, "wppMessage");
        List<h> d11 = wppMessage.d();
        u.g(d11);
        List<h> list = d11;
        boolean z5 = list instanceof Collection;
        if (!z5 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((h) it.next()) instanceof Timestamp) {
                    if (!z5 || !list.isEmpty()) {
                        for (h hVar : list) {
                            if (hVar instanceof MeasureLiveEcg) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ll.b
    public final void e(w wppDeviceManager, cj.b wppDevice, f message) {
        int i11;
        u.j(wppDeviceManager, "wppDeviceManager");
        u.j(wppDevice, "wppDevice");
        u.j(message, "message");
        Long userId = this.f54142e.f(wppDevice.g()).getUserId();
        long q11 = this.f54141d.e().q();
        if (userId != null && userId.longValue() == q11) {
            u70.i g11 = wppDevice.g();
            u.i(g11, "getMac(...)");
            for (WppDeviceConversation wppDeviceConversation : wppDeviceManager.z(g11)) {
                wppDeviceConversation.p();
            }
            List<h> d11 = message.d();
            u.i(d11, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : d11) {
                if (obj instanceof MeasureLiveMeta) {
                    arrayList.add(obj);
                }
            }
            MeasureLiveMeta measureLiveMeta = (MeasureLiveMeta) x.K(arrayList);
            if (measureLiveMeta != null) {
                i11 = measureLiveMeta.timeWindow;
            } else {
                i11 = 0;
            }
            int i12 = i11;
            List<h> d12 = message.d();
            u.i(d12, "getObjects(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : d12) {
                if (obj2 instanceof StoredSignalMeta) {
                    arrayList2.add(obj2);
                }
            }
            this.f54145h = (StoredSignalMeta) x.I(arrayList2);
            List<h> d13 = message.d();
            u.i(d13, "getObjects(...)");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : d13) {
                if (obj3 instanceof StoredSignalMetaExtend) {
                    arrayList3.add(obj3);
                }
            }
            StoredSignalMetaExtend storedSignalMetaExtend = (StoredSignalMetaExtend) x.I(arrayList3);
            List<h> d14 = message.d();
            u.i(d14, "getObjects(...)");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : d14) {
                if (obj4 instanceof UnitConversionParameters) {
                    arrayList4.add(obj4);
                }
            }
            UnitConversionParameters unitConversionParameters = (UnitConversionParameters) x.I(arrayList4);
            List<h> d15 = message.d();
            u.i(d15, "getObjects(...)");
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : d15) {
                if (obj5 instanceof TrackerWearPos) {
                    arrayList5.add(obj5);
                }
            }
            TrackerWearPos trackerWearPos = (TrackerWearPos) x.K(arrayList5);
            StoredSignalMeta storedSignalMeta = this.f54145h;
            if (storedSignalMeta != null) {
                u70.i g12 = wppDevice.g();
                u.i(g12, "getMac(...)");
                this.f54138a.start(i12, storedSignalMeta, storedSignalMetaExtend, unitConversionParameters, trackerWearPos, g12, p.f67672b.a().f(wppDevice).a());
                return;
            }
            u.s("storedSignalMeta");
            throw null;
        }
    }

    @Override // ll.b
    public final void f(cj.b wppDevice, f message) {
        int i11;
        boolean z5;
        Object a11;
        boolean z11;
        MeasurementHolder measurementHolder;
        u.j(wppDevice, "wppDevice");
        u.j(message, "message");
        Long userId = this.f54142e.f(wppDevice.g()).getUserId();
        long q11 = this.f54141d.e().q();
        if (userId != null && userId.longValue() == q11) {
            List<h> d11 = message.d();
            u.i(d11, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : d11) {
                if (obj instanceof MeasureStopReason) {
                    arrayList.add(obj);
                }
            }
            MeasureStopReason measureStopReason = (MeasureStopReason) x.K(arrayList);
            boolean z12 = true;
            if (measureStopReason != null) {
                i11 = measureStopReason.value;
            } else {
                i11 = 1;
            }
            boolean z13 = false;
            if (i11 == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            List<h> d12 = message.d();
            u.i(d12, "getObjects(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : d12) {
                if (obj2 instanceof StoredMeasureMeta) {
                    arrayList2.add(obj2);
                }
            }
            final StoredMeasureMeta storedMeasureMeta = (StoredMeasureMeta) x.K(arrayList2);
            List<h> d13 = message.d();
            u.i(d13, "getObjects(...)");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : d13) {
                if (obj3 instanceof StoredSignalMeta) {
                    arrayList3.add(obj3);
                }
            }
            final StoredSignalMeta storedSignalMeta = (StoredSignalMeta) x.K(arrayList3);
            List<h> d14 = message.d();
            u.i(d14, "getObjects(...)");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : d14) {
                if (obj4 instanceof StoredMeasureData) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            IllegalStateException illegalStateException = new IllegalStateException("Received wpp object in wrong order. StoredMeasureData should be the first.");
            List<h> d15 = message.d();
            u.i(d15, "getObjects(...)");
            for (h hVar : d15) {
                if (hVar instanceof StoredMeasureData) {
                    u.g(hVar);
                    arrayList5.add(new MeasurementHolder((StoredMeasureData) hVar, null, null, null, 14, null));
                } else {
                    y yVar = null;
                    if (hVar instanceof AlgorithmVersion) {
                        MeasurementHolder measurementHolder2 = (MeasurementHolder) x.U(arrayList5);
                        if (measurementHolder2 != null) {
                            u.g(hVar);
                            measurementHolder2.setAlgoVersions((AlgorithmVersion) hVar);
                            yVar = y.f85009a;
                        }
                        if (yVar == null) {
                            throw illegalStateException;
                        }
                    } else if (hVar instanceof FirmwareVersion) {
                        MeasurementHolder measurementHolder3 = (MeasurementHolder) x.U(arrayList5);
                        if (measurementHolder3 != null) {
                            u.g(hVar);
                            measurementHolder3.setFirmwareVersion((FirmwareVersion) hVar);
                            yVar = y.f85009a;
                        }
                        if (yVar == null) {
                            throw illegalStateException;
                        }
                    } else if ((hVar instanceof AlgoParam) && (measurementHolder = (MeasurementHolder) x.U(arrayList5)) != null) {
                        List<AlgoParam> algoParams = measurementHolder.getAlgoParams();
                        if (algoParams == null) {
                            algoParams = i0.f76187a;
                        }
                        ArrayList S0 = x.S0(algoParams);
                        u.g(hVar);
                        measurementHolder.setAlgoParams(x.m0(hVar, S0));
                    }
                }
            }
            LiveEcgMeasurementRepository liveEcgMeasurementRepository = this.f54138a;
            if (z5 && storedMeasureMeta != null) {
                p a12 = p.f67672b.a();
                int i12 = a12.i(wppDevice.h());
                try {
                    a11 = liveEcgMeasurementRepository.getLiveEcg(i12, storedMeasureMeta, arrayList5, new a(a12.d(i12)));
                } catch (Throwable th2) {
                    a11 = l.a(th2);
                }
                Throwable b10 = k.b(a11);
                if (b10 == null) {
                    HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) a11;
                    if (((int) new File(heartSignalMeasurement.getSignal().getSignalPath()).length()) > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    heartSignalMeasurement.setSynced(true);
                    if (heartSignalMeasurement.getSignal().getMeta().getType() != 7) {
                        if (z11) {
                            this.f54139b.insertOrUpdate(heartSignalMeasurement);
                        } else {
                            z12 = false;
                        }
                    }
                    z13 = z12;
                } else {
                    x70.b.n(b10);
                }
                WppDeviceConversation wppDeviceConversation = new WppDeviceConversation() { // from class: com.withings.wiscale2.device.common.wpp.LiveEcgMeasurementDelegate$stopMeasurement$getEcgMeasurementsConversation$1
                    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
                    public final void D() {
                        i iVar;
                        c cVar;
                        v vVar;
                        HeartSignalRepository heartSignalRepository;
                        e eVar;
                        NoteRepository noteRepository;
                        b bVar = b.this;
                        iVar = bVar.f54141d;
                        cVar = c.f103617d;
                        if (cVar != null) {
                            vVar = bVar.f54144g;
                            heartSignalRepository = bVar.f54139b;
                            jq.k kVar = d.f4445d;
                            if (kVar != null) {
                                eVar = bVar.f54142e;
                                noteRepository = bVar.f54143f;
                                E(new GetHeartSignalMeasurementsConversation(iVar, cVar, storedMeasureMeta, storedSignalMeta, vVar, heartSignalRepository, kVar, eVar, noteRepository, null, 1536));
                                oi0.b.h().n(i.b().e(), "syncAfterSignalMeasurement");
                                return;
                            }
                            u.s("signalSyncNotifier");
                            throw null;
                        }
                        throw new IllegalArgumentException("You must call init before".toString());
                    }
                };
                w wVar = this.f54140c;
                wVar.getClass();
                wVar.O(wppDevice, wppDeviceConversation, LiveEcgMeasurementDelegate$stopMeasurement$getEcgMeasurementsConversation$1.class);
            }
            u70.i g11 = wppDevice.g();
            u.i(g11, "getMac(...)");
            liveEcgMeasurementRepository.stop(storedMeasureMeta, i11, z13, g11);
        }
    }

    @Override // ll.b
    public final boolean g(cj.b wppDevice, f wppMessage) {
        u.j(wppDevice, "wppDevice");
        u.j(wppMessage, "wppMessage");
        List<h> d11 = wppMessage.d();
        u.g(d11);
        List<h> list = d11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (h hVar : list) {
            if (hVar instanceof MeasureCategory) {
                return true;
            }
        }
        return false;
    }

    @Override // ll.b
    public final void h(cj.b wppDevice, f message) {
        int i11;
        u.j(wppDevice, "wppDevice");
        u.j(message, "message");
        Long userId = this.f54142e.f(wppDevice.g()).getUserId();
        long q11 = this.f54141d.e().q();
        if (userId != null && userId.longValue() == q11) {
            List<h> d11 = message.d();
            u.i(d11, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : d11) {
                if (obj instanceof Timestamp) {
                    arrayList.add(obj);
                }
            }
            Timestamp timestamp = (Timestamp) x.K(arrayList);
            if (timestamp != null) {
                i11 = timestamp.value;
            } else {
                i11 = 0;
            }
            List<h> d12 = message.d();
            u.i(d12, "getObjects(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : d12) {
                if (obj2 instanceof MeasureLiveEcg) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((MeasureLiveEcg) next).samples != null) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                byte[] samples = ((MeasureLiveEcg) it2.next()).samples;
                u.i(samples, "samples");
                x.n(kotlin.collections.l.f(samples), arrayList4);
            }
            this.f54138a.setLiveData(i11, x.L0(arrayList4));
        }
    }
}
