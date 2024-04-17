package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import com.google.android.material.button.MaterialButton;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepScoreSnoringDisabledActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreSnoringDisabledActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreSnoringDisabledActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private tb0.q0 f60810a;

    /* renamed from: b  reason: collision with root package name */
    private final c f60811b = new c(this);

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60809d = {androidx.camera.core.v.c(SleepScoreSnoringDisabledActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f60808c = new Object();

    /* compiled from: SleepScoreSnoringDisabledActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreSnoringDisabledActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringDisabledActivity$onCreate$1", f = "SleepScoreSnoringDisabledActivity.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60812a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreSnoringDisabledActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringDisabledActivity$onCreate$1$wsm02$1", f = "SleepScoreSnoringDisabledActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Device>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreSnoringDisabledActivity f60814a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60814a = sleepScoreSnoringDisabledActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60814a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Device> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                return kotlin.collections.x.K(kn.e.c().j(SleepScoreSnoringDisabledActivity.A3(this.f60814a).q(), 63));
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60812a;
            SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity = SleepScoreSnoringDisabledActivity.this;
            boolean z5 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreSnoringDisabledActivity, null);
                this.f60812a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Device device = (Device) obj;
            if (device == null || !device.isMicMuted()) {
                z5 = false;
            }
            SleepScoreSnoringDisabledActivity.B3(sleepScoreSnoringDisabledActivity, z5);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60815a = nm0.h.b(new q3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60816b;

        public c(Activity activity) {
            this.f60816b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60815a.getValue();
        }
    }

    public static final User A3(SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity) {
        return (User) sleepScoreSnoringDisabledActivity.f60811b.getValue(sleepScoreSnoringDisabledActivity, f60809d[0]);
    }

    public static final void B3(SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity, boolean z5) {
        int i11;
        int i12;
        int i13;
        tb0.q0 q0Var = sleepScoreSnoringDisabledActivity.f60810a;
        if (q0Var != null) {
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            MaterialButton materialButton = q0Var.f99433b;
            materialButton.setVisibility(i11);
            materialButton.setOnClickListener(new gi.i(sleepScoreSnoringDisabledActivity, 11));
            tb0.q0 q0Var2 = sleepScoreSnoringDisabledActivity.f60810a;
            if (q0Var2 != null) {
                if (z5) {
                    i12 = C1987R.string.snoring_detectionIsDisable_title;
                } else {
                    i12 = C1987R.string.snoring_detectionWasDisabled_title;
                }
                q0Var2.f99435d.setText(sleepScoreSnoringDisabledActivity.getString(i12));
                tb0.q0 q0Var3 = sleepScoreSnoringDisabledActivity.f60810a;
                if (q0Var3 != null) {
                    if (z5) {
                        i13 = C1987R.string.snoring_detectionIsDisable_content;
                    } else {
                        i13 = C1987R.string.snoring_detectionWasDisabled_content;
                    }
                    q0Var3.f99434c.setText(sleepScoreSnoringDisabledActivity.getString(i13));
                    return;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    public static void z3(SleepScoreSnoringDisabledActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new p3(this$0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tb0.q0 b10 = tb0.q0.b(getLayoutInflater());
        this.f60810a = b10;
        setContentView(b10.a());
        tb0.q0 q0Var = this.f60810a;
        if (q0Var != null) {
            setSupportActionBar(q0Var.f99436e);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(true);
            }
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new b(null), 3, null);
            return;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return true;
    }
}
