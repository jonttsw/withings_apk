package com.withings.wiscale2.user.ui.profile;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f62020a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f62021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<BottomSheetType> f62022c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f62023d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f62020a = k4Var;
        this.f62021b = coroutineScope;
        this.f62022c = r0Var;
        this.f62023d = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33474c;
        EditProfileActivity.G3(this.f62020a, this.f62021b, this.f62022c, this.f62023d, bottomSheetType);
        return nm0.y.f85009a;
    }
}
