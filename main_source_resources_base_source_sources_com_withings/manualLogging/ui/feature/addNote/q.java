package com.withings.manualLogging.ui.feature.addNote;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.manualLogging.ui.common.LogType;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41549a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f41550b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LogType f41551c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f41552d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r8.n nVar, LogType logType, AddManualLogActivity addManualLogActivity, k1 k1Var) {
        super(1);
        this.f41549a = addManualLogActivity;
        this.f41550b = k1Var;
        this.f41551c = logType;
        this.f41552d = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        int i11 = AddManualLogActivity.f40697k;
        AddManualLogActivity addManualLogActivity = this.f41549a;
        addManualLogActivity.getClass();
        r8.n nVar = this.f41552d;
        LogType logType = this.f41551c;
        k1 k1Var = this.f41550b;
        androidx.navigation.compose.n.b(NavHost, "selectLogCategoryScreen", null, null, null, null, null, null, new s1.a(true, -575087830, new o0(nVar, logType, addManualLogActivity, k1Var)), 126);
        androidx.navigation.compose.n.b(NavHost, "addManualLogScreen/{categoryId}", kotlin.collections.x.V(androidx.camera.camera2.internal.v1.d0("categoryId", new t(addManualLogActivity))), null, null, null, null, null, new s1.a(true, -231516159, new i0(k1Var, addManualLogActivity, nVar)), 124);
        xb.i.a(NavHost, "simpleDescriptionBottomSheet/{title}/{description}", kotlin.collections.x.W(androidx.camera.camera2.internal.v1.d0("title", p0.f41543a), androidx.camera.camera2.internal.v1.d0(HealthConstants.FoodInfo.DESCRIPTION, q0.f41553a)), new s1.a(true, -1214591777, new s0(nVar)), 4);
        return nm0.y.f85009a;
    }
}
