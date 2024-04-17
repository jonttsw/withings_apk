package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32605a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32606b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<BottomSheetType> f32607c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f32608d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k4 k4Var, CoroutineScope coroutineScope, r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f32605a = k4Var;
        this.f32606b = coroutineScope;
        this.f32607c = r0Var;
        this.f32608d = c5Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33473b;
        h.e(this.f32605a, this.f32606b, this.f32607c, this.f32608d, bottomSheetType);
        return y.f85009a;
    }
}
