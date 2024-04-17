package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.tutorials.core.model.ExplanationsType;
import com.withings.user.core.models.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.f1;
import com.withings.wiscale2.sleep.ui.sleepscore.k4;
import com.withings.wiscale2.sleep.ui.sleepscore.n2;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
/* compiled from: SleepActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/f1$c;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/k4$b;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/n2$b;", "Lpy/a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepActivity extends Hilt_SleepActivity implements f1.c, k4.b, n2.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f60571e;

    /* renamed from: f  reason: collision with root package name */
    private final j f60572f;

    /* renamed from: g  reason: collision with root package name */
    private DateTime f60573g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Period> f60574h;

    /* renamed from: i  reason: collision with root package name */
    private ParcelableSnapshotMutableState f60575i;

    /* renamed from: j  reason: collision with root package name */
    private Period f60576j;

    /* renamed from: k  reason: collision with root package name */
    private DateTime f60577k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f60578l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f60579m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f60580n;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public p60.c f60581o;

    /* renamed from: p  reason: collision with root package name */
    private final String f60582p;

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60570r = {androidx.camera.core.v.c(SleepActivity.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/ActivitySleepBinding;", 0), androidx.camera.core.v.c(SleepActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final a f60569q = new Object();

    /* compiled from: SleepActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, User user, DateTime dateTime, Period period) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, SleepActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime).putExtra("period", period);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity", f = "SleepActivity.kt", l = {ConstantsWs.WS_STATUS_NOPRIMARYUSER}, m = "launchGuidedExplanationsIfNecessary")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        SleepActivity f60583a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f60584b;

        /* renamed from: d  reason: collision with root package name */
        int f60586d;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60584b = obj;
            this.f60586d |= Integer.MIN_VALUE;
            return SleepActivity.this.Q3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity", f = "SleepActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGBATTERYLVL}, m = "launchLegacyTutorialsIfNecessary")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        SleepActivity f60587a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f60588b;

        /* renamed from: d  reason: collision with root package name */
        int f60590d;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60588b = obj;
            this.f60590d |= Integer.MIN_VALUE;
            return SleepActivity.this.R3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$launchLegacyTutorialsIfNecessary$2", f = "SleepActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {
        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            SleepActivity sleepActivity = SleepActivity.this;
            return Boolean.valueOf(new hi0.d(sleepActivity).c(new Long(sleepActivity.P3().getId())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$loadFirstSleepActivityAndShowData$1", f = "SleepActivity.kt", l = {ConstantsWs.WS_STATUS_MISSING}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60592a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$loadFirstSleepActivityAndShowData$1$firstSleepTrack$1", f = "SleepActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepActivity f60594a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepActivity sleepActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60594a = sleepActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60594a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                if (ei0.q.f65441d != null) {
                    ei0.q qVar = ei0.q.f65441d;
                    if (qVar != null) {
                        return qVar.r(this.f60594a.P3().getId());
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DateTime now;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60592a;
            SleepActivity sleepActivity = SleepActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepActivity, null);
                this.f60592a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Track track = (Track) obj;
            if (track == null || (now = TrackKt.getEffectiveStartDate(track)) == null) {
                now = DateTime.now();
                kotlin.jvm.internal.u.i(now, "now(...)");
            }
            sleepActivity.f60577k = now;
            sleepActivity.T3();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<Period, nm0.y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Period period) {
            Period it = period;
            kotlin.jvm.internal.u.j(it, "it");
            SleepActivity sleepActivity = SleepActivity.this;
            sleepActivity.f60575i.setValue(it);
            SleepActivity.N3(sleepActivity);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$onCreate$2", f = "SleepActivity.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60596a;

        g(qm0.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60596a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f60596a = 1;
                if (SleepActivity.L3(SleepActivity.this, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$showTutorial$1$1", f = "SleepActivity.kt", l = {88, 90}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60598a;

        h(qm0.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new h(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60598a;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                SleepActivity sleepActivity = SleepActivity.this;
                if (sleepActivity.f60578l) {
                    this.f60598a = 1;
                    if (SleepActivity.B3(sleepActivity, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    this.f60598a = 2;
                    if (SleepActivity.A3(sleepActivity, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.device.common.onboarding.k> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.device.common.onboarding.k invoke() {
            return new com.withings.wiscale2.device.common.onboarding.k(SleepActivity.this);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class j implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60601a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60602b;

        public j(Activity activity) {
            this.f60602b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60601a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.o0> {
        @Override // ym0.l
        public final tb0.o0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.o0.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public SleepActivity() {
        super(0);
        ParcelableSnapshotMutableState f11;
        this.f60571e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f60572f = new j(this);
        Period period = Period.f43721f;
        List<Period> W = kotlin.collections.x.W(period, Period.f43722g, Period.f43723h);
        this.f60574h = W;
        Period period2 = (Period) kotlin.collections.x.K(W);
        f11 = androidx.compose.runtime.l0.f(period2 != null ? period2 : period, androidx.compose.runtime.v0.f8878a);
        this.f60575i = f11;
        this.f60576j = Period.f43719d;
        this.f60578l = wr.b.c(FeatureFlag.T);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.wiscale2.device.wpm.ui.f(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f60579m = registerForActivityResult;
        this.f60580n = nm0.h.b(new i());
        this.f60582p = "sleep";
    }

    public static final Object A3(SleepActivity sleepActivity, qm0.d dVar) {
        p60.c cVar = sleepActivity.f60581o;
        if (cVar != null) {
            Object collectLatest = FlowKt.collectLatest(cVar.b(ExplanationsType.f44580a, new Long(sleepActivity.P3().getId())), new w(sleepActivity, null), dVar);
            if (collectLatest != CoroutineSingletons.f76214a) {
                return nm0.y.f85009a;
            }
            return collectLatest;
        }
        kotlin.jvm.internal.u.s("explanationsRepository");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B3(com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r5, qm0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.withings.wiscale2.sleep.ui.sleepscore.x
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.wiscale2.sleep.ui.sleepscore.x r0 = (com.withings.wiscale2.sleep.ui.sleepscore.x) r0
            int r1 = r0.f61554d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f61554d = r1
            goto L1b
        L16:
            com.withings.wiscale2.sleep.ui.sleepscore.x r0 = new com.withings.wiscale2.sleep.ui.sleepscore.x
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f61552b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f61554d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r5 = r0.f61551a
            nm0.l.b(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.sleep.ui.sleepscore.y r2 = new com.withings.wiscale2.sleep.ui.sleepscore.y
            r4 = 0
            r2.<init>(r5, r4)
            r0.f61551a = r5
            r0.f61554d = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L4c
            goto L5d
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L58
            r5.S3()
            goto L5b
        L58:
            r5.finish()
        L5b:
            nm0.y r1 = nm0.y.f85009a
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.B3(com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity, qm0.d):java.lang.Object");
    }

    public static final com.withings.wiscale2.device.common.onboarding.k D3(SleepActivity sleepActivity) {
        return (com.withings.wiscale2.device.common.onboarding.k) sleepActivity.f60580n.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L3(com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r12, qm0.d r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof com.withings.wiscale2.sleep.ui.sleepscore.z
            if (r0 == 0) goto L16
            r0 = r13
            com.withings.wiscale2.sleep.ui.sleepscore.z r0 = (com.withings.wiscale2.sleep.ui.sleepscore.z) r0
            int r1 = r0.f61582d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f61582d = r1
            goto L1b
        L16:
            com.withings.wiscale2.sleep.ui.sleepscore.z r0 = new com.withings.wiscale2.sleep.ui.sleepscore.z
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.f61580b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f61582d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            nm0.l.b(r13)
            goto L8f
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r12 = r0.f61579a
            nm0.l.b(r13)
            goto L53
        L3c:
            nm0.l.b(r13)
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.sleep.ui.sleepscore.c0 r2 = new com.withings.wiscale2.sleep.ui.sleepscore.c0
            r2.<init>(r12, r5)
            r0.f61579a = r12
            r0.f61582d = r4
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r2, r0)
            if (r13 != r1) goto L53
            goto L91
        L53:
            r8 = r13
            com.withings.device.Device r8 = (com.withings.device.Device) r8
            if (r8 == 0) goto L6e
            com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity$a r6 = com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity.f53060m
            r10 = 0
            r11 = 12
            r9 = 0
            r7 = r12
            android.content.Intent r13 = com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity.a.a(r6, r7, r8, r9, r10, r11)
            com.withings.wiscale2.sleep.ui.sleepscore.b0 r2 = new com.withings.wiscale2.sleep.ui.sleepscore.b0
            r2.<init>(r12)
            wq.a.q(r12, r13, r2)
            nm0.y r13 = nm0.y.f85009a
            goto L6f
        L6e:
            r13 = r5
        L6f:
            if (r13 != 0) goto L8f
            r0.f61579a = r5
            r0.f61582d = r3
            boolean r13 = r12.f60578l
            if (r13 == 0) goto L83
            java.lang.Object r12 = r12.R3(r0)
            if (r12 != r1) goto L80
            goto L8c
        L80:
            nm0.y r12 = nm0.y.f85009a
            goto L8c
        L83:
            java.lang.Object r12 = r12.Q3(r0)
            if (r12 != r1) goto L8a
            goto L8c
        L8a:
            nm0.y r12 = nm0.y.f85009a
        L8c:
            if (r12 != r1) goto L8f
            goto L91
        L8f:
            nm0.y r1 = nm0.y.f85009a
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.L3(com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity, qm0.d):java.lang.Object");
    }

    public static final Object M3(SleepActivity sleepActivity, qm0.d dVar) {
        if (sleepActivity.f60578l) {
            Object R3 = sleepActivity.R3(dVar);
            if (R3 != CoroutineSingletons.f76214a) {
                return nm0.y.f85009a;
            }
            return R3;
        }
        Object Q3 = sleepActivity.Q3(dVar);
        if (Q3 != CoroutineSingletons.f76214a) {
            return nm0.y.f85009a;
        }
        return Q3;
    }

    public static final void N3(SleepActivity sleepActivity) {
        sleepActivity.getClass();
        sleepActivity.f60576j = Period.f43719d;
        sleepActivity.T3();
    }

    private final tb0.o0 O3() {
        Object value = ((LifecycleViewBindingProperty) this.f60571e).getValue(this, f60570r[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.o0) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User P3() {
        return (User) this.f60572f.getValue(this, f60570r[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q3(qm0.d<? super nm0.y> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.b
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$b r0 = (com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.b) r0
            int r1 = r0.f60586d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60586d = r1
            goto L18
        L13:
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$b r0 = new com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f60584b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f60586d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r0 = r0.f60583a
            nm0.l.b(r8)
            goto L57
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            nm0.l.b(r8)
            p60.c r8 = r7.f60581o
            if (r8 == 0) goto L7e
            com.withings.tutorials.core.model.ExplanationsType r2 = com.withings.tutorials.core.model.ExplanationsType.f44580a
            com.withings.user.core.models.User r4 = r7.P3()
            long r4 = r4.getId()
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            p60.e r8 = r8.b(r2, r6)
            r0.f60583a = r7
            r0.f60586d = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r0 = r7
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L63
            r0.S3()
            goto L7b
        L63:
            com.withings.tutorials.ui.screens.explanations.ExplanationsActivity$a r8 = com.withings.tutorials.ui.screens.explanations.ExplanationsActivity.f45078i
            com.withings.tutorials.core.model.ExplanationsType r1 = com.withings.tutorials.core.model.ExplanationsType.f44580a
            com.withings.user.core.models.User r2 = r0.P3()
            long r2 = r2.getId()
            r8.getClass()
            android.content.Intent r8 = com.withings.tutorials.ui.screens.explanations.ExplanationsActivity.a.a(r0, r1, r2)
            androidx.activity.result.b<android.content.Intent> r0 = r0.f60579m
            r0.a(r8)
        L7b:
            nm0.y r8 = nm0.y.f85009a
            return r8
        L7e:
            java.lang.String r8 = "explanationsRepository"
            kotlin.jvm.internal.u.s(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.Q3(qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R3(qm0.d<? super nm0.y> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.c
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$c r0 = (com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.c) r0
            int r1 = r0.f60590d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60590d = r1
            goto L18
        L13:
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$c r0 = new com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60588b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f60590d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r0 = r0.f60587a
            nm0.l.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$d r2 = new com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$d
            r4 = 0
            r2.<init>(r4)
            r0.f60587a = r5
            r0.f60590d = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L56
            r0.S3()
            goto L71
        L56:
            com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity$a r6 = com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity.f53518k
            com.withings.user.core.models.User r1 = r0.P3()
            long r1 = r1.getId()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r6.getClass()
            android.content.Intent r6 = com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity.a.a(r0, r3, r3, r4)
            androidx.activity.result.b<android.content.Intent> r0 = r0.f60579m
            r0.a(r6)
        L71:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.R3(qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S3() {
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T3() {
        Fragment f1Var;
        if (this.f60577k != null) {
            androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
            int id2 = O3().f99386b.getId();
            int ordinal = ((Period) this.f60575i.getValue()).ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f60575i;
                        Fail.j("What is this tab ? : " + parcelableSnapshotMutableState);
                        k4.a aVar = k4.f61116k;
                        User P3 = P3();
                        DateTime dateTime = this.f60573g;
                        if (dateTime != null) {
                            DateTime dateTime2 = this.f60577k;
                            if (dateTime2 != null) {
                                aVar.getClass();
                                f1Var = k4.a.a(P3, dateTime, dateTime2);
                            } else {
                                kotlin.jvm.internal.u.s("firstSleepTrackDate");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("dateTime");
                            throw null;
                        }
                    } else {
                        n2.a aVar2 = n2.f61157k;
                        User user = P3();
                        DateTime dateTime3 = this.f60573g;
                        if (dateTime3 != null) {
                            DateTime dateTime4 = this.f60577k;
                            if (dateTime4 != null) {
                                aVar2.getClass();
                                kotlin.jvm.internal.u.j(user, "user");
                                f1Var = new n2();
                                Bundle bundle = new Bundle();
                                bundle.putSerializable("EXTRA_USER", user);
                                bundle.putSerializable("EXTRA_DATE", dateTime3);
                                bundle.putSerializable("EXTRA_FIRST_TRACK_EVER", dateTime4);
                                f1Var.setArguments(bundle);
                            } else {
                                kotlin.jvm.internal.u.s("firstSleepTrackDate");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("dateTime");
                            throw null;
                        }
                    }
                } else {
                    k4.a aVar3 = k4.f61116k;
                    User P32 = P3();
                    DateTime dateTime5 = this.f60573g;
                    if (dateTime5 != null) {
                        DateTime dateTime6 = this.f60577k;
                        if (dateTime6 != null) {
                            aVar3.getClass();
                            f1Var = k4.a.a(P32, dateTime5, dateTime6);
                        } else {
                            kotlin.jvm.internal.u.s("firstSleepTrackDate");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.u.s("dateTime");
                        throw null;
                    }
                }
            } else {
                f1.a aVar4 = f1.f60942t;
                User user2 = P3();
                DateTime dateTime7 = this.f60573g;
                if (dateTime7 != null) {
                    DateTime dateTime8 = this.f60577k;
                    if (dateTime8 != null) {
                        aVar4.getClass();
                        kotlin.jvm.internal.u.j(user2, "user");
                        f1Var = new f1();
                        f1Var.setArguments(androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user2), new nm0.j("extra_date", dateTime7), new nm0.j("EXTRA_FIRST_TRACK_EVER", dateTime8)));
                    } else {
                        kotlin.jvm.internal.u.s("firstSleepTrackDate");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("dateTime");
                    throw null;
                }
            }
            m11.l(id2, f1Var, null);
            m11.g();
            return;
        }
        S3();
    }

    public static void z3(SleepActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new h(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.f1.c
    public final void F1(f1 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        this.f60573g = dateTime;
        T3();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.f1.c
    public final void K2(f1 fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        T3();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k4.b
    public final void O(k4 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        this.f60576j = Period.f43722g;
        this.f60575i.setValue(Period.f43721f);
        this.f60573g = dateTime;
        T3();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.f1.c
    public final void V1(f1 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        this.f60573g = dateTime;
        com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, (Period) this.f60575i.getValue(), dateTime);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k4.b
    public final void c3(k4 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        this.f60573g = dateTime;
        com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, (Period) this.f60575i.getValue(), dateTime);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.n2.b
    public final void f0(n2 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        this.f60573g = dateTime;
        com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, (Period) this.f60575i.getValue(), dateTime);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f60582p;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.f1.c
    public final void i1(f1 fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        this.f60576j = Period.f43719d;
        T3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Period period = this.f60576j;
        Period period2 = Period.f43719d;
        if (period != period2) {
            this.f60575i.setValue(period);
            this.f60576j = period2;
            T3();
            return;
        }
        super.onBackPressed();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        ParcelableSnapshotMutableState f11;
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        Intent intent = getIntent();
        kotlin.jvm.internal.u.i(intent, "getIntent(...)");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            obj = com.withings.measure.detail.paged.a.a(intent);
        } else {
            Serializable serializableExtra = intent.getSerializableExtra("date");
            if (!(serializableExtra instanceof DateTime)) {
                serializableExtra = null;
            }
            obj = (DateTime) serializableExtra;
        }
        kotlin.jvm.internal.u.g(obj);
        this.f60573g = (DateTime) obj;
        Intent intent2 = getIntent();
        kotlin.jvm.internal.u.i(intent2, "getIntent(...)");
        if (i11 >= 33) {
            obj2 = intent2.getSerializableExtra("period", Period.class);
        } else {
            Object serializableExtra2 = intent2.getSerializableExtra("period");
            if (!(serializableExtra2 instanceof Period)) {
                serializableExtra2 = null;
            }
            obj2 = (Period) serializableExtra2;
        }
        Period period = (Period) obj2;
        if (period == null) {
            period = Period.f43721f;
        }
        f11 = androidx.compose.runtime.l0.f(period, androidx.compose.runtime.v0.f8878a);
        this.f60575i = f11;
        setSupportActionBar(O3().f99387c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        AppBarLayout appBar = O3().f99385a;
        kotlin.jvm.internal.u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        FrameLayout fragmentContainer = O3().f99386b;
        kotlin.jvm.internal.u.i(fragmentContainer, "fragmentContainer");
        ay.b.n(fragmentContainer, false, true, 23);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f60575i;
        ComposeView topPeriodBar = O3().f99388d;
        kotlin.jvm.internal.u.i(topPeriodBar, "topPeriodBar");
        g20.g.f(this.f60574h, parcelableSnapshotMutableState, topPeriodBar, new f());
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new g(null), 3, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            if (onSupportNavigateUp()) {
                return true;
            }
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.n2.b
    public final void y2(n2 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        this.f60576j = Period.f43723h;
        this.f60575i.setValue(Period.f43721f);
        this.f60573g = dateTime;
        T3();
    }
}
