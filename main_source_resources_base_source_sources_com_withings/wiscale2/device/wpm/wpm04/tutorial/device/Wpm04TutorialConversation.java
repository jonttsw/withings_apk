package com.withings.wiscale2.device.wpm.wpm04.tutorial.device;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.MeasureProcessStep;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.note.model.NoteRepository;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation;
import fy.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import vf.c;
import xb0.h;
/* compiled from: Wpm04TutorialConversation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/device/Wpm04TutorialConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/comm/wpp/d$b;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04TutorialConversation extends WppDeviceConversation implements d.b {

    /* renamed from: f  reason: collision with root package name */
    private final i f55836f;

    /* renamed from: g  reason: collision with root package name */
    private final c f55837g;

    /* renamed from: h  reason: collision with root package name */
    private final v f55838h;

    /* renamed from: i  reason: collision with root package name */
    private final HeartSignalRepository f55839i;

    /* renamed from: j  reason: collision with root package name */
    private final e f55840j;

    /* renamed from: k  reason: collision with root package name */
    private final NoteRepository f55841k;

    /* renamed from: l  reason: collision with root package name */
    private a f55842l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<Integer> f55843m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55844n;

    /* compiled from: Wpm04TutorialConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void C();

        void E();

        void J();

        void L();

        void Z(Integer num);

        void h();

        void t();

        void u();

        void v();

        void x();
    }

    public Wpm04TutorialConversation(i userManager, c accountManager, v vVar, HeartSignalRepository heartSignalRepository, e deviceManager, NoteRepository noteRepository, a aVar) {
        u.j(userManager, "userManager");
        u.j(accountManager, "accountManager");
        u.j(heartSignalRepository, "heartSignalRepository");
        u.j(deviceManager, "deviceManager");
        u.j(noteRepository, "noteRepository");
        this.f55836f = userManager;
        this.f55837g = accountManager;
        this.f55838h = vVar;
        this.f55839i = heartSignalRepository;
        this.f55840j = deviceManager;
        this.f55841k = noteRepository;
        this.f55842l = aVar;
        this.f55843m = new ArrayList<>();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        int intValue;
        if (x().c() != 6) {
            return;
        }
        x().k().b(this);
        a aVar = this.f55842l;
        if (aVar != null) {
            aVar.J();
        }
        B(DeviceSession.DEVICE_SESSION_TTL, true, false);
        do {
            Object K = K();
            u.i(K, "waitForInput(...)");
            intValue = ((Number) K).intValue();
            if (intValue != 1) {
                if (intValue == 4) {
                    MeasureProcessStep measureProcessStep = new MeasureProcessStep();
                    measureProcessStep.step = 15;
                    measureProcessStep.stepParam = 2;
                    nj.a aVar2 = new nj.a(x());
                    aVar2.c(Wpp.CMD_NOTIFY_MEASURE_PROCESS_STEP, measureProcessStep);
                    aVar2.j();
                }
            } else {
                MeasureProcessStep measureProcessStep2 = new MeasureProcessStep();
                measureProcessStep2.step = 15;
                measureProcessStep2.stepParam = 1;
                nj.a aVar3 = new nj.a(x());
                aVar3.c(Wpp.CMD_NOTIFY_MEASURE_PROCESS_STEP, measureProcessStep2);
                aVar3.j();
            }
        } while (intValue != 3);
        ArrayList<Integer> arrayList = this.f55843m;
        if (!arrayList.isEmpty() || this.f55844n) {
            a aVar4 = this.f55842l;
            if (aVar4 != null) {
                aVar4.E();
            }
            new h(x(), e.c()).a();
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                StoredMeasureMeta storedMeasureMeta = new StoredMeasureMeta();
                storedMeasureMeta.uid = intValue2;
                storedMeasureMeta.userIdCnt = (short) 1;
                storedMeasureMeta.attrib = (short) 0;
                storedMeasureMeta.userId = new long[]{0};
                storedMeasureMeta.time = 0L;
                E(new GetHeartSignalMeasurementsConversation(this.f55836f, this.f55837g, storedMeasureMeta, null, this.f55838h, this.f55839i, null, this.f55840j, this.f55841k, null, 1544));
            }
            arrayList.clear();
            MeasureProcessStep measureProcessStep3 = new MeasureProcessStep();
            measureProcessStep3.step = 18;
            measureProcessStep3.stepParam = 0;
            nj.a aVar5 = new nj.a(x());
            aVar5.c(Wpp.CMD_NOTIFY_MEASURE_PROCESS_STEP, measureProcessStep3);
            aVar5.j();
        }
        a aVar6 = this.f55842l;
        if (aVar6 != null) {
            aVar6.v();
        }
        this.f55842l = null;
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d dVar) {
        a aVar = this.f55842l;
        if (aVar != null) {
            aVar.C();
        }
    }

    @Override // com.withings.comm.wpp.d.b
    public final void o(d dVar, f fVar) {
        if (fVar.b() == 332) {
            List<com.withings.comm.wpp.h> d11 = fVar.d();
            u.i(d11, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : d11) {
                if (obj instanceof MeasureProcessStep) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MeasureProcessStep measureProcessStep = (MeasureProcessStep) it.next();
                short s11 = (short) measureProcessStep.step;
                if (s11 == 2) {
                    a aVar = this.f55842l;
                    if (aVar != null) {
                        aVar.h();
                    }
                } else if (s11 == 13) {
                    this.f55844n = true;
                    a aVar2 = this.f55842l;
                    if (aVar2 != null) {
                        aVar2.u();
                    }
                } else if (s11 == 8) {
                    a aVar3 = this.f55842l;
                    if (aVar3 != null) {
                        aVar3.t();
                    }
                } else if (s11 == 10) {
                    this.f55843m.add(Integer.valueOf(measureProcessStep.stepParam));
                } else if (s11 == 14) {
                    a aVar4 = this.f55842l;
                    if (aVar4 != null) {
                        aVar4.Z(Integer.valueOf(measureProcessStep.stepParam));
                    }
                } else if (s11 == 11) {
                    a aVar5 = this.f55842l;
                    if (aVar5 != null) {
                        aVar5.x();
                    }
                } else if (s11 == 16) {
                    a aVar6 = this.f55842l;
                    if (aVar6 != null) {
                        aVar6.L();
                    }
                } else if (s11 == 17 || s11 == 18) {
                    G(3);
                } else {
                    a aVar7 = this.f55842l;
                    if (aVar7 != null) {
                        aVar7.Z(null);
                    }
                }
            }
        }
    }
}
