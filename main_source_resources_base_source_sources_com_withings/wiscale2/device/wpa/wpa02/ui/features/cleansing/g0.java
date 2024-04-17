package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.z4;
import com.withings.wiscale2.device.wpa.wpa02.conversation.a;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: Wpa02CleansingModeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeActivity$onCreate$1$1$1", f = "Wpa02CleansingModeActivity.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55283a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeActivity f55284b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f55285c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z4 f55286d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02CleansingModeActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Wpa02CleansingModeActivity f55287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f55288b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f55289c;

        a(Wpa02CleansingModeActivity wpa02CleansingModeActivity, r8.n nVar, z4 z4Var) {
            this.f55287a = wpa02CleansingModeActivity;
            this.f55288b = nVar;
            this.f55289c = z4Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            String string;
            com.withings.wiscale2.device.wpa.wpa02.conversation.a aVar = (com.withings.wiscale2.device.wpa.wpa02.conversation.a) obj;
            boolean z5 = aVar instanceof a.c;
            Wpa02CleansingModeActivity wpa02CleansingModeActivity = this.f55287a;
            if (z5) {
                string = wpa02CleansingModeActivity.getString(aVar.a(), wpa02CleansingModeActivity.getString(((a.c) aVar).c()));
            } else if (aVar instanceof a.f) {
                string = wpa02CleansingModeActivity.getString(aVar.a(), new Long(((a.f) aVar).c()));
            } else {
                string = wpa02CleansingModeActivity.getString(aVar.a());
            }
            String str = string;
            kotlin.jvm.internal.u.g(str);
            Wpa02CleansingModeActivity.B3(wpa02CleansingModeActivity).p0();
            androidx.navigation.e.P(this.f55288b, "cleansing_mode_introduction", false);
            ToastStyle toastStyle = ToastStyle.f33350c;
            String string2 = wpa02CleansingModeActivity.getString(aVar.b());
            kotlin.jvm.internal.u.g(string2);
            Object c11 = z4.c(this.f55289c, toastStyle, str, string2, 0L, f0.f55279a, dVar, 8);
            if (c11 != CoroutineSingletons.f76214a) {
                return nm0.y.f85009a;
            }
            return c11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Wpa02CleansingModeActivity wpa02CleansingModeActivity, r8.n nVar, z4 z4Var, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f55284b = wpa02CleansingModeActivity;
        this.f55285c = nVar;
        this.f55286d = z4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g0(this.f55284b, this.f55285c, this.f55286d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((g0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55283a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            Wpa02CleansingModeActivity wpa02CleansingModeActivity = this.f55284b;
            SharedFlow<com.withings.wiscale2.device.wpa.wpa02.conversation.a> r02 = Wpa02CleansingModeActivity.B3(wpa02CleansingModeActivity).r0();
            a aVar = new a(wpa02CleansingModeActivity, this.f55285c, this.f55286d);
            this.f55283a = 1;
            if (r02.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
