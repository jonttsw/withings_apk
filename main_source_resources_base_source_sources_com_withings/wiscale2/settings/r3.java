package com.withings.wiscale2.settings;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.MainActivity;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import qf.b;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$listenLogoutStates$1", f = "SettingsActivity.kt", l = {507}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class r3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60277a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60278b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60279c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60280d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$listenLogoutStates$1$1", f = "SettingsActivity.kt", l = {ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SettingsActivity f60283c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60284d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SettingsActivity.kt */
        /* renamed from: com.withings.wiscale2.settings.r3$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0778a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SettingsActivity f60285a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k1.r0<Boolean> f60286b;

            C0778a(SettingsActivity settingsActivity, k1.r0<Boolean> r0Var) {
                this.f60285a = settingsActivity;
                this.f60286b = r0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                qf.b bVar = (qf.b) obj;
                boolean e11 = kotlin.jvm.internal.u.e(bVar, b.c.f92608a);
                k1.r0<Boolean> r0Var = this.f60286b;
                if (e11) {
                    SettingsActivity settingsActivity = this.f60285a;
                    Intent addFlags = new Intent(settingsActivity, MainActivity.class).addFlags(67108864);
                    kotlin.jvm.internal.u.i(addFlags, "addFlags(...)");
                    androidx.core.app.h0 m11 = androidx.core.app.h0.m(settingsActivity);
                    m11.c(addFlags);
                    m11.r();
                    r0Var.setValue(Boolean.FALSE);
                } else if (kotlin.jvm.internal.u.e(bVar, b.a.f92606a)) {
                    r0Var.setValue(Boolean.TRUE);
                } else {
                    kotlin.jvm.internal.u.e(bVar, b.C1546b.f92607a);
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0 r0Var, SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, qm0.d dVar) {
            super(2, dVar);
            this.f60282b = settingsViewModel;
            this.f60283c = settingsActivity;
            this.f60284d = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f60284d, this.f60283c, this.f60282b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60281a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                StateFlow<qf.b> G0 = this.f60282b.G0();
                C0778a c0778a = new C0778a(this.f60283c, this.f60284d);
                this.f60281a = 1;
                if (G0.collect(c0778a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(k1.r0 r0Var, SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, qm0.d dVar) {
        super(2, dVar);
        this.f60278b = settingsActivity;
        this.f60279c = settingsViewModel;
        this.f60280d = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r3(this.f60280d, this.f60278b, this.f60279c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60277a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SettingsActivity settingsActivity = this.f60278b;
            Lifecycle lifecycle = settingsActivity.getLifecycle();
            kotlin.jvm.internal.u.i(lifecycle, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.f14374c;
            a aVar = new a(this.f60280d, settingsActivity, this.f60279c, null);
            this.f60277a = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
