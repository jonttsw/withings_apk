package com.withings.ecg.details;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.library.ecg.EcgLeadType;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteLiveData;
import com.withings.note.model.NoteRepository;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class b0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38097a;

    /* renamed from: b  reason: collision with root package name */
    private final HeartSignalRepository f38098b;

    /* renamed from: c  reason: collision with root package name */
    private final NoteRepository f38099c;

    /* renamed from: d  reason: collision with root package name */
    private final fy.k f38100d;

    /* renamed from: e  reason: collision with root package name */
    private final fy.d f38101e;

    /* renamed from: f  reason: collision with root package name */
    private final jq.b f38102f;

    /* renamed from: g  reason: collision with root package name */
    private final GetSignalDataSyncFactory f38103g;

    /* renamed from: h  reason: collision with root package name */
    private final t00.d f38104h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<Boolean>> f38105i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<HeartSignalMeasurement> f38106j;

    /* renamed from: k  reason: collision with root package name */
    private a2 f38107k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38108l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f38109m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedFlow<User> f38110n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38111o;

    /* renamed from: p  reason: collision with root package name */
    private final List<EcgLeadType> f38112p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f38113q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38114r;

    /* renamed from: s  reason: collision with root package name */
    private final xw.p<HeartSignalMeasurement, Boolean, a> f38115s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38116t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38117u;

    /* renamed from: v  reason: collision with root package name */
    private final xw.h<o2> f38118v;

    /* renamed from: w  reason: collision with root package name */
    private final List<com.withings.measure.detail.ui.views.j> f38119w;

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final HeartDiagnosticUI f38120a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f38121b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f38122c;

        /* renamed from: d  reason: collision with root package name */
        private final int f38123d;

        /* renamed from: e  reason: collision with root package name */
        private final int f38124e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f38125f;

        /* renamed from: g  reason: collision with root package name */
        private final int f38126g;

        /* renamed from: h  reason: collision with root package name */
        private final int f38127h;

        public a(HeartDiagnosticUI heartDiagnosticUiModel, boolean z5, boolean z11, int i11, int i12, Integer num, int i13, int i14) {
            kotlin.jvm.internal.u.j(heartDiagnosticUiModel, "heartDiagnosticUiModel");
            this.f38120a = heartDiagnosticUiModel;
            this.f38121b = z5;
            this.f38122c = z11;
            this.f38123d = i11;
            this.f38124e = i12;
            this.f38125f = num;
            this.f38126g = i13;
            this.f38127h = i14;
        }

        public final int a() {
            return this.f38123d;
        }

        public final int b() {
            return this.f38126g;
        }

        public final HeartDiagnosticUI c() {
            return this.f38120a;
        }

        public final Integer d() {
            return this.f38125f;
        }

        public final int e() {
            return this.f38124e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f38120a, aVar.f38120a) && this.f38121b == aVar.f38121b && this.f38122c == aVar.f38122c && this.f38123d == aVar.f38123d && this.f38124e == aVar.f38124e && kotlin.jvm.internal.u.e(this.f38125f, aVar.f38125f) && this.f38126g == aVar.f38126g && this.f38127h == aVar.f38127h) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f38127h;
        }

        public final boolean g() {
            return this.f38121b;
        }

        public final boolean h() {
            return this.f38122c;
        }

        public final int hashCode() {
            int hashCode;
            int a11 = androidx.appcompat.app.h.a(this.f38124e, androidx.appcompat.app.h.a(this.f38123d, androidx.camera.core.y1.a(this.f38122c, androidx.camera.core.y1.a(this.f38121b, this.f38120a.hashCode() * 31, 31), 31), 31), 31);
            Integer num = this.f38125f;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return Integer.hashCode(this.f38127h) + androidx.appcompat.app.h.a(this.f38126g, (a11 + hashCode) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DiagnosticData(heartDiagnosticUiModel=");
            sb2.append(this.f38120a);
            sb2.append(", isInOrNeedReview=");
            sb2.append(this.f38121b);
            sb2.append(", isRejectedReview=");
            sb2.append(this.f38122c);
            sb2.append(", attrib=");
            sb2.append(this.f38123d);
            sb2.append(", titleResId=");
            sb2.append(this.f38124e);
            sb2.append(", subtitleResId=");
            sb2.append(this.f38125f);
            sb2.append(", descriptionResId=");
            sb2.append(this.f38126g);
            sb2.append(", url=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f38127h, ")");
        }
    }

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f38128a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f38129b;

        public b(boolean z5, boolean z11) {
            this.f38128a = z5;
            this.f38129b = z11;
        }

        public final boolean a() {
            return this.f38128a;
        }

        public final boolean b() {
            return this.f38129b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f38128a == bVar.f38128a && this.f38129b == bVar.f38129b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f38129b) + (Boolean.hashCode(this.f38128a) * 31);
        }

        public final String toString() {
            return "SignalFileStatus(hasSignalData=" + this.f38128a + ", hideSignalData=" + this.f38129b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgDetailsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$deleteEcg$1$1", f = "EcgDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f38131b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HeartSignalMeasurement f38132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j5, HeartSignalMeasurement heartSignalMeasurement, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f38131b = j5;
            this.f38132c = heartSignalMeasurement;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f38131b, this.f38132c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object runBlocking$default;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            b0 b0Var = b0.this;
            HeartSignalRepository.flagAsDeletedById$default(b0Var.f38098b, this.f38131b, false, 2, null);
            mq.c cVar = new mq.c(b0Var.f38097a);
            HeartSignalMeasurement heartSignalMeasurement = this.f38132c;
            cVar.c(heartSignalMeasurement.getSignal().getMeta().getType(), heartSignalMeasurement.getTimestamp().getMillis());
            NoteGroup noteGroup = (NoteGroup) b0Var.f38108l.getValue();
            if (noteGroup != null) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(b0Var), Dispatchers.getIO(), null, new d0(b0Var, noteGroup, null), 2, null);
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new c0(b0Var, noteGroup, null), 1, null);
                nm0.y yVar = (nm0.y) runBlocking$default;
            }
            return nm0.y.f85009a;
        }
    }

    public b0(long j5, long j11, boolean z5, Context context, HeartSignalRepository heartSignalRepository, NoteRepository noteRepository, fy.k kVar, fy.d dVar, jq.b deviceDiagnosticStringResourcesProvider, GetSignalDataSyncFactory getSignalDataSyncFactory, t00.d networkSyncManager, jm.a aVar, sq.f fVar, r70.c userRepository) {
        kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        kotlin.jvm.internal.u.j(deviceDiagnosticStringResourcesProvider, "deviceDiagnosticStringResourcesProvider");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f38097a = context;
        this.f38098b = heartSignalRepository;
        this.f38099c = noteRepository;
        this.f38100d = kVar;
        this.f38101e = dVar;
        this.f38102f = deviceDiagnosticStringResourcesProvider;
        this.f38103g = getSignalDataSyncFactory;
        this.f38104h = networkSyncManager;
        this.f38105i = new androidx.lifecycle.k0<>();
        LiveData<HeartSignalMeasurement> heartSignalLiveData = heartSignalRepository.getHeartSignalLiveData(j5);
        this.f38106j = heartSignalLiveData;
        a2 a2Var = new a2(heartSignalLiveData, fVar);
        this.f38107k = a2Var;
        this.f38108l = androidx.lifecycle.e1.c(a2Var, new s0(this));
        this.f38109m = nm0.h.b(new t0(this, j11));
        this.f38110n = FlowKt.shareIn(userRepository.g(j11), androidx.lifecycle.h1.a(this), SharingStarted.Companion.getEagerly(), 1);
        this.f38111o = androidx.lifecycle.e1.b(a2Var, v0.f38346a);
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(heartSignalLiveData, new p0(this));
        this.f38112p = kotlin.collections.x.W(EcgLeadType.DI, EcgLeadType.DII, EcgLeadType.DIII, EcgLeadType.AVF, EcgLeadType.AVL, EcgLeadType.AVR);
        androidx.lifecycle.k0<Integer> b10 = xw.d.b(null);
        this.f38113q = b10;
        this.f38114r = androidx.lifecycle.e1.b(b10, new u0(this));
        xw.p<HeartSignalMeasurement, Boolean, a> pVar = new xw.p<>(a2Var, c11, new e0(this));
        this.f38115s = pVar;
        this.f38116t = androidx.lifecycle.e1.b(a2Var, new r0(aVar));
        this.f38117u = androidx.lifecycle.e1.b(xw.a.d(new nm0.j(heartSignalLiveData, pVar)), new q0(this));
        this.f38118v = xw.i.a(androidx.lifecycle.e1.c(a2Var, new m0(this)), new n0(z5));
        this.f38119w = kotlin.collections.x.W(new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_feelingTitle, C1987R.string.ecg_detail_resultAddDetails_feelingDescription, C1987R.drawable.ic_neutral_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_contextTitle, C1987R.string.ecg_detail_resultAddDetails_contextDescription, C1987R.drawable.ic_time_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_intakesTitle, C1987R.string.ecg_detail_resultAddDetails_intakesDescription, C1987R.drawable.ic_mug_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_medicinesTitle, C1987R.string.ecg_detail_resultAddDetails_medicinesDescription, C1987R.drawable.ic_pill_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_armTitle, C1987R.string.ecg_detail_resultAddDetails_armDescription, C1987R.drawable.ic_arm_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_symptomsTitle, C1987R.string.ecg_detail_resultAddDetails_symptomsDescription, C1987R.drawable.ic_symptoms_black_24dp));
    }

    public final List<com.withings.measure.detail.ui.views.j> A0() {
        return this.f38119w;
    }

    public final androidx.lifecycle.k0<xw.c<Boolean>> B0() {
        return this.f38105i;
    }

    public final xw.p<HeartSignalMeasurement, Boolean, a> F0() {
        return this.f38115s;
    }

    public final a2 G0() {
        return this.f38107k;
    }

    public final xw.h<o2> K0() {
        return this.f38118v;
    }

    public final androidx.lifecycle.j0 M0() {
        return this.f38117u;
    }

    public final androidx.lifecycle.j0 O0() {
        return this.f38116t;
    }

    public final LiveData<HeartSignalMeasurement> R0() {
        return this.f38106j;
    }

    public final NoteLiveData T0() {
        return (NoteLiveData) this.f38109m.getValue();
    }

    public final androidx.lifecycle.j0 U0() {
        return this.f38114r;
    }

    public final androidx.lifecycle.k0<Integer> V0() {
        return this.f38113q;
    }

    public final androidx.lifecycle.j0 W0() {
        return this.f38111o;
    }

    public final SharedFlow<User> X0() {
        return this.f38110n;
    }

    public final boolean Y0() {
        Boolean bool;
        Integer attrib;
        HeartSignalMeasurement value = this.f38106j.getValue();
        if (value != null) {
            HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) kotlin.collections.x.K(value.getMeasures());
            if (measure != null && (attrib = measure.getAttrib()) != null) {
                bool = Boolean.valueOf(!bj0.d.o(attrib));
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public final void Z0() {
        this.f38105i.setValue(new xw.c<>(Boolean.TRUE));
    }

    public final void a1(long j5) {
        this.f38107k.v(this.f38098b.getHeartSignalLiveData(j5));
    }

    public final void y0(int i11) {
        this.f38113q.setValue(Integer.valueOf(i11));
    }

    public final void z0(long j5) {
        a2 a2Var = this.f38107k;
        LiveData<HeartSignalMeasurement> liveData = this.f38106j;
        a2Var.removeSource(liveData);
        HeartSignalMeasurement value = liveData.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new c(j5, value, null), 2, null);
        }
    }
}
