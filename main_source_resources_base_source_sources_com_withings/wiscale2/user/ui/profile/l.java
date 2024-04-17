package com.withings.wiscale2.user.ui.profile;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f61981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f61982b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<BottomSheetType> f61983c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f61984d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f61981a = k4Var;
        this.f61982b = coroutineScope;
        this.f61983c = r0Var;
        this.f61984d = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33478g;
        EditProfileActivity.G3(this.f61981a, this.f61982b, this.f61983c, this.f61984d, bottomSheetType);
        return nm0.y.f85009a;
    }
}
