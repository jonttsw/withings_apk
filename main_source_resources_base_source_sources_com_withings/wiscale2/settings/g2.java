package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$LogoutButton$3$1", f = "SettingsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60013a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60014b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(SettingsViewModel settingsViewModel, SettingsActivity settingsActivity, qm0.d<? super g2> dVar) {
        super(2, dVar);
        this.f60013a = settingsViewModel;
        this.f60014b = settingsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g2(this.f60013a, this.f60014b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        SettingsViewModel settingsViewModel = this.f60013a;
        settingsViewModel.getClass();
        SettingsActivity context = this.f60014b;
        kotlin.jvm.internal.u.j(context, "context");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(settingsViewModel), Dispatchers.getIO(), null, new i5(settingsViewModel, context, null), 2, null);
        return nm0.y.f85009a;
    }
}
