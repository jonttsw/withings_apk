package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32613a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32614b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<BottomSheetType> f32615c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f32616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k4 k4Var, CoroutineScope coroutineScope, r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f32613a = k4Var;
        this.f32614b = coroutineScope;
        this.f32615c = r0Var;
        this.f32616d = c5Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33475d;
        h.e(this.f32613a, this.f32614b, this.f32615c, this.f32616d, bottomSheetType);
        return y.f85009a;
    }
}
