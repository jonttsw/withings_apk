package com.withings.wiscale2.device.wpm.ui;

import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: Wpm0203Activity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$Wpm02ViewModel$saveMeasure$1", f = "Wpm0203Activity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.d f55751a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ we0.l f55752b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f55753c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ u70.i f55754d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ProbeReply f55755e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<MeasuresGroup, User, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Wpm0203Activity.d f55756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u70.i f55757b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f55758c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ProbeReply f55759d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Wpm0203Activity.d dVar, u70.i iVar, boolean z5, ProbeReply probeReply) {
            super(2);
            this.f55756a = dVar;
            this.f55757b = iVar;
            this.f55758c = z5;
            this.f55759d = probeReply;
        }

        @Override // ym0.p
        public final nm0.y invoke(MeasuresGroup measuresGroup, User user) {
            t00.d dVar;
            Long l5;
            MeasuresGroup measuresGroup2;
            MeasuresGroup measuresGrp = measuresGroup;
            kotlin.jvm.internal.u.j(measuresGrp, "measuresGrp");
            kotlin.jvm.internal.u.j(user, "<anonymous parameter 1>");
            Wpm0203Activity.d dVar2 = this.f55756a;
            User t02 = dVar2.t0();
            if (t02 != null) {
                WiscaleDBH f11 = WiscaleDBH.f();
                kotlin.jvm.internal.u.i(f11, "get(...)");
                sw.a z5 = sw.a.z();
                kotlin.jvm.internal.u.i(z5, "get(...)");
                measuresGrp.setId(new fy.v(new zx.v(z5), f11, zx.j.f111082d.a()).a(t02.q(), hy.g.a(measuresGrp), this.f55759d));
            }
            dVar = dVar2.f55649h;
            User t03 = dVar2.t0();
            if (t03 != null) {
                l5 = Long.valueOf(t03.q());
            } else {
                l5 = null;
            }
            dVar.c(ConstantsWs.CALLCTX_TBP_DEVICE_SYNC, l5, null);
            xw.n<Wpm0203Activity.c> R0 = dVar2.R0();
            User t04 = dVar2.t0();
            measuresGroup2 = dVar2.f55667z;
            R0.postValue(new Wpm0203Activity.c(t04, this.f55757b, measuresGroup2, this.f55758c));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Wpm0203Activity.d dVar, we0.l lVar, boolean z5, u70.i iVar, ProbeReply probeReply, qm0.d<? super k> dVar2) {
        super(2, dVar2);
        this.f55751a = dVar;
        this.f55752b = lVar;
        this.f55753c = z5;
        this.f55754d = iVar;
        this.f55755e = probeReply;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k(this.f55751a, this.f55752b, this.f55753c, this.f55754d, this.f55755e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j5;
        MeasuresGroup measuresGroup;
        MeasuresGroup measuresGroup2;
        MeasuresGroup measuresGroup3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Wpm0203Activity.d dVar = this.f55751a;
        User t02 = dVar.t0();
        we0.l lVar = this.f55752b;
        int i11 = lVar.f104968a;
        int i12 = lVar.f104969b;
        int i13 = lVar.f104970c;
        DateTime now = DateTime.now();
        MeasuresGroup measuresGroup4 = new MeasuresGroup(3);
        int i14 = 0;
        measuresGroup4.setAttrib(0);
        measuresGroup4.setCategory(1);
        measuresGroup4.setDate(now.toDate());
        if (t02 != null) {
            j5 = t02.q();
        } else {
            j5 = -1;
        }
        measuresGroup4.setUserId(j5);
        measuresGroup4.setDevtype(4);
        measuresGroup4.setAttrib(0);
        Measure measure = new Measure();
        measure.setDate(measuresGroup4.getDate());
        measure.setGroup(measuresGroup4);
        measure.setType(10);
        measure.setUnit(0);
        measure.setValue(i12);
        measuresGroup4.addMeasure(measure);
        Measure measure2 = new Measure();
        measure2.setDate(measuresGroup4.getDate());
        measure2.setGroup(measuresGroup4);
        measure2.setType(9);
        measure2.setUnit(0);
        measure2.setValue(i11);
        measuresGroup4.addMeasure(measure2);
        Measure measure3 = new Measure();
        measure3.setDate(measuresGroup4.getDate());
        measure3.setGroup(measuresGroup4);
        measure3.setType(11);
        measure3.setUnit(0);
        measure3.setValue(i13);
        measuresGroup4.addMeasure(measure3);
        dVar.f55667z = measuresGroup4;
        measuresGroup = dVar.f55667z;
        boolean z5 = this.f55753c;
        if (measuresGroup != null) {
            if (z5) {
                i14 = 5;
            }
            measuresGroup.setAttrib(i14);
        }
        measuresGroup2 = dVar.f55667z;
        nm0.j jVar = new nm0.j(measuresGroup2, dVar.t0());
        ProbeReply probeReply = this.f55755e;
        u70.i iVar = this.f55754d;
        if (((nm0.y) cr.a.a(jVar, new a(dVar, iVar, z5, probeReply))) == null) {
            xw.n<Wpm0203Activity.c> R0 = dVar.R0();
            measuresGroup3 = dVar.f55667z;
            R0.postValue(new Wpm0203Activity.c(null, iVar, measuresGroup3, z5));
        }
        return nm0.y.f85009a;
    }
}
