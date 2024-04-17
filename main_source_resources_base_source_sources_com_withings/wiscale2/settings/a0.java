package com.withings.wiscale2.settings;

import android.app.Application;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DebugDeeplinkActivity.kt */
/* loaded from: classes5.dex */
public final class a0 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.j0 f59847a;

    /* compiled from: DebugDeeplinkActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<b0>, List<User>>, List<b0>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f59848a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final List<b0> invoke(nm0.j<List<b0>, List<User>> jVar) {
            nm0.j<List<b0>, List<User>> jVar2 = jVar;
            List<User> b10 = jVar2.b();
            List<b0> a11 = jVar2.a();
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
            for (b0 b0Var : a11) {
                if (b0Var instanceof e0) {
                    kotlin.jvm.internal.u.g(b10);
                    ((e0) b0Var).c(b10);
                }
                arrayList.add(b0Var);
            }
            return arrayList;
        }
    }

    /* compiled from: DebugDeeplinkActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DebugDeeplinkViewModel$deeplinksToTest$1", f = "DebugDeeplinkActivity.kt", l = {ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends b0>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59849a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59850b;

        b() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.wiscale2.settings.a0$b] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f59850b = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<? extends b0>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59849a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f59850b;
                List W = kotlin.collections.x.W(new e0(0), new k5("withings-bd2://timeline"), new k5("withings-bd2://timeline/measure?type=1"), new k5("withings-bd2://timeline/measure?type=8"), new k5("withings-bd2://timeline/measure?type=36"), new k5("withings-bd2://timeline/reminders"), new k5("withings-bd2://settings/2fa"), new k5("withings-bd2://programs"), new k5("withings-bd2://join?programid=111"), new k5("withings-bd2://programs/program?programid=112"), new k5("withings-bd2://profile"), new k5("withings-bd2://profile/settings"), new k5("withings-bd2://profile/pregnancyModeTurnOff"), new k5("withings-bd2://library?type=article&contentId=discovery_bplus_welcome"), new k5("withings-bd2://library?type=video-workout"), new k5("withings-bd2://library?type=X&filterId=Y"), new k5("withings-bd2://stepgoal"), new k5("withings-bd2://weightgoal"), new k5("withings-bd2://devices"), new k5("withings-bd2://dashboard"), new k5("withings-bd2://achieve"), new k5("withings-bd2://paywall"), new k5("withings-bd2://leaderboard"), new k5("withings-bd2://sharing_invitation"), new k5("withings-bd2://sharing_invitation?invitation=hell0"));
                this.f59849a = 1;
                if (h0Var.emit(W, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DebugDeeplinkActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DebugDeeplinkViewModel$users$1", f = "DebugDeeplinkActivity.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<User>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59851a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m70.i f59853c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m70.i iVar, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f59853c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(this.f59853c, dVar);
            cVar.f59852b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<User>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59851a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                List<User> d11 = this.f59853c.d();
                this.f59851a = 1;
                if (((androidx.lifecycle.h0) this.f59852b).emit(d11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    public a0(Application application, m70.i iVar) {
        super(application);
        this.f59847a = androidx.lifecycle.e1.b(xw.a.b(new nm0.j(androidx.lifecycle.h.a(Dispatchers.getIO(), new kotlin.coroutines.jvm.internal.i(2, null), 2), androidx.lifecycle.h.a(Dispatchers.getIO(), new c(iVar, null), 2))), a.f59848a);
    }

    public final androidx.lifecycle.j0 f0() {
        return this.f59847a;
    }
}
