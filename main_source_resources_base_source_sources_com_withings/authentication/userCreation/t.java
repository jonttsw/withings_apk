package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32609a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32610b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<BottomSheetType> f32611c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f32612d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k4 k4Var, CoroutineScope coroutineScope, r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f32609a = k4Var;
        this.f32610b = coroutineScope;
        this.f32611c = r0Var;
        this.f32612d = c5Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33474c;
        h.e(this.f32609a, this.f32610b, this.f32611c, this.f32612d, bottomSheetType);
        return y.f85009a;
    }
}
