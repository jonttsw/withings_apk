package com.withings.wiscale2.device.common.tutorial;

import android.app.Application;
import androidx.camera.core.y1;
import androidx.lifecycle.e1;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.viewpager.widget.ViewPager;
import com.withings.common.device.TutorialStateListener;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import nm0.j;
import nm0.y;
import ym0.l;
import ym0.p;
/* compiled from: LegacyTutorialActivity.kt */
/* loaded from: classes5.dex */
public final class f extends androidx.lifecycle.b implements ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    private final Long f53552a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f53553b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f53554c;

    /* renamed from: d  reason: collision with root package name */
    private final TutorialStateListener f53555d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i> f53556e;

    /* renamed from: f  reason: collision with root package name */
    private final g f53557f;

    /* renamed from: g  reason: collision with root package name */
    private final j0<Boolean> f53558g;

    /* renamed from: h  reason: collision with root package name */
    private final k0<Integer> f53559h;

    /* renamed from: i  reason: collision with root package name */
    private final j0 f53560i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f53561j;

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Serializable {

        /* renamed from: d  reason: collision with root package name */
        private boolean f53565d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f53566e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f53562a = false;

        /* renamed from: b  reason: collision with root package name */
        private boolean f53563b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f53564c = false;

        /* renamed from: f  reason: collision with root package name */
        private int f53567f = C1987R.string._SKIP_;

        /* renamed from: g  reason: collision with root package name */
        private int f53568g = C1987R.string._DONE_;

        public a(boolean z5, boolean z11) {
            this.f53565d = z5;
            this.f53566e = z11;
        }

        public final boolean a() {
            return this.f53562a;
        }

        public final int b() {
            return this.f53567f;
        }

        public final int c() {
            return this.f53568g;
        }

        public final boolean d() {
            return this.f53564c;
        }

        public final boolean e() {
            return this.f53563b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f53562a == aVar.f53562a && this.f53563b == aVar.f53563b && this.f53564c == aVar.f53564c && this.f53565d == aVar.f53565d && this.f53566e == aVar.f53566e && this.f53567f == aVar.f53567f && this.f53568g == aVar.f53568g) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f53566e;
        }

        public final boolean g() {
            return this.f53565d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f53568g) + androidx.appcompat.app.h.a(this.f53567f, y1.a(this.f53566e, y1.a(this.f53565d, y1.a(this.f53564c, y1.a(this.f53563b, Boolean.hashCode(this.f53562a) * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WorkflowControlData(displaySkip=");
            sb2.append(this.f53562a);
            sb2.append(", shouldShowLeftText=");
            sb2.append(this.f53563b);
            sb2.append(", shouldShowLeftImage=");
            sb2.append(this.f53564c);
            sb2.append(", shouldShowRightText=");
            sb2.append(this.f53565d);
            sb2.append(", shouldShowRightImage=");
            sb2.append(this.f53566e);
            sb2.append(", leftTextRes=");
            sb2.append(this.f53567f);
            sb2.append(", rightTextRes=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f53568g, ")");
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements p<TutorialStateListener, Device, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(TutorialStateListener tutorialStateListener, Device device) {
            TutorialStateListener stateListener = tutorialStateListener;
            Device device2 = device;
            u.j(stateListener, "stateListener");
            u.j(device2, "device");
            f fVar = f.this;
            Application application = fVar.getApplication();
            boolean unused = fVar.f53561j;
            boolean unused2 = fVar.f53554c;
            stateListener.N(application, device2);
            return y.f85009a;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0<Boolean> f53570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f53571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0<Boolean> j0Var, f fVar) {
            super(1);
            this.f53570a = j0Var;
            this.f53571b = fVar;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            boolean z5;
            Boolean bool2 = bool;
            if (!this.f53571b.f53556e.isEmpty()) {
                u.g(bool2);
                if (!bool2.booleanValue()) {
                    z5 = false;
                    this.f53570a.setValue(Boolean.valueOf(z5));
                    return y.f85009a;
                }
            }
            z5 = true;
            this.f53570a.setValue(Boolean.valueOf(z5));
            return y.f85009a;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.tutorial.LegacyTutorialViewModel$userHasAlreadySeenTutorial$1", f = "LegacyTutorialActivity.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_FEET}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements p<h0<Boolean>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53572a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f53573b;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f53573b = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(h0<Boolean> h0Var, qm0.d<? super y> dVar) {
            return ((d) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53572a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                f fVar = f.this;
                Boolean valueOf = Boolean.valueOf(fVar.f53557f.c(fVar.f53552a));
                this.f53572a = 1;
                if (((h0) this.f53573b).emit(valueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements l<Integer, a> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final a invoke(Integer num) {
            Integer num2 = num;
            f fVar = f.this;
            List list = fVar.f53556e;
            u.g(num2);
            a c11 = ((i) list.get(num2.intValue())).c();
            if (c11 == null) {
                boolean t02 = fVar.t0();
                return new a(t02, !t02);
            }
            return c11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Application application, Long l5, Device device, boolean z5, TutorialStateListener tutorialStateListener, List<? extends i> stepsContents, g gVar) {
        super(application);
        u.j(stepsContents, "stepsContents");
        this.f53552a = l5;
        this.f53553b = device;
        this.f53554c = z5;
        this.f53555d = tutorialStateListener;
        this.f53556e = stepsContents;
        this.f53557f = gVar;
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new d(null), 2);
        j0<Boolean> j0Var = new j0<>();
        j0Var.addSource(a11, new LegacyTutorialActivity.d(new c(j0Var, this)));
        this.f53558g = j0Var;
        k0<Integer> b10 = xw.d.b(0);
        this.f53559h = b10;
        this.f53560i = e1.b(b10, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t0() {
        Integer value = this.f53559h.getValue();
        if (value == null || value.intValue() < x.M(this.f53556e)) {
            return false;
        }
        return true;
    }

    public final void A0() {
        if (!t0()) {
            this.f53561j = true;
            this.f53559h.postValue(Integer.valueOf(x.M(this.f53556e)));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        this.f53559h.postValue(Integer.valueOf(i11));
    }

    public final k0<Integer> p0() {
        return this.f53559h;
    }

    public final j0<Boolean> q0() {
        return this.f53558g;
    }

    public final j0 r0() {
        return this.f53560i;
    }

    public final void y0() {
        boolean t02 = t0();
        Long l5 = this.f53552a;
        g gVar = this.f53557f;
        if (t02) {
            cr.a.a(new j(this.f53555d, this.f53553b), new b());
            gVar.d(l5);
            this.f53558g.setValue(Boolean.TRUE);
            return;
        }
        k0<Integer> k0Var = this.f53559h;
        Integer value = k0Var.getValue();
        if (value == null) {
            value = 0;
        }
        k0Var.postValue(Integer.valueOf(value.intValue() + 1));
        if (t0()) {
            gVar.d(l5);
        }
    }

    public final void z0() {
        k0<Integer> k0Var = this.f53559h;
        Integer value = k0Var.getValue();
        if (value == null) {
            value = 0;
        }
        int intValue = value.intValue();
        if (intValue > 0) {
            k0Var.setValue(Integer.valueOf(intValue - 1));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
    }
}
