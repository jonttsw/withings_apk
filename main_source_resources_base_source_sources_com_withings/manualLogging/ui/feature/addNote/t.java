package com.withings.manualLogging.ui.feature.addNote;

import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41587a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AddManualLogActivity addManualLogActivity) {
        super(1);
        this.f41587a = addManualLogActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        kotlin.jvm.internal.u.j(navArgument, "$this$navArgument");
        navArgument.d(r8.o.f94580k);
        ManualLogCategory B3 = AddManualLogActivity.B3(this.f41587a);
        navArgument.b((B3 == null || (r0 = B3.name()) == null) ? "Medicine" : "Medicine");
        return nm0.y.f85009a;
    }
}
