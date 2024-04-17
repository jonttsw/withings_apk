package com.withings.wiscale2.settings;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: SettingsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$logout$1", f = "SettingsViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60051a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60052b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f60053c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<qf.b, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SettingsViewModel settingsViewModel) {
            super(1);
            this.f60054a = settingsViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(qf.b bVar) {
            MutableStateFlow mutableStateFlow;
            qf.b state = bVar;
            kotlin.jvm.internal.u.j(state, "state");
            mutableStateFlow = this.f60054a.f59772o;
            mutableStateFlow.setValue(state);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(SettingsViewModel settingsViewModel, Context context, qm0.d<? super i5> dVar) {
        super(2, dVar);
        this.f60052b = settingsViewModel;
        this.f60053c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i5(this.f60052b, this.f60053c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        qf.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60051a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SettingsViewModel settingsViewModel = this.f60052b;
            aVar = settingsViewModel.f59764g;
            a aVar2 = new a(settingsViewModel);
            this.f60051a = 1;
            if (((k0) aVar).a(this.f60053c, this, aVar2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
