package com.withings.wiscale2.user.ui.profile;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
final class t extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f62068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f62069b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<BottomSheetType> f62070c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f62071d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f62068a = k4Var;
        this.f62069b = coroutineScope;
        this.f62070c = r0Var;
        this.f62071d = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33476e;
        EditProfileActivity.G3(this.f62068a, this.f62069b, this.f62070c, this.f62071d, bottomSheetType);
        return nm0.y.f85009a;
    }
}
